package ufes.view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class EstacaoClimaticaView extends javax.swing.JFrame {
    
    public EstacaoClimaticaView() {
        initComponents();
        this.mudaEstiloTabela();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setVisible(true);
    }
    
    public void preencherDadosUltimaAtualizacao(String temperatura, String umidade, String pressao, String data) {
        txtResultadoTemperatura.setText(temperatura);
        txtResultadoUmidade.setText(umidade);
        txtResultadoPressao.setText(pressao);
        txtResultadoData.setText(data);
    }
    
    public void preencherDadosMediaClima(String temperatura, String umidade, String pressao, String numRegistros){
        txtResultadoTemperaturaMedia.setText(temperatura);
        txtResultadoUmidadeMedia.setText(umidade);
        txtResultadoPressaoMedia.setText(pressao);
        txtResultadoNumRegistros.setText(numRegistros);
        txtqtdRegistros.setText(numRegistros);
    }
    
    public void exibirGrafico(DefaultCategoryDataset dataset) {
        // Remova qualquer ChartPanel existente
        jPanelGraficoMaxMin.removeAll();

        JFreeChart chart = ChartFactory.createBarChart("Gráfico de Máximas e Mínimas", "Tipo do dado", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300)); // Define as dimensões desejadas (largura x altura)

        // Configure o layout do painel
        jPanelGraficoMaxMin.setLayout(new FlowLayout());

        // Adicione o chartPanel ao painel
        jPanelGraficoMaxMin.add(chartPanel);

        // Atualize o painel
        jPanelGraficoMaxMin.revalidate();
        jPanelGraficoMaxMin.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrameUltimaAtualizacaoClima = new javax.swing.JInternalFrame();
        jPanel = new javax.swing.JPanel();
        jLabelTemperatura = new javax.swing.JLabel();
        txtResultadoTemperatura = new javax.swing.JLabel();
        jLabelUmidade = new javax.swing.JLabel();
        txtResultadoUmidade = new javax.swing.JLabel();
        jLabelPressao = new javax.swing.JLabel();
        txtResultadoPressao = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        txtResultadoData = new javax.swing.JLabel();
        jInternalFrameDadosMediaClima = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabelTemperaturaMedia = new javax.swing.JLabel();
        txtResultadoTemperaturaMedia = new javax.swing.JLabel();
        jLabelUmidadeMedia = new javax.swing.JLabel();
        txtResultadoUmidadeMedia = new javax.swing.JLabel();
        jLabelPressaoMedia = new javax.swing.JLabel();
        txtResultadoPressaoMedia = new javax.swing.JLabel();
        jLabelNumRegistros = new javax.swing.JLabel();
        txtResultadoNumRegistros = new javax.swing.JLabel();
        jInternalFrameGraficoMaxMinDados = new javax.swing.JInternalFrame();
        jPanelGraficoMaxMin = new javax.swing.JPanel();
        txtqtdRegistros = new javax.swing.JLabel();
        jLabelqtdRegistros = new javax.swing.JLabel();
        jInternalFrameIncluir1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jButtonRemoverDados = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jInternalFrameIncluir2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabelTemperatura2 = new javax.swing.JLabel();
        jLabelUmidade2 = new javax.swing.JLabel();
        jLabelPressao2 = new javax.swing.JLabel();
        jLabelData2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPaneTemperaturaIncluir1 = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextPaneUmidade1 = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPanePressao1 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPaneData1 = new javax.swing.JTextPane();
        jButtonIncluirDadosDoTempo1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuLog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estação Climática");

        jDesktopPane.setBackground(new java.awt.Color(51, 51, 51));

        jInternalFrameUltimaAtualizacaoClima.setTitle("Última atualização do tempo");
        jInternalFrameUltimaAtualizacaoClima.setVisible(true);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTemperatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTemperatura.setText("Temperatura:");

        txtResultadoTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoTemperatura.setText("TEMPERATURA");

        jLabelUmidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidade.setText("Umidade:");

        txtResultadoUmidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidade.setText("UMIDADE");

        jLabelPressao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressao.setText("Pressão:");

        txtResultadoPressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressao.setText("PRESSÃO");

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelData.setText("Data:");

        txtResultadoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoData.setText("DD/MM/AAAA");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressao)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUmidade)
                            .addComponent(jLabelData))
                        .addGap(56, 56, 56)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jLabelTemperatura)
                        .addGap(29, 29, 29)
                        .addComponent(txtResultadoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura)
                    .addComponent(txtResultadoTemperatura))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUmidade)
                    .addComponent(txtResultadoUmidade))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPressao)
                    .addComponent(txtResultadoPressao))
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(txtResultadoData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameUltimaAtualizacaoClimaLayout = new javax.swing.GroupLayout(jInternalFrameUltimaAtualizacaoClima.getContentPane());
        jInternalFrameUltimaAtualizacaoClima.getContentPane().setLayout(jInternalFrameUltimaAtualizacaoClimaLayout);
        jInternalFrameUltimaAtualizacaoClimaLayout.setHorizontalGroup(
            jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameUltimaAtualizacaoClimaLayout.setVerticalGroup(
            jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrameDadosMediaClima.setTitle("Dados médios");
        jInternalFrameDadosMediaClima.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTemperaturaMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTemperaturaMedia.setText("Temperatura:");

        txtResultadoTemperaturaMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoTemperaturaMedia.setText("TEMPERATURA");

        jLabelUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidadeMedia.setText("Umidade:");

        txtResultadoUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidadeMedia.setText("UMIDADE");

        jLabelPressaoMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressaoMedia.setText("Pressão:");

        txtResultadoPressaoMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressaoMedia.setText("PRESSÃO");

        jLabelNumRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumRegistros.setText("Nº de registros:");

        txtResultadoNumRegistros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoNumRegistros.setText("REGISTROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressaoMedia)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUmidadeMedia)
                            .addComponent(jLabelTemperaturaMedia)
                            .addComponent(jLabelNumRegistros))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoNumRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoTemperaturaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoPressaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoUmidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperaturaMedia)
                    .addComponent(txtResultadoTemperaturaMedia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUmidadeMedia)
                    .addComponent(txtResultadoUmidadeMedia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPressaoMedia)
                    .addComponent(txtResultadoPressaoMedia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumRegistros)
                    .addComponent(txtResultadoNumRegistros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameDadosMediaClimaLayout = new javax.swing.GroupLayout(jInternalFrameDadosMediaClima.getContentPane());
        jInternalFrameDadosMediaClima.getContentPane().setLayout(jInternalFrameDadosMediaClimaLayout);
        jInternalFrameDadosMediaClimaLayout.setHorizontalGroup(
            jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameDadosMediaClimaLayout.setVerticalGroup(
            jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jInternalFrameGraficoMaxMinDados.setTitle("Máximas e mínimas");
        jInternalFrameGraficoMaxMinDados.setVisible(true);

        jPanelGraficoMaxMin.setEnabled(false);
        jPanelGraficoMaxMin.setPreferredSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout jPanelGraficoMaxMinLayout = new javax.swing.GroupLayout(jPanelGraficoMaxMin);
        jPanelGraficoMaxMin.setLayout(jPanelGraficoMaxMinLayout);
        jPanelGraficoMaxMinLayout.setHorizontalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        jPanelGraficoMaxMinLayout.setVerticalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrameGraficoMaxMinDadosLayout = new javax.swing.GroupLayout(jInternalFrameGraficoMaxMinDados.getContentPane());
        jInternalFrameGraficoMaxMinDados.getContentPane().setLayout(jInternalFrameGraficoMaxMinDadosLayout);
        jInternalFrameGraficoMaxMinDadosLayout.setHorizontalGroup(
            jInternalFrameGraficoMaxMinDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        jInternalFrameGraficoMaxMinDadosLayout.setVerticalGroup(
            jInternalFrameGraficoMaxMinDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        txtqtdRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtqtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        txtqtdRegistros.setText("99999");

        jLabelqtdRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelqtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelqtdRegistros.setText("Número de registros: ");

        jInternalFrameIncluir1.setTitle("Registros");
        jInternalFrameIncluir1.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButtonRemoverDados.setText("Remover");
        jButtonRemoverDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverDadosActionPerformed(evt);
            }
        });

        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Temperatura", "Umidade", "Pressão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRegistros.setColumnSelectionAllowed(true);
        jTableRegistros.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTableRegistros);
        jTableRegistros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableRegistros.getColumnModel().getColumnCount() > 0) {
            jTableRegistros.getColumnModel().getColumn(0).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(1).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(2).setResizable(false);
            jTableRegistros.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(jButtonRemoverDados, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoverDados)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameIncluir1Layout = new javax.swing.GroupLayout(jInternalFrameIncluir1.getContentPane());
        jInternalFrameIncluir1.getContentPane().setLayout(jInternalFrameIncluir1Layout);
        jInternalFrameIncluir1Layout.setHorizontalGroup(
            jInternalFrameIncluir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameIncluir1Layout.setVerticalGroup(
            jInternalFrameIncluir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameIncluir1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jInternalFrameIncluir2.setTitle("Incluir dados do tempo ");
        jInternalFrameIncluir2.setVisible(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTemperatura2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTemperatura2.setText("Temperatura:");

        jLabelUmidade2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidade2.setText("Umidade:");

        jLabelPressao2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressao2.setText("Pressão:");

        jLabelData2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelData2.setText("Data:");

        jScrollPane6.setViewportView(jTextPaneTemperaturaIncluir1);

        jScrollPane7.setViewportView(jTextPaneUmidade1);

        jScrollPane8.setViewportView(jTextPanePressao1);

        jScrollPane9.setViewportView(jTextPaneData1);

        jButtonIncluirDadosDoTempo1.setText("Incluir");
        jButtonIncluirDadosDoTempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirDadosDoTempo1ActionPerformed(evt);
            }
        });

        jLabel2.setText("* dd/MM/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUmidade2)
                            .addComponent(jLabelData2)
                            .addComponent(jLabelTemperatura2)
                            .addComponent(jLabelPressao2))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonIncluirDadosDoTempo1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTemperatura2)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUmidade2)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressao2)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIncluirDadosDoTempo1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelData2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrameIncluir2Layout = new javax.swing.GroupLayout(jInternalFrameIncluir2.getContentPane());
        jInternalFrameIncluir2.getContentPane().setLayout(jInternalFrameIncluir2Layout);
        jInternalFrameIncluir2Layout.setHorizontalGroup(
            jInternalFrameIncluir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameIncluir2Layout.setVerticalGroup(
            jInternalFrameIncluir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameIncluir2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jDesktopPane.setLayer(jInternalFrameUltimaAtualizacaoClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameDadosMediaClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameGraficoMaxMinDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(txtqtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelqtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameIncluir1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameIncluir2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jInternalFrameUltimaAtualizacaoClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jInternalFrameDadosMediaClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addComponent(jInternalFrameIncluir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelqtdRegistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtqtdRegistros)
                .addGap(34, 34, 34))
            .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jInternalFrameIncluir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(913, Short.MAX_VALUE)))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPaneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInternalFrameIncluir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jInternalFrameDadosMediaClima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jInternalFrameUltimaAtualizacaoClima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelqtdRegistros)
                    .addComponent(txtqtdRegistros))
                .addGap(12, 12, 12))
            .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPaneLayout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jInternalFrameIncluir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        jMenu.setText("Configurar");
        jMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jMenuLog.setText("Log");
        jMenuLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogActionPerformed(evt);
            }
        });
        jMenu.add(jMenuLog);

        jMenuBar.add(jMenu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogActionPerformed
        
    }//GEN-LAST:event_jMenuLogActionPerformed

    private void jButtonRemoverDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverDadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoverDadosActionPerformed

    private void jButtonIncluirDadosDoTempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirDadosDoTempo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIncluirDadosDoTempo1ActionPerformed

    public JMenuItem getjMenuLog() {
        return jMenuLog;
    }

    // REGISTROS
    public JTable getjTableRegistros() {
        return jTableRegistros;
    }
    
    private void mudaEstiloTabela() {
        // cor do cabeçalho
        JTableHeader header = this.getjTableRegistros().getTableHeader();
        header.setBackground(Color.black);
        header.setForeground(Color.white);
        
        // alinhamento do cabeçalho
        ((DefaultTableCellRenderer)this.getjTableRegistros().getTableHeader()
                .getDefaultRenderer()).setHorizontalAlignment(JLabel.LEFT);
        
        // alinhando as células
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);
        this.getjTableRegistros().getColumnModel().getColumn(0).setCellRenderer(leftRenderer);
        this.getjTableRegistros().getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        this.getjTableRegistros().getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        this.getjTableRegistros().getColumnModel().getColumn(3).setCellRenderer(leftRenderer);
    }
    
    public JButton getjButtonRemoverDados() {
        return jButtonRemoverDados;
    }
    
    // FIM DO REGISTROS


    

    // INCLUIR
    public JButton getjButtonIncluirDadosDoTempo() {
        return jButtonIncluirDadosDoTempo1;
    }

    public JTextPane getjTextPaneData() {
        return jTextPaneData1;
    }

    public JTextPane getjTextPanePressao() {
        return jTextPanePressao1;
    }

    public JTextPane getjTextPaneTemperaturaIncluir() {
        return jTextPaneTemperaturaIncluir1;
    }

    public JTextPane getjTextPaneUmidade() {
        return jTextPaneUmidade1;
    }
    // INCLUIR
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIncluirDadosDoTempo1;
    private javax.swing.JButton jButtonRemoverDados;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameDadosMediaClima;
    private javax.swing.JInternalFrame jInternalFrameGraficoMaxMinDados;
    private javax.swing.JInternalFrame jInternalFrameIncluir1;
    private javax.swing.JInternalFrame jInternalFrameIncluir2;
    private javax.swing.JInternalFrame jInternalFrameUltimaAtualizacaoClima;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelData2;
    private javax.swing.JLabel jLabelNumRegistros;
    private javax.swing.JLabel jLabelPressao;
    private javax.swing.JLabel jLabelPressao2;
    private javax.swing.JLabel jLabelPressaoMedia;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTemperatura2;
    private javax.swing.JLabel jLabelTemperaturaMedia;
    private javax.swing.JLabel jLabelUmidade;
    private javax.swing.JLabel jLabelUmidade2;
    private javax.swing.JLabel jLabelUmidadeMedia;
    private javax.swing.JLabel jLabelqtdRegistros;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuLog;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelGraficoMaxMin;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableRegistros;
    private javax.swing.JTextPane jTextPaneData1;
    private javax.swing.JTextPane jTextPanePressao1;
    private javax.swing.JTextPane jTextPaneTemperaturaIncluir1;
    private javax.swing.JTextPane jTextPaneUmidade1;
    private javax.swing.JLabel txtResultadoData;
    private javax.swing.JLabel txtResultadoNumRegistros;
    private javax.swing.JLabel txtResultadoPressao;
    private javax.swing.JLabel txtResultadoPressaoMedia;
    private javax.swing.JLabel txtResultadoTemperatura;
    private javax.swing.JLabel txtResultadoTemperaturaMedia;
    private javax.swing.JLabel txtResultadoUmidade;
    private javax.swing.JLabel txtResultadoUmidadeMedia;
    private javax.swing.JLabel txtqtdRegistros;
    // End of variables declaration//GEN-END:variables

}
