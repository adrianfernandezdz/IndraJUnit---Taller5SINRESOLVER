package Taller5.MockitoVerifiers.tests;

import java.util.Arrays;
import java.util.List;

import Taller5.MockitoVerifiers.models.Orden;
import Taller5.MockitoVerifiers.repositories.OrdenRepository;
import Taller5.MockitoVerifiers.services.OrdenService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OrdenServiceTest {


    // Settear mocks e instanciar servicio.



    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    @Test
    void testRegistrarOrden() {
    }

    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    @Test
    void testEliminarOrden() {
    }

    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    // Verificar que NO se ha llamado a otros métodos del repositorio.
    @Test
    void testBuscarOrden() {
    }


    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    // Verificar que NO se ha llamado a otros métodos del repositorio.
    // Comprobar el resultado del servicio.
    @Test
    void testObtenerOrdenesPorUsuario() {
    }


    // Testear un registro, búsqueda y eliminación de una orden.
    // Verificar el orden de las llamadas (Usaremos InOrder de Mockito).
    @Test
    void testInvocationOrder() {
    }
}
