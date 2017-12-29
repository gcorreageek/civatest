package com.flit.phonebook;

/**
 * Un interfaz básico para un directorio telefónico.
 * Se debe poder agregar, actualizar, borrar y obtener números por nombre.
 *
 * Primero: Implementar los métodos siguientes.
 *
 * Segundo: Identificar las posibles limitaciones de esta interfaz.
 *
 * Tercero: Proponer una mejora a esta interfaz para resolver alguna(s)
 * de dichas limitaciones.
 */
public interface Phonebook {

	Boolean addEntry(String name, String number);

	String getEntry(String name);

	Boolean updateEntry(String name, String number);

	Boolean deleteEntry(String name);

}

