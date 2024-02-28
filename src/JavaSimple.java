import java.util.Scanner;

public class JavaSimple {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la distancia en kilometros: ");
            double kilometros = scanner.nextDouble();
            double metros = convertirAMetros(kilometros);

            System.out.println(kilometros + " kilometros es igual a " + metros + " metros.");
            scanner.close();
        }

        public static double convertirAMetros(double kilometros) {
            return kilometros * 1000;
        }
    }

