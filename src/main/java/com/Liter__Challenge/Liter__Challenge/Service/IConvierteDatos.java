package com.Liter__Challenge.Liter__Challenge.Service;

public interface IConvierteDatos {
   <T> T obtenerDatos(String json, Class<T> clase);
}
