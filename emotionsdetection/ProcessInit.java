/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emotionsdetection;


import java.util.ArrayList;
import kmeans.KmeansInit;
import linearregression.LinearInit;

/**
 *
 * @author 1450
 */
public class ProcessInit {
   

    public void initProcess(ArrayList orgdata)
    {
        
       
        
        for(int i=0;i<orgdata.size();i++)
        {
            ArrayList row=(ArrayList) orgdata.get(i);
            System.out.println(row);
           
        }
        
         String res1="";
         for(int i=0;i<orgdata.size();i++)
           {
               ArrayList t=(ArrayList) orgdata.get(i);
               String temp=t.toString();
               res1=res1+"\n "+temp;
                //               System.out.println(temp);
           }
         DatasetDisplayFrame.res=res1;
        
        ArrayList preprocess=new ArrayList();
        
        for(int i=0;i<orgdata.size();i++)
        {
            ArrayList temp=new ArrayList();
            ArrayList row=(ArrayList) orgdata.get(i);
            String st1=(String) row.get(1);
            String st2=(String) row.get(5);
            
            temp.add(st1);
            temp.add(st2);
            
            preprocess.add(temp);
            
        }
        
        System.out.println();
         System.out.println("DATA AFTER PREPROCESSING****************************************************");
        
        for(int i=0;i<preprocess.size();i++)
        {
            ArrayList row=(ArrayList) preprocess.get(i);
            System.out.println(row);
           
        }
        
         String res2="";
         for(int i=0;i<preprocess.size();i++)
           {
               ArrayList t=(ArrayList) preprocess.get(i);
               String temp=t.toString();
               res2=res2+"\n "+temp;
                //               System.out.println(temp);
           }
         DataPreprocessFrame.res=res2;
        
         ArrayList kmeanscluster= new KmeansInit().getCluster(preprocess);
         System.out.println("K-MEANS Clusters Are====================================");
        
         for(int i=0;i<kmeanscluster.size();i++)
        {
            System.out.println("CLUSTER NO "+(i+1));
            ArrayList t=(ArrayList) kmeanscluster.get(i);
            
            for(int j=0;j<t.size();j++)
            {
                ArrayList t1=(ArrayList) t.get(j);
                System.out.println(t1);
            }
                        
                    System.out.println();
            
        }
         
          String res3="";
           
         
         for(int i=0;i<kmeanscluster.size();i++)
           {
              res3=res3+" K-MEANS CLUSTER NO "+(i+1)+"\n";
               String s1="";
               
               ArrayList t=(ArrayList) kmeanscluster.get(i);
               for(int j=0;j<t.size();j++)
               {
                 ArrayList t1=(ArrayList) t.get(j);
                 String s2=t1.toString();
                  s1=s1+"\n"+s2;
               
                   
               }
               
               res3=res3+"\n"+s1;
               res3=res3+"\n\n-------------------------------------------------------------------------------------------------------------------------\n\n";
               
                //               System.out.println(temp);
           }
         KMeansClusterFrame.res=res3;
           
         
          System.out.println("\n");
         System.out.println("Linear Regression Cluster===================================================");
       
         ArrayList linearregress= new LinearInit().getLinearRegression(kmeanscluster);
         
         
         System.out.println("ECG"+ "  "+ "Skin Temperature"+" "+"Linear Probability Ratio");
         for(int i=0;i<linearregress.size();i++)
        {
            System.out.println("CLUSTER NO "+(i+1));
            ArrayList t=(ArrayList) linearregress.get(i);
            
            for(int j=0;j<t.size();j++)
            {
                ArrayList t1=(ArrayList) t.get(j);
                System.out.println(t1);
            }
                        
                    System.out.println();
            
        }
         
         String res4="";
          
          for(int i=0;i<linearregress.size();i++)
           {
              res4=res4+" LINEAR REGRESSION CLUSTER NO "+(i+1)+"\n";
               String s1="";
               
               ArrayList t=(ArrayList) linearregress.get(i);
               for(int j=0;j<t.size();j++)
               {
                 ArrayList t1=(ArrayList) t.get(j);
                 String s2=t1.toString();
                  s1=s1+"\n"+s2;
               
                   
               }
               
               res4=res4+"\n"+s1;
               res4=res4+"\n\n-------------------------------------------------------------------------------------------------------------------------\n\n";
               
                //               System.out.println(temp);
           }
         LinearRegressionFrame.res=res4;
        
        
                System.out.println("Maximum Linear Probability Ratio: "+DataKeeper.max);
                System.out.println("Minimum Linear Probability Ratio: "+DataKeeper.min);
                System.out.println("Threshold Linear Probability Ratio: "+DataKeeper.mid);
                

        
    }
    
}
