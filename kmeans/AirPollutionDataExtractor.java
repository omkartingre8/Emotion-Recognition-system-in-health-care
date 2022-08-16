package kmeans;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author welcome
 */
public class AirPollutionDataExtractor {

       
       public ArrayList getTestScore(String area1)
    {

       ArrayList db=new ArrayList();
       

        try
        {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/airpollution","root","root");
            Statement st=conn.createStatement();
            



            String query="Select *from pollutiondata where Area='"+area1+"'";

            ResultSet rs=st.executeQuery(query);
            

            
             while(rs.next())
            {

                

             String area=rs.getString(1);
             String co2=rs.getString(2);
             String co=rs.getString(3);
             
             
             
             ArrayList data=new ArrayList();

              data.add(area);
              data.add(co2);
              data.add(co);
              
              
              db.add(data);
              
             
            }

            

        }

        catch(Exception e)
        {
            System.out.println("Exception in Air Pollution Data Extractor Class is: "+e);

        }

       return db;
    }

      
}


     
      