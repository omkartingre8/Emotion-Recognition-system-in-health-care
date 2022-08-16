/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.text.DecimalFormat;
import java.util.ArrayList;


/**
 *
 * @author welcome
 */
public class EuclideanDistanceCal {
    
    
    public double getDistance(ArrayList preprocess)
    {
        ArrayList eucdistance=new ArrayList();
       double mean=0.0, summean=0.0;
        
       
        
        
        
        for(int i=0;i<preprocess.size();i++)
        {
            ArrayList ntemp=new ArrayList();
            double dis=0.0;
            ArrayList temp1=(ArrayList) preprocess.get(i);
            
          // String s=(String) temp1.get(0);
           String s1=(String)temp1.get(0);
           String s2=(String)temp1.get(1);
           
           

            double x1=Double.parseDouble(s1);
            double x2=Double.parseDouble(s2);
            
           
            
            
            double sum=0.0;
            for(int j=0;j<preprocess.size();j++)
            {
               
                if(i!=j)
                {
                   ArrayList temp2=(ArrayList) preprocess.get(j);
            
           String ss1=(String)temp2.get(0);
           String ss2=(String)temp2.get(1);
           

            double y1=Double.parseDouble(ss1);
            double y2=Double.parseDouble(ss2);
            
           
            
            double ssum= Math.pow(y1-x1, 2)+Math.pow(y2-x2, 2);
           // System.out.println(sum);
            dis=Math.sqrt(ssum);
            
            
            sum=sum+dis;
             //   System.out.println(sum);
           
                }
                
              }
         
         
             
            double rd=sum/preprocess.size()-1;
            rd=Math.abs(rd);
            rd=Double.parseDouble(new DecimalFormat("##.##").format(rd));
            String rd1=Double.toString(rd);
           // System.out.println("rd "+rd);
                
            
            ntemp.add(s1);
            ntemp.add(s2);
            ntemp.add(rd1);
//           
            mean=mean+rd;
            
            eucdistance.add(ntemp);
           // DataKeeper.distancelist.add(ntemp);
            
        
        }
        
        mean=mean/preprocess.size();
        mean=Double.parseDouble(new DecimalFormat("##.##").format(mean));
        
        DataKeeper.distancelist=eucdistance;
        
//        System.out.println("MEAN===========================================");
//        System.out.println(mean);
        
        
        mean=Math.sqrt(mean);
        
        return mean;
    }
    
}
