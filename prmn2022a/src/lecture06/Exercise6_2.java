package lecture06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        int index;
        List<Integer> list;
        list = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i < 5; i++){
            list.add(random.nextInt(6) + 1);
        }
        System.out.println("さいころを5つ振りました.");

        Scanner input = new Scanner(System.in);
        System.out.println("何番目のさいころの値を確認しますか？");
        System.out.print("> ");
        try {
            index = input.nextInt();
            System.out.println(list.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
            return;
        }
    }
}
