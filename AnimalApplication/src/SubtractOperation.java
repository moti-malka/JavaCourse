public class SubtractOperation extends AbstractOperation {

    public SubtractOperation(){
        super(10, 15);
    }

    public int execute(){
        return super.operation1 + super.operation2;
    }

    public int getSymbol(){
        return '-';
    }


}
