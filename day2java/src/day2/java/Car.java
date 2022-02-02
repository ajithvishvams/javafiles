package day2.java;

class Car 
{
  private int price;
  private String brandName;
  private String color;
  
  //default constructor 
  Car() 
  {
  }
  
  Car(int price, String brandName, String color) 
  {
      this.price = price;
      this.brandName = brandName;
      this.color = color;
  }
  public void setPrice(int price) {
      this.price = price;
  }
  public void setBrandName(String brandName) {
      this.brandName = brandName;
  }
  public void setColor(String color) {
      this.color = color;
  }
  public int getPrice() {
      return this.price;
  }

  public String getBrandName() {
      return this.brandName;
  }
  public String getcolor() {
      return this.color;
  }
  public void printDetails() {
      System.out.println("Brand " + this.brandName);
      System.out.println("Price " + this.price);
      System.out.println("Color " + this.color);
  }
  public static void main(String args[]) {
      Car car1 = new Car(850000, "Hyundai", "White");
      car1.printDetails();
      Car car2 = new Car();
      car2.setBrandName("Lenovo");
      car2.setPrice(750000);
      car2.setColor("Blue");

      System.out.println("Price " + car2.getPrice());
      System.out.println("BrandName " + car2.getBrandName());
      System.out.println("Color " + car2.getcolor());

  }

}

