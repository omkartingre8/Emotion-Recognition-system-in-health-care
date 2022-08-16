/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class DataPoints {
    
    public ArrayList getDataPoints()
    {
        
        ArrayList dpoints=new ArrayList();
        int p1=21, p2=33, p3=54, p4=77, p5=84;
        
      int ds=DataKeeper.distancelist.size();
      
      int x1=(ds*p1)/100;
      int x2=(ds*p2)/100;
      int x3=(ds*p3)/100;
      int x4=(ds*p4)/100;
      int x5=(ds*p5)/100;
      
      
      String y1=Integer.toString(x1);
      String y2=Integer.toString(x2);
      String y3=Integer.toString(x3);
      String y4=Integer.toString(x4);
      String y5=Integer.toString(x5);
        
        
      dpoints.add(y1);
      dpoints.add(y2);
      dpoints.add(y3);
      dpoints.add(y4);
      dpoints.add(y5);
        
        return dpoints;
    }
    
}
