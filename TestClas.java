  
class Calculator3{

public static void printArray(int[] array){
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
}

public static void printArray1(char[] array){
for(int i=0;i<array.length;i++)
System.out.println(array[i]);
}
public static int[] NaturalNumber(int size){
int[] array=new int[size];
//int[] array=new int[5];
for(int i=0;i<size;i++)
	array[i]=i+1;
return array;
}

public static int[] RandomNumber(int size){
int[] array=new int[size];
for(int i=0;i<size;i++)
array[i]=(int)(Math.random()*100);
return array;

}

public static char[] randomCharArray(int[] array){
char[] aa=new char[array.length];
	int j=array.length-1;
	for(int i=0;i<array.length;i++){
	aa[j]=(char)array[i];
	j--;
	}
	return aa;
	}	

//1.addition of two number

public static int Add(int a,int b){
int c=a+b;
return c;

}	


//2.generate prime numbers between from and to
   public static int[] arrayofprime(int from,int to){
      int[] array=new int[((to-from)/2)+1];
        int a=0;
      for(int i=from;i<=to;i++){
	  boolean flag=Calculator3.primeornot(i);
	  if(flag){
	  array[a]=i;
	  a++;
	  }
	  }
	  return array;
    } 
	public static boolean primeornot(int num){
int n;int count=0;
for(n=1;n<=num;n++){
if(num%n==0)
count++;
}
if(count==2)
return true;
else
return false;
}

//3.calculate speed
public static double speed(double distance, double time){
double speed=distance/time;
return speed;  
	  }
	  
	  
	  
//4.Fibonacci series
	public static boolean fib(int num) {
	
	int count=0;
	int[] fib=new int[num+3];
	fib[0]=0;fib[1]=1;
	for(int i=2; i<num+3; i++) {
	
		fib[i]=fib[i-1]+fib[i-2];
		fib[i-2]=fib[i-1];
		fib[i-1]=fib[i];
		}
	for(int i=0; i<fib.length; i++){ 
		if(fib[i]==num)
			count++;
		}
	if(count==1)	
		return true;
	else
		return false;
	}

//5.reverse number

/* public static int rvrn(int rvrnum){
//int num=1234;
int rvrnum=0;
int temp=0;
while(num>0){
temp=num%10;
rvrnum=rvrnum*10+temp;
num=num/10;
}


}	 */  

//6.to find biggest number

public static int max(int a,int b,int c){
int count=0;
while(a!=1000 && b!=1000 && c!=1000){
  a++;
  b++;
  c++;
  count++;
   }
  int max=1000-count;
  return max;
 
  }  
  
  //7.reverse of an array
public static int[] reverseOfArray(int[] array) {
	int[] a=new int[array.length];
	int j=array.length-1;
	for(int i=0;i<array.length;i++){
	a[j]=array[i];
	j--;
	}
	return a;
	}	  

//8.summation of an array
	public static int Summation(int size){
int sum=0;
int[] array=new int[size];
for(int i=0;i<size;i++) {
array[i]=i+1;
sum=sum+array[i];
}
return sum;

}

	
//9.count vowels in an char array
public static int vowel1(int count){
char array[]={'n','i','d','h','i','s','h','r','e'};
char array1[]={'a','e','i','o','u'};
for (int i=0;i<array.length;i++){
for (int j=0;j<array1.length;j++){
if (array[i]==array1[j])
count++;
}
}
return count;
}		

//10.sorting an array
public static int[] sortarray(int[] array){
 //int[] array={2,8,3,1};
         int temp,k;
      for(int i=0;i<4;i++)
      for(int j=0;j<4;j++){
          if(array[i]<array[j]){
          temp=array[i];
      array[i]=array[j];
       array[j]=temp;
          }
        }
      return array;
      }
	  
//11.character array
	
  public static char[] chararray(char[] array){
 //int[] array={2,8,3,1};
         char temp,k;
      for(int i=0;i<4;i++)
      for(int j=0;j<4;j++){
          if(array[i]<array[j]){
          temp=array[i];
      array[i]=array[j];
       array[j]=temp;
          }
        }
      return array;
      }		  
}
	

