//How to create a method in java program?
public class MethodinJava {
	int a=10;
void meth(){
	System.out.println("This is Static method");
}
int main(){
	return a;
}
}
 class java{
	public static void main(String args[]){
		MethodinJava m=new MethodinJava();
	m.meth();
	System.out.println("The number is:"+m.main());
	}
}
