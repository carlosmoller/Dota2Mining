/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;
import funcionalidades.Sugerirheroi;
import java.util.Map;
import java.util.HashMap;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Moller
 */
public class sugerirHeroi extends javax.swing.JFrame {

    Map herois = new HashMap();
    Map chaves = new HashMap();
    DefaultTableModel tabela;
    int picks[] = new int[10];
    int sugestao[] = new int [5];
    public sugerirHeroi() {
        
        
        herois.put(0, "Not chosen yet");
        herois.put(1, "Anti-Mage");
        herois.put(2, "Axe");
        herois.put(3, "Bane");
        herois.put(4, "Bloodseeker");
        herois.put(5, "Crystal Maiden");
        herois.put(6, "Drow Ranger");
        herois.put(7, "Earthshaker");
        herois.put(8, "Juggernaut");
        herois.put(9, "Mirana");        
        herois.put(10, "Morphling");
        herois.put(11, "Shadow Fiend");
        herois.put(12, "Phantom Lancer");
        herois.put(13, "Puck");
        herois.put(14, "Pudge");
        herois.put(15, "Razor");
        herois.put(16, "Sand King");
        herois.put(17, "Storm Spirit");
        herois.put(18, "Sven");
        herois.put(19, "Tiny");
        herois.put(20, "Vengeful Spirit");
        herois.put(21, "Windranger");
        herois.put(22, "Zeus");
        herois.put(23, "Kunkka");
        herois.put(24, "Terrorblade");
        herois.put(25, "Lina");
        herois.put(26, "Lion");
        herois.put(27, "Shadow Shaman");
        herois.put(28, "Slardar");
        herois.put(29, "Tidehunter");
        herois.put(30, "Witch Doctor");
        herois.put(31, "Lich");
        herois.put(32, "Riki");
        herois.put(33, "Enigma");
        herois.put(34, "Tinker");
        herois.put(35, "Sniper");
        herois.put(36, "Necrophos");
        herois.put(37, "Warlock");
        herois.put(38, "Beastmaster");
        herois.put(39, "Queen of Pain");
        herois.put(40, "Venomancer");
        herois.put(41, "Faceless Void");
        herois.put(42, "Wraith King");
        herois.put(43, "Death Prophet");
        herois.put(44, "Phantom Assassin");
        herois.put(45, "Pugna");
        herois.put(46, "Templar Assassin");
        herois.put(47, "Viper");
        herois.put(48, "Luna");
        herois.put(49, "Dragon Knight");
        herois.put(50, "Dazzle");
        herois.put(51, "Clockwerk");
        herois.put(52, "Leshrac");
        herois.put(53, "Nature's Prophet");
        herois.put(54, "Lifestealer");
        herois.put(55, "Dark Seer");
        herois.put(56, "Clinkz");
        herois.put(57, "Omniknight");
        herois.put(58, "Enchantress");
        herois.put(59, "Huskar");
        herois.put(60, "Night Stalker");
        herois.put(61, "Broodmother");
        herois.put(62, "Bounty Hunter");
        herois.put(63, "Weaver");
        herois.put(64, "Jakiro");
        herois.put(65, "Batrider");
        herois.put(66, "Chen");
        herois.put(67, "Spectre");
        herois.put(68, "Ancient Apparition");
        herois.put(69, "Doom");
        herois.put(70, "Ursa");
        herois.put(71, "Spirit Breaker");
        herois.put(72, "Gyrocopter");
        herois.put(73, "Alchemist");
        herois.put(74, "Invoker");
        herois.put(75, "Silencer");
        herois.put(76, "Outworld Devourer");
        herois.put(77, "Lycan");
        herois.put(78, "Brewmaster");
        herois.put(79, "Shadow Demon");
        herois.put(80, "Lone Druid");
        herois.put(81, "Chaos Knight");
        herois.put(82, "Meepo");
        herois.put(83, "Treant Protector");
        herois.put(84, "Ogre Magi");
        herois.put(85, "Undying");
        herois.put(86, "Rubick");
        herois.put(87, "Disruptor");
        herois.put(88, "Nyx Assassin");
        herois.put(89, "Naga Siren");
        herois.put(90, "Keeper of the Light");
        herois.put(91, "Io");
        herois.put(92, "Visage");
        herois.put(93, "Slark");
        herois.put(94, "Medusa");
        herois.put(95, "Troll Warlord");
        herois.put(96, "Centaur Warrunner");
        herois.put(97, "Magnus");
        herois.put(98, "Timbersaw");
        herois.put(99, "Bristleback");
        herois.put(100, "Tusk");
        herois.put(101, "Skywrath Mage");
        herois.put(102, "Abaddon");
        herois.put(103, "Elder Titan");
        herois.put(104, "Legion Commander");
        herois.put(105, "Techies");
        herois.put(106, "Ember Spirit");
        herois.put(107, "Earth Spirit");
        
        chaves.put("Not chosen yet", 0);
        chaves.put("Anti-Mage",1);
        chaves.put("Axe",2);
        chaves.put("Bane",3);
        chaves.put("Bloodseeker",4);
        chaves.put("Crystal Maiden",5);
        chaves.put("Drow Ranger",6);
        chaves.put("Earthshaker",7);
        chaves.put("Juggernaut",8);
        chaves.put("Mirana",9);        
        chaves.put("Morphling",10);
        chaves.put("Shadow Fiend",11);
        chaves.put("Phantom Lancer",12);
        chaves.put("Puck",13);
        chaves.put("Pudge",14);
        chaves.put("Razor",15);
        chaves.put("Sand King",16);
        chaves.put("Storm Spirit",17);
        chaves.put("Sven",18);
        chaves.put("Tiny",19);
        chaves.put("Vengeful Spirit",20);
        chaves.put("Windranger",21);
        chaves.put("Zeus",22);
        chaves.put("Kunkka",23);
        chaves.put("Terrorblade",24);
        chaves.put("Lina",25);
        chaves.put("Lion",26);
        chaves.put("Shadow Shaman",27);
        chaves.put("Slardar",28);
        chaves.put("Tidehunter",29);
        chaves.put("Witch Doctor",30);
        chaves.put("Lich",31);
        chaves.put("Riki",32);
        chaves.put("Enigma",33);
        chaves.put("Tinker",34);
        chaves.put("Sniper",35);
        chaves.put("Necrophos",36);
        chaves.put("Warlock",37);
        chaves.put("Beastmaster",38);
        chaves.put("Queen of Pain",39);
        chaves.put("Venomancer",40);
        chaves.put("Faceless Void",41);
        chaves.put("Wraith King",42);
        chaves.put("Death Prophet",43);
        chaves.put("Phantom Assassin",44);
        chaves.put("Pugna",45);
        chaves.put("Templar Assassin",46);
        chaves.put("Viper",47);
        chaves.put("Luna",48);
        chaves.put("Dragon Knight",49);
        chaves.put("Dazzle",50);
        chaves.put("Clockwerk",51);
        chaves.put("Leshrac",52);
        chaves.put("Nature's Prophet",53);
        chaves.put("Lifestealer",54);
        chaves.put("Dark Seer",55);
        chaves.put("Clinkz",56);
        chaves.put("Omniknight",57);
        chaves.put("Enchantress",58);
        chaves.put("Huskar",59);
        chaves.put("Night Stalker",60);
        chaves.put("Broodmother",61);
        chaves.put("Bounty Hunter",62);
        chaves.put("Weaver",63);
        chaves.put("Jakiro",64);
        chaves.put("Batrider",65);
        chaves.put("Chen",66);
        chaves.put("Spectre",67);
        chaves.put("Ancient Apparition",68);
        chaves.put("Doom",69);
        chaves.put("Ursa",70);
        chaves.put("Spirit Breaker",71);
        chaves.put("Gyrocopter",72);
        chaves.put("Alchemist",73);
        chaves.put("Invoker",74);
        chaves.put("Silencer",75);
        chaves.put("Outworld Devourer",76);
        chaves.put("Lycan",77);
        chaves.put("Brewmaster",78);
        chaves.put("Shadow Demon",79);
        chaves.put("Lone Druid",80);
        chaves.put("Chaos Knight",81);
        chaves.put("Meepo",82);
        chaves.put("Treant Protector",83);
        chaves.put("Ogre Magi",84);
        chaves.put("Undying",85);
        chaves.put("Rubick",86);
        chaves.put("Disruptor",87);
        chaves.put("Nyx Assassin",88);
        chaves.put("Naga Siren",89);
        chaves.put("Keeper of the Light",90);
        chaves.put("Io",91);
        chaves.put("Visage",92);
        chaves.put("Slark",93);
        chaves.put("Medusa",94);
        chaves.put("Troll Warlord",95);
        chaves.put("Centaur Warrunner",96);
        chaves.put("Magnus",97);
        chaves.put("Timbersaw",98);
        chaves.put("Bristleback",99);
        chaves.put("Tusk",100);
        chaves.put("Skywrath Mage",101);
        chaves.put("Abaddon",102);
        chaves.put("Elder Titan",103);
        chaves.put("Legion Commander",104);
        chaves.put("Techies",105);
        chaves.put("Ember Spirit",106);
        chaves.put("Earth Spirit",107);
        
        initComponents();
        tabela = (DefaultTableModel) this.jTable1.getModel();
        
        for (int i = 0; i < 107; i++) {
            this.jComboBox1.addItem((String) herois.get(i));
            this.jComboBox2.addItem((String) herois.get(i));
            this.jComboBox3.addItem((String) herois.get(i));
            this.jComboBox4.addItem((String) herois.get(i));
            this.jComboBox5.addItem((String) herois.get(i));
            this.jComboBox6.addItem((String) herois.get(i));
            this.jComboBox7.addItem((String) herois.get(i));
            this.jComboBox8.addItem((String) herois.get(i));
            this.jComboBox9.addItem((String) herois.get(i));
            this.jComboBox10.addItem((String) herois.get(i));
        }
             
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Team Selector");

        jLabel1.setText("Your Team");

        jLabel2.setText("Enemy Team");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hero 1", "Hero 2", "Hero 3", "Hero 4", "Hero 5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Suggest");
        jButton1.setActionCommand("Suggest");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Suggestions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        while (tabela.getRowCount() != 0) tabela.removeRow(0);
        
        picks[0] = (int) chaves.get(this.jComboBox1.getSelectedItem().toString());
        picks[1] = (int) chaves.get(this.jComboBox2.getSelectedItem().toString());
        picks[2] = (int) chaves.get(this.jComboBox3.getSelectedItem().toString());
        picks[3] = (int) chaves.get(this.jComboBox4.getSelectedItem().toString());
        picks[4] = (int) chaves.get(this.jComboBox5.getSelectedItem().toString());
        picks[5] = (int) chaves.get(this.jComboBox6.getSelectedItem().toString());
        picks[6] = (int) chaves.get(this.jComboBox7.getSelectedItem().toString());
        picks[7] = (int) chaves.get(this.jComboBox8.getSelectedItem().toString());
        picks[8] = (int) chaves.get(this.jComboBox9.getSelectedItem().toString());
        picks[9] = (int) chaves.get(this.jComboBox10.getSelectedItem().toString());
        Sugerirheroi previsao = new Sugerirheroi(picks[0],
                                                 picks[1],
                                                 picks[2],
                                                 picks[3],
                                                 picks[4],
                                                 picks[5],
                                                 picks[6],
                                                 picks[7],
                                                 picks[8],
                                                 picks[9]
        );
        previsao.realizarMineracao();
        for (int i = 0; i < 5; i++) {
             if (previsao.eval.predictions().get(i).predicted() == 0) {
                 int k = 0;
                 for (int j = 0; j < 107; j++) {
                     if (Integer.parseInt(previsao.previsao.get(i).stringValue(j)) == 1) {
                         sugestao[k] = j;
                         k++;
                     }
                 
                     
                 }
                 tabela.insertRow(tabela.getRowCount(), new Object[]{(String) herois.get(sugestao[0]),(String) herois.get(sugestao[1]),(String) herois.get(sugestao[2]),(String) herois.get(sugestao[3]),(String) herois.get(sugestao[4])}); 
                 
             }
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sugerirHeroi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sugerirHeroi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sugerirHeroi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sugerirHeroi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sugerirHeroi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
