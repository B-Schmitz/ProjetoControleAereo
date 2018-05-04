package br.controle_aereo.janelas;

import br.controle_aereo.calculos.Calculos;
import br.controle_aereo.excecoes.ExceptionCoord;
import br.controle_aereo.grafico.Pontos;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    private final ImageIcon icone;
    private Dimension d;
    private final Graphics graph;
    private Thread t;
    private Pontos pontos;
    
    
     boolean alive = true, acaoExclusao = false;
    Calculos cal = new Calculos();
    double[] res = new double[2];
    private final DefaultTableModel model;
    //double x, y, r, ang, vel, dir;
   private final Queue<Pontos> filaAcao = new LinkedList<>();
    private final Queue<Pontos> filaCalculo = new LinkedList<>();
    ArrayList<Pontos> arrayPontos;
    
    
    // Ver pra que serve isso:
    
    public void setAcaoExclusao(boolean acaoExclusao) {
        this.acaoExclusao = acaoExclusao;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isAcaoExclusao() {
        return acaoExclusao;
    }

    public DefaultTableModel getModel() {
        return model;
    }
    

    public Principal() {
        initComponents();

        // Configuração da Janela
        this.setLocationRelativeTo(null);
        icone = new ImageIcon("src/br/pet/icones/");
        this.setIconImage(icone.getImage());
         
        // Gera linhas X e Y
        graph = painel_radar.getGraphics();
       GeraGrafico();
        
        
        model = (DefaultTableModel) tabela_datagrid.getModel();
    }

    public void GeraGrafico(){
        graph.drawLine(0, 199, 399, 199);
        graph.drawLine(199, 0, 199, 399);
    }
    
    public void Janela(JInternalFrame frame) {
        desktopPane_principal.remove(frame);
        desktopPane_principal.add(frame);
        ((BasicInternalFrameUI) frame.getUI()).setNorthPane(null); //retirar o painel superior
        frame.setBorder(null);
        frame.moveToFront();
        frame.setVisible(true);
    }
    
     public JPanel getRadar() {
        return painel_radar;
    }
     
      public void iniciaThread() {
        try {
            t.start();
        } catch (Exception e) {
        }
    }
     
     public Queue<Pontos> getFilaAcao() {
        return filaAcao;
    }

    public void insereTabela(Object data[]) {
        model.addRow(data);
    }
    
     public Double verificaDouble (String a) throws ExceptionCoord{
        try{
            return Double.parseDouble(a);
        }catch(NumberFormatException e){
            throw new ExceptionCoord("Número inválido.");
        }
    }
    
    public Pontos GetAviao() throws ExceptionCoord{
       
        pontos = new Pontos();
        
        pontos.setX(verificaDouble(txt_X.getText().replaceAll(",", ".")));
        pontos.setY(verificaDouble(txt_Y.getText().replaceAll(",", ".")));
        pontos.setRaio(verificaDouble(txt_Raio.getText().replaceAll(",", ".")));
        pontos.setAngulo(verificaDouble(txt_Angulo.getText().replaceAll(",", ".")));
        pontos.setVelocidade(verificaDouble(txt_Velocidade.getText().replaceAll(",", ".")));
        pontos.setDirecao(verificaDouble(txt_Direcao.getText().replaceAll(",", ".")));
        
        return pontos;
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane_principal = new javax.swing.JDesktopPane();
        painel_radar = new javax.swing.JPanel();
        painel_datagrid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_datagrid = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        painel_principal = new javax.swing.JPanel();
        btn_inserir = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_funcaoX = new javax.swing.JTextField();
        txt_funcaoY = new javax.swing.JTextField();
        txt_funcaoAngulo = new javax.swing.JTextField();
        txt_distanciaMinima = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_tempoMinimo = new javax.swing.JTextField();
        menu_barra = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Aéreo");

        desktopPane_principal.setBackground(new java.awt.Color(0, 51, 102));

        painel_radar.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout painel_radarLayout = new javax.swing.GroupLayout(painel_radar);
        painel_radar.setLayout(painel_radarLayout);
        painel_radarLayout.setHorizontalGroup(
            painel_radarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painel_radarLayout.setVerticalGroup(
            painel_radarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        painel_datagrid.setBackground(new java.awt.Color(0, 51, 102));
        painel_datagrid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datagrid", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        painel_datagrid.setForeground(new java.awt.Color(0, 51, 153));

        tabela_datagrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "X", "Y", "r", "Ângulo", "Velocidade", "Direção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela_datagrid.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela_datagrid);
        if (tabela_datagrid.getColumnModel().getColumnCount() > 0) {
            tabela_datagrid.getColumnModel().getColumn(0).setResizable(false);
            tabela_datagrid.getColumnModel().getColumn(1).setResizable(false);
            tabela_datagrid.getColumnModel().getColumn(2).setResizable(false);
            tabela_datagrid.getColumnModel().getColumn(3).setResizable(false);
            tabela_datagrid.getColumnModel().getColumn(4).setResizable(false);
            tabela_datagrid.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout painel_datagridLayout = new javax.swing.GroupLayout(painel_datagrid);
        painel_datagrid.setLayout(painel_datagridLayout);
        painel_datagridLayout.setHorizontalGroup(
            painel_datagridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        painel_datagridLayout.setVerticalGroup(
            painel_datagridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_datagridLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        painel_principal.setBackground(new java.awt.Color(0, 51, 102));
        painel_principal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inserir Avião", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        painel_principal.setForeground(new java.awt.Color(255, 255, 255));

        btn_inserir.setText("Inserir");
        btn_inserir.setPreferredSize(new java.awt.Dimension(63, 30));
        btn_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inserirActionPerformed(evt);
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
                .addGroup(painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_principalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
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
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addComponent(btn_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Y:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ângulo:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Distância mínima:");

        jButton1.setText("Translandar");

        jButton2.setText("Escalonar");

        jButton3.setText("Rotacionar");

        jButton4.setText("Aviões próximos ao aeroporto");

        jButton5.setText("Aviões próximos");

        jButton6.setText("Em rota de colisão");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tempo mínimo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_funcaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_funcaoY, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(55, 55, 55)
                            .addComponent(txt_funcaoAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(21, 21, 21)
                            .addComponent(txt_tempoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_distanciaMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_funcaoX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_funcaoY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txt_funcaoAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_tempoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_distanciaMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desktopPane_principal.setLayer(painel_radar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane_principal.setLayer(painel_datagrid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane_principal.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane_principal.setLayer(painel_principal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane_principal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPane_principalLayout = new javax.swing.GroupLayout(desktopPane_principal);
        desktopPane_principal.setLayout(desktopPane_principalLayout);
        desktopPane_principalLayout.setHorizontalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPane_principalLayout.createSequentialGroup()
                .addGroup(desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel_datagrid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, desktopPane_principalLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(painel_radar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        desktopPane_principalLayout.setVerticalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPane_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(desktopPane_principalLayout.createSequentialGroup()
                        .addComponent(painel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel_radar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_datagrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Relatório");
        menu_barra.add(jMenu1);

        setJMenuBar(menu_barra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inserirActionPerformed
         iniciaThread();
        try {
            GetAviao();
        } catch (ExceptionCoord ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
         Object data[] = new Object[]{model.getRowCount(), String.valueOf(new DecimalFormat("#.00").format(pontos.getX())), String.valueOf(new DecimalFormat("#.00").format(pontos.getY())), String.valueOf(new DecimalFormat("#.00").format(pontos.getRaio())), String.valueOf(new DecimalFormat("#.00").format(pontos.getAngulo())), String.valueOf(new DecimalFormat("#.00").format(pontos.getVelocidade())), String.valueOf(new DecimalFormat("#.00").format(pontos.getDirecao()))};
         insereTabela(data);     
    }//GEN-LAST:event_btn_inserirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_inserir;
    private javax.swing.JDesktopPane desktopPane_principal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_X;
    private javax.swing.JLabel label_Y;
    private javax.swing.JLabel label_angulo;
    private javax.swing.JLabel label_direcao;
    private javax.swing.JLabel label_raio;
    private javax.swing.JLabel label_velocidade;
    private javax.swing.JMenuBar menu_barra;
    private javax.swing.JPanel painel_datagrid;
    private javax.swing.JPanel painel_principal;
    private javax.swing.JPanel painel_radar;
    private javax.swing.JTable tabela_datagrid;
    private javax.swing.JTextField txt_Angulo;
    private javax.swing.JTextField txt_Direcao;
    private javax.swing.JTextField txt_Raio;
    private javax.swing.JTextField txt_Velocidade;
    private javax.swing.JTextField txt_X;
    private javax.swing.JTextField txt_Y;
    private javax.swing.JTextField txt_distanciaMinima;
    private javax.swing.JTextField txt_funcaoAngulo;
    private javax.swing.JTextField txt_funcaoX;
    private javax.swing.JTextField txt_funcaoY;
    private javax.swing.JTextField txt_tempoMinimo;
    // End of variables declaration//GEN-END:variables
}
