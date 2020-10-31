public class TestFraction {

  public static void main(String[] args) {

    Fraction f1, f2;  

    f1 = new Fraction(3, 0); 
    System.out.println(f1 + "\t// Correct answer: 1/2");

    f1 = new Fraction(0, -4); 
    System.out.println(f1 + "\t// Correct answer: 0/1");

    f1 = new Fraction(0, 0); 
    System.out.println(f1 + "\t// Correct answer: 0/1");

    f1 = new Fraction(3, 4); 
    System.out.println(f1 + "\t// Correct answer: 3/4");
    
    f1 = new Fraction(3, -4); 
    System.out.println(f1 + "\t// Correct answer: -3/4");
    System.out.println(f1.value() + "\t// Correct answer: -0.75");
    
    f1 = new Fraction(-6, -4); 
    System.out.println(f1 + "\t// Correct answer: 3/2");

    f2 = new Fraction(1, 2);
    System.out.println(f1.value() - f2.value() + "\t// Correct answer: 1.0");
  }
}
