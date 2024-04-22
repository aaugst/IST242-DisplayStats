//DONE
package Model;

public class Person
{
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }
   
    public Person(){
        name = "";
        height = new Height(0, 0);
        weight = 0;
        hometown = "N/A";
        highSchool = "N/A";
    }
    
    Person(String personName, Height personHeight, int personWeight, String personHometown, String personHighSchool){
        name = personName;
        height = personHeight;
        weight = personWeight;
        hometown = personHometown;
        highSchool = personHighSchool;
    }
    
    public String toString(){
        return "Person{name=" + getName() + ", height=" + getHeight() + ", weight=" + getWeight() + ", hometown=" + getHometown() + ", highSchool=" + getHighSchool() + "}";
    }
}