/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;
import funcionalidades.SugerirBuild;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Moller
 */
public class sugerirBuild extends javax.swing.JFrame {

    /**
     * Creates new form sugerirBuild
     */
    Map herois = new HashMap();
    SugerirBuild build;
    String buildp1;
    String buildp2;
    String parametro;
    DefaultTableModel tabela;
    
    public sugerirBuild() {
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
        initComponents();
        
        tabela = (DefaultTableModel) this.jTable1.getModel();
        for (int i = 1; i < 107; i++) {
            this.jComboBox1.addItem((String) herois.get(i));
           
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Item suggestions");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Builds"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Before 15 Min.", "After 30 Min." }));

        jLabel1.setText("Character");

        jLabel2.setText("Match Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        while (tabela.getRowCount() != 0) tabela.removeRow(0);
        
        if (jComboBox2.getSelectedIndex() == 0)
        {
            System.out.println(jComboBox2.getSelectedItem().toString());
            parametro = ""+this.jComboBox1.getSelectedItem().toString()+"15";
        }
        else
        {
            System.out.println(jComboBox2.getSelectedItem().toString());
            parametro = ""+this.jComboBox1.getSelectedItem().toString()+"30";
        }
        build = new SugerirBuild(parametro);
        build.realizarMineracao();
        for (int j = 0; j < build.associacao.getAssociationRules().getNumRules(); j++) {
        buildp1 = build.associacao.getAssociationRules().getRules().get(j).getPremise().toString();
        buildp2 = build.associacao.getAssociationRules().getRules().get(j).getConsequence().toString();
        buildp1 +=" ";
        buildp2 = buildp2.replace("[", "/ ");
        buildp1 +=buildp2;
        buildp1 = buildp1.replace("=t","");
        buildp1 = buildp1.replace(","," /");
        buildp1 = buildp1.replace("[","");
        buildp1 = buildp1.replace("]","");
        tabela.insertRow(tabela.getRowCount(), new Object[]{(String) buildp1}); 

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
            java.util.logging.Logger.getLogger(sugerirBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sugerirBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sugerirBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sugerirBuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sugerirBuild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
