import Actions.Actions;
import Exeptions.SameActionExeption;
import characters.*;
import Actions.doorInteraction;
import things.*;

public class Main {
    public static void main(String[] args){
        INeznayka neznaika = new INeznayka.Neznaika();
        Thing door = new Door(true);
        Thing couch = new Couch();
        Thing ladder = new Ladder();
        Thing doll = new Doll("интересная");
        Malishka knopochka = new Knopochka();
        Malishka sineglazka = new Sineglazka();
        Malishka kisonka = new Kisonka("волосы кудряшками", "веселые, озорные глаза", "лукавая рожица с остреньким носиком");
        Door hole = new Door();
        hole.getHole();
        DoorInteraction i = new DoorInteraction() {
            @Override
            public void lookIn(Person obj) {
                System.out.println(obj.getName() + " подглядывает в дверную скважину. ");
            }
            @Override
            public void unlockDoor(Person obj) {
                System.out.print(obj.getName() + " отворяет дверь. ");
            }
        };
        try {
            System.out.print("Когда ");
            sineglazka.doAction(Actions.GONE);
            neznaika.doAction(Actions.WANT, Actions.LOOK, doll);
            neznaika.doAction(Actions.LAY, couch);
            System.out.print("Но за дверью ");
            neznaika.doAction(Actions.LISTEN, "шаги и шепот. ");
            neznaika.doAction(Actions.DECIDE, Actions.LOOK, door);
            neznaika.doAction(Actions.SEE, "что ");
            i.lookIn(sineglazka);
            i.lookIn(knopochka);
            System.out.print("Как вдруг ");
            neznaika.doAction(Actions.LISTEN, "возню. ");
            knopochka.doAction(Actions.ARGUE, sineglazka);
            neznaika.openDoor();
            neznaika.doAction(Actions.SEE, knopochka);
            neznaika.doAction(Actions.SEE, sineglazka);
            neznaika.isAnnoyed();
            knopochka.isAfraid();
            sineglazka.isAfraid();
            knopochka.doAction(Actions.RUN, ladder);
            sineglazka.doAction(Actions.RUN, ladder);
            neznaika.doAction(Actions.SCRATCH, "затылок. ");
            neznaika.doAction(Actions.LAY, couch);
            neznaika.doAction(Actions.DECIDE, Actions.SLEEP);
            neznaika.doAction(Actions.LISTEN, "шаги. ");
            i.unlockDoor(kisonka);
            neznaika.doAction(Actions.SEE, kisonka);
            Kisonka.MalishkaDescription description = ((Kisonka) kisonka).getDescription();
            System.out.println("У нее " + description.getHair() + ", " + description.getEyes() + ", " + description.getFace());
        }catch (SameActionExeption e){
            e.getMessage();
        }
    }
}
