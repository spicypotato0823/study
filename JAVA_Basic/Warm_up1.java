import java.util.Scanner;

public class Warm_up1 { // 클래스 이름 = 파일 이름


    public static void main(String[] args)
    {
        //여기에 코드를 작성
        Scanner sc = new Scanner(System.in);

        System.out.println("println");
        System.out.print("print");
        System.out.printf("printf %c언어 스타일", 'c');
        
        /*
        int num = sc.nextInt();
        double pi = sc.nextDouble();
        String str = sc.next();// 단어 입력 (공백전까지)
        String line = sc.nextLine();// 한 줄 통째로 입력
         */
        
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }




    
}