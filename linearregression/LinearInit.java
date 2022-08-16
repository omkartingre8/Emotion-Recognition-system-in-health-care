/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearregression;

import emotionsdetection.DataKeeper;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author 1450
 */
public class LinearInit {
    
    public ArrayList getLinearRegression(ArrayList kmeanscluster)
    {
        ArrayList linearcluster=new ArrayList();
        
        ArrayList intercept=new ArrayList();
        
        ArrayList<Double> x=new ArrayList<Double>();
        ArrayList<Double> y=new ArrayList<Double>();
        
        for (int i = 0; i <kmeanscluster.size(); i++) 
        {
            ArrayList single= (ArrayList) kmeanscluster.get(i);
            
            for (int j = 0; j <single.size(); j++) 
            {
                ArrayList row=(ArrayList) single.get(j);   
                x.add(Double.parseDouble((String) row.get(0)));
                y.add(Double.parseDouble((String) row.get(1)));
                   
            }
            
         //   System.out.println("X Data: "+x);
          //   System.out.println("Y Data: "+y);
             ArrayList slopeintercevalue= new LinearRegression().initRegression(x,y);
             intercept.add(slopeintercevalue);
            
        }
        
           System.out.println("Cluster Wise Intercept Value: "+intercept);
           
           
           double max=0.0;
           double min=50.0;
           double mid=0.0;
           
                for (int j = 0; j <kmeanscluster.size(); j++) 
                {
                    ArrayList row1 = (ArrayList) intercept.get(j);
                    double m = (double) row1.get(0);
                    double b = (double) row1.get(1);
                    ArrayList temp1 = new ArrayList();
                    ArrayList single=(ArrayList) kmeanscluster.get(j);
                    
                    for (int k = 0; k <single.size(); k++) 
                    {
                        ArrayList temp2 = new ArrayList();
                        ArrayList row = (ArrayList) single.get(k);
                        double x1 = Double.parseDouble((String) row.get(0));
                        
                                               
                        double num = m * x1 + b;
                       // num = Double.parseDouble(new DecimalFormat("##.##").format(num));
                        
                        if(max<num)
                        {
                            max=num; 
                        }
                        else if(min>num)
                        {
                           min=num;     
                        }
                        
                       
                            
                        temp2.add(row.get(0));
                        temp2.add(row.get(1));
                        temp2.add(Double.toString(num));
                        temp1.add(temp2);

                    }
                   // System.out.println("Temp1: "+temp1);
                    linearcluster.add(temp1);
                    
                } 
                
           
           
          // System.out.println("Linear Cluster Size"+linearcluster.size());
                
                double m1=max/2;
                double m2=min/2;
                
                mid=m1+m2;
                DataKeeper.max=max;
                DataKeeper.min=min;
                DataKeeper.mid=mid;
                
         return linearcluster;
    }
    
}
