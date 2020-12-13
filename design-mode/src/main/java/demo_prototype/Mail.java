package demo_prototype;

import lombok.Data;

@Data
public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.contxt = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone(){
        Mail mail = null;
        try {
            mail =(Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }



}
