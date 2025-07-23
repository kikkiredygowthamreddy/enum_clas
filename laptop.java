enum system{
    mac(10), window(11), dell(14);

    private int price;

    private system(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class laptop{
    public static void main(String args[]) {
////     system sys = system.mac;
//     System.out.println(sys + " : " + sys.getPrice);    
  for(system sys : system.values()){
      System.out.println(sys + " : " + sys.getPrice());    
  }
}


}