package demo_memento;

import lombok.Data;


@Data
public class Boy {
    private String status ="";

    public void changeState(){
        this.status = "心情可能很不好";
    }

    /**
     *
     * @return
     */
    public Memento createMemento(){

       return new Memento(this.status);
    }

    public void restoreMemento(Memento memento){
        this.setStatus(memento.getStatus());
    }
}
