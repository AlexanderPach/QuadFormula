
import java.lang.Math.*;
public class QuadForm {

    public static void main(String[] args) {
      
      //variable are used the same way such as seen in formula
        double a;
        double b;
        double c;
        
      
      //takes in command arguments
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
      
      // setting the discriminant function
        
        double discriminant = (Math.pow(b, 2) - 4.0*(a*c));
        double numerator = Math.sqrt(discriminant);
      
       //results in both positive and negative roots
        
        double root_a = ((-(b)) + numerator)/(2.0 * a);
        double root_b = ((-(b)) - numerator)/(2.0 * a);
        
        System.out.println(root_a);
        System.out.println(root_b);
    }

}

