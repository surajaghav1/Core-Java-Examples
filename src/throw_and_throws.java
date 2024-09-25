/*
THROWS :
        THIS KEYWORD IS USED TO THROW AN ALREADY DEFINED EXCEPTION THATS IS "PREDEFINED EXCEPTION AND USER DEFINED EXCEPTIONS ".

 THROW :
        THIS KEYWORD IS USED TO THROW AN EXCEPTION


        S. NO.

KEY DIFFERENCE



                                 THROW                                                                                                                                                                                      THROWS

1.	POINT OF USAGE	THE THROW KEYWORD IS USED INSIDE A FUNCTION. IT IS USED WHEN IT IS REQUIRED TO THROW AN EXCEPTION LOGICALLY.	                                                           THE THROWS KEYWORD IS USED IN THE FUNCTION SIGNATURE. IT IS USED WHEN THE FUNCTION HAS SOME STATEMENTS THAT CAN LEAD TO EXCEPTIONS.
2.	EXCEPTIONS THROWN	THE THROW KEYWORD IS USED TO THROW AN EXCEPTION EXPLICITLY. IT CAN THROW ONLY ONE EXCEPTION AT A TIME.	                                                            THE THROWS KEYWORD CAN BE USED TO DECLARE MULTIPLE EXCEPTIONS, SEPARATED BY A COMMA. WHICHEVER EXCEPTION OCCURS, IF MATCHED WITH THE DECLARED ONES, IS THROWN AUTOMATICALLY THEN.
3.	SYNTAX	SYNTAX OF THROW KEYWORD INCLUDES THE INSTANCE OF THE EXCEPTION TO BE THROWN. SYNTAX WISE THROW KEYWORD IS FOLLOWED BY THE INSTANCE VARIABLE.	                                  SYNTAX OF THROWS KEYWORD INCLUDES THE CLASS NAMES OF THE EXCEPTIONS TO BE THROWN. SYNTAX WISE THROWS KEYWORD IS FOLLOWED BY EXCEPTION CLASS NAMES.
4.	PROPAGATION OF EXCEPTIONS	THROW KEYWORD CANNOT PROPAGATE CHECKED EXCEPTIONS. IT IS ONLY USED TO PROPAGATE THE UNCHECKED EXCEPTIONS THAT ARE NOT CHECKED USING THE THROWS KEYWORD. 	        THROWS KEYWORD IS USED TO PROPAGATE THE CHECKED EXCEPTIONS ONLY.

 */
class negativeException extends Exception{
    @Override
    public String getMessage() {
        return "Wrong choice";
    }

    @Override
    public String toString() {
        return "You entered zero wrong choice ";
    }
}

public class throw_and_throws {
    public static float divide(int x,int y) throws ArithmeticException{
        float result=x/y;
        return result;
    }
    public static double area(int r) throws negativeException{
        if(r<0) {
        throw new negativeException();
        }
        double result=Math.PI*r*r;
            return result;
    }


    public static void main(String[] args) {
        try {
//        System.out.println(divide(30,10));
//        System.out.println(divide(30,0));
           double ar= area(5);
            System.out.println("Area is ;"+ ar);
        }
        catch (Exception e){
            System.out.println("Error wrong input ");
        }


    }
}

