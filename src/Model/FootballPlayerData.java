//DONE
package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData extends FootballPlayer implements TableData, Displayable
{
    private ArrayList<TableMember> players;
    
    private int firstLineToDisplay;
    private int lastLineToDisplay;
    private int linesBeingDisplayed;
    private int lineToHighlight;

    public FootballPlayerData()
    {
        players = new ArrayList<>();
        loadTable();
        this.setLinesBeingDisplayed(10);
        // this.setFirstLineToDisplay(0);
        lineToHighlight = 1;
    }

    @Override
    public void loadTable()
    {
        ReadPlayersFromXML();
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }//readplayersfromxml

    //DONE
    public ArrayList<TableMember> getTable(){
        return players;
    }

    //DONE
    public ArrayList<String> getHeaders(){
        return getAttributeNames();
    }

    //DONE
    public ArrayList<String> getLine(int line){
        return players.get(line).getAttributes();
    }

    //DONE
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine){
        ArrayList<ArrayList<String>> lines = new ArrayList<ArrayList<String>>();
                
        for (int i = firstLine; i <= lastLine; i++){
            lines.add(this.getLine(i));
        }
        
        return lines;
    }

    //DONE 
    public int getFirstLineToDisplay(){
        return firstLineToDisplay;
    }
  
    //DONE
    public void setFirstLineToDisplay(int firstLine){
        if (firstLine < 0){
            firstLineToDisplay = 0;
        }
        if (firstLine > this.getTable().size() - this.getLinesBeingDisplayed()){
            firstLineToDisplay = this.getTable().size() - this.getLinesBeingDisplayed();
        }
        else{
            firstLineToDisplay = firstLine;
        }
    } 

    //DONE
    public int getLineToHighlight(){
        return lineToHighlight;
    }
    
    //DONE
    public void setLineToHighlight(int highlightedLine){
        lineToHighlight = highlightedLine;
    } 

    //DONE
    public int getLastLineToDisplay(){
        return firstLineToDisplay + linesBeingDisplayed - 1;
    } 
    
    //DONE
    public void setLastLineToDisplay(int lastLine){
        lastLineToDisplay = firstLineToDisplay + linesBeingDisplayed - 1;
    }
  
    //DONE
    public int getLinesBeingDisplayed(){
        return linesBeingDisplayed; 
    } 
    
    //DONE
    public void setLinesBeingDisplayed(int numberOfLines){
        linesBeingDisplayed = numberOfLines;
    }
}
