//DONE
package View;

import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame{
    
    private InitialPanel ip;

    public InitialFrame(){
        super();
        setupLayoutForMacs();
        ip = new InitialPanel();
        this.add(ip);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000,500);
        setVisible(true);
    }
    
    public InitialPanel getIp() {
        return ip;
    }

    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
    
    private void setupLayoutForMacs()
    { 
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
