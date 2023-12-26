package Actions;

import characters.Person;
import things.Door;

public interface DoorInteraction {
    void lookIn(Person obj);
    void unlockDoor(Person obj);
}
