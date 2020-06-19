interface A{
    void show();
}
// Day 1
// class Xyz implements A{
//     public void show()
//     {
//         System.out.print("Hellow !");
//     }
// }
// public class Lambda {
//     public static void main(String args[])
//     {
//         A obj = new Xyz();
//         obj.show();
//     }
// }


public class Lambda {
    public static void main(String args[])
    {
        // A obj = new A(){
        //     {
        //         public void show()
        //         {
        //             System.out.print("Hellow !");
        //         }
        //     }
        // };
        A obj = () -> System.out.println("Hello !");
        
        
        obj.show();


       
    }
}