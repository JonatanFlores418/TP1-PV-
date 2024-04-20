package ar.edu.unju.fi.ejercicio11;

public class Main {
    public static void main(String[] args) {
    	int j = 40;
          
    	for (int i = 2; j >= 0; i += 4) {
            j -= 3;
            int value = 40 + 37 * i - 3 * j * (i - 2);
            System.out.print(value + " ");
        }
    }
}
 