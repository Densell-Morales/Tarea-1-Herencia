public class Calculadora {
    private String nombre;
    public int sumar(int primerNumero, int segundoNumero){
        return primerNumero + segundoNumero;
    }

    public  int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a % b);
    }

    public  double areaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

}

