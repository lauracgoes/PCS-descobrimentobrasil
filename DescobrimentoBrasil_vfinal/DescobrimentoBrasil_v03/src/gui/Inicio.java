/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import jogo.Jogo;

/**
 *
 * @author Bianca
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form InicioTeste
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaInicio = new javax.swing.JTabbedPane();
        telaInicioJogo = new javax.swing.JPanel();
        labelNomeJogo = new javax.swing.JLabel();
        labelNomeAluno = new javax.swing.JLabel();
        campoNomeAluno = new javax.swing.JTextField();
        botaoJogar = new javax.swing.JButton();
        labelPergaminhoFundo = new javax.swing.JLabel();
        telaResponsavel = new javax.swing.JPanel();
        labelSenha = new javax.swing.JLabel();
        campoSenhaResponsavel = new javax.swing.JPasswordField();
        botaoVerRelatorio = new javax.swing.JButton();
        labelPergaminhoResp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(668, 510));
        getContentPane().setLayout(null);

        telaInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        telaInicioJogo.setLayout(null);

        labelNomeJogo.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        labelNomeJogo.setText("Descobrimento do Brasil");
        telaInicioJogo.add(labelNomeJogo);
        labelNomeJogo.setBounds(160, 60, 410, 60);

        labelNomeAluno.setFont(new java.awt.Font("Blackadder ITC", 0, 30)); // NOI18N
        labelNomeAluno.setText("Qual é o seu nome?");
        telaInicioJogo.add(labelNomeAluno);
        labelNomeAluno.setBounds(230, 140, 210, 50);

        campoNomeAluno.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        campoNomeAluno.setBorder(new javax.swing.border.MatteBorder(null));
        telaInicioJogo.add(campoNomeAluno);
        campoNomeAluno.setBounds(260, 200, 140, 50);

        botaoJogar.setBackground(new java.awt.Color(209, 191, 129));
        botaoJogar.setFont(new java.awt.Font("DFKai-SB", 0, 18)); // NOI18N
        botaoJogar.setText("PARTICIPAR DO DESAFIO!");
        botaoJogar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        botaoJogar.setMargin(new java.awt.Insets(1, 3, 1, 3));
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });
        telaInicioJogo.add(botaoJogar);
        botaoJogar.setBounds(210, 320, 230, 50);

        labelPergaminhoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background-Pergaminho-2.png"))); // NOI18N
        telaInicioJogo.add(labelPergaminhoFundo);
        labelPergaminhoFundo.setBounds(-70, -40, 760, 1000);

        telaInicio.addTab("Jogo", telaInicioJogo);

        telaResponsavel.setLayout(null);

        labelSenha.setFont(new java.awt.Font("Blackadder ITC", 0, 30)); // NOI18N
        labelSenha.setText("Qual é a sua senha?");
        telaResponsavel.add(labelSenha);
        labelSenha.setBounds(210, 120, 210, 30);
        telaResponsavel.add(campoSenhaResponsavel);
        campoSenhaResponsavel.setBounds(260, 170, 120, 40);

        botaoVerRelatorio.setFont(new java.awt.Font("Blackadder ITC", 0, 20)); // NOI18N
        botaoVerRelatorio.setText("Visualizar Relatório");
        botaoVerRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerRelatorioActionPerformed(evt);
            }
        });
        telaResponsavel.add(botaoVerRelatorio);
        botaoVerRelatorio.setBounds(230, 300, 180, 70);

        labelPergaminhoResp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background-Pergaminho-2.png"))); // NOI18N
        telaResponsavel.add(labelPergaminhoResp);
        labelPergaminhoResp.setBounds(-80, -10, 740, 950);

        telaInicio.addTab("Responsável", telaResponsavel);

        getContentPane().add(telaInicio);
        telaInicio.setBounds(0, 0, 668, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVerRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerRelatorioActionPerformed
        // TODO add your handling code here:
        char[] senha = campoSenhaResponsavel.getPassword();
        if(checaSenha(senha))
            try {
                Runtime.getRuntime().exec(new String[]
                {"rundll32", "url.dll,FileProtocolHandler",
                    "log.txt"});
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoVerRelatorioActionPerformed

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
        // TODO add your handling code here:
        Jogo.getDb().getRodadaAtual().setNome(campoNomeAluno.getText());
        this.setVisible(false);
        Jogo.sortearRegioes();
        InterfaceMapa1.main(null);
    }//GEN-LAST:event_botaoJogarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private static boolean checaSenha(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { 'a', 'b', 'c', '1', '2', '3' };

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(input, correctPassword);
        }
        //Zero out the password.
        Arrays.fill(correctPassword,'0');

        return isCorrect;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoJogar;
    private javax.swing.JButton botaoVerRelatorio;
    private javax.swing.JTextField campoNomeAluno;
    private javax.swing.JPasswordField campoSenhaResponsavel;
    private javax.swing.JLabel labelNomeAluno;
    private javax.swing.JLabel labelNomeJogo;
    private javax.swing.JLabel labelPergaminhoFundo;
    private javax.swing.JLabel labelPergaminhoResp;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JTabbedPane telaInicio;
    private javax.swing.JPanel telaInicioJogo;
    private javax.swing.JPanel telaResponsavel;
    // End of variables declaration//GEN-END:variables
}
