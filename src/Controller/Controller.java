//TODO
package Controller;

import Model.Model;
import View.View;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Controller 
{

    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;
        
        //create buttons
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        
        //add data (labels)
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
        
        this.addListeners();

    }
    
    //DONE
    public void addListeners() {
                
        view.getInitial().getIp().getCp().getHeaderButtons().get(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(0).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(0).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(1).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(1).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(2).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(2).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(3).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(3).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(4).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(4).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(4).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(5).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {               
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(5).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(5).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().getHeaderButtons().get(6).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (int i = 0; i < model.getFpData().getHeaders().size(); i++){
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setBackground(Color.orange);
                    view.getInitial().getIp().getCp().getHeaderButtons().get(i).setForeground(Color.black);
                }
            
                view.getInitial().getIp().getCp().getHeaderButtons().get(6).setBackground(Color.black);
                view.getInitial().getIp().getCp().getHeaderButtons().get(6).setForeground(Color.white);
            }
        });
        
        view.getInitial().getIp().getCp().addMouseWheelListener(new MouseWheelListener() {           
            @Override
            public void mouseWheelMoved(MouseWheelEvent e)
            {
                int units = e.getUnitsToScroll();
                // int wr = e.getWheelRotation();

                model.getFpData().setFirstLineToDisplay(model.getFpData().getFirstLineToDisplay() + units);
                
                view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders());
                
                System.out.println(units);    
            }  
        });
    }
}