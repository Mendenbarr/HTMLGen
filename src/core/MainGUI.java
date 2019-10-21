/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import components.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.Caret;

/**
 *
 * @author 01048750
 */
public class MainGUI extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        ImageButton.addActionListener(this);
        JumpListButton.addActionListener(this);
        LinkButton.addActionListener(this);
        TableButton.addActionListener(this);
        SaveButton.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        SaveButton = new javax.swing.JButton();
        LinkButton = new javax.swing.JButton();
        ImageButton = new javax.swing.JButton();
        TableButton = new javax.swing.JButton();
        JumpListButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTXT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HTML Generator");

        jToolBar1.setRollover(true);

        SaveButton.setText("Save");
        SaveButton.setFocusable(false);
        SaveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SaveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(SaveButton);

        LinkButton.setText("Insert Link");
        LinkButton.setFocusable(false);
        LinkButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LinkButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(LinkButton);

        ImageButton.setText("Insert Image");
        ImageButton.setFocusable(false);
        ImageButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImageButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(ImageButton);

        TableButton.setText("Insert Table");
        TableButton.setFocusable(false);
        TableButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TableButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(TableButton);

        JumpListButton.setText("Insert Jump List");
        JumpListButton.setFocusable(false);
        JumpListButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JumpListButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JumpListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumpListButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(JumpListButton);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        mainTXT.setColumns(20);
        mainTXT.setRows(5);
        mainTXT.setTabSize(4);
        mainTXT.setWrapStyleWord(true);
        jScrollPane1.setViewportView(mainTXT);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(616, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JumpListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumpListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumpListButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ImageButton;
    private javax.swing.JButton JumpListButton;
    private javax.swing.JButton LinkButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton TableButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea mainTXT;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source==ImageButton) new ImageGenerator(this).setVisible(true);
        else if (source==JumpListButton) new JumpListGenerator(this).setVisible(true);
        else if (source==LinkButton) new LinkGenerator(this).setVisible(true);
        else if (source==SaveButton) addText("Test");
        else if (source==TableButton) new TableGenerator(this).setVisible(true);
    }
    // Inserts text at the current curser position
    public void addText(String text) {
        mainTXT.insert(text, mainTXT.getCaretPosition());
    }
}
