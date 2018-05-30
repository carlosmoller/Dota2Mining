/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionalidades;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;
/**
 *
 * @author Moller
 */
public class Sugerirheroi {
    
    public NaiveBayes bayes = new NaiveBayes();
    public Evaluation eval;
    public BufferedReader dados;
    public Instances dadosformatados;
    public BufferedReader dadosgerados;
    public Instances previsao;
    public Random gerador = new Random();
    public int gerado;
    public int r, d = 0;
    public int herois[] = new int[111];
    public int heroir[] = new int [111];
    public int heroid[] = new int [111];
    public int radiant[] = new int[5];
    
    
    
    
    public Sugerirheroi(int r1, int r2, int r3, int r4, int r5, int d1, int d2, int d3, int d4, int d5) {
        
        try {
            dados = new BufferedReader(new FileReader("analisetimevitorioso.arff"));
            dadosformatados = new Instances(dados);
            dadosformatados.setClassIndex(dadosformatados.numAttributes()-1);
            dados.close();
            FileWriter stream = new FileWriter("previsoes.arff");
            BufferedWriter out = new BufferedWriter(stream);
        
        
        
        for (int i = 0; i < 111; i++) {
            herois[i] = 0;
            heroir[i] = 0;
            heroid[i] = 0;
        }
        
        if (r1 != 0) {
            herois[r1] = 1;
            heroir[r1] = 1;
        }
        else r++;
        
        if (r2 != 0) {
            herois[r2] = 1;
            heroir[r2] = 1;
        }
        else r++;
        if (r3 != 0) {
            herois[r3] = 1;
            heroir[r3] = 1;
        }
        else r++;
        if (r4 != 0) {
            herois[r4] = 1;
            heroir[r4] = 1;
        }
        else r++;
        if (r5 != 0) {
            herois[r5] = 1;
            heroir[r5] = 1;
        }
        else r++;
        
        if (d1 != 0) {
            herois[d1] = 1;
            heroid[d1] = 1;
        }
        if (d2 != 0) {
            herois[d2] = 1;
            heroid[d2] = 1;
        }
        if (d3 != 0) {
            herois[d3] = 1;
            heroid[d3] = 1;
        }
        if (d4 != 0) {
            herois[d4] = 1;
            heroid[d4] = 1;
        }
        if (d5 != 0) {
            herois[d5] = 1;
            heroid[d5] = 1;
        }
        
        
        
        
        System.out.println("Rodando");
        System.out.println(dadosformatados.numInstances());
        System.out.println(dadosformatados.get(150).stringValue(7));
        out.write("@relation dota\n");
        
        for (int i=0; i < 111; i++) {
            out.write("@attribute r"+i+" {0,1}\n");
        }
        
        for (int i=0; i < 111; i++) {
            out.write("@attribute d"+i+" {0,1}\n");
        }
        out.write("@attribute timevitorioso {0,1}\n");
        out.write("\n@data\n");
        for (int i=0; i < 500; i++) {
            int j = 0;
            while (j < r) {
                gerado = gerador.nextInt(110)+1;
                if (herois[gerado] == 0) {
                    radiant[j] = gerado;
                    heroir[gerado] = 1;
                    herois[gerado] = 1;
                    j++;
                }
            }
            out.write(""+heroir[0]+"");
            for (j=1; j<111; j++) {
                out.write(","+heroir[j]+"");
            }
            out.write(","+heroid[0]+"");
            for (j=1; j<111; j++) {
                out.write(","+heroid[j]+"");
            }
            out.write(",0\n");
            j = 0;
            
            while (j < radiant.length) {
                heroir[radiant[j]] = 0;
                herois[radiant[j]] = 0;
                radiant[j] = 0;
                j++;
            }
            
            
            
        }
        out.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sugerirheroi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Sugerirheroi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void realizarMineracao() {
        

        try {
            dadosgerados = new BufferedReader(new FileReader("previsoes.arff"));
            
            previsao = new Instances(dadosgerados);
            previsao.setClassIndex(dadosformatados.numAttributes()-1);
            bayes.buildClassifier(dadosformatados);
            this.eval = new Evaluation(dadosformatados);
            eval.evaluateModel(bayes, previsao);
            
            
        } catch (Exception ex) {
            Logger.getLogger(Sugerirheroi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
    
    
}
