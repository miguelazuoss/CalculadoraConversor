/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TelaConversor extends javax.swing.JFrame {

    /**
     * Creates new form TelaConversor
     */
    private String botaoSelecionado = ""; // String global para verificar o botão selecionado; //

    public TelaConversor() {
        initComponents();
        setLocationRelativeTo(null); // Local de inicio do jframe sendo o centro; //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgTipoBase = new javax.swing.ButtonGroup();
        jpConversor = new javax.swing.JPanel();
        jrbDecimal = new javax.swing.JRadioButton();
        jrbBinario = new javax.swing.JRadioButton();
        jrbOctal = new javax.swing.JRadioButton();
        jrbHexadecimal = new javax.swing.JRadioButton();
        jtfValorParaConversao = new javax.swing.JTextField();
        jpDecimal = new javax.swing.JPanel();
        jtfDecimal = new javax.swing.JTextField();
        jlDecimal = new javax.swing.JLabel();
        jpBinario = new javax.swing.JPanel();
        jtfBinario = new javax.swing.JTextField();
        jlBinario = new javax.swing.JLabel();
        jpHexadecimal = new javax.swing.JPanel();
        jtfHexadecimal = new javax.swing.JTextField();
        jlHexadecimal = new javax.swing.JLabel();
        jpOctal = new javax.swing.JPanel();
        jtfOctal = new javax.swing.JTextField();
        jlOctal = new javax.swing.JLabel();
        jlAvisoEnter = new javax.swing.JLabel();
        jmbConversor = new javax.swing.JMenuBar();
        jmbCalculadora = new javax.swing.JMenu();
        jmiCalculadora = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de bases");
        setResizable(false);

        jpConversor.setBackground(new java.awt.Color(51, 51, 51));

        jbgTipoBase.add(jrbDecimal);
        jrbDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jrbDecimal.setText("Decimal");
        jrbDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbDecimalActionPerformed(evt);
            }
        });

        jbgTipoBase.add(jrbBinario);
        jrbBinario.setForeground(new java.awt.Color(255, 255, 255));
        jrbBinario.setText("Binário");
        jrbBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBinarioActionPerformed(evt);
            }
        });

        jbgTipoBase.add(jrbOctal);
        jrbOctal.setForeground(new java.awt.Color(255, 255, 255));
        jrbOctal.setText("Octal");
        jrbOctal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOctalActionPerformed(evt);
            }
        });

        jbgTipoBase.add(jrbHexadecimal);
        jrbHexadecimal.setForeground(new java.awt.Color(255, 255, 255));
        jrbHexadecimal.setText("Hexadecimal");
        jrbHexadecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHexadecimalActionPerformed(evt);
            }
        });

        jtfValorParaConversao.setBackground(new java.awt.Color(204, 204, 204));
        jtfValorParaConversao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfValorParaConversao.setForeground(new java.awt.Color(255, 255, 255));
        jtfValorParaConversao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorParaConversaoActionPerformed(evt);
            }
        });

        jpDecimal.setBackground(new java.awt.Color(102, 102, 102));

        jtfDecimal.setBackground(new java.awt.Color(153, 153, 153));
        jtfDecimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jtfDecimal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 1));
        jtfDecimal.setKeymap(null);
        jtfDecimal.setOpaque(true);
        jtfDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDecimalActionPerformed(evt);
            }
        });

        jlDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jlDecimal.setText("Decimal");

        javax.swing.GroupLayout jpDecimalLayout = new javax.swing.GroupLayout(jpDecimal);
        jpDecimal.setLayout(jpDecimalLayout);
        jpDecimalLayout.setHorizontalGroup(
            jpDecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDecimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtfDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpDecimalLayout.setVerticalGroup(
            jpDecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jtfDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jlDecimal))
        );

        jpBinario.setBackground(new java.awt.Color(102, 102, 102));

        jtfBinario.setBackground(new java.awt.Color(153, 153, 153));
        jtfBinario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfBinario.setForeground(new java.awt.Color(255, 255, 255));
        jtfBinario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 1));
        jtfBinario.setKeymap(null);

        jlBinario.setForeground(new java.awt.Color(255, 255, 255));
        jlBinario.setText("Binário");

        javax.swing.GroupLayout jpBinarioLayout = new javax.swing.GroupLayout(jpBinario);
        jpBinario.setLayout(jpBinarioLayout);
        jpBinarioLayout.setHorizontalGroup(
            jpBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBinarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBinarioLayout.setVerticalGroup(
            jpBinarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBinarioLayout.createSequentialGroup()
                .addComponent(jlBinario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jtfBinario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jpHexadecimal.setBackground(new java.awt.Color(102, 102, 102));

        jtfHexadecimal.setBackground(new java.awt.Color(153, 153, 153));
        jtfHexadecimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfHexadecimal.setForeground(new java.awt.Color(255, 255, 255));
        jtfHexadecimal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 1));
        jtfHexadecimal.setKeymap(null);

        jlHexadecimal.setForeground(new java.awt.Color(255, 255, 255));
        jlHexadecimal.setText("Hexadecimal");

        javax.swing.GroupLayout jpHexadecimalLayout = new javax.swing.GroupLayout(jpHexadecimal);
        jpHexadecimal.setLayout(jpHexadecimalLayout);
        jpHexadecimalLayout.setHorizontalGroup(
            jpHexadecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpHexadecimalLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jlHexadecimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpHexadecimalLayout.setVerticalGroup(
            jpHexadecimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlHexadecimal)
            .addComponent(jtfHexadecimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpOctal.setBackground(new java.awt.Color(102, 102, 102));

        jtfOctal.setBackground(new java.awt.Color(153, 153, 153));
        jtfOctal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfOctal.setForeground(new java.awt.Color(255, 255, 255));
        jtfOctal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 6, 1, 1));
        jtfOctal.setHighlighter(null);
        jtfOctal.setKeymap(null);
        jtfOctal.setSelectionColor(new java.awt.Color(255, 255, 255));

        jlOctal.setForeground(new java.awt.Color(255, 255, 255));
        jlOctal.setText("Octal");

        javax.swing.GroupLayout jpOctalLayout = new javax.swing.GroupLayout(jpOctal);
        jpOctal.setLayout(jpOctalLayout);
        jpOctalLayout.setHorizontalGroup(
            jpOctalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOctalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlOctal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfOctal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpOctalLayout.setVerticalGroup(
            jpOctalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOctalLayout.createSequentialGroup()
                .addComponent(jlOctal)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jtfOctal, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jlAvisoEnter.setForeground(new java.awt.Color(204, 204, 204));
        jlAvisoEnter.setText("Pressione 'Enter' para converter...");

        javax.swing.GroupLayout jpConversorLayout = new javax.swing.GroupLayout(jpConversor);
        jpConversor.setLayout(jpConversorLayout);
        jpConversorLayout.setHorizontalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValorParaConversao)
                    .addGroup(jpConversorLayout.createSequentialGroup()
                        .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jpConversorLayout.createSequentialGroup()
                                    .addComponent(jrbDecimal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jrbBinario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jrbOctal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jrbHexadecimal))
                                .addComponent(jpDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpBinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpHexadecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlAvisoEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpConversorLayout.setVerticalGroup(
            jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConversorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbDecimal)
                    .addComponent(jrbBinario)
                    .addComponent(jrbOctal)
                    .addComponent(jrbHexadecimal))
                .addGap(3, 3, 3)
                .addComponent(jlAvisoEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfValorParaConversao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpBinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpOctal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jmbCalculadora.setText("Calculadora");

        jmiCalculadora.setText("Calculadora");
        jmiCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCalculadoraActionPerformed(evt);
            }
        });
        jmbCalculadora.add(jmiCalculadora);

        jmbConversor.add(jmbCalculadora);

        setJMenuBar(jmbConversor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCalculadoraActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }//GEN-LAST:event_jmiCalculadoraActionPerformed

    private void jrbDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbDecimalActionPerformed
        // TODO add your handling code here:
        botaoSelecionado = "decimal";
    }//GEN-LAST:event_jrbDecimalActionPerformed

    private void jrbOctalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOctalActionPerformed
        // TODO add your handling code here:
        botaoSelecionado = "octal";
    }//GEN-LAST:event_jrbOctalActionPerformed

    private void jtfValorParaConversaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorParaConversaoActionPerformed
        // TODO add your handling code here:

        switch (botaoSelecionado) {
            case "decimal":
                try { // Tenta fazer a conversão; //
                    long valorDecimal = Long.parseLong(jtfValorParaConversao.getText());
                    jtfBinario.setText(Long.toBinaryString(valorDecimal));  // Decimal para binário; //
                    jtfOctal.setText(Long.toOctalString(valorDecimal));     // Decimal para octal; //
                    jtfHexadecimal.setText(Long.toHexString(valorDecimal)); // Decimal para hexadecimal; //
                    jtfDecimal.setText(jtfValorParaConversao.getText());       // Já está em decimal; //
                } catch (NumberFormatException e) { // Caso não for possivel converter, exibe aviso do JOptionPane e marca em textos que não foi possivel converter; //
                    JOptionPane.showMessageDialog(null, "Não é possível converter, texto não está em formato decimal");
                    jtfBinario.setText("Não foi possível converter");
                    jtfDecimal.setText("Não foi possível converter");
                    jtfOctal.setText("Não foi possível converter");
                    jtfHexadecimal.setText("Não foi possível converter");
                }
                break;

            case "octal":
                try { // Tenta fazer a conversão; //
                    long valorOctal = Long.parseLong(jtfValorParaConversao.getText(), 8);
                    jtfBinario.setText(Long.toBinaryString(valorOctal));    // Octal para binário
                    jtfDecimal.setText(Long.toString(valorOctal));          // Octal para decimal
                    jtfHexadecimal.setText(Long.toHexString(valorOctal));   // Octal para hexadecimal
                    jtfOctal.setText(jtfValorParaConversao.getText());         // Já está em octal
                } catch (NumberFormatException e) { // Caso não for possivel converter, exibe aviso do JOptionPane e marca em textos que não foi possivel converter; //
                    JOptionPane.showMessageDialog(null, "Não é possível converter, texto não está em formato octal");
                    jtfBinario.setText("Não foi possível converter");
                    jtfDecimal.setText("Não foi possível converter");
                    jtfOctal.setText("Não foi possível converter");
                    jtfHexadecimal.setText("Não foi possível converter");
                }
                break;

            case "hexadecimal":
                try { // Tenta fazer a conversão; //
                    long valorHex = Long.parseLong(jtfValorParaConversao.getText(), 16);
                    jtfBinario.setText(Long.toBinaryString(valorHex));      // Hexadecimal para binário
                    jtfDecimal.setText(Long.toString(valorHex));            // Hexadecimal para decimal
                    jtfOctal.setText(Long.toOctalString(valorHex));         // Hexadecimal para octal
                    jtfHexadecimal.setText(jtfValorParaConversao.getText());   // Já está em hexadecimal
                } catch (NumberFormatException e) { // Caso não for possivel converter, exibe aviso do JOptionPane e marca em textos que não foi possivel converter; //
                    JOptionPane.showMessageDialog(null, "Não é possível converter, texto não está em formato hexadecimal");
                    jtfBinario.setText("Não foi possível converter");
                    jtfDecimal.setText("Não foi possível converter");
                    jtfOctal.setText("Não foi possível converter");
                    jtfHexadecimal.setText("Não foi possível converter");
                }
                break;

            case "binario":
                try { // Tenta fazer a conversão; //
                    long valorBinario = Long.parseLong(jtfValorParaConversao.getText(), 2);
                    jtfDecimal.setText(Long.toString(valorBinario));        // Binário para decimal
                    jtfOctal.setText(Long.toOctalString(valorBinario));     // Binário para octal
                    jtfHexadecimal.setText(Long.toHexString(valorBinario)); // Binário para hexadecimal
                    jtfBinario.setText(jtfValorParaConversao.getText());       // Já está em binário
                } catch (NumberFormatException e) { // Caso não for possivel converter, exibe aviso do JOptionPane e marca em textos que não foi possivel converter; //
                    JOptionPane.showMessageDialog(null, "Não é possível converter, texto não está em formato binário");
                    jtfBinario.setText("Não foi possível converter");
                    jtfDecimal.setText("Não foi possível converter");
                    jtfOctal.setText("Não foi possível converter");
                    jtfHexadecimal.setText("Não foi possível converter");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Marcar alguma base para converter!");
                break;
        }
    }//GEN-LAST:event_jtfValorParaConversaoActionPerformed

    private void jrbHexadecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHexadecimalActionPerformed
        // TODO add your handling code here:
        botaoSelecionado = "hexadecimal";
    }//GEN-LAST:event_jrbHexadecimalActionPerformed

    private void jrbBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBinarioActionPerformed
        // TODO add your handling code here:
        botaoSelecionado = "binario";
    }//GEN-LAST:event_jrbBinarioActionPerformed

    private void jtfDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDecimalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.ButtonGroup jbgTipoBase;
    private javax.swing.JButton jbtAdicao;
    private javax.swing.JButton jbtAdicao1;
    private javax.swing.JButton jbtApagar;
    private javax.swing.JButton jbtApagar1;
    private javax.swing.JButton jbtArmazenarMemoria;
    private javax.swing.JButton jbtArmazenarMemoria1;
    private javax.swing.JButton jbtBotao0;
    private javax.swing.JButton jbtBotao1;
    private javax.swing.JButton jbtBotao10;
    private javax.swing.JButton jbtBotao11;
    private javax.swing.JButton jbtBotao12;
    private javax.swing.JButton jbtBotao13;
    private javax.swing.JButton jbtBotao14;
    private javax.swing.JButton jbtBotao15;
    private javax.swing.JButton jbtBotao16;
    private javax.swing.JButton jbtBotao17;
    private javax.swing.JButton jbtBotao18;
    private javax.swing.JButton jbtBotao19;
    private javax.swing.JButton jbtBotao2;
    private javax.swing.JButton jbtBotao3;
    private javax.swing.JButton jbtBotao4;
    private javax.swing.JButton jbtBotao5;
    private javax.swing.JButton jbtBotao6;
    private javax.swing.JButton jbtBotao7;
    private javax.swing.JButton jbtBotao8;
    private javax.swing.JButton jbtBotao9;
    private javax.swing.JButton jbtCE;
    private javax.swing.JButton jbtCE1;
    private javax.swing.JButton jbtDecimal;
    private javax.swing.JButton jbtDecimal1;
    private javax.swing.JButton jbtDivisao;
    private javax.swing.JButton jbtDivisao1;
    private javax.swing.JButton jbtIgual;
    private javax.swing.JButton jbtIgual1;
    private javax.swing.JButton jbtMemoria;
    private javax.swing.JButton jbtMemoria1;
    private javax.swing.JButton jbtMemoriaClear;
    private javax.swing.JButton jbtMemoriaClear1;
    private javax.swing.JButton jbtMultiplicacao;
    private javax.swing.JButton jbtMultiplicacao1;
    private javax.swing.JButton jbtResto;
    private javax.swing.JButton jbtResto1;
    private javax.swing.JButton jbtSubtracao;
    private javax.swing.JButton jbtSubtracao1;
    private javax.swing.JLabel jlAvisoEnter;
    private javax.swing.JLabel jlBinario;
    private javax.swing.JLabel jlDecimal;
    private javax.swing.JLabel jlHexadecimal;
    private javax.swing.JLabel jlOctal;
    private javax.swing.JMenu jmbCalculadora;
    private javax.swing.JMenuBar jmbConversor;
    private javax.swing.JMenuItem jmiCalculadora;
    private javax.swing.JPanel jpBinario;
    private javax.swing.JPanel jpConversor;
    private javax.swing.JPanel jpDecimal;
    private javax.swing.JPanel jpHexadecimal;
    private javax.swing.JPanel jpOctal;
    private javax.swing.JRadioButton jrbBinario;
    private javax.swing.JRadioButton jrbDecimal;
    private javax.swing.JRadioButton jrbHexadecimal;
    private javax.swing.JRadioButton jrbOctal;
    private javax.swing.JTextField jtfBinario;
    private javax.swing.JTextField jtfDecimal;
    private javax.swing.JTextField jtfHexadecimal;
    private javax.swing.JTextField jtfOctal;
    private javax.swing.JTextField jtfValorParaConversao;
    private javax.swing.JTextField jtfVisor;
    private javax.swing.JTextField jtfVisor1;
    // End of variables declaration//GEN-END:variables
}
