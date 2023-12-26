package characters;

import Actions.Actions;

public abstract class Malishka extends Person{
    public void isAfraid(){
        int emotion;
        emotion = ((int) (Math.random() * (101 - 0)) + 0);
        if (emotion < 31)
            System.out.print(getName() + " не испугалась. ");
        else if (31 < emotion & emotion < 61)
            System.out.print(getName() + " немного испугалась, со страхом посмотрела на Незнайку и заморгала глазками. ");
        else if (60 < emotion & emotion < 81) {
            System.out.print(getName() + " сильно испугалась, на глазах начали появляться слезки. ");
            doAction(Actions.CRY);
        }
        else {
            System.out.print(getName() + " очень сильно испугалась, расплакалась и начала кричать. ");
            doAction(Actions.CRY);
        }
    }

}
