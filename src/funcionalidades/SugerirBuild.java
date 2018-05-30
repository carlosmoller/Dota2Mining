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
import weka.core.Instances;
import weka.associations.Apriori;


/**
 *
 * @author Moller
 */
public class SugerirBuild {
    public Apriori associacao = new Apriori();
    public Instances dadosformatados;
    public BufferedReader dados;
    
    public SugerirBuild(String heroi) {
        try {
            
            dados = new BufferedReader(new FileReader(""+heroi+".arff"));
            dadosformatados = new Instances(dados);
            dados.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SugerirBuild.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SugerirBuild.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    public void realizarMineracao() {
        try {
            
            associacao.setMinMetric(0.7);
            associacao.setLowerBoundMinSupport(0.05);
            associacao.setOutputItemSets(true);
            associacao.buildAssociations(dadosformatados);
            
        } catch (Exception ex) {
            Logger.getLogger(SugerirBuild.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
