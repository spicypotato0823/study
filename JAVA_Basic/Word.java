public class Word {
    //멤버 변수
    private int level;
    private String en;
    private String ko;

    public Word(String newEn, String newKo, int newLevel)
    {
        this.en = newEn;
        this.ko = newKo;
        this.level = newLevel;
        
    }

    public void setLevel(int newLevel)
    {
        if(newLevel >= 1 && newLevel <= 3)
            {
                this.level = newLevel;
            }        
        else
        {
            System.out.println("경고 : 난이도는 1~3 사이만 가능합니다.");
        }
    }

    public void printWord()
    {
        System.out.printf("[영단어] : %s [의미] : %s [난이도] : %d\n", en, ko, level);
    }
    
}
