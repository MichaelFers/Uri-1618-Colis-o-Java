
import java.util.Scanner;

public class Colisao{
    public static void main(String[] args) {

	int cont, ax, ay, bx, by, cx, cy, dx, dy, rx, ry;

        Scanner reader = new Scanner(System.in);
	cont = reader.nextInt();

	for (int i = 0; i < cont; ++i){
            
            ax = reader.nextInt();
            ay = reader.nextInt();
            bx = reader.nextInt();
            by = reader.nextInt();
            cx = reader.nextInt();
            cy = reader.nextInt();
            dx = reader.nextInt();
            dy = reader.nextInt();
            rx = reader.nextInt();
            ry = reader.nextInt();

		if(rx >= ax && rx <= bx && rx >= dx && rx <= cx && ry >= ay && ry <= dy && ry >= by && ry <= cy){
			System.out.printf("1\n");		
		}else{
                     System.out.printf("0\n");
		}
	}
    }
}
