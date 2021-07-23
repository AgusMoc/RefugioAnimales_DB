package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Refugio {

    private String dbName = "refugio";
    private String dbUser = "root";
    private String dbPwd = "Mocellini1";

    public void buscarYMostrar(String sql){
        ConexionDB conexionDB = new ConexionDB(dbName,dbUser,dbPwd);
        ResultSet resultados = conexionDB.consultar(sql);
        try{
            mostrarResultados(resultados);
        }catch(SQLException e){
            System.out.println("No se encontraron resultados.");
        }finally {
            conexionDB.cerrar();
        }
    }
    private void mostrarResultados(ResultSet resultados) throws SQLException {
        if(resultados != null)
            while(resultados.next())
                System.out.println("Nombre: "+resultados.getString("nombre")+", especie: "+resultados.getString("especie") +", edad: "+resultados.getString("edad") );
    }


    public void actualizarEdad (int id_Animal, int edad){
        ConexionDB conexionDB = new ConexionDB(dbName,dbUser,dbPwd);
        String sql = "UPDATE animales SET edad ="+edad+" WHERE (id_Animal='"+id_Animal+"');";
        try {
            conexionDB.insertar(sql);
            System.out.println("Modificación exitosa!");
            System.out.println("El animal con id: "+id_Animal+" tiene "+edad+ " de edad");
        }catch(SQLException e){
            System.out.println("No se pudo modificar el registro.");
        }finally {
            conexionDB.cerrar();
        }
    }

    public void listarAnimales (){
        buscarYMostrar("SELECT * FROM animales;");
    }

    public void consultarPorEspecie(int i){
        String esp = ESPECIE.values()[i].name();
        System.out.println("consultó por "+ esp);
        buscarYMostrar("SELECT * FROM animales WHERE especie = '"+esp+"'");

    }

    public void consultarPorNroAnimal(int nroAnimal){
        buscarYMostrar("SELECT * FROM animales WHERE nroAnimal = '"+nroAnimal+"'");
    }


}
