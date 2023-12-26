package characters;

import Actions.Actions;
import Exeptions.SameActionExeption;
import things.Thing;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String clothes;

    public final void setName(String name){
        this.name = name;
    }
    public final String getName(){
        return name;
    }
    public final void setClothes(String clothes){
        this.clothes = clothes;
    }
    public final String getClothes(){
        return clothes;
    }
    public void doAction(Actions act ) {
        Actions action = act.setAction();
        String str = act.getAction();
        System.out.print(getName() + str + " ");
    }
    public void doAction(Actions act, Thing obj){
        doAction(act);
        System.out.print(obj.getMaterial() + " " + obj.getName() + ". ");
    }
    public void doAction(Actions act, Person obj){
        doAction(act);
        System.out.print(obj.getName() + " " + obj.getClothes() + ". ");
    }
    public void doAction(Actions act, String string){
        doAction(act);
        System.out.print(string);
    }
    public void doAction(Actions act, Actions act2, Thing obj) throws SameActionExeption {
        if (act2.getAction() == act.getAction()){
            throw new SameActionExeption("одинаковые действия");
        }
        else {
            doAction(act);
            System.out.print(act2.getAction() + "на " + obj.getName());
        }
    }
    public void doAction(Actions act, Actions act2)throws SameActionExeption {
        if (act.getAction() == act2.getAction()){
            throw new SameActionExeption("одинаковые действия");
        }
        else {
            doAction(act);
            System.out.print(act2.getAction());
        }
    }
    public void isAnnoyed(){
        int emotion;
        emotion = ((int) (Math.random() * (101 - 0)) + 0);
        if (emotion < 31)
            System.out.print("Незнайка не обратил внимания на выходки малышек. ");
        else if (31 < emotion & emotion < 61)
            System.out.print("Незнайка лишь вздохнул и попросил девочек быть потише. ");
        else if (60 < emotion & emotion < 81)
            System.out.print("Незнайка был недоволен поведением малышек, поэтому наругал их за излишний шум. ");
        else
            System.out.print("Незнайка очень сильно разозлился и отругал малышек за их поведение. ");
    }
    @Override
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

}

