package lecture1;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2210770 Takeru Kitagawa");
        int num = 2110770;
        System.out.println("B" + num + " Takeru Kitagawa");

        int age = 20;
        if(age < 20){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }else{
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        int sum = 0;
        for(int n : array){
            sum += n;
        }
        System.out.println(sum);

        int[] score = {41, 85, 72, 38, 80};
        String hantei;
        for(int i = 0; i < score.length; i++){
            if(90 <= score[i]){
                hantei = "秀";
            }else if(80 <= score[i]){
                hantei = "優";
            }else if(70 <= score[i]){
                hantei = "良";
            }else if(60 <= score[i]){
                hantei = "可";
            }else{
                hantei = "不可";
            }
            System.out.println(i + "番 " + score[i] + "点 " + hantei);
        }
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");

    }
    static int min(int[] score){
        int min = score[0];
        for(int i = 1; i < score.length; i++){
            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }
    static int max(int[] score){
        int max = score[0];
        for(int i = 1; i < score.length; i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }
    static double average(int[] score){
        int sum = 0;
        for(int n : score){
            sum += n;
        }
        double ave =(double)sum / score.length;

        return ave;
    }
}
