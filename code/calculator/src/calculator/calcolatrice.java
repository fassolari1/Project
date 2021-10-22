package calculator;

public class calcolatrice {
	//ok adesso provo
	int a = 1;
	int b = 2;
	
	public double somma(double num1, double num2){
        return num1 + num2;
    }

    public double sottrazione(double num1, double num2){
        return num1 - num2;
    }

    public double moltiplicazione(double num1, double num2){
        return num1 * num2;
    }

    public double divisione(double num1, double num2){
        double result=0;
        try {
            result = num1/num2;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return result;
    }
}
