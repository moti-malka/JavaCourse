public class AddOpeation extends AbstractOperation {

    public AddOpeation(){
        super(10, 15);
    }

    public int execute(){
        return super.operation1 + super.operation2;
    }

    public int getSymbol(){
        return '+';
    }


}
