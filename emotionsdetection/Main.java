/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package emotionsdetection;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.UIManager;

/**
 *
 * @author 1450
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
            MainFrame mf=new MainFrame();
            mf.setVisible(true);
            mf.setSize(d);

        
       
    }
    
}
