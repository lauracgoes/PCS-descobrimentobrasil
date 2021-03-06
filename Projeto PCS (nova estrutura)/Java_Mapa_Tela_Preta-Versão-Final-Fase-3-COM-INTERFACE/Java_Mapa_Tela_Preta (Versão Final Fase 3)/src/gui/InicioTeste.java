/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Bianca
 */
public class InicioTeste extends javax.swing.JFrame {

    /**
     * Creates new form InicioTeste
     */
    public InicioTeste() {
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
        getContentPane().setLayout(null);

        telaInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        telaInicioJogo.setLayout(null);

        labelNomeJogo.setFont(new java.awt.Font("Blackadder ITC", 1, 36)); // NOI18N
        labelNomeJogo.setText("Descobrimento do Brasil");
        telaInicioJogo.add(labelNomeJogo);
        labelNomeJogo.setBounds(140, 60, 410, 60);

        labelNomeAluno.setFont(new java.awt.Font("Blackadder ITC", 0, 30)); // NOI18N
        labelNomeAluno.setText("Qual é o seu nome?");
        telaInicioJogo.add(labelNomeAluno);
        labelNomeAluno.setBounds(230, 140, 230, 60);

        campoNomeAluno.setBackground(new java.awt.Color(255, 255, 204));
        campoNomeAluno.setFont(new java.awt.Font("Blackadder ITC", 1, 24)); // NOI18N
        campoNomeAluno.setText("Pedro Álvares");
        campoNomeAluno.setBorder(null);
        telaInicioJogo.add(campoNomeAluno);
        campoNomeAluno.setBounds(260, 210, 140, 40);

        botaoJogar.setBackground(new java.awt.Color(209, 191, 129));
        botaoJogar.setFont(new java.awt.Font("DFKai-SB", 0, 18)); // NOI18N
        botaoJogar.setText("JOGAR!");
        telaInicioJogo.add(botaoJogar);
        botaoJogar.setBounds(280, 320, 100, 50);

        labelPergaminhoFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Desktop\\Projeto PCS\\Background-Pergaminho-2 - Copia.png")); // NOI18N
        telaInicioJogo.add(labelPergaminhoFundo);
        labelPergaminhoFundo.setBounds(40, 0, 640, 510);

        telaInicio.addTab("Jogo", telaInicioJogo);

        telaResponsavel.setLayout(null);

        labelSenha.setFont(new java.awt.Font("Blackadder ITC", 0, 30)); // NOI18N
        labelSenha.setText("Qual é a sua senha?");
        telaResponsavel.add(labelSenha);
        labelSenha.setBounds(210, 120, 210, 30);

        campoSenhaResponsavel.setText("jPasswordField1");
        telaResponsavel.add(campoSenhaResponsavel);
        campoSenhaResponsavel.setBounds(260, 170, 120, 40);

        botaoVerRelatorio.setFont(new java.awt.Font("Blackadder ITC", 0, 20)); // NOI18N
        botaoVerRelatorio.setText("Visualizar Relatório");
        telaResponsavel.add(botaoVerRelatorio);
        botaoVerRelatorio.setBounds(230, 300, 180, 70);

        labelPergaminhoResp.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bianca\\Desktop\\Projeto PCS\\Background-Pergaminho-2 - Copia.png")); // NOI18N
        labelPergaminhoResp.setText("jLabel1");
        telaResponsavel.add(labelPergaminhoResp);
        labelPergaminhoResp.setBounds(30, 0, 600, 510);

        telaInicio.addTab("Responsável", telaResponsavel);

        getContentPane().add(telaInicio);
        telaInicio.setBounds(0, 0, 668, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InicioTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTeste().setVisible(true);
            }
        });
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
