import java.io.*;
import java.util.Scanner;
public class Task0 {

    //    public class Task0 {
//
//        //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
////Требуется перехватить все возможные ошибки и вывести их в логгер.
////
////После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
//        public static void main(String[] args) {
//
//        }
//
//        public String findJewelsInStones(String jewels, String stones){
//
//            return "";
//        }
//    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int text = in.nextInt();

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\green\\OneDrive\\Рабочий стол\\Учёба\\Visual Studio Code\\Java знакомство и как пользоваться базовым API\\DZ2\\task1")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}