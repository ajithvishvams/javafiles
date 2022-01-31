package day2.java;
class Pen {

  private int price;
  private String brandName;
  private String color;

  Pen() {

  }

  Pen(int price, String brandName, String color) 
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
  public String getColor() {
      return this.color;
  }
  public void printDetails() {
      System.out.println("Brand " + this.brandName);
      System.out.println("Price " + this.price);
      System.out.println("Color " + this.color);
  }
  public static void main(String args[]) {
      Pen pen1 = new Pen(10, "Avenue", "grey");
      pen1.printDetails();
      
      Pen pen2 = new Pen();
      pen2.setBrandName("Park");
      pen2.setColor("Green");
      pen2.setPrice(50);


      System.out.println("BrandName " + pen2.getBrandName());
      System.out.println("Color " + pen2.getColor());
      System.out.println("Price " + pen2.getPrice());

  }

}

