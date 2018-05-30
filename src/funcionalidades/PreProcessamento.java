/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;
import util.HibernateUtil;
import persistencia.Jogadores;
import persistencia.Partida;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author calmeida
 */
public class PreProcessamento {
    int duracao, timevitorioso, r1, r2, r3, r4, r5, d1, d2, d3, d4, d5;
    int[] r = new int[151];
    int[] d = new int[151];
    String instancia = ""; 
    Partida partida = new Partida();
    Partida partida1 = new Partida();
    Jogadores jogador = new Jogadores();
    int[] itens = new int[250];
    
    public void criaARFFAssociacaoHerois() {
        try {
                  FileWriter stream = new FileWriter("associacaoherois.arff");
                  BufferedWriter out = new BufferedWriter(stream);
                  
           
           
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List listapartida = session.createQuery("from Partida").list();
        session.close();
        
        out.write("@relation dota\n");
        
        int i = 0;
        for (i=0; i < 111; i++) {
            r[i] = 0;
            out.write("@attribute r"+i+" { t}\n");
        }
        
        out.write("\n@data\n");
        for (i=0; i < listapartida.size(); i++) {
            partida = (Partida) listapartida.get(i);
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List listajogadores = session.createQuery("from Jogadores where idpartida ="+partida.getIdpartida()+"").list();
            session.close();
            for (int k = 0; k < listajogadores.size(); k++) {
                
                jogador = (Jogadores) listajogadores.get(k);
                if (k == 0) r1 = jogador.getIdheroi();
                if (k == 1) r2 = jogador.getIdheroi();
                if (k == 2) r3 = jogador.getIdheroi();
                if (k == 3) r4 = jogador.getIdheroi();
                if (k == 4) r5 = jogador.getIdheroi();
            }
            r[r1] = 1;
            r[r2] = 1;
            r[r3] = 1;
            r[r4] = 1;
            r[r5] = 1;
            
            if (r[0] == 0) out.write("?");
            else out.write("t");
            for (int j=1; j<110; j++) {
                if (r[j] == 0) out.write(",?");
                else out.write(",t");
            }
            if (r[110] == 0) out.write(",?\n");
            else out.write(",t\n");
            
            
            r[r1] = 0;
            r[r2] = 0;
            r[r3] = 0;
            r[r4] = 0;
            r[r5] = 0;
        
        }
        out.close();
        session.close();
            System.out.println("acabou");
        }
        catch (IOException e) {
               
        }
    }
    public void criaARFFBuild(String heroi, int id, int tempo ) {
    try {
        
       for (int i = 0; i < 216; i++) {
           itens[i] = 0;
       }
       
       FileWriter stream = new FileWriter(""+heroi+""+tempo+".arff");
       BufferedWriter out = new BufferedWriter(stream); 
       out.write("@relation dota\n\n");
       out.write("@attribute 'Blink Dagger' { t}\n");
       out.write("@attribute 'Blades of Attack' { t}\n");
       out.write("@attribute 'Broadsword' { t}\n");
       out.write("@attribute 'Chainmail' { t}\n");
       out.write("@attribute 'Claymore' { t}\n");
       out.write("@attribute 'Helm of Iron Will' { t}\n");
       out.write("@attribute 'Javelin' { t}\n");
       out.write("@attribute 'Mithril Hammer' { t}\n");
       out.write("@attribute 'Platemail' { t}\n");
       out.write("@attribute 'Quarterstaff' { t}\n");
       out.write("@attribute 'Quelling Blade' { t}\n");
       out.write("@attribute 'Ring of Protection' { t}\n");
       out.write("@attribute 'Gauntlets' { t}\n");
       out.write("@attribute 'Slippers' { t}\n");
       out.write("@attribute 'Mantle' { t}\n");
       out.write("@attribute 'Branches' { t}\n");
       out.write("@attribute 'Belt of Strenght' { t}\n");
       out.write("@attribute 'Boots of Elves' { t}\n");
       out.write("@attribute 'Robe' { t}\n");
       out.write("@attribute 'Circlet' { t}\n");
       out.write("@attribute 'Ogre Axe' { t}\n");
       out.write("@attribute 'Blades of Alacrity' { t}\n");
       out.write("@attribute 'Staff of Wizardry' { t}\n");
       out.write("@attribute 'Ultimate Orb' { t}\n");
       out.write("@attribute 'Gloves' { t}\n");
       out.write("@attribute 'Lifesteal' { t}\n");
       out.write("@attribute 'Ring of Regen' { t}\n");
       out.write("@attribute 'Sobi Mask' { t}\n");
       out.write("@attribute 'Boots' { t}\n");
       out.write("@attribute 'Gem of True Sight' { t}\n");
       out.write("@attribute 'Cloak' { t}\n");
       out.write("@attribute 'Talisman of Evasion' { t}\n");
       out.write("@attribute 'Cheese' { t}\n");
       out.write("@attribute 'Magic Stick' { t}\n");
       out.write("@attribute 'Magic Wand Recipe' { t}\n");
       out.write("@attribute 'Magic Wand' { t}\n");
       out.write("@attribute 'Ghost Scepter' { t}\n");
       out.write("@attribute 'Clarity' { t}\n");
       out.write("@attribute 'Flask' { t}\n");
       out.write("@attribute 'Dust' { t}\n");
       out.write("@attribute 'Bottle' { t}\n");
       out.write("@attribute 'Observer Wards' { t}\n");
       out.write("@attribute 'Sentry Wards' { t}\n");
       out.write("@attribute 'Tango' { t}\n");
       out.write("@attribute 'Courier' { t}\n");
       out.write("@attribute 'Teleport Scroll' { t}\n");
       out.write("@attribute 'Boots of Travel Recipe' { t}\n");
       out.write("@attribute 'Boots of Travel' { t}\n");
       out.write("@attribute 'Phase Boots Recipe' { t}\n");
       out.write("@attribute 'Phase Boots' { t}\n");
       out.write("@attribute 'Demon Edge' { t}\n");
       out.write("@attribute 'Eaglehorn' { t}\n");
       out.write("@attribute 'Reaver' { t}\n");
       out.write("@attribute 'Sacred Relic' { t}\n");
       out.write("@attribute 'Hyperstone' { t}\n");
       out.write("@attribute 'Ring of Health' { t}\n");
       out.write("@attribute 'Void Stone' { t}\n");
       out.write("@attribute 'Mystic Staff' { t}\n");
       out.write("@attribute 'Energy Booster' { t}\n");
       out.write("@attribute 'Point Booster' { t}\n");
       out.write("@attribute 'Vitality Booster' { t}\n");
       out.write("@attribute 'Power Treads Recipe' { t}\n");
       out.write("@attribute 'Power Treads' { t}\n");
       out.write("@attribute 'Hand of Midas Recipe' { t}\n");
       out.write("@attribute 'Hand of Midas' { t}\n");
       out.write("@attribute 'Oblivion Staff Recipe' { t}\n");
       out.write("@attribute 'Oblivion Staff' { t}\n");
       out.write("@attribute 'Perseverence Recipe' { t}\n");
       out.write("@attribute 'Perseverence' { t}\n");
       out.write("@attribute 'Poor Mans Shield Recipe' { t}\n");
       out.write("@attribute 'Poor Mans Shield' { t}\n");
       out.write("@attribute 'Bracer Recipe' { t}\n");
       out.write("@attribute 'Bracer' { t}\n");
       out.write("@attribute 'Wraith Band Recipe' { t}\n");
       out.write("@attribute 'Wraith Band' { t}\n");
       out.write("@attribute 'Null Talisman Recipe' { t}\n");
       out.write("@attribute 'Null Talisman' { t}\n");
       out.write("@attribute 'Mekansm Recipe' { t}\n");
       out.write("@attribute 'Mekansm' { t}\n");
       out.write("@attribute 'Vladimir Recipe' { t}\n");
       out.write("@attribute 'Vladimir' { t}\n");
       out.write("@attribute 'Null1' { t}\n");
       out.write("@attribute 'Null2' { t}\n");
       out.write("@attribute 'Flying Courier' { t}\n");
       out.write("@attribute 'Buckler Recipe' { t}\n");
       out.write("@attribute 'Buckler' { t}\n");
       out.write("@attribute 'Ring of Basilius Recipe' { t}\n");
       out.write("@attribute 'Ring of Basilius' { t}\n");
       out.write("@attribute 'Pipe Recipe' { t}\n");
       out.write("@attribute 'Pipe' { t}\n");
       out.write("@attribute 'Urn of Shadows Recipe' { t}\n");
       out.write("@attribute 'Urn of Shadows' { t}\n");
       out.write("@attribute 'Headdress Recipe' { t}\n");
       out.write("@attribute 'Headdress' { t}\n");
       out.write("@attribute 'Scyte of Vise Recipe' { t}\n");
       out.write("@attribute 'Scyte of Vise' { t}\n");
       out.write("@attribute 'Orchid Recipe' { t}\n");
       out.write("@attribute 'Orchid' { t}\n");
       out.write("@attribute 'Cyclone Recipe' { t}\n");
       out.write("@attribute 'Cyclone' { t}\n");
       out.write("@attribute 'Force Staff Recipe' { t}\n");
       out.write("@attribute 'Force Staff' { t}\n");
       out.write("@attribute 'Dagon Recipe' { t}\n");
       out.write("@attribute 'Dagon' { t}\n");
       out.write("@attribute 'Necronomicon Recipe' { t}\n");
       out.write("@attribute 'Necronomicon' { t}\n");
       out.write("@attribute 'Scepter Recipe' { t}\n");
       out.write("@attribute 'Scepter' { t}\n");
       out.write("@attribute 'Refresh Orb Recipe' { t}\n");
       out.write("@attribute 'Refresh Orb' { t}\n");
       out.write("@attribute 'Assault Cuirass Recipe' { t}\n");
       out.write("@attribute 'Assault Cuirass' { t}\n");
       out.write("@attribute 'Heart Recipe' { t}\n");
       out.write("@attribute 'Heart of Tarrasque' { t}\n");
       out.write("@attribute 'BKB Recipe' { t}\n");
       out.write("@attribute 'Black King Bar' { t}\n");
       out.write("@attribute 'Aegis' { t}\n");
       out.write("@attribute 'Shivas Guard Recipe' { t}\n");
       out.write("@attribute 'Shivas Guard' { t}\n");
       out.write("@attribute 'Bloodstone Recipe' { t}\n");
       out.write("@attribute 'Bloodstone' { t}\n");
       out.write("@attribute 'Linkens Recipe' { t}\n");
       out.write("@attribute 'Linkens Sphere' { t}\n");
       out.write("@attribute 'Vanguard Recipe' { t}\n");
       out.write("@attribute 'Vanguard' { t}\n");
       out.write("@attribute 'Blade Mail Recipe' { t}\n");
       out.write("@attribute 'Blade Mail' { t}\n");
       out.write("@attribute 'Soul Booster Recipe' { t}\n");
       out.write("@attribute 'Soul Booster' { t}\n");
       out.write("@attribute 'Hood Recipe' { t}\n");
       out.write("@attribute 'Hood of Defiance' { t}\n");
       out.write("@attribute 'Rapier Recipe' { t}\n");
       out.write("@attribute 'Divine Rapier' { t}\n");
       out.write("@attribute 'MKB Recipe' { t}\n");
       out.write("@attribute 'Monkey King Bar' { t}\n");
       out.write("@attribute 'Radiance Recipe' { t}\n");
       out.write("@attribute 'Radiance' { t}\n");
       out.write("@attribute 'Butterfly Recipe' { t}\n");
       out.write("@attribute 'Butterfly' { t}\n");
       out.write("@attribute 'Daedalus Recipe' { t}\n");
       out.write("@attribute 'Daedalus' { t}\n");
       out.write("@attribute 'Basher Recipe' { t}\n");
       out.write("@attribute 'Basher' { t}\n");
       out.write("@attribute 'Battlefury Recipe' { t}\n");
       out.write("@attribute 'Battlefury' { t}\n");
       out.write("@attribute 'Manta Recipe' { t}\n");
       out.write("@attribute 'Manta Style' { t}\n");
       out.write("@attribute 'Crystalis Recipe' { t}\n");
       out.write("@attribute 'Crystalis' { t}\n");
       out.write("@attribute 'Armlet Recipe' { t}\n");
       out.write("@attribute 'Armlet' { t}\n");
       out.write("@attribute 'Shadow Blade' { t}\n");
       out.write("@attribute 'Sange and Yasha Recipe' { t}\n");
       out.write("@attribute 'Sange and Yasha' { t}\n");
       out.write("@attribute 'Satanic Recipe' { t}\n");
       out.write("@attribute 'Satanic' { t}\n");
       out.write("@attribute 'Mjollnir Recipe' { t}\n");
       out.write("@attribute 'Mjollnir' { t}\n");
       out.write("@attribute 'Skadi Recipe' { t}\n");
       out.write("@attribute 'Skadi' { t}\n");
       out.write("@attribute 'Sange Recipe' { t}\n");
       out.write("@attribute 'Sange' { t}\n");
       out.write("@attribute 'Dominator Recipe' { t}\n");
       out.write("@attribute 'Dominator' { t}\n");
       out.write("@attribute 'Maelstrom Recipe' { t}\n");
       out.write("@attribute 'Maelstrom' { t}\n");
       out.write("@attribute 'Desolator Recipe' { t}\n");
       out.write("@attribute 'Desolator' { t}\n");
       out.write("@attribute 'Yasha Recipe' { t}\n");
       out.write("@attribute 'Yasha' { t}\n");
       out.write("@attribute 'Mask of Madness Recipe' { t}\n");
       out.write("@attribute 'Mask of Madness' { t}\n");
       out.write("@attribute 'Diffusal Recipe' { t}\n");
       out.write("@attribute 'Diffusal Blade' { t}\n");
       out.write("@attribute 'Ethereal Blade Recipe' { t}\n");
       out.write("@attribute 'Ethereal Blade' { t}\n");
       out.write("@attribute 'Soul Ring Recipe' { t}\n");
       out.write("@attribute 'Soul Ring' { t}\n");
       out.write("@attribute 'Arcane Boots Recipe' { t}\n");
       out.write("@attribute 'Arcane Boots' { t}\n");
       out.write("@attribute 'Orb of Venom' { t}\n");
       out.write("@attribute 'Stout Shield' { t}\n"); //182
       out.write("@attribute 'Shadow Blade Recipe' { t}\n");
       out.write("@attribute 'Drums Recipe' { t}\n");
       out.write("@attribute 'Drums' { t}\n");
       out.write("@attribute 'Medallion Recipe' { t}\n");
       out.write("@attribute 'Medallion' { t}\n");
       out.write("@attribute 'Smoke of Deceit' { t}\n");
       out.write("@attribute 'Veil of Discord Recipe' { t}\n");
       out.write("@attribute 'Veil of Discord' { t}\n");
       out.write("@attribute 'Null3' { t}\n");
       out.write("@attribute 'Null4' { t}\n");
       out.write("@attribute 'Null5' { t}\n");
       out.write("@attribute 'Null6' { t}\n");
       out.write("@attribute 'Null7' { t}\n");
       out.write("@attribute 'Null8' { t}\n");
       out.write("@attribute 'Null9' { t}\n");
       out.write("@attribute 'Null10' { t}\n");
       out.write("@attribute 'Null11' { t}\n");
       out.write("@attribute 'Null12' { t}\n");
       out.write("@attribute 'Null13' { t}\n");
       out.write("@attribute 'Null14' { t}\n");
       out.write("@attribute 'Null15' { t}\n");
       out.write("@attribute 'Null16' { t}\n");
       out.write("@attribute 'Rod of Atos Recipe' { t}\n");
       out.write("@attribute 'Rod of Atos' { t}\n");
       out.write("@attribute 'Abyssal Blade Recipe' { t}\n");
       out.write("@attribute 'Abyssal Blade' { t}\n");
       out.write("@attribute 'Halberd Recipe' { t}\n");
       out.write("@attribute 'Halberd' { t}\n");
       out.write("@attribute 'Ring of Aquilla Recipe' { t}\n");
       out.write("@attribute 'Ring of Aquilla' { t}\n");
       out.write("@attribute 'Tranquil Boots Recipe' { t}\n");
       out.write("@attribute 'Tranquil Boots' { t}\n");
       out.write("@attribute 'Shadow Amulet' { t}\n");
           
           out.write("@data\n");
    
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    List listajogadores = session.createQuery("from Jogadores where idheroi = "+id+"").list();
    session.close();
        System.out.println(listajogadores.size());
        
        for (int i=0; i < listajogadores.size(); i++) {
        jogador  = (Jogadores) listajogadores.get(i);
        partida = jogador.getPartida();
    
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List listapartida = session.createQuery("from Partida where idpartida = "+partida.getIdpartida()+"").list();
        session.close();
        
        partida1 = (Partida) listapartida.get(0);
            System.out.println(partida1.getDuracao());
        if (tempo == 30) {
        if (partida1.getDuracao() > 1799) {
            
        
        if (jogador.getItem1() != 0) itens[jogador.getItem1()] = 1;
        if (jogador.getItem2() != 0) itens[jogador.getItem2()] = 1;
        if (jogador.getItem3() != 0) itens[jogador.getItem3()] = 1;
        if (jogador.getItem4() != 0) itens[jogador.getItem4()] = 1;
        if (jogador.getItem5() != 0) itens[jogador.getItem5()] = 1;
        if (jogador.getItem6() != 0) itens[jogador.getItem6()] = 1;
        
        if (itens[1] == 0) out.write("?");
        else out.write("t");
                
        for (int j=2; j<216; j++) {
                if (itens[j] == 0) out.write(",?");
                else out.write(",t");
        
        }
        out.write("\n");
        itens[jogador.getItem1()] = 0;
        itens[jogador.getItem2()] = 0;
        itens[jogador.getItem3()] = 0;
        itens[jogador.getItem4()] = 0;
        itens[jogador.getItem5()] = 0;
        itens[jogador.getItem6()] = 0;
        }
    }
        else {
        if (partida1.getDuracao() < 601) {
            
        
            if (jogador.getItem1() != 0) itens[jogador.getItem1()] = 1;
            if (jogador.getItem2() != 0) itens[jogador.getItem2()] = 1;
            if (jogador.getItem3() != 0) itens[jogador.getItem3()] = 1;
            if (jogador.getItem4() != 0) itens[jogador.getItem4()] = 1;
            if (jogador.getItem5() != 0) itens[jogador.getItem5()] = 1;
            if (jogador.getItem6() != 0) itens[jogador.getItem6()] = 1;

            if (itens[1] == 0) out.write("?");
            else out.write("t");

            for (int j=2; j<216; j++) {
                    if (itens[j] == 0) out.write(",?");
                    else out.write(",t");

            }
            out.write("\n");
            itens[jogador.getItem1()] = 0;
            itens[jogador.getItem2()] = 0;
            itens[jogador.getItem3()] = 0;
            itens[jogador.getItem4()] = 0;
            itens[jogador.getItem5()] = 0;
            itens[jogador.getItem6()] = 0;
            }
        }
    
    }
    out.close();
}
    catch (IOException e) {
            
    }
}
    public void criaARFFTempoIdeal() {
        try {
                  FileWriter stream = new FileWriter("tempoideal.arff");
                  BufferedWriter out = new BufferedWriter(stream);
                  
           
           
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List listapartida = session.createQuery("from Partida").list();
        session.close();
        
        out.write("@relation dota\n");
        
        int i = 0;
        for (i=0; i < 111; i++) {
            r[i] = 0;
            out.write("@attribute r"+i+" {0,1}\n");
        }
        
        for (i=0; i < 111; i++) {
            d[i] = 0;
            out.write("@attribute d"+i+" {0,1}\n");
        }
        out.write("@attribute duracao numeric\n");
        out.write("@attribute timevitorioso {0,1}\n");
        out.write("\n@data\n");
        for (i=0; i < listapartida.size(); i++) {
            partida = (Partida) listapartida.get(i);
            timevitorioso = partida.getTimevitorioso();
            duracao = partida.getDuracao();
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List listajogadores = session.createQuery("from Jogadores where idpartida ="+partida.getIdpartida()+"").list();
            session.close();
            for (int k = 0; k < listajogadores.size(); k++) {
                
                jogador = (Jogadores) listajogadores.get(k);
                if (k == 0) r1 = jogador.getIdheroi();
                if (k == 1) r2 = jogador.getIdheroi();
                if (k == 2) r3 = jogador.getIdheroi();
                if (k == 3) r4 = jogador.getIdheroi();
                if (k == 4) r5 = jogador.getIdheroi();
                if (k == 5) d1 = jogador.getIdheroi();
                if (k == 6) d2 = jogador.getIdheroi();
                if (k == 7) d3 = jogador.getIdheroi();
                if (k == 8) d4 = jogador.getIdheroi();
                if (k == 9) d5 = jogador.getIdheroi();
            }
            r[r1] = 1;
            r[r2] = 1;
            r[r3] = 1;
            r[r4] = 1;
            r[r5] = 1;
            d[d1] = 1;
            d[d2] = 1;
            d[d3] = 1;
            d[d4] = 1;
            d[d5] = 1;
            
            out.write(""+r[0]+"");
            for (int j=1; j<111; j++) {
                out.write(","+r[j]+"");
            }
            out.write(","+d[0]+"");
            for (int l=1; l<111; l++) {
                out.write(","+d[l]+"");
            }
            out.write(","+duracao+"");
            out.write(","+timevitorioso+"\n");
            
            r[r1] = 0;
            r[r2] = 0;
            r[r3] = 0;
            r[r4] = 0;
            r[r5] = 0;
            d[d1] = 0;
            d[d2] = 0;
            d[d3] = 0;
            d[d4] = 0;
            d[d5] = 0;
        
        }
        out.close();
        }
        catch (IOException e) {
               System.out.println(e);
        }
    }
    public void criaARFFSugestaoTime() {
        try {
                  FileWriter stream = new FileWriter("analisetimevitorioso.arff");
                  BufferedWriter out = new BufferedWriter(stream);
                  
           
           
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List listapartida = session.createQuery("from Partida").list();
        session.close();
        
        out.write("@relation dota\n");
        
        int i = 0;
        for (i=0; i < 111; i++) {
            r[i] = 0;
            out.write("@attribute r"+i+" {0,1}\n");
        }
        
        for (i=0; i < 111; i++) {
            d[i] = 0;
            out.write("@attribute d"+i+" {0,1}\n");
        }
        out.write("@attribute timevitorioso {0,1}\n");
        out.write("\n@data\n");
        for (i=0; i < listapartida.size(); i++) {
            partida = (Partida) listapartida.get(i);
            timevitorioso = partida.getTimevitorioso();
            
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List listajogadores = session.createQuery("from Jogadores where idpartida ="+partida.getIdpartida()+"").list();
            session.close();
            for (int k = 0; k < listajogadores.size(); k++) {
                
                jogador = (Jogadores) listajogadores.get(k);
                if (k == 0) r1 = jogador.getIdheroi();
                if (k == 1) r2 = jogador.getIdheroi();
                if (k == 2) r3 = jogador.getIdheroi();
                if (k == 3) r4 = jogador.getIdheroi();
                if (k == 4) r5 = jogador.getIdheroi();
                if (k == 5) d1 = jogador.getIdheroi();
                if (k == 6) d2 = jogador.getIdheroi();
                if (k == 7) d3 = jogador.getIdheroi();
                if (k == 8) d4 = jogador.getIdheroi();
                if (k == 9) d5 = jogador.getIdheroi();
            }
            r[r1] = 1;
            r[r2] = 1;
            r[r3] = 1;
            r[r4] = 1;
            r[r5] = 1;
            d[d1] = 1;
            d[d2] = 1;
            d[d3] = 1;
            d[d4] = 1;
            d[d5] = 1;
            
            out.write(""+r[0]+"");
            for (int j=1; j<111; j++) {
                out.write(","+r[j]+"");
            }
            out.write(","+d[0]+"");
            for (int l=1; l<111; l++) {
                out.write(","+d[l]+"");
            }
            out.write(","+timevitorioso+"\n");
            
            r[r1] = 0;
            r[r2] = 0;
            r[r3] = 0;
            r[r4] = 0;
            r[r5] = 0;
            d[d1] = 0;
            d[d2] = 0;
            d[d3] = 0;
            d[d4] = 0;
            d[d5] = 0;
        
        }
        out.close();
            System.out.println("acabou");
        }
        catch (IOException e) {
               
        }
    }
}
