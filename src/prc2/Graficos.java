/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc2;

import java.util.ArrayList;
import org.jfree.chart.*;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Sergio
 */
public class Graficos {
    
        JFreeChart graph;
        
        public void PieGraphF( ArrayList <Float> d,int pos, String s, String y)
        {   
            //System.out.println("Estoy EN PIEGRAPH");
            // Fuente de Datos
            DefaultPieDataset data = new DefaultPieDataset();
            int  tmp = 0;
            for(int i = pos; i <= pos+11; i++)
            {
                tmp +=1;
                data.setValue("Mes " + tmp +": "+d.get(i)+" ", d.get(i));
                                
            //data.setValue(d.get(pos), 45);
            //data.setValue("Python", 15);
            }

            // Creando el Grafico
            JFreeChart chart = ChartFactory.createPieChart(
             "Gráfico de "+s+" para el año "+y, 
             data, 
             true, 
             true, 
             false);

            // Mostrar Grafico
            ChartFrame frame = new ChartFrame("JFreeChart", chart);
            
            frame.pack();
            frame.setVisible(true);
                    /*
            // Fuente de Datos
            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("C", 40);
            data.setValue("Java", 45);
            data.setValue("Python", 15);

            // Creando el Grafico
            JFreeChart chart = ChartFactory.createPieChart(
             "Ejemplo Rapido de Grafico en un ChartFrame", 
             data, 
             true, 
             true, 
             false);

            // Mostrar Grafico
            ChartFrame frame = new ChartFrame("JFreeChart", chart);
            frame.pack();
            frame.setVisible(true);*/
        }
        
        public void PieGraphI ( ArrayList <Integer> d,int pos, String s, String y)
        {   
             //System.out.println("Estoy EN PIEGRAPH");
            // Fuente de Datos
            DefaultPieDataset data = new DefaultPieDataset();
            int  tmp = 0;
            for(int i = pos; i <= pos+11; i++)
            {
                tmp +=1;
                data.setValue("Mes " + tmp +": "+d.get(i)+" ", d.get(i));
                                
            //data.setValue(d.get(pos), 45);
            //data.setValue("Python", 15);
            }

            // Creando el Grafico
            JFreeChart chart = ChartFactory.createPieChart(
             "Gráfico de "+s+" para el año "+y, 
             data, 
             true, 
             true, 
             false);

            // Mostrar Grafico
            ChartFrame frame = new ChartFrame("JFreeChart", chart);
            
            frame.pack();
            frame.setVisible(true);
        }
}
