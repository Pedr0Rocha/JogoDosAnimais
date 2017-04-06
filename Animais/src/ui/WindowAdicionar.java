
package ui;

import animais.NoArvore;
import java.awt.Dimension;

/**
 *
 * @author pedrodesktop
 */
public class WindowAdicionar extends javax.swing.JFrame {

    NoArvore noAtual;
    
    public WindowAdicionar(NoArvore noAtual) {
        this.noAtual = noAtual;
        initComponents();
        myInits();
    }

    private void myInits() {
        setSize(new Dimension(400, 300));
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        lblCaracteristica.setText("Um(a) tem _____ mas " + this.noAtual.getDado() + " um não.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        txtAnimal = new javax.swing.JTextField();
        lblCaracteristica = new javax.swing.JLabel();
        txtCaracteristica = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo dos Animais - Adicionar");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Em qual animal você pensou?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        getContentPane().add(jLabel1, gridBagConstraints);

        txtAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnimalFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        getContentPane().add(txtAnimal, gridBagConstraints);

        lblCaracteristica.setText("Um(a) tem _____ mas um não.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        getContentPane().add(lblCaracteristica, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        getContentPane().add(txtCaracteristica, gridBagConstraints);

        btnAdicionar.setText("Adicionar Animal");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(btnAdicionar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        String animalCerto = txtAnimal.getText();
        String novaCaracteristica = txtCaracteristica.getText();
        String animalErrado = this.noAtual.getDado();
        
        this.noAtual.setDado("O animal que você pensou " + novaCaracteristica + "?");
        this.noAtual.setFilhoDir(new NoArvore(animalCerto));
        this.noAtual.setFilhoEsq(new NoArvore(animalErrado));
        
        dispose();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtAnimalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnimalFocusLost
        lblCaracteristica.setText("Um(a) " + txtAnimal.getText() + " ________ mas " + this.noAtual.getDado() + " um não.");
    }//GEN-LAST:event_txtAnimalFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCaracteristica;
    private javax.swing.JTextField txtAnimal;
    private javax.swing.JTextField txtCaracteristica;
    // End of variables declaration//GEN-END:variables
}
