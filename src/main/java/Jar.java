import java.util.Random;

public class Jar{
  private String name;
  private static int MAX_ITEMS;
  
  public Jar(String name, int MAX_ITEMS){
    this.name = name;
    this.MAX_ITEMS = MAX_ITEMS;
  }

  //Fill jar with random amount between 1 and max  
  public int fill(){
    Random random = new Random();
    int randomFillQuantity = random.nextInt(MAX_ITEMS);
    randomFillQuantity ++;
    return randomFillQuantity;
  }

}