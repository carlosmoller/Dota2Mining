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
 * @author calmeida
 */
public class sugerirTempo {
    public NaiveBayes bayes = new NaiveBayes();
    public Evaluation eval;
    public BufferedReader dados;
    public Instances dadosformatados;
    public BufferedReader dadosgerados;
    public Instances previsao;
    public Evaluation teste;
    public Random gerador = new Random();
    public int gerado;
    public int r, d = 0;
    public int herois[] = new int[111];
    public int heroir[] = new int [111];
    public int heroid[] = new int [111];
    public int radiant[] = new int[5];
    
    public sugerirTempo(int r1, int r2, int r3, int r4, int r5, int d1, int d2, int d3, int d4, int d5) {
        
        try {
            dados = new BufferedReader(new FileReader("tempoideal.arff"));
            dadosformatados = new Instances(dados);
            dadosformatados.setClassIndex(dadosformatados.numAttributes()-1);
            dados.close();
            FileWriter stream = new FileWriter("previsoestempo.arff");
            BufferedWriter out = new BufferedWriter(stream);
        
        
        
        for (int i = 0; i < 111; i++) {
            herois[i] = 0;
            heroir[i] = 0;
            heroid[i] = 0;
        }
        
            heroir[r1] = 1;
            heroir[r2] = 1;
            heroir[r3] = 1;
            heroir[r4] = 1;
            heroir[r5] = 1;
            heroid[d1] = 1;
            heroid[d2] = 1;
            heroid[d3] = 1;
            heroid[d4] = 1;
            heroid[d5] = 1;
        
            out.write("@relation dota\n");
        
        for (int i=0; i < 111; i++) {
            out.write("@attribute r"+i+" {0,1}\n");
        }
        
        for (int i=0; i < 111; i++) {
            out.write("@attribute d"+i+" {0,1}\n");
        }
        out.write("@attribute duracao numeric\n");
        out.write("@attribute timevitorioso {0,1}\n");
        out.write("\n@data\n");
        int tempo = 10;
        
        for (int i=0; i < 5; i++) {
            int j = 0;
            
            out.write(""+heroir[0]+"");
            for (j=1; j<111; j++) {
                out.write(","+heroir[j]+"");
            }
            out.write(","+heroid[0]+"");
            for (j=1; j<111; j++) {
                out.write(","+heroid[j]+"");
            }
            out.write(","+tempo*60+"");
            out.write(",0\n");
            tempo+=10;
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
            dadosgerados = new BufferedReader(new FileReader("previsoestempo.arff"));
            
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


  