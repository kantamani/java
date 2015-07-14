class TestMain{


public static void main(String[] args){

System.out.println(Calculator3.Add(4,5));
 //System.out.printf("\t");
 Calculator3.printArray(Calculator3.arrayofprime(10,20));
 System.out.println(Calculator3.speed(15,5));
 System.out.println(Calculator3.fib(0));
 
 System.out.println(Calculator3.max(55,43,25)); 
 Calculator3.printArray(Calculator3.reverseOfArray(Calculator3.NaturalNumber(10)));
 /*to find summation*/
int array2=Calculator3.Summation(31);
//for(int i=0;i<array2.length;i++)
System.out.println(array2);

 System.out.println(Calculator3.vowel1(0));
 Calculator3.printArray(Calculator3.sortarray(Calculator3.RandomNumber(5)));
Calculator3.printArray(Calculator3.sortarray(Calculator3.NaturalNumber(5)));
Calculator3.printArray1(Calculator3.randomCharArray(Calculator3.RandomNumber(10)));
 /* System.out.println(calculator1.rvrn(1234)); */
 /*Primitive data types find minimum and maximum values*/
   System.out.println("int(min) = " + Integer.MIN_VALUE);
   System.out.println("int(min) = " + Integer.MAX_VALUE);
   System.out.println("int(bit-length) = " + Integer.SIZE);

//Calculator3.printArray(Calculator3.arrayofprime(10,20));
}

}