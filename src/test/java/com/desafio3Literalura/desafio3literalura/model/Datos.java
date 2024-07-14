package com.desafio3Literalura.desafio3literalura.model;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Datos(

     @JsonAlias("results") List<DatosLibros> resultados
             )
{
}
