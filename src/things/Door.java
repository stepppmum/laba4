package things;

import Exeptions.KeyHoleSizeExeption;

public class Door extends Thing{
    private static boolean isClosed;
    private keyHole Hole = new keyHole();

    public Door(boolean isClosed){
        super.setName("дверь. ");
        super.setMaterial("массивная");
        this.isClosed = isClosed;
    }
    public Door(){

    }
    public void setClosed(boolean isClosed){
        this.isClosed = isClosed;
    }
    public static boolean getClosed(){
        return isClosed;
    }

    public void getHole(){
//        keyHole Hole = new keyHole();
        try{
            Hole.setSize(5);
        } catch (KeyHoleSizeExeption e){
            System.err.println("Неверно задан размер");
        }
    }


    public class keyHole{
        private int Size;

        public void setSize(int Size) throws KeyHoleSizeExeption {
            if(Size <= 0){
                throw new KeyHoleSizeExeption("НЕПРАВИЛЬНО");
            }
            this.Size = Size;
        }
        public int getSize(){
            return Size;
        }

    }


}
