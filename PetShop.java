public class PetShop{
  private Dog[] inventory;

  public PetShop(){
    this.inventory = new Dog[10];
  }

  public int stockCount(){
    int count = 0;
    for(Dog dog : inventory){
      if(dog != null){
        count ++;
      }
    }
    return count;
  }

  public void addInventory(Dog dog){
    if(shopFull()) return;
    int currentStock = stockCount();
    inventory[currentStock] = dog;
  }

  public boolean shopFull(){
    return stockCount() == inventory.length;
  }

  public void emptyInventory(){
    for(int i = 0; i < inventory.length; i++){
      inventory[i] = null;
    }
  }
}