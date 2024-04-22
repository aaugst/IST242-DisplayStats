//DONE
package View;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel {

    private CenterPanel cp;

    public InitialPanel(){
        super();
        cp = new CenterPanel();
        this.setLayout(new GridLayout (1,1));
        this.add(cp);
        
    }
    
    public CenterPanel getCp() {
        return cp;
    }

    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }
}
