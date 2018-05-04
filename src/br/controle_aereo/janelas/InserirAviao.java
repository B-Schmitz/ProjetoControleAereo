/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle_aereo.janelas;

import br.controle_aereo.grafico.Pontos;
import javax.swing.ImageIcon;

/**
 *
 * @author Bernardo-PC
 */
public class InserirAviao extends javax.swing.JInternalFrame {

    private Pontos aviao;

    /**
     * Creates new form InserirAviao
     */
    public InserirAviao() {
        initComponents();
        this.setFrameIcon(new ImageIcon("src/br/pet/icones/cliente.png"));
    }

    public Pontos GetAviao() {

        aviao = new Pontos();

        aviao.setX(Double.parseDouble(txt_X.getText()));
        aviao.setY(Double.parseDouble(txt_Y.getText()));
        aviao.setRaio(Double.parseDouble(txt_Raio.getText()));
        aviao.setAngulo(Double.parseDouble(txt_Angulo.getText()));
        aviao.setVelocidade(Double.parseDouble(txt_Velocidade.getText()));
        aviao.setDirecao(Double.parseDouble(txt_Direcao.getText()));

        return aviao;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JPanel();
        btn_inserir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        label_X = new javax.swing.JLabel();
        label_Y = new javax.swing.JLabel();
        txt_X = new javax.swing.JTextField();
        txt_Y = new javax.swing.JTextField();
        label_raio = new javax.swing.JLabel();
        label_angulo = new javax.swing.JLabel();
        label_velocidade = new javax.swing.JLabel();
        label_direcao = new javax.swing.JLabel();
        txt_Raio = new javax.swing.JTextField();
        txt_Angulo = new javax.swing.JTextField();
        txt_Velocidade = new javax.swing.JTextField();
        txt_Direcao = new javax.swing.JTextField();

        setTitle("Inserir Avião");

        painel_principal.setBackground(new java.awt.Color(0, 51, 102));
        painel_principal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Avião", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        painel_principal.setForeground(new java.awt.Color(255, 255, 255));

        btn_inserir.setText("Inserir");
        btn_inserir.setPreferredSize(new java.awt.Dimension(63, 30));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        label_X.setForeground(new java.awt.Color(255, 255, 255));
        label_X.setText("X:");

        label_Y.setForeground(new java.awt.Color(255, 255, 255));
        label_Y.setText("Y:");

        label_raio.setForeground(new java.awt.Color(255, 255, 255));
        label_raio.setText("r(Raio):");

        label_angulo.setForeground(new java.awt.Color(255, 255, 255));
        label_angulo.setText("Ângulo:");

        label_velocidade.setForeground(new java.awt.Color(255, 255, 255));
        label_velocidade.setText("Velocidade:");

        label_direcao.setForeground(new java.awt.Color(255, 255, 255));
        label_direcao.setText("Direção:");

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_principalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principalLayout.createSequentialGroup()
                                .addComponent(label_X)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_X, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principalLayout.createSequentialGroup()
                                .addComponent(label_Y)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(label_angulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Angulo))
                            .addGroup(painel_principalLayout.createSequentialGroup()
                                .addComponent(label_raio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_velocidade)
                            .addComponent(label_direcao))
                        .addGap(18, 18, 18)
                        .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Direcao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_X)
                    .addComponent(txt_X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_raio)
                    .addComponent(label_velocidade)
                    .addComponent(txt_Raio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Velocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Y)
                    .addComponent(txt_Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_angulo)
                    .addComponent(label_direcao)
                    .addComponent(txt_Angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Direcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_inserir;
    private javax.swing.JLabel label_X;
    private javax.swing.JLabel label_Y;
    private javax.swing.JLabel label_angulo;
    private javax.swing.JLabel label_direcao;
    private javax.swing.JLabel label_raio;
    private javax.swing.JLabel label_velocidade;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JTextField txt_Angulo;
    private javax.swing.JTextField txt_Direcao;
    private javax.swing.JTextField txt_Raio;
    private javax.swing.JTextField txt_Velocidade;
    private javax.swing.JTextField txt_X;
    private javax.swing.JTextField txt_Y;
    // End of variables declaration//GEN-END:variables
}
