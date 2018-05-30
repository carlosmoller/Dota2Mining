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


public class associacaoHerois {
    public Apriori associacao = new Apriori();
    public Instances dadosformatados;
    public BufferedReader dados;
    
    public associacaoHerois() {
        try {
            dados = new BufferedReader(new FileReader("associacaoherois.arff"));
            dadosformatados = new Instances(dados);
            associacao.setMinMetric(0.15);
            associacao.setLowerBoundMinSupport(0.007);
            associacao.buildAssociations(dadosformatados);
            
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(associacaoHerois.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(associacaoHerois.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(associacaoHerois.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}