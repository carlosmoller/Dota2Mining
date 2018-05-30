/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;
import javax.swing.JTextField;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.*;
import org.hibernate.Session;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import persistencia.*;
/**
 *
 * @author Moller
 */
public class coletor {
    boolean loopinfinito;
    int numPartidas;
    public int coletorPartidas (int quantidade) 
{
        int c;
        numPartidas = 0;
        loopinfinito = true;
        String timevitorioso;
        Partida partida = new Partida();
        Jogadores jogador = new Jogadores();
        Habilidades habilidade = new Habilidades();
        Session session = null;
        
        List matches = new ArrayList();
        while (numPartidas < quantidade) {
        try {
        File partidas = new File("c:/teste/dotapartidas.xml");
        /* InputStream inputStream = new FileInputStream(partidas);
        Reader reader = new InputStreamReader(inputStream,"UTF-8");
        InputSource is = new InputSource(reader); */
        URL url1 = new URL("https","api.steampowered.com","/IDOTA2Match_570/GetMatchHistory/V001/?format=XML&key=10A0218FD2C53B14F582926B78AB998C&skill=3");
        
        InputStream stream = url1.openStream();
        
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(stream);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("match");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            
            Element eElement = (Element) nNode;
            if (Integer.parseInt(eElement.getElementsByTagName("lobby_type").item(0).getTextContent()) == 0 || Integer.parseInt(eElement.getElementsByTagName("lobby_type").item(0).getTextContent()) == 7) {
                
            matches.add(eElement.getElementsByTagName("match_id").item(0).getTextContent());    
            }
          }
        }
            System.out.println(matches.size());
            for (int i = 0; i < matches.size(); i++ ) {
            try {
            c = 0;
            URL url = new URL("https","api.steampowered.com","/IDOTA2Match_570/GetMatchDetails/V001/?format=XML&key=10A0218FD2C53B14F582926B78AB998C&match_id="+matches.get(i).toString()+"");
            System.out.println(url.toString());
            stream = url.openStream();
            DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
            Document doc1 = dBuilder1.parse(stream);
            doc1.getDocumentElement().normalize();
            nList = doc1.getElementsByTagName("result");
            Node nNode = nList.item(0);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            
            Element eElement = (Element) nNode;
            if (Integer.parseInt(eElement.getElementsByTagName("human_players").item(0).getTextContent()) != 10) c = 1;
                       System.out.println(eElement.getElementsByTagName("human_players").item(0).getTextContent());       
            }
            nList = doc1.getElementsByTagName("player");
            for (int temp = 0; temp < nList.getLength(); temp++) {
            nNode = nList.item(temp);
            
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            
            Element eElement = (Element) nNode;
            if (Integer.parseInt(eElement.getElementsByTagName("leaver_status").item(0).getTextContent()) != 0) c = 1;
                System.out.println(eElement.getElementsByTagName("leaver_status").item(0).getTextContent());                  
            }
            
        }
        
            
            
        if (c == 0) {
            
            try {
            nList = doc1.getElementsByTagName("result");
            nNode = nList.item(0);
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) nNode;
            timevitorioso = eElement.getElementsByTagName("radiant_win").item(0).getTextContent();
            if (timevitorioso.equals("true")) partida.setTimevitorioso(0);
            else partida.setTimevitorioso(1);
            
            partida.setDuracao(Integer.parseInt(eElement.getElementsByTagName("duration").item(0).getTextContent()));
            partida.setCluster(Integer.parseInt(eElement.getElementsByTagName("cluster").item(0).getTextContent()));
            partida.setIdliga(Integer.parseInt(eElement.getElementsByTagName("leagueid").item(0).getTextContent()));
            partida.setIdpartida(Long.parseLong(eElement.getElementsByTagName("match_id").item(0).getTextContent()));
            partida.setTempofb(Integer.parseInt(eElement.getElementsByTagName("first_blood_time").item(0).getTextContent()));
            partida.setTipolobby(Integer.parseInt(eElement.getElementsByTagName("game_mode").item(0).getTextContent()));
            partida.setTorresdire(Integer.parseInt(eElement.getElementsByTagName("tower_status_dire").item(0).getTextContent()));
            partida.setTorresradiant(Integer.parseInt(eElement.getElementsByTagName("tower_status_radiant").item(0).getTextContent()));
            
            session = util.HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(partida);
            session.getTransaction().commit();
            session.close();
          }
          nList = doc1.getElementsByTagName("player");
          
          for (int temp = 0; temp < nList.getLength(); temp++) {
            nNode = nList.item(temp);
            
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            
            Element eElement = (Element) nNode;
            
            jogador.setAssistencias(Integer.parseInt(eElement.getElementsByTagName("assists").item(0).getTextContent()));
            jogador.setDanoemtorre(Integer.parseInt(eElement.getElementsByTagName("tower_damage").item(0).getTextContent()));
            jogador.setDenies(Integer.parseInt(eElement.getElementsByTagName("denies").item(0).getTextContent()));
            jogador.setGpm(Integer.parseInt(eElement.getElementsByTagName("gold_per_min").item(0).getTextContent()));
            jogador.setHpcurado(Integer.parseInt(eElement.getElementsByTagName("hero_healing").item(0).getTextContent()));
            jogador.setIdconta(Long.parseLong(eElement.getElementsByTagName("account_id").item(0).getTextContent()));
            jogador.setIdheroi(Integer.parseInt(eElement.getElementsByTagName("hero_id").item(0).getTextContent()));
            jogador.setItem1(Integer.parseInt(eElement.getElementsByTagName("item_0").item(0).getTextContent()));
            jogador.setItem2(Integer.parseInt(eElement.getElementsByTagName("item_1").item(0).getTextContent()));
            jogador.setItem3(Integer.parseInt(eElement.getElementsByTagName("item_2").item(0).getTextContent()));
            jogador.setItem4(Integer.parseInt(eElement.getElementsByTagName("item_3").item(0).getTextContent()));
            jogador.setItem5(Integer.parseInt(eElement.getElementsByTagName("item_4").item(0).getTextContent()));
            jogador.setItem6(Integer.parseInt(eElement.getElementsByTagName("item_5").item(0).getTextContent()));
            jogador.setKills(Integer.parseInt(eElement.getElementsByTagName("kills").item(0).getTextContent()));
            jogador.setLasthits(Integer.parseInt(eElement.getElementsByTagName("last_hits").item(0).getTextContent()));
            jogador.setLevel(Integer.parseInt(eElement.getElementsByTagName("level").item(0).getTextContent()));
            jogador.setMortes(Integer.parseInt(eElement.getElementsByTagName("deaths").item(0).getTextContent()));
            jogador.setOurofinal(Integer.parseInt(eElement.getElementsByTagName("gold").item(0).getTextContent()));
            jogador.setOurogasto(Integer.parseInt(eElement.getElementsByTagName("gold_spent").item(0).getTextContent()));
            jogador.setPartida(partida);
            jogador.setSlot(Integer.parseInt(eElement.getElementsByTagName("player_slot").item(0).getTextContent()));
            jogador.setXpm(Integer.parseInt(eElement.getElementsByTagName("xp_per_min").item(0).getTextContent()));
            
            session = util.HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(jogador);
            session.getTransaction().commit();
            session.close();
            
            NodeList nList2 = eElement.getElementsByTagName("ability");
            Node nNode2;
                System.out.println(nList2.getLength());
            for (int it = 0; it < nList2.getLength(); it++ ) {
                nNode2 = nList2.item(it);
                it++;
                System.out.println(it);
                if (nNode2.getNodeType() == Node.ELEMENT_NODE) {
            
            Element eElement1 = (Element) nNode2;
                habilidade.setIdhabilidade(Integer.parseInt(eElement1.getElementsByTagName("ability").item(0).getTextContent()));
                habilidade.setJogadores(jogador);
                habilidade.setLevel(Integer.parseInt(eElement1.getElementsByTagName("level").item(0).getTextContent()));
                habilidade.setTempo(Integer.parseInt(eElement1.getElementsByTagName("time").item(0).getTextContent()));
                session = util.HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(habilidade);
                session.getTransaction().commit();
                session.close();
                numPartidas++;
                
               }    
            }
                                    
            }
        }   
            }
            catch(Exception e) {
        if (session.isOpen() == true) {
            System.out.println("Fechando seção");
            session.close();
        }
        e.printStackTrace();
    }
        }
        }
            catch(Exception e) {
        if (session.isOpen() == true) {
            System.out.println("Fechando seção");
            session.close();
        }
        e.printStackTrace();
    }
        }
        
        
    } catch(Exception e) {
        if (session.isOpen() == true) {
            System.out.println("Fechando seção");
            session.close();
        }
        e.printStackTrace();
    }
    
    try {
        matches.clear();
        if (numPartidas < quantidade) {
        System.out.println("Aguardando 5 minutin");
    TimeUnit.MINUTES.sleep(1);
        }
} catch (InterruptedException e) {
    //Handle exception
}
        } 

    return numPartidas;
}
     
}
