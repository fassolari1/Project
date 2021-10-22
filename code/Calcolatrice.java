public class Calcolatrice{
    public Calcolatrice(){        
    }

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
            Console.out.println("Error");
        }
        return result;
    }
}
