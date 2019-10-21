/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import core.MainGUI;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jake
 */
public class JFrameHTMLGen extends javax.swing.JFrame {

    public String boilerplate = "";
    public MainGUI parent;
    public javax.swing.JTextArea txtDoc;

    public void startOver() {
        txtDoc.setText(boilerplate);
    }

    public void add() {
        System.out.println(parent.getTitle());
        parent.addText(txtDoc.getText());
        this.dispose();
    }

    public void save() {
        JFileChooser chooser = new JFileChooser();
        int retValue = chooser.showSaveDialog(this);
        if (retValue == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                FileOutputStream fos = new FileOutputStream(f);
                String str = txtDoc.getText();
                fos.write(str.getBytes());
                fos.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Unable to save file.");
            }
        }
    }
}
