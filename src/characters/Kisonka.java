package characters;

import Actions.doorInteraction;

public class Kisonka extends Malishka{
    private String Hair, Eyes, Face;
    public Kisonka(String Hair, String Eyes, String Face){
        super.setName("Кисонька");
        super.setClothes("незнакомая");
        this.Hair = Hair;
        this.Eyes = Eyes;
        this.Face = Face;
    }
    public interface malishkaDescription{
        String getHair();
        String getEyes();
        String getFace();
    }
    public malishkaDescription getDescription(){
        class KisonkaDescription implements malishkaDescription{
            final String Hair = Kisonka.this.Hair, Eyes = Kisonka.this.Eyes, Face = Kisonka.this.Face;

            @Override
            public String getHair(){
                return this.Hair;
            }
            @Override
            public  String getEyes(){
                return this.Eyes;
            }
            @Override
            public String getFace(){
                return this.Face;
            }
        }
        return new KisonkaDescription();
    }

}
