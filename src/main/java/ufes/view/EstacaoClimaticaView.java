package ufes.view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class EstacaoClimaticaView extends javax.swing.JFrame {
    
    public EstacaoClimaticaView() {
        initComponents();
    }
    
    public void exibirGrafico(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart("Gráfico de Máximas e Mínimas", "Variável", "Valor", dataset, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 300)); // Define as dimensões desejadas (largura x altura)

        // Configure o layout do painel
        jPanelGraficoMaxMin.setLayout(new FlowLayout());

        // Adicione o chartPanel ao painel
        jPanelGraficoMaxMin.add(chartPanel);

        // Atualize o painel
        jPanelGraficoMaxMin.validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrameMaxMinDadosClima = new javax.swing.JInternalFrame();
        jPanelGraficoMaxMin = new javax.swing.JPanel();
        jLabelMaxMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameMaxMinDadosClima.setVisible(true);

        javax.swing.GroupLayout jPanelGraficoMaxMinLayout = new javax.swing.GroupLayout(jPanelGraficoMaxMin);
        jPanelGraficoMaxMin.setLayout(jPanelGraficoMaxMinLayout);
        jPanelGraficoMaxMinLayout.setHorizontalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanelGraficoMaxMinLayout.setVerticalGroup(
            jPanelGraficoMaxMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jLabelMaxMin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMaxMin.setText("Máximas e mínimas");

        javax.swing.GroupLayout jInternalFrameMaxMinDadosClimaLayout = new javax.swing.GroupLayout(jInternalFrameMaxMinDadosClima.getContentPane());
        jInternalFrameMaxMinDadosClima.getContentPane().setLayout(jInternalFrameMaxMinDadosClimaLayout);
        jInternalFrameMaxMinDadosClimaLayout.setHorizontalGroup(
            jInternalFrameMaxMinDadosClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameMaxMinDadosClimaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jInternalFrameMaxMinDadosClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMaxMin))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jInternalFrameMaxMinDadosClimaLayout.setVerticalGroup(
            jInternalFrameMaxMinDadosClimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameMaxMinDadosClimaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelMaxMin)
                .addGap(18, 18, 18)
                .addComponent(jPanelGraficoMaxMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jInternalFrameMaxMinDadosClima, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jInternalFrameMaxMinDadosClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jInternalFrameMaxMinDadosClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameMaxMinDadosClima;
    private javax.swing.JLabel jLabelMaxMin;
    private javax.swing.JPanel jPanelGraficoMaxMin;
    // End of variables declaration//GEN-END:variables
}
