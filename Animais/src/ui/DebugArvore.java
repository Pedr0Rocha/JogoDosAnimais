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
        setResizable(false);
        setLocationRelativeTo(null);
        
        if (noAtual.getFilhoDir() == null && noAtual.getFilhoEsq() == null)
            animais += noAtual.getDado();
        else
            getPossiveisAnimais(this.noAtual);
        
        txtAnimais.setText(animais);
    }
    
    private void getPossiveisAnimais(NoArvore noAtual) {
        if (noAtual.getFilhoDir() != null) {
            if (!noAtual.getFilhoDir().getDado().contains("?"))
                animais += noAtual.getFilhoDir().getDado() + "\n";
            getPossiveisAnimais(noAtual.getFilhoDir());
        }
        if (noAtual.getFilhoEsq() != null) {
            if (!noAtual.getFilhoEsq().getDado().contains("?"))
                animais += noAtual.getFilhoEsq().getDado() + "\n";
            getPossiveisAnimais(noAtual.getFilhoEsq());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAnimais = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jogo dos Animais - Debug Arvore");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txtAnimais.setEditable(false);
        txtAnimais.setColumns(20);
        txtAnimais.setRows(5);
        jScrollPane1.setViewportView(txtAnimais);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel1.setText("Debug Arvore - Possíves Animais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(7, 7, 7, 7);
        getContentPane().add(jLabel1, gridBagConstraints);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        getContentPane().add(btnFechar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAnimais;
    // End of variables declaration//GEN-END:variables
}
