
public class Integer15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=741;

int hun=a/100;
int tens=a%100/10;
int unit=a%10;
a=tens*100+hun*10+unit;

System.out.println("после перестановки сотен и десятков "+a);
	}

}
