package practica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestModulo {
    private static final String IP = "localhost"; // Puedes cambiar a localhost
    private static final int PUERTO = 1200; //Si cambias aquí el puerto, recuerda cambiarlo en el servidor


    @Test
    public void testModulo() throws Exception {
        // Crear una instancia de la implementación de la interfaz
        Registry registry = LocateRegistry.getRegistry(IP, PUERTO);
        Interfaz interfaz = (Interfaz) registry.lookup("Calculadora"  );

        // Llamar al método modulo
        float resultado = interfaz.modulo(10, 3);
        assertEquals(1, resultado, 0); // Se espera que 10 % 3 sea igual a 1

    }
}
