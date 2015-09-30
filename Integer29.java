
public class Integer29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10, b=10, c=3;

int x = a/c*c; //количество сторон С по оси X
int y = b/c*c; //количество сторон С по оси Y
int quantitySquares=(x*y)/(c*c);
System.out.println("Кол-во квадратов со стороной С, размещённых в прямоугольнике = "+quantitySquares);
int freeSpaceX=(a%x)*b; //Не занято по оси X
int freeSpaceY=(b%y)*a-(a%x)*(b%y); //Не занято по оси Y
int freeSpace = freeSpaceX+freeSpaceY;
System.out.println("Площадь незанятой части прямоугольника АВ = "+freeSpace);
	}

}
