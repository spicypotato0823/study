import java.util.Scanner;

public class Main 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        Word[] wordBook = new Word[3];

        for(int i = 1; i <= wordBook.length; i++)
            {
                System.out.printf("%d번째 단어를 입력하세요 : ", i);
                String str1 = sc.next();
                
                System.out.printf("%d번째 단어의 뜻을 입력하세요 : ", i);
                String str2 = sc.next();

                System.out.printf("%d번째 단어의 난이도를 입력하세요 : ", i);
                int num = sc.nextInt();
                
                
                wordBook[i - 1] = new Word(str1, str2, num);
                
            }    
    
            for(Word w : wordBook)
            {
                w.printWord();
            }
            

            sc.close();
    }    

}
