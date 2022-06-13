import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class main {
    public static void main(String[] args)throws IOException{
        int x = 11;
        int try_num = 0;
        Scanner scan = new Scanner(System.in);
        while(try_num < 5){
            System.out.println("2桁の数字を入力してください");
            int gess = scan.nextInt();
            if(gess <10 || gess >99){
                System.out.println("もう一度やり直してください");
                continue;
            }
            if(gess == x){
                System.out.println("あたり");
                break;
            }else if(gess < x){
                if(gess + 20 < x){
                    System.out.println("その数字より20以上大きい");
                }else{
                    System.out.println("その数字より大きい");
                }
            }else if(gess > x){
                if(gess -20 > x){
                    System.out.println("その数字より20以上小さい");
                }else{
                    System.out.println("その数字より小さい");
                }
            }
            try_num++;

        }
    }
}