package ufes.view;
import java.awt.GraphicsEnvironment;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author Gabriel
 */
public class ConfiguracaoSistemaView extends javax.swing.JFrame {

    public ConfiguracaoSistemaView() {
        initComponents();
        centralizarTela();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxOpcoesLog = new javax.swing.JComboBox<>();
        jLabelLog = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuração do sistema");

        jComboBoxOpcoesLog.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxOpcoesLog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JSON", "XML" }));

        jLabelLog.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLog.setText("Log: ");

        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSalvar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOpcoesLog, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLog)
                    .addComponent(jComboBoxOpcoesLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    public JComboBox<String> getjComboBoxOpcoesLog() {
        return jComboBoxOpcoesLog;
    }
    
    public String getLogEscolhido() {
        return (String) jComboBoxOpcoesLog.getSelectedItem();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxOpcoesLog;
    private javax.swing.JLabel jLabelLog;
    // End of variables declaration//GEN-END:variables
}
