public class Sistema {
    public class NumeroParImpar {

    // Método que verifica si es par o impar
    public static String verificarNumero(int numero) {
        if (numero % 2 == 0) {
            return "El número es PAR";
        } else {
            return "El número es IMPAR";
        }
    }

    public static void main(String[] args) {
        int numero = 7; // puedes cambiar el número

        String resultado = verificarNumero(numero);

        System.out.println("Número: " + numero);
        System.out.println(resultado);
    }
}
}
