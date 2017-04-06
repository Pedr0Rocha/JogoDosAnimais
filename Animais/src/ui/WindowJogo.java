package ui;

import animais.NoArvore;
import java.awt.Dimension;

/**
 *
 * @author pedrodesktop
 */
public class WindowJogo extends javax.swing.JFrame {

    private NoArvore raiz;
    private NoArvore noAtual;
    private boolean adivinhando;
    
    public WindowJogo(NoArvore raiz) {
        adivinhando = false;
        this.raiz = raiz;
        initComponents();
        myInits();
    }

    private void myInits() {
        setSize(new Dimension(400, 300));
        setResizable(false);
        setLocationRelativeTo(null);
        
        comecaJogo();
    }
    
    private void comecaJogo() {
        this.noAtual = this.raiz;
        fazPergunta(this.noAtual.getDado());
    }
    
    private void rodaJogo() {
        if (!this.noAtual.ehFolha())
            fazPergunta(this.noAtual.getDado());
        else
            adivinharAnimal();
    }
    
    private void fazPergunta(String pergunta) {
        lblTexto.setText(pergunta);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblTexto = new javax.swing.JLabel();
        btnSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        btnDebug = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo dos Animais - Jogo");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        getContentPane().add(lblTexto, gridBagConstraints);

        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(btnSim, gridBagConstraints);

        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(11, 11, 11, 11);
        getContentPane().add(btnNao, gridBagConstraints);

        btnDebug.setText("Debug");
        btnDebug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebugActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(btnDebug, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        if (adivinhando) {
            adivinhando = false;
            acertouAnimal();
        } else {
            if (!this.noAtual.ehFolha()) {
                this.noAtual = this.noAtual.getFilhoDir();
                rodaJogo();
            }
        }
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        if (adivinhando) {
            adivinhando = false;
            adicionaAnimal();
        } else {
            if (!this.noAtual.ehFolha()) {        
                this.noAtual = this.noAtual.getFilhoEsq();
                rodaJogo();
            }
        }
    }//GEN-LAST:event_btnNaoActionPerformed

    private void btnDebugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebugActionPerformed
        new DebugArvore(this.noAtual).setVisible(true);
    }//GEN-LAST:event_btnDebugActionPerformed

    private void adivinharAnimal() {
        adivinhando = true;
        fazPergunta("O animal é " + this.noAtual.getDado() + "?");
    }
    
    private void adicionaAnimal() {
        new WindowAdicionar(this.noAtual).setVisible(true);
        comecaJogo();
    }
    
    private void acertouAnimal() {
        new WindowAcertou().setVisible(true);
        comecaJogo();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDebug;
    private javax.swing.JButton btnNao;
    private javax.swing.JButton btnSim;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
}