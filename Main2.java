interface Telephone 
{
 void isRinging(boolean status, int myNumber);
}
class Main2
{
  public static void main(String args[])
  {
    Telephone t = (boolean status, int myNumber) -> {
  	  if(status == true)
  	  {
  		  System.out.println("Number " + myNumber + " is ringing");
  	  }
    };
    t.isRinging(true, 123456);
  }
}