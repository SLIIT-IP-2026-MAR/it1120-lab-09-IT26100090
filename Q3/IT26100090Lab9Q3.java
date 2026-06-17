public class IT26100090Lab9Q3 {

    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        
        int prod1 = multiply(3, 4);          
        int prod2 = multiply(5, 7);         
        int sum1  = add(prod1, prod2);       
        int result1 = square(sum1);          

       
        int sum2 = add(4, 7);                
        int sum3 = add(8, 3);                
        int sq1  = square(sum2);             
        int sq2  = square(sum3);             
        int result2 = add(sq1, sq2);       

        
        System.out.println("Result of (3 * 4 + 5 * 7)²   : " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}