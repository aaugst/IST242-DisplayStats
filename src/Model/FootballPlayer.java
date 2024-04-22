//DONE
package Model;
import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember {
    
    private int number;
    private String position;
    ArrayList<String> attributes;
    ArrayList<String> attributeNames;
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public FootballPlayer(){
        super();
        number = 0;
        position = "N/A";
    }
    
    FootballPlayer(String personName, Height personHeight, int personWeight, String personHometown, String personHighSchool, int playerNumber, String playerPosition){
        super(personName, personHeight, personWeight, personHometown, personHighSchool);
        number = playerNumber;
        position = playerPosition;
    }
    
    public String toString(){
        return "Person{name=" + getName() + ", height=" + getHeight() + ", weight=" + getWeight() + ", hometown=" + getHometown() + ", highSchool=" + getHighSchool() + "}" 
                + " FootballPlayer{number=" + getNumber() + ", position=" + getPosition() + "}";
    }  
    
    //DONE
    public String getAttribute(int n){
        if (n == 0){
            return String.valueOf(this.getNumber());
        }        
        else if (n == 1){
            return this.getPosition();
        }
        else if (n == 2){
            return this.getName();
        }
        else if (n == 3){
            return this.getHeight().toString();
        }
        else if (n == 4){
            return String.valueOf(this.getWeight());
        }
        else if (n == 5){
            return this.getHometown();
        }
        else if (n == 6){
            return this.getHighSchool();
        }
        else{
            return "invalid input parameter";
        }
    }
    
    //DONE
    public ArrayList<String> getAttributes( ){
        attributes = new ArrayList<String>();
        
        for (int i = 0; i < 7; i++){            
            attributes.add(this.getAttribute(i));  
        }
        
        return attributes;    
    }             
    
    //DONE
    public String getAttributeName(int n){
        if (n == 0){
            return "number";
        }        
        else if (n == 1){
            return "position";
        }
        else if (n == 2){
            return "name";
        }
        else if (n == 3){
            return "height";
        }
        else if (n == 4){
            return "weight";
        }
        else if (n == 5){
            return "hometown";
        }
        else if (n == 6){
            return "highSchool";
        }
        else{
            return "invalid input parameter";
        }
    }
    
    //DONE
    public ArrayList<String> getAttributeNames( ){
       attributeNames = new ArrayList<String>();
        
        for (int i = 0; i < 7; i++){            
            attributeNames.add(this.getAttributeName(i));  
        }
        
        return attributeNames;
    }
}