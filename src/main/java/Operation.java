public class Operation {

    private String operation;
    private double a;
    private double b;
    private double resultat;

    public Operation() {
    }

    public Operation(String operation, double a, double b, double resultat) {
        this.operation = operation;
        this.a = a;
        this.b = b;
        this.resultat = resultat;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultat() {
        return resultat;
    }

    public void setResultat(double resultat) {
        this.resultat = resultat;
    }
}
