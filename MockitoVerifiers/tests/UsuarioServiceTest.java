package Taller5.MockitoVerifiers.tests;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import Taller5.MockitoVerifiers.models.Orden;
import Taller5.MockitoVerifiers.models.Usuario;
import Taller5.MockitoVerifiers.repositories.UsuarioRepository;
import Taller5.MockitoVerifiers.services.OrdenService;
import Taller5.MockitoVerifiers.services.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class UsuarioServiceTest {

    //setear mocks y servicio


    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado a los métodos correspondientes del otro servicio.
    @Test
    void testRegistrarUsuarioConOrden() {
    }


    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado a los métodos correspondientes del otro servicio.
    @Test
    void testEliminarUsuario() {
    }

    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    // Verificar que NO se ha llamado a otros métodos del repositorio.
    // Comprobar el resultado del servicio.
    @Test
    void testBuscarUsuario() {
    }


    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    @Test
    void testActualizarUsuario() {
    }

    // Verificar que se ha llamado a los métodos correspondientes del repositorio.
    // Verificar que se ha llamado el número de veces necesario.
    // Verificar que NO se ha llamado a otros métodos del repositorio.
    // Comprobar el resultado del servicio.
    @Test
    void testObtenerTodosLosUsuarios() {
    }


    // Testear un registro, búsqueda, actualización e eliminación.
    // Verificar el orden de las llamadas (Usaremos InOrder de Mockito).
    @Test
    void testInvocationOrder() {
    }
}
