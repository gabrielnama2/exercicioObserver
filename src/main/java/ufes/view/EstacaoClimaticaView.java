package ufes.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class EstacaoClimaticaView extends javax.swing.JFrame {
    
    public EstacaoClimaticaView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jLabelTituloUltimoAtualizacaoClima = new javax.swing.JLabel();
        jLabelUmidade = new javax.swing.JLabel();
        jLabelTemperatura = new javax.swing.JLabel();
        jLabelPressao = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        txtResultadoPressao = new javax.swing.JLabel();
        txtResultadoTemperatura = new javax.swing.JLabel();
        txtResultadoData = new javax.swing.JLabel();
        txtResultadoUmidade = new javax.swing.JLabel();
        jInternalFrameDadosMediaClima = new javax.swing.JInternalFrame();
        jLabelTituloDadosMedios = new javax.swing.JLabel();
        jLabelUmidadeMedia = new javax.swing.JLabel();
        jLabelTemperaturaMedia = new javax.swing.JLabel();
        jLabelPressaoMedia = new javax.swing.JLabel();
        jLabelNumRegistros = new javax.swing.JLabel();
        txtResultadoPressaoMedia = new javax.swing.JLabel();
        txtResultadoTemperaturaMedia = new javax.swing.JLabel();
        txtResultadoNumRegistros = new javax.swing.JLabel();
        txtResultadoUmidadeMedia = new javax.swing.JLabel();
        jInternalFrameGraficoMaxMinDados = new javax.swing.JInternalFrame();
        jPanelGraficoMaxMin = new javax.swing.JPanel();
        jLabelMaxMin2 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estação Climática");

        jInternalFrameUltimaAtualizacaoClima.setTitle("Última atualização do tempo");
        jInternalFrameUltimaAtualizacaoClima.setVisible(true);

        jLabelTituloUltimoAtualizacaoClima.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTituloUltimoAtualizacaoClima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloUltimoAtualizacaoClima.setText("ÚLTIMA ATUALIZAÇÃO DO TEMPO");

        jLabelUmidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidade.setText("Umidade:");

        jLabelTemperatura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTemperatura.setText("Temperatura:");

        jLabelPressao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressao.setText("Pressão:");

        jLabelData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelData.setText("Data:");

        txtResultadoPressao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressao.setText("PRESSÃO");

        txtResultadoTemperatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoTemperatura.setText("TEMPERATURA");

        txtResultadoData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoData.setText("DD/MM/AAAA");

        txtResultadoUmidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidade.setText("UMIDADE");

        javax.swing.GroupLayout jInternalFrameUltimaAtualizacaoClimaLayout = new javax.swing.GroupLayout(jInternalFrameUltimaAtualizacaoClima.getContentPane());
        jInternalFrameUltimaAtualizacaoClima.getContentPane().setLayout(jInternalFrameUltimaAtualizacaoClimaLayout);
        jInternalFrameUltimaAtualizacaoClimaLayout.setHorizontalGroup(
            jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressao)
                    .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createSequentialGroup()
                        .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUmidade)
                            .addComponent(jLabelTemperatura)
                            .addComponent(jLabelData))
                        .addGap(29, 29, 29)
                        .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoUmidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloUltimoAtualizacaoClima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameUltimaAtualizacaoClimaLayout.setVerticalGroup(
            jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameUltimaAtualizacaoClimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTituloUltimoAtualizacaoClima)
                .addGap(30, 30, 30)
                .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperatura)
                    .addComponent(txtResultadoTemperatura))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUmidade)
                    .addComponent(txtResultadoUmidade))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPressao)
                    .addComponent(txtResultadoPressao))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameUltimaAtualizacaoClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(txtResultadoData))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jInternalFrameDadosMediaClima.setTitle("Dados médios");
        jInternalFrameDadosMediaClima.setVisible(true);

        jLabelTituloDadosMedios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTituloDadosMedios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloDadosMedios.setText("DADOS MÉDIOS");

        jLabelUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUmidadeMedia.setText("Umidade:");

        jLabelTemperaturaMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTemperaturaMedia.setText("Temperatura:");

        jLabelPressaoMedia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPressaoMedia.setText("Pressão:");

        jLabelNumRegistros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumRegistros.setText("Nº de registros:");

        txtResultadoPressaoMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoPressaoMedia.setText("PRESSÃO");

        txtResultadoTemperaturaMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoTemperaturaMedia.setText("TEMPERATURA");

        txtResultadoNumRegistros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoNumRegistros.setText("REGISTROS");

        txtResultadoUmidadeMedia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultadoUmidadeMedia.setText("UMIDADE");

        javax.swing.GroupLayout jInternalFrameDadosMediaClimaLayout = new javax.swing.GroupLayout(jInternalFrameDadosMediaClima.getContentPane());
        jInternalFrameDadosMediaClima.getContentPane().setLayout(jInternalFrameDadosMediaClimaLayout);
        jInternalFrameDadosMediaClimaLayout.setHorizontalGroup(
            jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDadosMediaClimaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPressaoMedia)
                    .addGroup(jInternalFrameDadosMediaClimaLayout.createSequentialGroup()
                        .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUmidadeMedia)
                            .addComponent(jLabelTemperaturaMedia)
                            .addComponent(jLabelNumRegistros))
                        .addGap(29, 29, 29)
                        .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtResultadoNumRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoTemperaturaMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoPressaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultadoUmidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(jInternalFrameDadosMediaClimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloDadosMedios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrameDadosMediaClimaLayout.setVerticalGroup(
            jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameDadosMediaClimaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTituloDadosMedios)
                .addGap(30, 30, 30)
                .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTemperaturaMedia)
                    .addComponent(txtResultadoTemperaturaMedia))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUmidadeMedia)
                    .addComponent(txtResultadoUmidadeMedia))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPressaoMedia)
                    .addComponent(txtResultadoPressaoMedia))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameDadosMediaClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumRegistros)
                    .addComponent(txtResultadoNumRegistros))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jInternalFrameGraficoMaxMinDados.setTitle("Máximas e mínimas");
        jInternalFrameGraficoMaxMinDados.setVisible(true);

        jPanelGraficoMaxMin.setEnabled(false);
        jPanelGraficoMaxMin.setPreferredSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout jPanelGraficoMaxMinLayout = new javax.swing.GroupLayout(jPanelGraficoMaxMin);
        jPanelGraficoMaxMin.setLayout(jPanelGraficoMaxMinLayout);
        jPanelGraficoMaxMinLayout.setHorizontalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanelGraficoMaxMinLayout.setVerticalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabelMaxMin2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMaxMin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaxMin2.setText("MÁXIMAS E MÍNIMAS");

        javax.swing.GroupLayout jInternalFrameGraficoMaxMinDadosLayout = new javax.swing.GroupLayout(jInternalFrameGraficoMaxMinDados.getContentPane());
        jInternalFrameGraficoMaxMinDados.getContentPane().setLayout(jInternalFrameGraficoMaxMinDadosLayout);
        jInternalFrameGraficoMaxMinDadosLayout.setHorizontalGroup(
            jInternalFrameGraficoMaxMinDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMaxMin2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jInternalFrameGraficoMaxMinDadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jInternalFrameGraficoMaxMinDadosLayout.setVerticalGroup(
            jInternalFrameGraficoMaxMinDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameGraficoMaxMinDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelMaxMin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDesktopPane.setLayer(jInternalFrameUltimaAtualizacaoClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameDadosMediaClima, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane.setLayer(jInternalFrameGraficoMaxMinDados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jInternalFrameUltimaAtualizacaoClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrameDadosMediaClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPaneLayout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrameGraficoMaxMinDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jInternalFrameDadosMediaClima)
                        .addComponent(jInternalFrameUltimaAtualizacaoClima)))
                .addGap(7, 7, 7))
        );

        jMenu.setText("Configurar");
        jMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameDadosMediaClima;
    private javax.swing.JInternalFrame jInternalFrameGraficoMaxMinDados;
    private javax.swing.JInternalFrame jInternalFrameUltimaAtualizacaoClima;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelMaxMin2;
    private javax.swing.JLabel jLabelNumRegistros;
    private javax.swing.JLabel jLabelPressao;
    private javax.swing.JLabel jLabelPressaoMedia;
    private javax.swing.JLabel jLabelTemperatura;
    private javax.swing.JLabel jLabelTemperaturaMedia;
    private javax.swing.JLabel jLabelTituloDadosMedios;
    private javax.swing.JLabel jLabelTituloUltimoAtualizacaoClima;
    private javax.swing.JLabel jLabelUmidade;
    private javax.swing.JLabel jLabelUmidadeMedia;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanelGraficoMaxMin;
    private javax.swing.JLabel txtResultadoData;
    private javax.swing.JLabel txtResultadoNumRegistros;
    private javax.swing.JLabel txtResultadoPressao;
    private javax.swing.JLabel txtResultadoPressaoMedia;
    private javax.swing.JLabel txtResultadoTemperatura;
    private javax.swing.JLabel txtResultadoTemperaturaMedia;
    private javax.swing.JLabel txtResultadoUmidade;
    private javax.swing.JLabel txtResultadoUmidadeMedia;
    // End of variables declaration//GEN-END:variables
}
