/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.ArrayList;
import jogo.Estado;
import jogo.Jogo;

/**
 *
 * @author Laura
 */
public class InterfaceMapa3 extends javax.swing.JFrame {

    ArrayList<Estado> estados = jogo.Jogo.getEstadosSorteados();
    Estado estadoAtual = estados.get(0);
    int posAtual = 0;
    boolean primeiraVez = true;
    boolean acertou = false;
    int pontuacao = 0;

    
    /**
     * Creates new form InterfaceMapa
     */
    public InterfaceMapa3() {
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

        jLabel3 = new javax.swing.JLabel();
        botaoMapaSaoLuis = new javax.swing.JButton();
        botaoMapaPalmas = new javax.swing.JButton();
        botaoMapaBoaVista = new javax.swing.JButton();
        botaoMapaManaus = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        botaoMapaRioBranco = new javax.swing.JButton();
        botaoMapaMacapa = new javax.swing.JButton();
        botaoMapaCuiaba = new javax.swing.JButton();
        botaoMapaBrasilia = new javax.swing.JButton();
        botaoMapaCampoGrande = new javax.swing.JButton();
        botaoMapaCuritiba = new javax.swing.JButton();
        botaoMapaBelem = new javax.swing.JButton();
        botaoMapaTeresina = new javax.swing.JButton();
        botaoMapaFortaleza = new javax.swing.JButton();
        botaoMapaNatal = new javax.swing.JButton();
        botaoMapaJoaoPessoa = new javax.swing.JButton();
        botaoMapaFlorianopolis = new javax.swing.JButton();
        botaoMapaPortoAlegre = new javax.swing.JButton();
        botaoMapaSaoPaulo = new javax.swing.JButton();
        botaoMapaBeloHorizonte = new javax.swing.JButton();
        botaoMapaVitoria = new javax.swing.JButton();
        botaoMapaSalvador = new javax.swing.JButton();
        botaoMapaAracaju = new javax.swing.JButton();
        botaoMapaMaceio = new javax.swing.JButton();
        botaoMapaRecife = new javax.swing.JButton();
        botaoMapaGoiania = new javax.swing.JButton();
        botaoMapaRioJaneiro = new javax.swing.JButton();
        botaoMapaPortoVelho = new javax.swing.JButton();
        labelMostraEstado = new javax.swing.JLabel();
        labelMapa3 = new javax.swing.JLabel();
        campoPontuacaoF3 = new javax.swing.JTextField();
        labelInformativa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(704, 642));
        getContentPane().setLayout(null);

        jLabel3.setText("Pontos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 450, 40, 14);

        botaoMapaSaoLuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSaoLuisActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSaoLuis);
        botaoMapaSaoLuis.setBounds(390, 210, 10, 10);

        botaoMapaPalmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaPalmasActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaPalmas);
        botaoMapaPalmas.setBounds(360, 240, 10, 10);

        botaoMapaBoaVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaBoaVistaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaBoaVista);
        botaoMapaBoaVista.setBounds(240, 140, 10, 10);

        botaoMapaManaus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaManausActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaManaus);
        botaoMapaManaus.setBounds(210, 190, 10, 10);
        getContentPane().add(jButton18);
        jButton18.setBounds(210, 190, 10, 10);

        botaoMapaRioBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaRioBrancoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaRioBranco);
        botaoMapaRioBranco.setBounds(170, 250, 10, 10);

        botaoMapaMacapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaMacapaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaMacapa);
        botaoMapaMacapa.setBounds(330, 130, 10, 10);

        botaoMapaCuiaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaCuiabaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaCuiaba);
        botaoMapaCuiaba.setBounds(290, 270, 10, 10);

        botaoMapaBrasilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaBrasiliaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaBrasilia);
        botaoMapaBrasilia.setBounds(460, 290, 10, 10);

        botaoMapaCampoGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaCampoGrandeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaCampoGrande);
        botaoMapaCampoGrande.setBounds(300, 350, 10, 10);

        botaoMapaCuritiba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaCuritibaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaCuritiba);
        botaoMapaCuritiba.setBounds(330, 380, 10, 10);

        botaoMapaBelem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaBelemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaBelem);
        botaoMapaBelem.setBounds(320, 200, 10, 10);

        botaoMapaTeresina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaTeresinaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaTeresina);
        botaoMapaTeresina.setBounds(410, 220, 10, 10);

        botaoMapaFortaleza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaFortalezaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaFortaleza);
        botaoMapaFortaleza.setBounds(440, 190, 10, 10);

        botaoMapaNatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaNatalActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaNatal);
        botaoMapaNatal.setBounds(540, 190, 10, 10);

        botaoMapaJoaoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaJoaoPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaJoaoPessoa);
        botaoMapaJoaoPessoa.setBounds(500, 220, 10, 10);

        botaoMapaFlorianopolis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaFlorianopolisActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaFlorianopolis);
        botaoMapaFlorianopolis.setBounds(410, 400, 10, 10);

        botaoMapaPortoAlegre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaPortoAlegreActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaPortoAlegre);
        botaoMapaPortoAlegre.setBounds(310, 430, 10, 10);

        botaoMapaSaoPaulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSaoPauloActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSaoPaulo);
        botaoMapaSaoPaulo.setBounds(360, 370, 10, 10);

        botaoMapaBeloHorizonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaBeloHorizonteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaBeloHorizonte);
        botaoMapaBeloHorizonte.setBounds(400, 330, 10, 10);

        botaoMapaVitoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaVitoriaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaVitoria);
        botaoMapaVitoria.setBounds(500, 320, 10, 10);

        botaoMapaSalvador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaSalvadorActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaSalvador);
        botaoMapaSalvador.setBounds(420, 270, 10, 10);

        botaoMapaAracaju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaAracajuActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaAracaju);
        botaoMapaAracaju.setBounds(510, 250, 10, 10);

        botaoMapaMaceio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaMaceioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaMaceio);
        botaoMapaMaceio.setBounds(510, 240, 10, 10);

        botaoMapaRecife.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaRecifeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaRecife);
        botaoMapaRecife.setBounds(500, 230, 10, 10);

        botaoMapaGoiania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaGoianiaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaGoiania);
        botaoMapaGoiania.setBounds(340, 300, 10, 10);

        botaoMapaRioJaneiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaRioJaneiroActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaRioJaneiro);
        botaoMapaRioJaneiro.setBounds(490, 350, 10, 10);

        botaoMapaPortoVelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMapaPortoVelhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMapaPortoVelho);
        botaoMapaPortoVelho.setBounds(220, 250, 10, 10);

        labelMostraEstado.setText(estadoAtual.getCapital());
        getContentPane().add(labelMostraEstado);
        labelMostraEstado.setBounds(240, 50, 220, 50);

        labelMapa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mapa Fase 3.jpg"))); // NOI18N
        getContentPane().add(labelMapa3);
        labelMapa3.setBounds(130, 40, 460, 490);

        campoPontuacaoF3.setText(Integer.toString(pontuacao));
        getContentPane().add(campoPontuacaoF3);
        campoPontuacaoF3.setBounds(560, 440, 40, 30);

        labelInformativa.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        labelInformativa.setText("Acerte a capital!");
        getContentPane().add(labelInformativa);
        labelInformativa.setBounds(270, 0, 190, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMapaManausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaManausActionPerformed
        // TODO add your handling code here:
        checaResposta("manaus");
    }//GEN-LAST:event_botaoMapaManausActionPerformed

    private void botaoMapaBoaVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaBoaVistaActionPerformed
        // TODO add your handling code here:
        checaResposta("boa vista");
    }//GEN-LAST:event_botaoMapaBoaVistaActionPerformed

    private void botaoMapaRioBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaRioBrancoActionPerformed
        // TODO add your handling code here:
        checaResposta("rio branco");
    }//GEN-LAST:event_botaoMapaRioBrancoActionPerformed

    private void botaoMapaPortoVelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaPortoVelhoActionPerformed
        // TODO add your handling code here:
        checaResposta("porto velho");
    }//GEN-LAST:event_botaoMapaPortoVelhoActionPerformed

    private void botaoMapaBelemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaBelemActionPerformed
        // TODO add your handling code here:
        checaResposta("belem");
    }//GEN-LAST:event_botaoMapaBelemActionPerformed

    private void botaoMapaMacapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaMacapaActionPerformed
        // TODO add your handling code here:
        checaResposta("macapa");
    }//GEN-LAST:event_botaoMapaMacapaActionPerformed

    private void botaoMapaPalmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaPalmasActionPerformed
        // TODO add your handling code here:
        checaResposta("palmas");
    }//GEN-LAST:event_botaoMapaPalmasActionPerformed

    private void botaoMapaSaoLuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSaoLuisActionPerformed
        // TODO add your handling code here:
        checaResposta("sao luis");
    }//GEN-LAST:event_botaoMapaSaoLuisActionPerformed

    private void botaoMapaFortalezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaFortalezaActionPerformed
        // TODO add your handling code here:
        checaResposta("fortaleza");
    }//GEN-LAST:event_botaoMapaFortalezaActionPerformed

    private void botaoMapaTeresinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaTeresinaActionPerformed
        // TODO add your handling code here:
        checaResposta("teresina");
    }//GEN-LAST:event_botaoMapaTeresinaActionPerformed

    private void botaoMapaSalvadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSalvadorActionPerformed
        // TODO add your handling code here:
        checaResposta("salvador");
    }//GEN-LAST:event_botaoMapaSalvadorActionPerformed

    private void botaoMapaAracajuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaAracajuActionPerformed
        // TODO add your handling code here:
        checaResposta("aracaju");
    }//GEN-LAST:event_botaoMapaAracajuActionPerformed

    private void botaoMapaRecifeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaRecifeActionPerformed
        // TODO add your handling code here:
        checaResposta("recife");
    }//GEN-LAST:event_botaoMapaRecifeActionPerformed

    private void botaoMapaJoaoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaJoaoPessoaActionPerformed
        // TODO add your handling code here:
        checaResposta("joao pessoa");
    }//GEN-LAST:event_botaoMapaJoaoPessoaActionPerformed

    private void botaoMapaNatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaNatalActionPerformed
        // TODO add your handling code here:
        checaResposta("natal");
    }//GEN-LAST:event_botaoMapaNatalActionPerformed

    private void botaoMapaMaceioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaMaceioActionPerformed
        // TODO add your handling code here:
        checaResposta("maceio");
    }//GEN-LAST:event_botaoMapaMaceioActionPerformed

    private void botaoMapaBrasiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaBrasiliaActionPerformed
        // TODO add your handling code here:
        checaResposta("brasilia");
    }//GEN-LAST:event_botaoMapaBrasiliaActionPerformed

    private void botaoMapaBeloHorizonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaBeloHorizonteActionPerformed
        // TODO add your handling code here:
        checaResposta("belo horizonte");
    }//GEN-LAST:event_botaoMapaBeloHorizonteActionPerformed

    private void botaoMapaVitoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaVitoriaActionPerformed
        // TODO add your handling code here:
        checaResposta("vitoria");
    }//GEN-LAST:event_botaoMapaVitoriaActionPerformed

    private void botaoMapaRioJaneiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaRioJaneiroActionPerformed
        // TODO add your handling code here:
        checaResposta("rio de janeiro");
    }//GEN-LAST:event_botaoMapaRioJaneiroActionPerformed

    private void botaoMapaSaoPauloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaSaoPauloActionPerformed
        // TODO add your handling code here:
        checaResposta("sao paulo");
    }//GEN-LAST:event_botaoMapaSaoPauloActionPerformed

    private void botaoMapaFlorianopolisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaFlorianopolisActionPerformed
        // TODO add your handling code here:
        checaResposta("florianopolis");
    }//GEN-LAST:event_botaoMapaFlorianopolisActionPerformed

    private void botaoMapaPortoAlegreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaPortoAlegreActionPerformed
        // TODO add your handling code here:
        checaResposta("porto alegre");
    }//GEN-LAST:event_botaoMapaPortoAlegreActionPerformed

    private void botaoMapaCuritibaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaCuritibaActionPerformed
        // TODO add your handling code here:
        checaResposta("curitiba");
    }//GEN-LAST:event_botaoMapaCuritibaActionPerformed

    private void botaoMapaCampoGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaCampoGrandeActionPerformed
        // TODO add your handling code here:
        checaResposta("campo grande");
    }//GEN-LAST:event_botaoMapaCampoGrandeActionPerformed

    private void botaoMapaGoianiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaGoianiaActionPerformed
        // TODO add your handling code here:
        checaResposta("goiania");
    }//GEN-LAST:event_botaoMapaGoianiaActionPerformed

    private void botaoMapaCuiabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMapaCuiabaActionPerformed
        // TODO add your handling code here:
        checaResposta("cuiaba");
    }//GEN-LAST:event_botaoMapaCuiabaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceMapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMapa3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMapa3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoMapaAracaju;
    private javax.swing.JButton botaoMapaBelem;
    private javax.swing.JButton botaoMapaBeloHorizonte;
    private javax.swing.JButton botaoMapaBoaVista;
    private javax.swing.JButton botaoMapaBrasilia;
    private javax.swing.JButton botaoMapaCampoGrande;
    private javax.swing.JButton botaoMapaCuiaba;
    private javax.swing.JButton botaoMapaCuritiba;
    private javax.swing.JButton botaoMapaFlorianopolis;
    private javax.swing.JButton botaoMapaFortaleza;
    private javax.swing.JButton botaoMapaGoiania;
    private javax.swing.JButton botaoMapaJoaoPessoa;
    private javax.swing.JButton botaoMapaMacapa;
    private javax.swing.JButton botaoMapaMaceio;
    private javax.swing.JButton botaoMapaManaus;
    private javax.swing.JButton botaoMapaNatal;
    private javax.swing.JButton botaoMapaPalmas;
    private javax.swing.JButton botaoMapaPortoAlegre;
    private javax.swing.JButton botaoMapaPortoVelho;
    private javax.swing.JButton botaoMapaRecife;
    private javax.swing.JButton botaoMapaRioBranco;
    private javax.swing.JButton botaoMapaRioJaneiro;
    private javax.swing.JButton botaoMapaSalvador;
    private javax.swing.JButton botaoMapaSaoLuis;
    private javax.swing.JButton botaoMapaSaoPaulo;
    private javax.swing.JButton botaoMapaTeresina;
    private javax.swing.JButton botaoMapaVitoria;
    private javax.swing.JTextField campoPontuacaoF3;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelInformativa;
    private javax.swing.JLabel labelMapa3;
    private javax.swing.JLabel labelMostraEstado;
    // End of variables declaration//GEN-END:variables

    private void checaResposta(String nomeCapital) {
        if(estadoAtual.getCapital().toLowerCase().equals(nomeCapital)){
            if(primeiraVez){
                pontuacao += 2;
                campoPontuacaoF3.setText(Integer.toString(pontuacao));
            } else {
                campoPontuacaoF3.setText(Integer.toString(++pontuacao));
            }
            Jogo.getEstatisticas().setRespostasCapitais(nomeCapital, primeiraVez);
            primeiraVez = true;
            acertou = true;
        } else {
            primeiraVez = false;
        }
        if(posAtual < estados.size()-1 && acertou) {
            acertou = false;
            estadoAtual = estados.get(++posAtual);
            labelMostraEstado.setText(estadoAtual.getCapital());
        } else if (acertou) {
            acertou = false;
            this.setVisible(false);
            Jogo.getEstatisticas().setPontuacaoTotal(pontuacao);
            try {
                dao.Database.salvarJogo(Jogo.getEstatisticas());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            InterfaceMapa4.main(null);
        }
}

}
