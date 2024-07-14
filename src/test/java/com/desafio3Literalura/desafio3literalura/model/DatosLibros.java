package com.desafio3Literalura.desafio3literalura.model;

import java.awt.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros(

        @JsonAlias("title") String titulo,

        @JsonAlias("authors")List<DatosAutor> autor,

        @JsonAlias("languages")List<String> idiomas,

        @JsonAlias("download_count")Double numeroDeDesacargas,



) {
}
