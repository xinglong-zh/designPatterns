package demo_facade;

public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    private Police police = new Police();

    void sendLetter(String context,String address){
        this.letterProcess.writeContext(context);
        this.letterProcess.fillEnvelope(address);

        this.police.checkLetter(letterProcess);
        this.letterProcess.letterIntoEnvelope();
        this.letterProcess.sendLetter();
    }

}
