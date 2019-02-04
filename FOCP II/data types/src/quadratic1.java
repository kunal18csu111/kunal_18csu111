import Math;

class quadratic1
{

    public static void main(String[] args) 
    {

        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;

        double determinant = b * b - 4 * a * c;

       
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("root1 = "+ root1 "and root2 = "+ root2);
        }
        
        else if(determinant == 0) {w2tcyul;

            
            root1 = root2 = -b / (2 * a);

            System.out.println("root1 = root2 = "+ root1);

        }
        
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.println("root1 = " + realpart +imaginary +" and root2 = "+realpart+imaginarypart);
        }
    }
}