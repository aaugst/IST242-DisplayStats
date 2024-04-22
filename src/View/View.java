//DONE
package View;

import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;

public class View
{

    private InitialFrame initial;

    public View()
    {
        initial = new InitialFrame();
    }

    //DONE
    public void basicDisplay(String s)
    {
        System.out.println(s);
    }
    
    //DONE
    public void basicDisplay(ArrayList<String> arr)
    {
        for (String s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
    
    //DONE
    public void linesDisplay(ArrayList<ArrayList<String>> arrOfarr){
         for (ArrayList<String> s : arrOfarr){
             basicDisplay(s);
         }
    }
    
    //DONE
    public void CenterInitialSetup(int lines, int headers){
         initial.getIp().getCp().makeButtons(lines, headers);
    }
    
    //DONE
    public void CenterUpdate(ArrayList<ArrayList<String>> arrOfarr, ArrayList<String> arr){
        initial.getIp().getCp().makeLabels(arrOfarr, arr);
    }
    
    public InitialFrame getInitial() {
        return initial;
    }

    public void setInitial(InitialFrame initial) {
        this.initial = initial;
    }
}
