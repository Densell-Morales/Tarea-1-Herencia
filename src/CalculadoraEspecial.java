public class CalculadoraEspecial extends Calculadora {
    private String nombre;


    public double sumarDecimales(double primerNumero, double segundoNumero){
        return primerNumero + segundoNumero;
    }

    public int elevarCuadrado(int numeroBase){
        return numeroBase * numeroBase;
    }

    protected int resta(int primerNumero, int segundoNumero){
        return primerNumero - segundoNumero;
    }

    public  int factorial(int n) {if (n == 0 || n == 1) {return 1;}return n * factorial(n - 1);}

    public boolean esPrimo(int num) {if (num <= 1) {return false;}for (int i = 2; i < num; i++) {if (num % i == 0) {return false;}}return true;}

    public  String invertirCadena(String cadena) {return new StringBuilder(cadena).reverse().toString();}

    public  double areaDeUnTriangulo(double base, double altura) { return 0.5 * base * altura; }

    public boolean palindromo(String texto) {return texto.equalsIgnoreCase(invertirCadena(texto));}

    public void imprimirNPrimos(int limite) {for (int i = 2; i <= limite; i++) {if (esPrimo(i)) {System.out.print(i + " ");}}}

    public double numeroPar(double np){

        if (np % 2 == 0) {
            System.out.println(np + " es un número par.");
        } else {
            System.out.println(np + " no es un número par.");
        }
        return 0;
    }

}


