package characters;

import Actions.DoorInteraction;

public class Kisonka extends Malishka{
    private String hair, eyes, face;
    public Kisonka(String hair, String eyes, String face){
        super.setName("Кисонька");
        super.setClothes("незнакомая");
        this.hair = hair;
        this.eyes = eyes;
        this.face = face;
    }
    public interface MalishkaDescription{
        String getHair();
        String getEyes();
        String getFace();
    }
    public MalishkaDescription getDescription(){
        class KisonkaDescription implements MalishkaDescription{
            final String hair = Kisonka.this.hair, eyes = Kisonka.this.eyes, face = Kisonka.this.face;

            @Override
            public String getHair(){
                return this.hair;
            }
            @Override
            public  String getEyes(){
                return this.eyes;
            }
            @Override
            public String getFace(){
                return this.face;
            }
        }
        return new KisonkaDescription();
    }

}
