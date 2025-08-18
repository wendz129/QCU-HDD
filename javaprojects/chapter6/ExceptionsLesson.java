package chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsLesson{
    public static void main(String[] args) throws Exception, RuntimeException {
        throw new Exception("Bad Code");
        // throw new RuntimeException("Bad Code");
    }
}
class ExceptionLesson2{
    public static void main(String[] args) {
        try{
            
            // System.out.println(args[0]);
            System.out.println(12/0);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("eeeee");
            System.exit(0);
        }
        catch(RuntimeException e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("finally block");
        }

        System.out.println("done");
        
    }
}
class ExceptionLesson3{
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = read();
            }
        catch(IOException e){
            try{
                if(reader!=null){
                    reader.close();
                            }
                }
            catch(IOException inner){
                    //
                }
            }
        }
            
            private static FileReader read() throws IOException {
                return null;
            }
}

// package chapter6;

// import java.io.FileReader;
// import java.io.IOException;

// public class ExceptionsLesson{
//     public static void main(String[] args) throws Exception, RuntimeException {
//         throw new Exception("Bad Code");
//         // throw new RuntimeException("Bad Code");
//     }
// }
// class ExceptionLesson2{
//     public static void main(String[] args) {
//         try{
            
//             // System.out.println(args[0]);
//             System.out.println(12/0);
            
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("eeeee");
//             System.exit(0);
//         }
//         catch(RuntimeException e){
//             System.out.println(e);
            
//         }
//         finally{
//             System.out.println("finally block");
//         }

//         System.out.println("done");
        
//     }
// }
// class ExceptionLesson3{
//     public static void main(String[] args) {
//         FileReader reader = null;
//         try{
//             reader = read();
//             }
//         catch(IOException e){
//             try{
//                 if(reader!=null){
//                     reader.close();
//                             }
//                 }
//             catch(IOException inner){
//                     //
//                 }
//             }
//         }
            
//             private static FileReader read() throws IOException {
//                 return null;
//             }
// }

// Gorilla.java
public class Gorilla implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The gorilla grunts!");
    }

    @Override
    public void eat() {
        System.out.println("The gorilla eats bananas and leaves.");
    }

    @Override
    public void sleep() {
        System.out.println("The gorilla sleeps in the trees.");
    }


    // Additional method specific to Gorilla
    public void climb() {
        System.out.println("The gorilla climbs the trees.");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        gorilla.makeSound();  // Output: The gorilla grunts!
        gorilla.eat();        // Output: The gorilla eats bananas and leaves.
        gorilla.sleep();      // Output: The gorilla sleeps in the trees.
        gorilla.climb();      // Output: The gorilla climbs the trees.
    }
}