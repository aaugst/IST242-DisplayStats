//TODO
package View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel {
        
    private ArrayList<JButton> headerButtons;
    private ArrayList<JButton> playerButtons;
            
    public CenterPanel(){
        super();
        setBackground(Color.black);
        headerButtons = new ArrayList<>();
        playerButtons = new ArrayList<>();
        this.setLayout(new GridLayout(0,7));
    }
    
    //DONE
    public void makeButtons(int lines, int headers){
   
        for (int i = 0; i < headers; i++){
            JButton hB = new JButton(i + "");
            hB.setBackground(Color.orange);
            headerButtons.add(hB);
            this.add(hB);
        }
        
        for (int i = 0; i < lines * headers ; i++){
            JButton pB = new JButton(i + "");
            pB.setBackground(Color.white);
            playerButtons.add(pB);
            this.add(pB);
        }
        
        this.validate();
        this.repaint();
    }
    
    //DONE
    public void makeLabels(ArrayList<ArrayList<String>> arrOfarr, ArrayList<String> arr){
        for (int i = 0; i < arr.size(); i++) {
            headerButtons.get(i).setText(arr.get(i));
        }
        
        int k = 0;
        for (int i = 0; i < arrOfarr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                    playerButtons.get(k).setText(arrOfarr.get(i).get(j)); 
                    k++;
            }
        }
    }
    
    public ArrayList<JButton> getHeaderButtons() {
        return headerButtons;
    }

    public void setHeaderButtons(ArrayList<JButton> headerButtons) {
        this.headerButtons = headerButtons;
    }

    public ArrayList<JButton> getPlayerButtons() {
        return playerButtons;
    }

    public void setPlayerButtons(ArrayList<JButton> playerButtons) {
        this.playerButtons = playerButtons;
    }
}
