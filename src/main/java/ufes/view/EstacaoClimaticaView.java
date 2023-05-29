package ufes.view;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class EstacaoClimaticaView extends javax.swing.JFrame {
    
    public EstacaoClimaticaView() {
        initComponents();
        centralizarTela();
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
    
    public void exibirMensagemExcecao(String mensagem) {
        JOptionPane.showMessageDialog(null, "Erro: " + mensagem, "Mensagem de erro", WIDTH);
        this.setVisible(true);
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
        txtResultadoTemperatura.setText("0");

        jLabelUmidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidade.setText("Umidade:");

        txtResultadoUmidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidade.setText("0");

        jLabelPressao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressao.setText("Pressão:");

        txtResultadoPressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressao.setText("0");

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelData.setText("Data:");

        txtResultadoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
        txtResultadoTemperaturaMedia.setText("0");

        jLabelUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidadeMedia.setText("Umidade:");

        txtResultadoUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidadeMedia.setText("0");

        jLabelPressaoMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressaoMedia.setText("Pressão:");

        txtResultadoPressaoMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressaoMedia.setText("0");

        jLabelNumRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumRegistros.setText("Nº de registros:");

        txtResultadoNumRegistros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoNumRegistros.setText("0");

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
        txtqtdRegistros.setText("0");

        jLabelqtdRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelqtdRegistros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelqtdRegistros.setText("Número de registros: ");

        jDesktopPane.setLayer(jInternalFrameUltimaAtualizacaoClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameDadosMediaClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameGraficoMaxMinDados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(txtqtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jLabelqtdRegistros, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jInternalFrameUltimaAtualizacaoClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameDadosMediaClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelqtdRegistros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtqtdRegistros)
                .addGap(34, 34, 34))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameDadosMediaClima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInternalFrameUltimaAtualizacaoClima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelqtdRegistros)
                    .addComponent(txtqtdRegistros))
                .addGap(12, 12, 12))
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

    public JMenuItem getjMenuLog() {
        return jMenuLog;
    }
    
    private void centralizarTela(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        //Obtém a posição central da tela
        int screenWidth = ge.getCenterPoint().x;
        int screenHeight = ge.getCenterPoint().y;
        
        //Calcula a posição central da janela
        int janelaX = screenWidth - (this.getWidth()/2);
        int janelaY = screenHeight - (this.getHeight()/2);
        
        //Define a posição na tela
        setLocation(janelaX, janelaY);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameDadosMediaClima;
    private javax.swing.JInternalFrame jInternalFrameGraficoMaxMinDados;
    private javax.swing.JInternalFrame jInternalFrameUltimaAtualizacaoClima;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelNumRegistros;
    private javax.swing.JLabel jLabelPressao;
    private javax.swing.JLabel jLabelPressaoMedia;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTemperaturaMedia;
    private javax.swing.JLabel jLabelUmidade;
    private javax.swing.JLabel jLabelUmidadeMedia;
    private javax.swing.JLabel jLabelqtdRegistros;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuLog;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelGraficoMaxMin;
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
