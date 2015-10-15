package prc2;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio
 */
public class Datos {
    
    ArrayList <Dataset> data = new ArrayList();
    Graficos graph;

    
    public void crear_dataset(String s)
    {
        Dataset tmp = new Dataset(s);
        data.add(tmp);
    }
    
}
