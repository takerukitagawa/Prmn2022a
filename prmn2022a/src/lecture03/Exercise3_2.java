package lecture03;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static <Student> void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        System.out.print("> ");
        int n = input.nextInt();

        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.println(i + "行目:");
            System.out.print("> ");
            Scanner inputa = new Scanner(System.in);
            String item = inputa.nextLine();
            list.add(item);
        }

        int i = 0;
        for(String List: list){
            System.out.println("[" + i +  "] " + List);
            i++;
        }
    }
}
