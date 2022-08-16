/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearregression;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author VOSTRO2557
 */
public class LinearRegression {
    
     private double m=0.0, b=0.0;
     
    public ArrayList initRegression(ArrayList<Double> x, ArrayList<Double> y)
    {
           
      //  ArrayList =new ArrayList();
        ArrayList<Double> slopeinterce=new ArrayList<Double>();
        
        
        ArrayList<Double> slope=new ArrayList<Double>();
        ArrayList<Double> intercept=new ArrayList<Double>();
        
        double sumx=0.0;
        double sumy=0.0;
        double x2=0.0;
        double xy=0.0;
        
         
        
        for(int i=0;i<x.size();i++)
        {
            ArrayList temp=new ArrayList();
            double num1=x.get(i);
            double num2=y.get(i);
            double value1=num1*num1;
            double value2=num1*num2;
            
            sumx=sumx+num1;
            sumy=sumy+num2;
            x2=x2+value1;
            xy=xy+value2;
            
//            System.out.println(num1);
//            System.out.println(num2);
//            System.out.println(value1);
//            System.out.println(value2);
           
          
        }
            slope.add(sumx);
            slope.add(sumy);
            slope.add(x2);
            slope.add(xy);
        
    //    System.out.println(value);
            
             double size=x.size();
             
            
             double val1=(size*slope.get(3))-(slope.get(0)*slope.get(1));
             double val2=(size*slope.get(2))-Math.pow(slope.get(0), 2);
                       m= val1/val2;
                       m=Math.abs(m);
            
           
         //   m=Double.parseDouble(new DecimalFormat("##.####").format(m));
            
//           
        //    System.out.println("Slope is: "+m);
            
              b=(slope.get(1)-(m*slope.get(0)))/size;
              b=Math.abs(b);
           //   b=Double.parseDouble(new DecimalFormat("##.####").format(b));
              
              
           //   System.out.println("Intercept is: "+b);
                
//             for(int i=0;i<x.size();i++)
//             {
//                 double num=m*x.get(i)+b;
//                 num=Double.parseDouble(new DecimalFormat("##.##").format(num));
//                 intercept.add(num);
//                 
//             }
            
             //  System.out.println("Equation of Line: "+intercept);
             
             slopeinterce.add(m);
             slopeinterce.add(b);
             
             return slopeinterce;
            
      
             
    }
    
    double getSlope_M()
    {
        return m;
        
    }
    
    double getIntercept_Y()
    {
        return b;
        
    }
    
}
