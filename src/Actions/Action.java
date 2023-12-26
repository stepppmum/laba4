package Actions;


public abstract class Action implements Iaction {
    public abstract Actions setAction();
    public abstract String getAction();
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Action action = (Action) object;
        return this.setAction() == action.setAction() && this.getAction() == action.getAction();
    }
    @Override
    public int hashCode(){
        return this.setAction().hashCode() * this.getAction().hashCode();
    }
    @Override
    public String toString(){
        return this.getAction();
    }
}
