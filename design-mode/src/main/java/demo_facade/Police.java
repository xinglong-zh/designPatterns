package demo_facade;

public class Police {
    public void checkLetter(ILetterProcess letterProcess){
        System.out.println(letterProcess+"已经被检查了");
    }
}
