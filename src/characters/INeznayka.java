package characters;

import Actions.Actions;
import things.Door;

public abstract class INeznayka extends Person {
    public abstract void openDoor();

    public static class Neznaika extends INeznayka{
        public Neznaika() {
            super.setName("Незнайка");
        }
        public void openDoor(){
            if (Door.getClosed()) {
                doAction(Actions.OPEN);
                System.out.print("массивную дверь. ");
                System.out.print("Незнайка ударил малышек дверью( ");
            }
            else
                System.out.println("Незнайка видит двух малышек.");
        }
    }
}
