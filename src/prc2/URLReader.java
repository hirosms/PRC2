/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prc2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class URLReader {
    
    ArrayList <Integer> year;
    ArrayList <Integer> month;
    ArrayList <Float> tmax;
    ArrayList <Float> tmin;
    ArrayList <Integer> afdays; //Dias con Heladas
    ArrayList <Float> rain;
    ArrayList <Float> sun;
    
    

    public ArrayList readURL(String name)
    {
        ArrayList <String> Dataset = new ArrayList();
        try {
            URL link = new URL("http://www.metoffice.gov.uk/pub/data/weather/uk/climate/stationdata/"+name+"data.txt");
            URLConnection urlConnection = link.openConnection();
            DataInputStream dis = new DataInputStream(urlConnection.getInputStream());
            String inputLine;
            String Linea;
            
            int trash = 0;
            while ((inputLine = dis.readLine()) != null) {
                if(trash > 6)
                {
                    Linea = inputLine;
                    Linea = inputLine.replace(" ", "#").replace("---","##0").replace('*','#');
                    Dataset.add(Linea);
                }
                trash ++;
                //System.out.println(inputLine);
                //System.out.println(Cadena.get(i));
                //i++;
            }
            dis.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
        
        return Dataset;
    }  

    public URLReader (String name)
    { 
        ArrayList <Integer> year = new ArrayList();
        ArrayList <Integer> month = new ArrayList();
        ArrayList <Float> tmax = new ArrayList();
        ArrayList <Float> tmin = new ArrayList();
        ArrayList <Integer> afdays = new ArrayList(); //Dias con Heladas
        ArrayList <Float> rain = new ArrayList();
        ArrayList <Float> sun = new ArrayList();
        
        ArrayList <String> cadenat = new ArrayList();
        cadenat = readURL(name);
        
        String year_t = "";
        String  month_t = "";
        String tmax_t = "";
        String tmin_t = "";
        String afdays_t = "";
        String rain_t = "";
        String sun_t = "";
        
        for (int i = 0; i < cadenat.size(); i++)
        {
            String cadena = cadenat.get(i);
            char aux1 = ' ';
            
            for(int j = 0; j < cadena.length(); j++)
            {
                if(cadena.charAt(j) != '#' ){
                   if(j<=8){
                        aux1 = cadena.charAt(j);
                        year_t = year_t +aux1;                           
                    }

                if(j>=8 && j<=12){
                        aux1 = cadena.charAt(j);
                        month_t = month_t +aux1; 
                    }

                if(j>=12 && j<=19){
                        aux1 = cadena.charAt(j);
                        tmax_t = tmax_t +aux1;
                    }
                
                if(j>=20 && j<=27){
                        aux1 = cadena.charAt(j);
                        tmin_t = tmin_t +aux1;
                    }
                if(j>=32 && j<=36){
                        aux1 = cadena.charAt(j);
                        afdays_t = afdays_t +aux1;
                    }
                if(j>=37 && j<=44){
                        aux1 = cadena.charAt(j);
                        rain_t = rain_t +aux1;
                    }
                if(j>=45 && j<=50){
                        aux1 = cadena.charAt(j);
                        sun_t = sun_t +aux1;
                    }
                
                aux1 = ' ';
                }
            }
            
        int auxi = 0;
        float auxd = 0;
        
        auxi = Integer.parseInt(year_t);    year_t = "";    System.out.println(auxi);     
        //year.add(auxi);//
        auxi = Integer.parseInt(month_t);   month_t = "";   System.out.println(auxi);
        //month.add(auxi);//
        auxd = Float.parseFloat(tmax_t);    tmax_t = "";    System.out.println(auxd);
        //tmax.add(auxd);//
        auxd = Float.parseFloat(tmin_t);    tmin_t = "";    System.out.println(auxd);
        //tmin.add(auxd);//
        auxi = Integer.parseInt(afdays_t);  afdays_t = "";  System.out.println(auxi);
        //afdays.add(auxi);//
        auxd = Float.parseFloat(rain_t);    rain_t = "";    System.out.println(auxd);
        //rain.add(auxd);//
        auxd = Float.parseFloat(sun_t);     sun_t = "";     System.out.println(auxd);
        //sun.add(auxd);//
        
        }
    }
}
            
        


