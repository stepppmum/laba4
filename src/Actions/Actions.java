package Actions;

public enum Actions {
    LAY, ARGUE, LISTEN, OPEN, RUN, CRY, SEE, GONE, WANT, LOOK, DECIDE, PEEK, SCRATCH, SLEEP;
    public Actions setAction(){
        switch(this){
            case CRY:
                return Actions.CRY;
            case LAY:
                return Actions.LAY;
            case RUN:
                return Actions.RUN;
            case SEE:
                return Actions.SEE;
            case OPEN:
                return Actions.OPEN;
            case ARGUE:
                return Actions.ARGUE;
            case LISTEN:
                return Actions.LISTEN;
            case GONE:
                return Actions.GONE;
            case WANT:
                return Actions.WANT;
            case LOOK:
                return Actions.LOOK;
            case DECIDE:
                return Actions.DECIDE;
            case PEEK:
                return Actions.PEEK;
            case SCRATCH:
                return Actions.SCRATCH;
            default:
                return null;
        }
    }
    public String getAction(){
        switch (this){
            case CRY:
                return " плачет. ";
            case LAY:
                return " лежит на";
            case RUN:
                return " убегает по";
            case SEE:
                return " видит";
            case OPEN:
                return " открывает";
            case ARGUE:
                return " спорит с";
            case LISTEN:
                return " слышит";
            case GONE:
                return " ушла";
            case WANT:
                return " захотел";
            case LOOK:
                return "посмотреть ";
            case DECIDE:
                return " решил";
            case PEEK:
                return "подсматривает в ";
            case SCRATCH:
                return " почесал";
            case SLEEP:
                return "вздремнуть ";
            default:
                return null;
        }
    }

}