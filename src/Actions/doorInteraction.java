package Actions;

import characters.Person;
import things.Door;

public interface doorInteraction {
    void lookIn(Person obj);
    void unlockDoor(Person obj);
}
