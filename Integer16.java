
public class Integer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=123;

int hun=a/100;
int tens=a%100/10;
int unit=a%10;
a=hun*100+unit*10+tens;

System.out.println("число после перестановки "+a);
	}

}
