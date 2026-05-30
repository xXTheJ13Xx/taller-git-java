import java.util.Scanner;
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



public class LoginSimple {

    // Credenciales simuladas (hardcoded)
    private static final String USUARIO_CORRECTO = "David Rodrigo";
    private static final String PASSWORD_CORRECTO = "CONEJO1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intentos = 3;
        boolean acceso = false;

        System.out.println("=== SISTEMA DE LOGIN ===");

        while (intentos > 0) {
            System.out.print("\nUsuario: ");
            String usuario = scanner.nextLine();

            System.out.print("Contraseña: ");
            String password = scanner.nextLine();

            // Validación
            if (validarCredenciales(usuario, password)) {
                acceso = true;
                break;
            } else {
                intentos--;
                System.out.println("❌ Credenciales incorrectas.");
                System.out.println("Intentos restantes: " + intentos);
            }
        }

        // Resultado final
        if (acceso) {
            System.out.println("✅ Bienvenido al sistema!");
        } else {
            System.out.println("🚫 Acceso bloqueado.");
        }

        scanner.close();
    }

    // Método de validación
    public static boolean validarCredenciales(String usuario, String password) {
        return usuario.equals(USUARIO_CORRECTO) && password.equals(PASSWORD_CORRECTO);
    }
}
}
