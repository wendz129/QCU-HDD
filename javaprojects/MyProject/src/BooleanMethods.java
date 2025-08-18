// Boolean Methods
// descriptive naming of methods
// methods as conditions

class BooleanMethods {

    public static boolean isTeen(int age)
    {
        if (age >13 && age <= 19)
    {
        return true;
    }
    else
    {
            return false;
   }
 }

    public static void main(String[] args) 
{
   int age;

    do
    {
      System.out.println("Please enter an age that is NOT a teenager: ");
        age = In.getInt();
        } while (    isTeen(age)     );
        System.out.println("Thank you.");
    }
}






//// Boolean Methods
//// descriptive naming of methods
//// methods as conditions
//import java.util.Scanner;
//
//class BooleanMethods 
//{
//  public static boolean isTeen(int age)
//    {
//        return age >=13 && age <= 19;
//    }
//
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//   int age;
//
//    do {
//      System.out.println("Please enter an age that is NOT a teenager: ");
//        age = scanner.nextInt();
//        } while (    isTeen(age)     );
//        System.out.println("Thank you.");
//        scanner.close();
//    }
//}