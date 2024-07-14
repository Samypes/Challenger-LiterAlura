package com.desafio3Literalura.desafio3literalura;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);

}
