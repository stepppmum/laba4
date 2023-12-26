package things;

import Exeptions.KeyHoleSizeExeption;

public abstract class Thing{
    private String name;
    private String material;

    public final void setName(String name){
        this.name = name;
    }
    public final String getName(){
        return name;
    }
    public final void setMaterial(String material){
        this.material = material;
    }
    public final String getMaterial(){
        return material;
    }



    @Override
    public String toString(){
        return this.name;
    }

}
