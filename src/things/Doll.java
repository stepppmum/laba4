package things;

public class Doll extends Thing{
    private static String appearance;
    public Doll(String appearance){
        super.setName("куколку. ");
        super.setMaterial("чудная");
        this.appearance = appearance;
    }
}
