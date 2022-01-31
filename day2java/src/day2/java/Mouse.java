package day2.java;

class Mouse {

  private int price;
  private String brandName;
  private String type;

  Mouse() {

  }

  Mouse(int price, String brandName, String type) 
  {
      this.price = price;
      this.brandName = brandName;
      this.type = type;
  }
  public void setPrice(int price) {
      this.price = price;
  }
  public void setBrandName(String brandName) {
      this.brandName = brandName;
  }
  public void setColor(String type) 
  {
      this.type =type;
  }
  public int getPrice() {
      return this.price;
  }

  public String getBrandName() {
      return this.brandName;
  }
  public String gettype() {
      return this.type;
  }
  public void printDetails() {
      System.out.println("Brand " + this.brandName);
      System.out.println("Price " + this.price);
      System.out.println("Type " + this.type);
  }
  public static void main(String args[]) {
      Mouse mouse1 = new Mouse(650, "Hp", "Wireless");
      mouse1.printDetails();
      
      Mouse mouse2 = new Mouse();
      mouse2.setBrandName("Lenovo");
      mouse2.setColor("Blue");
      mouse2.setPrice(750);


      System.out.println("Price " + mouse2.getPrice());
      System.out.println("BrandName " + mouse2.getBrandName());
      System.out.println("Type " + mouse2.gettype());

  }

}

