package com.aluracursos.desafio_Literalura.Services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
