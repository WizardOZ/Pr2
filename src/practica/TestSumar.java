package practica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.testng.annotations.Test;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestSumar {
    private static final String IP = "localhost"; // Puedes cambiar a localhost
    private static final int PUERTO = 1200; //Si cambias aquí el puerto, recuerda cambiarlo en el servidor


    @Test
    public void testSumar() throws Exception {
        // Crear una instancia de la implementación de la interfaz
        Registry registry = LocateRegistry.getRegistry(IP, PUERTO);
        Interfaz interfaz = (Interfaz) registry.lookup("Calculadora"  );

        // Llamar al método sumar
        float resultado = interfaz.sumar(5, 3);

        // Verificar que el resultado sea el esperado
        assertEquals(8, resultado, 0);
    }
}
