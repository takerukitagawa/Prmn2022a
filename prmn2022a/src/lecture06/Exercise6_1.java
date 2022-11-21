package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        double num = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("小数値を入力してください:");
        try{
            num = input.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("エラー.");
            return;
        }

        System.out.println("入力した値: " + num);
    }
}
