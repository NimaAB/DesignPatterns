package interfaces;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.claculateTax();
    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2020();
    }
}
