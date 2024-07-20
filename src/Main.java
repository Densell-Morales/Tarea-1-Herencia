import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        CalculadoraEspecial miCalculadora = new CalculadoraEspecial();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Suma");
            System.out.println("2. elevar al cuadrado");
            System.out.println("3. resta");
            System.out.println("4. factorial");
            System.out.println("5. numero primo");
            System.out.println("6. invertir una cadena de texto");
            System.out.println("7. minimo comun divisor");
            System.out.println("8. sumar decimales");
            System.out.println("9. area de un triangulo");
            System.out.println("10. palindromo");
            System.out.println("11. imprimir n primos");
            System.out.println("12. numero par");
            System.out.println("13. area de un circulo");
            System.out.println("14. salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                miCalculadora.sumar(10, 4);
                System.out.println(miCalculadora.sumar(10, 5));
                break;
                case 2:
                miCalculadora.elevarCuadrado(5);
                System.out.println(miCalculadora.elevarCuadrado(5));
                break;
                case 3:
                miCalculadora.resta(10, 4);
                System.out.println(miCalculadora.resta(10, 5));
                break;
                case 4:
                miCalculadora.factorial(5);
                System.out.println(miCalculadora.factorial(5));
                break;
                case 5:
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingrese un numero para saber si es primo ");
                int num = entrada.nextInt();
                miCalculadora.esPrimo(num);
                break;
                case 6:
                     Scanner sc = new Scanner(System.in);
                     System.out.println("Ingresa una cadena");
                    String cadena = sc.nextLine();
                    miCalculadora.invertirCadena(cadena);
                    System.out.println(miCalculadora.invertirCadena(cadena));
                break;
                case 7:
                miCalculadora.mcd(10, 4);
                System.out.println(miCalculadora.mcd(10, 4));
                break;
                case 8:
                    Scanner scc = new Scanner(System.in);
                    System.out.println("Ingrese el primer numero decimal ");
                    double primerNumero = scc.nextInt();
                    System.out.println("Ingrese el segundo numero decimal ");
                    double segundoNumero = scc.nextInt();
                    miCalculadora.sumarDecimales(primerNumero, segundoNumero);
                    System.out.println(miCalculadora.sumarDecimales(primerNumero, segundoNumero));
                    break;
                case 9:
                    Scanner scd = new Scanner(System.in);
                    System.out.println("Ingrese la base ");
                    double base = scd.nextDouble();
                    System.out.println("Ingrese la altura ");
                    double altura = scd.nextDouble();
                    miCalculadora.areaDeUnTriangulo(altura, base);
                    System.out.println(miCalculadora.areaDeUnTriangulo(altura, base));
                    break;
                case 10:
                    Scanner scf = new Scanner(System.in);
                    System.out.println("Ingrese un texto para saber si es un palindromo ");
                    String texto = scf.nextLine();
                    miCalculadora.palindromo(texto);
                    System.out.println(miCalculadora.palindromo(texto));
                    break;
                case 11:
                    Scanner scg = new Scanner(System.in);
                    System.out.println("ingresa la cantidad de numero primos que deseas imprimir");
                    int limite = scg.nextInt();
                    miCalculadora.imprimirNPrimos(limite);
                    break;
                case 12:
                    Scanner scd2 = new Scanner(System.in);
                    System.out.println("Ingresa un numero para saber si es par");
                    double np = scd2.nextDouble();
                    miCalculadora.numeroPar(np);
                    System.out.println(miCalculadora.numeroPar(np));
                    break;
                case 13:
                    Scanner scd3 = new Scanner(System.in);
                    System.out.println("Area de un circulo");
                    double radio = scd3.nextDouble();
                    miCalculadora.areaCirculo(radio);
                    System.out.println(miCalculadora.areaCirculo(radio));
                    break;
                case 14:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");

            }
        } while (opcion != 14);

        scanner.close();
        }
    }