package Taller5.MockitoVerifiers.repositories;

import java.util.List;

import Taller5.MockitoVerifiers.models.Orden;

public interface OrdenRepository {
    void agregarOrden(Orden orden);
    Orden obtenerOrden(String id);
    void eliminarOrden(String id);
    List<Orden> obtenerOrdenesPorUsuario(String usuarioId);
}