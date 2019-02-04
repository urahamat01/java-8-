
public class Palindom1{
public static void main(String [] args){
int sum = 0, num=121, temp,r; 

temp=num;

while(temp!=0){
r=temp%10;
sum = sum*10+r;
temp = temp/10;
}
if(num==sum){

System.out.println("palindom");
}else{
System.out.println("not palindom");

}
System.out.println();
}
}
