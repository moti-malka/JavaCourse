
abstract public class AbstractOperation {

    protected int operation1;
    protected int operation2;

    public  AbstractOperation(int operation1, int operation2){
        this.operation1 = operation1;
        this.operation2 = operation2;
    }



    public abstract int execute();

    public abstract int getSymbol();


    @Override
    public String toString() {
        return operation1 + " " +  getSymbol() + " " + operation2 + " = " + execute();
    }
}
