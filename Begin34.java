public class Begin34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float xChocKg=2;
float chocPrice=5;
float yIrisKg=2;
float irisPrice=3;

float oneKgChocPrice=chocPrice/xChocKg;
float oneKgIrisPrice=irisPrice/yIrisKg;
float diffPrice=oneKgChocPrice/oneKgIrisPrice;

System.out.println("Один кг шоколадных конфет стоит "+oneKgChocPrice);
System.out.println("Один кг ирисок стоит "+oneKgIrisPrice);
System.out.println("Шоколадные дороже ирисок в "+diffPrice+" раз");
	}

}
