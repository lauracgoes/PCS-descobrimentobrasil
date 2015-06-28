/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import jogo.Jogo;
import jogo.Regiao;

/**
 *
 * @author Laura
 */
public class InterfaceMapa1 extends javax.swing.JFrame {

    ArrayList<Regiao> regioes = jogo.Jogo.getRegioesSorteadas();
    Regiao regiaoAtual = regioes.get(0);
    int posAtual = 0;
    boolean primeiraVez = true;
    boolean acertou = false;
    int pontuacao = 0;
    
    /**
     * Creates new form InterfaceMapa
     */
    public InterfaceMapa1() {
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

        labelPontuacao = new javax.swing.JLabel();
        labelInformativa = new javax.swing.JLabel();
        botaoMapaSudeste = new javax.swing.JButton();
        botaoMapaNordeste = new javax.swing.JButton();
        botaoMapaNorte = new javax.swing.JButton();
        botaoMapaCentroOeste = new javax.swing.JButton();
        botaoMapaSul = new javax.swing.JButton();
        campoPontuacao = new javax.swing.JTextField();
        labelMostraRegiao = new javax.swing.JLabel();
        labelImagemMapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(704, 642));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        labelPontuacao.setFont(new java.awt.Font("Perpetua Titling MT", 0, 11)); // NOI18N
        labelPontuacao.setText("Pontos:");
        getContentPane().add(labelPontuacao);
        labelPontuacao.setBounds(420, 450, 50, 20);

        labelInformativa.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        labelInformativa.setText("Acerte a região!");
        getContentPane().add(labelInformativa);
        labelInformativa.setBounds(230, 0, 190, 80);

        botaoMapaSudeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSudesteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSudeste);
        botaoMapaSudeste.setBounds(380, 350, 40, 30);

        botaoMapaNordeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaNordesteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaNordeste);
        botaoMapaNordeste.setBounds(400, 240, 50, 40);

        botaoMapaNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaNorteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaNorte);
        botaoMapaNorte.setBounds(240, 190, 50, 40);

        botaoMapaCentroOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaCentroOesteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaCentroOeste);
        botaoMapaCentroOeste.setBounds(290, 300, 50, 40);

        botaoMapaSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSulActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSul);
        botaoMapaSul.setBounds(320, 410, 30, 40);

        campoPontuacao.setText(Integer.toString(pontuacao));
        getContentPane().add(campoPontuacao);
        campoPontuacao.setBounds(470, 440, 60, 40);

        labelMostraRegiao.setText(regiaoAtual.getNome());
        getContentPane().add(labelMostraRegiao);
        labelMostraRegiao.setBounds(210, 70, 220, 50);

        labelImagemMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mapa Fase 1.jpg"))); // NOI18N
        getContentPane().add(labelImagemMapa);
        labelImagemMapa.setBounds(130, 110, 460, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMapaSudesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSudesteActionPerformed
        // TODO add your handling code here:
        checaResposta("sudeste");
    }//GEN-LAST:event_botaoMapaSudesteActionPerformed

    private void botaoMapaNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaNorteActionPerformed
        // TODO add your handling code here:
        checaResposta("norte");
    }//GEN-LAST:event_botaoMapaNorteActionPerformed

    private void botaoMapaNordesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaNordesteActionPerformed
        // TODO add your handling code here:
        checaResposta("nordeste");
    }//GEN-LAST:event_botaoMapaNordesteActionPerformed

    private void botaoMapaCentroOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaCentroOesteActionPerformed
        // TODO add your handling code here:
        checaResposta("centro-oeste");
    }//GEN-LAST:event_botaoMapaCentroOesteActionPerformed

    private void botaoMapaSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSulActionPerformed
        // TODO add your handling code here:
        checaResposta("sul");
    }//GEN-LAST:event_botaoMapaSulActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMapa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMapaCentroOeste;
    private javax.swing.JButton botaoMapaNordeste;
    private javax.swing.JButton botaoMapaNorte;
    private javax.swing.JButton botaoMapaSudeste;
    private javax.swing.JButton botaoMapaSul;
    private javax.swing.JTextField campoPontuacao;
    private javax.swing.JLabel labelImagemMapa;
    private javax.swing.JLabel labelInformativa;
    private javax.swing.JLabel labelMostraRegiao;
    private javax.swing.JLabel labelPontuacao;
    // End of variables declaration//GEN-END:variables

    private void checaResposta(String nomeRegiao) {
        if(regiaoAtual.getNome().toLowerCase().equals(nomeRegiao)){
            if(primeiraVez){
                pontuacao += 2;
                campoPontuacao.setText(Integer.toString(pontuacao));
            } else {
                campoPontuacao.setText(Integer.toString(++pontuacao));
            }
            Jogo.getEstatisticas().setRespostasRegioes(nomeRegiao, primeiraVez);
            primeiraVez = true;
            acertou = true;
        } else {
            primeiraVez = false;
        }
        if(posAtual < regioes.size()-1 && acertou) {
            acertou = false;
            regiaoAtual = regioes.get(++posAtual);
            labelMostraRegiao.setText(regiaoAtual.getNome());
        } else if (acertou) {
            this.setVisible(false);
            Jogo.getEstatisticas().setPontuacaoTotal(pontuacao);
            Jogo.sortearEstados();
            InterfaceMapa2.main(null);
        }
    }
}