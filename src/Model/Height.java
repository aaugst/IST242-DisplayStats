//DONE
package Model;

public class Height {
    
    private int feet;
    private int inches;

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
    public Height(){
        feet = 0;
        inches = 0;
    }
    
    Height(int heightFeet, int heightInches){
        feet = heightFeet;
        inches = heightInches;
    }
    
    public String toString(){
        return feet + "'" + inches + "\"";
    }
}