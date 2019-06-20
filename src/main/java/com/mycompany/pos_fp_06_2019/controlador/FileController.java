package com.mycompany.pos_fp_06_2019.controlador;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileController<E> {
    
    private Class<E[]> clase;
    
    public FileController(Class<E[]> clase) {
        this.clase = clase;
    }

	/**
	 * 
	 * @param lista
	 * @param fileName
	 */
	public void guardarLista(List<E> lista, String fileName) {
		// TODO - implement FileController.guardarLista
                
                FileWriter writer;
                try {
                    writer = new FileWriter(fileName);
                    Gson gson = new GsonBuilder().create();
                    gson.toJson(lista, writer);
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Error al crear el archivo");
                }
	}

	public List<E> cargarLista(String ruta) {
		// TODO - implement FileController.cargarLista
                
                JsonParser jsonParser = new JsonParser();
                ArrayList<E> lista = new ArrayList();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(ruta));
                    Gson g = new Gson();
                    
                    lista = new ArrayList( Arrays.asList(g.fromJson(br, this.clase)) );
                                                                        
                   
                }catch (IOException e) {
                    e.printStackTrace();
                }
                
                return lista;
        }
}