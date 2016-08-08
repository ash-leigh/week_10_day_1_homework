import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PetShopTest{
  PetShop petShop;
  Dog dog;

  @Before
  public void before(){
    petShop = new PetShop();
    dog = new Dog();
  }

  @Test
  public void inventoryStartsEmpty(){
    assertEquals(0, petShop.stockCount());
  }

  @Test
  public void canAddInventory(){
    petShop.addInventory(dog);
    assertEquals(1, petShop.stockCount());
  }

  @Test
  public void shopIsFull(){
    for(int i = 0; i < 10; i++){
      petShop.addInventory(dog);
    }
    assertEquals(true, petShop.shopFull());
  }

  @Test
  public void cannotAddWhenFull(){
    for(int i = 0; i < 15; i++){
      petShop.addInventory(dog);
    }
    assertEquals(10, petShop.stockCount());
  }

  @Test
  public void canEmptyInventory(){
    petShop.addInventory(dog);
    assertEquals(1, petShop.stockCount());
    petShop.emptyInventory();
    assertEquals(0, petShop.stockCount());
  }


}

