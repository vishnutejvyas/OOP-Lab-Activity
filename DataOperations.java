class DataOperations {
public static void main(String[] args) {
byte p = 6;
byte q = 3;
System.out.println("p = " + p + ", q = " + q);
int result1 = p+q;
int result2 = p-q;
int result3 = p*q;
int result4 = p/q;
int result5 = p%q;
boolean result6 = p<q;
boolean result7 = (p==q || p>q);
p++;
System.out.println("Sum =" + result1);
System.out.println("Difference = " + result2);
System.out.println("Product = " + result3);
System.out.println("Quotient = " + result4);
System.out.println("Remainder = " + result5);
System.out.println("p<q : " + result6);
System.out.println("p=q or p>q : " + result7);
System.out.println("Value of p after increment = " + p);
}
}