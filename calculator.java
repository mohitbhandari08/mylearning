class WrongInput extends Exception{
    public String toString(){
     return "The value cannot be 8 or 9";
    }
    public String getMessage(){
        return "I am get message";
    }
}
class MaxInputException extends Exception{
        public String toString(){
            return "The value cannot be greater thsn 100000";
        }
        public String getMessage(){
            return " i am a get message";
        }
}
class CannotDivideByZeroException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "Input cant be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class CustomCalculator{
    double add(double a , double b) throws WrongInput,MaxInputException{
        if (a==8 || a==9){
            throw new WrongInput();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a+b;
    }
    double subtract(double a , double b) throws WrongInput,MaxInputException {
        if (a == 8 || a == 9) {
            throw new WrongInput();
        }
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a , double b) throws MaxMultiplyInputException{
        if (a>7000 || b>7000){
            throw new MaxMultiplyInputException();
        }
        return a*b;
    }
    double divide( double a , double b) throws CannotDivideByZeroException{
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        return a/b;
    }
}
public class calculator {
    public static void main(String[] args)throws MaxMultiplyInputException,MaxInputException,CannotDivideByZeroException,WrongInput{
    CustomCalculator b = new CustomCalculator();
    try{
        b.add(8,9);
    }
    catch (Exception e){
        System.out.println(e);
    }
    }

}

