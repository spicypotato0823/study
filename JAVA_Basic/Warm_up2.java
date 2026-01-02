import java.util.Scanner;


public class Warm_up2 {
    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("단어를 입력하세요: ");
        String str = sc.next();
        
        System.out.print("난이도를 입력하세요: ");
        int num = sc.nextInt();

        System.out.printf("[입력 확인] 단어 : %s / 난이도 : %d", str, num);

        
        sc.close();
        

    }
}
