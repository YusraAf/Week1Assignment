package week1assignment.task2armstrong;

public class StrongNumber {
	int strongNumber, lowerLimit, upperLimit;
 //public StrongNumber() {
	//this.strongNumber=strongNumber;
 //}
 
 public StrongNumber(int lowerLimit,int upperLimit) {
	 this.lowerLimit= lowerLimit;
	 this.upperLimit= upperLimit;
 }
 
 public StrongNumber() {
	 // TODO Auto-generated constructor stub
}

public int checkStrNumber(int number) {
	 int originalNumber=number, result, strong=0;
	 while(originalNumber>0) {		 
		result= originalNumber%10;
		strong= strong + fact(result);
		originalNumber /=10;
		 
	 }
	 if (number== strong)
	 return strong;
	 else 
		 return 0;
 }
 
 public void checkStrNumberRange() {
	 int i, result=0;
	 
	 for(i=lowerLimit;i<=upperLimit;i++) {
		result= checkStrNumber(i); 
		if (result!=0) {
			System.out.print(result+",");
		}
		
	 }
 }

 
int fact (int i)
{
int f =1,j;
for(j=i;j>0;j--) {
	f=f*j;
}
return f;
}

}
