public class QuadForm {

  public static void main(String[] args){
  
    double a;
    double b;
    double c;
    
    a = Double.parseDouble(args[0]);
    b = Double.parseDouble(args[1]);
    c = Double.parseDouble(args[2]);
    
    double discriminant = (b**2.0) - 4.0*(a*c);
    double numerator = Math.sqrt(discriminant);
    
    double root_a = (-b + numerator)/2.0 * a;
    double root_b = (-b - numerator)/2.0 * a;
    
    System.out.println(root_a);
    System.out.println(root_b);
    
  
  }

}


