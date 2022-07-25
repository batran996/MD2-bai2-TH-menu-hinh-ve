import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vẽ ứng dụng theo STT !");
        Scanner input = new Scanner(System.in);
        int change = -1;
        while (change != 0) {
            System.out.println("hãy chọn các giá trị sau ");
            System.out.println("chọn 1: vẽ tam giác");
            System.out.println("chọn 2: vẽ hình vuông");
            System.out.println("chọn 3: vẽ hình chữ nhật");
            System.out.println("chọn 0: thoát ra");
            change = input.nextInt();
            switch (change) {
                case 1:
                    System.out.println("vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("vẽ hình vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("vẽ hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("có cái nịt");
            }
        }
    }

}