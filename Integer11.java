
public class Integer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=682;
		int hundred=a/100;
		int tens=a%100/10;
		int unit=a%tens%10;
		int sum=hundred+tens+unit;
		int prod=hundred*tens*unit;

		System.out.println("сумма цифр равна "+sum);
		System.out.println("произведение цифр равно "+prod);
	}

}
