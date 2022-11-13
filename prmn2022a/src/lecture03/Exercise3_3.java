package lecture03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3_3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            System.out.println(i + "つ目の整数を入力してください:");
            System.out.print("> ");
            String num = input.nextLine();
            int numi = Integer.parseInt(num);
            list.add(numi);
        }
        list.add(list.get(0) + list.get(1));
        System.out.println(list.get(0) + " + " + list.get(1) + " = " + list.get(2));
    }
}
