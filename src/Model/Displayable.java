//DONE
package Model;

public interface Displayable {
  
  // 
  public int getFirstLineToDisplay(); 
  public void setFirstLineToDisplay(int firstLine); 

  public int getLineToHighlight(); 
  public void setLineToHighlight(int highlightedLine); 

  public int getLastLineToDisplay(); 
  public void setLastLineToDisplay(int lastLine); 

  public int getLinesBeingDisplayed(); 
  public void setLinesBeingDisplayed(int numberOfLines); 
}
