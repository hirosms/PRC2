/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc2;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import Calculos.Calculos;

/**
 *
 * @author Sergio
 */
public class Dash extends javax.swing.JFrame {
    
    Dataset dataset = new Dataset("oxford");
    Graficos graph = new Graficos();
    /**
     * Creates new form Dash
     */
    public Dash() {
        initComponents();
        Year.setVisible(false);
        jLabel2.setVisible(false);
    }

      public int get_pos(int n)
    {
        int retorno = -1;
        for (int i = 0; i < dataset.year.size();i++)
        {
            if(n == dataset.year.get(i))
            {
                retorno = i;
                break;
            }
        }
        return retorno;
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Place = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        But_tmax = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CrearData = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        But_tmin = new javax.swing.JButton();
        But_af = new javax.swing.JButton();
        But_rain = new javax.swing.JButton();
        But_sun = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tmax_v = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tmin_v = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        af_v = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rain_v = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sun_v = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CrearData1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Place.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aberporth", "armagh", "ballypatrick", "bradford", "braemar", "camborne", "cambridge", "cardiff", "chivenor", "cwmystwyth", "dunstaffnage", "durham", "eastbourne", "eskdalemuir", "heathrow", "hurn", "lerwick", "leuchars", "lowestoft", "manston", "nairn", "newton", "oxford", "paisley", "rossonwye", "ringway", "shawbury", "sheffield", "southampton", "stornoway", "suttonbonington", "tiree", "valley", "waddington", "whitby", "wickairport", "yeovilton" }));
        Place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceActionPerformed(evt);
            }
        });

        But_tmax.setText("Temperatura Maxima");
        But_tmax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_tmaxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Lugar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Año");

        CrearData.setText("Cargar Lugar");
        CrearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDataActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Graficos");

        But_tmin.setText("Temperatura Minima");
        But_tmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_tminActionPerformed(evt);
            }
        });

        But_af.setText("Dias de Heladas");
        But_af.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_afActionPerformed(evt);
            }
        });

        But_rain.setText("Lluvia Recogida");
        But_rain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_rainActionPerformed(evt);
            }
        });

        But_sun.setText("Horas de Sol");
        But_sun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                But_sunActionPerformed(evt);
            }
        });

        tmax_v.setText("---");

        jLabel5.setText("Temperatura Max:");

        jLabel6.setText("Temperatura Min:");

        tmin_v.setText("---");

        jLabel7.setText("Dias de Heladas:");

        af_v.setText("---");

        jLabel8.setText("Lluvia Recogida:");

        rain_v.setText("---");

        jLabel9.setText("Dias de Sol:");

        sun_v.setText("---");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Media anual");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(af_v, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tmin_v, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tmax_v, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(rain_v)
                            .addComponent(sun_v))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tmax_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tmin_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(af_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rain_v))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sun_v))
                .addContainerGap())
        );

        CrearData1.setText("Obtener Estadísticas");
        CrearData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearData1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_umbrella_png494.png"))); // NOI18N
        jLabel10.setText("UK Weather");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(But_tmax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrearData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(But_tmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(But_af, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(But_rain, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(But_sun, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CrearData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Place, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearData)
                    .addComponent(CrearData1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But_tmax)
                    .addComponent(But_rain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But_tmin)
                    .addComponent(But_sun))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(But_af)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void But_tmaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_tmaxActionPerformed
        // TODO add your handling code here:
        //jLabel1.setText(jComboBox1.getSelectedItem().toString());
        //jLabel2.setText(jComboBox2.getSelectedItem().toString());
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
        //Year.removeAllItems();
        
        //jLabel2.setText(""+ini);
        
        //jPanel1.setVisible(true);
        
        
        graph.PieGraphF(dataset.tmax, ini, But_tmax.getText(), ""+n);
        
    }//GEN-LAST:event_But_tmaxActionPerformed

    private void PlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceActionPerformed
        // TODO add your handling code here:
        //dataset.crear_dataset(jComboBox1.getSelectedItem().toString());
        //jLabel1.setText(jComboBox1.getSelectedItem().toString());
        
    }//GEN-LAST:event_PlaceActionPerformed

    private void CrearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDataActionPerformed
        // TODO add your handling code here:
        dataset.crear_dataset(Place.getSelectedItem().toString());
        Year.setVisible(true);
        jLabel2.setVisible(true);
               
        for (int i = 0; i < dataset.year.size();i+=12)
        {
            Year.addItem(dataset.year.get(i));
        }
    }//GEN-LAST:event_CrearDataActionPerformed

    private void But_tminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_tminActionPerformed
        // TODO add your handling code here:
        
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.tmin, ini, But_tmin.getText(), ""+n);
    }//GEN-LAST:event_But_tminActionPerformed

    private void But_afActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_afActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphI(dataset.afdays, ini, But_af.getText(), ""+n);
    }//GEN-LAST:event_But_afActionPerformed

    private void But_rainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_rainActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.rain, ini, But_rain.getText(), ""+n);
    }//GEN-LAST:event_But_rainActionPerformed

    private void But_sunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_But_sunActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(Year.getSelectedItem().toString());
        int ini = get_pos(n);
                
        graph.PieGraphF(dataset.sun, ini, But_sun.getText(), ""+n);
    }//GEN-LAST:event_But_sunActionPerformed

    private void CrearData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearData1ActionPerformed
        // TODO add your handling code here:
        Calculos c = new Calculos();
        float f ;
        
        f = (float) (Math.floor(c.get_mediaF(dataset.tmax) * 100) / 100);
        tmax_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.tmin) * 100) / 100);
        tmin_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaI(dataset.afdays) * 100) / 100);
        af_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.rain) * 100) / 100);
        rain_v.setText(""+f);
        f = (float) (Math.floor(c.get_mediaF(dataset.sun)/24 * 100) / 100);
        sun_v.setText(""+f);
        
        
    }//GEN-LAST:event_CrearData1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton But_af;
    private javax.swing.JButton But_rain;
    private javax.swing.JButton But_sun;
    private javax.swing.JButton But_tmax;
    private javax.swing.JButton But_tmin;
    private javax.swing.JButton CrearData;
    private javax.swing.JButton CrearData1;
    private javax.swing.JComboBox Place;
    private javax.swing.JComboBox Year;
    private javax.swing.JLabel af_v;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel rain_v;
    private javax.swing.JLabel sun_v;
    private javax.swing.JLabel tmax_v;
    private javax.swing.JLabel tmin_v;
    // End of variables declaration//GEN-END:variables
}
