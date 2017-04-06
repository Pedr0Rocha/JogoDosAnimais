package ui;

import animais.NoArvore;
import java.awt.Dimension;

/**
 *
 * @author pedrodesktop
 */
public class DebugArvore extends javax.swing.JFrame {

    NoArvore noAtual;
    String animais = "";
    
    public DebugArvore(NoArvore noAtual) {
        this.noAtual = noAtual;
        initComponents();
    
        myInits();
    }

    private void myInits() {
        setSize(new Dimension(400, 300));
        setLocationRelativeTo(null);
        
        getPossiveisAnimais(this.noAtual);
    }
    
    private void getPossiveisAnimais(NoArvore noAtual) {
        if (this.noAtual.getFilhoDir() != null) {
            System.out.println("CADE " + this.noAtual.getFilhoDir().getDado());
            animais += this.noAtual.getFilhoDir().getDado();
            animais += "\n";
            getPossiveisAnimais(noAtual.getFilhoDir());
        }
        if (this.noAtual.getFilhoEsq() != null) {
            animais += this.noAtual.getFilhoEsq().getDado();
            animais += "\n";
            getPossiveisAnimais(noAtual.getFilhoEsq());
        }
        txtAnimais.setText(animais);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnimais = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txtAnimais.setColumns(20);
        txtAnimais.setRows(5);
        jScrollPane1.setViewportView(txtAnimais);

        getContentPane().add(jScrollPane1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAnimais;
    // End of variables declaration//GEN-END:variables
}
