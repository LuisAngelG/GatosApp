package com.lgastelu.gatosapp.repository;

import com.lgastelu.gatosapp.models.Datos;

import java.util.ArrayList;
import java.util.List;

public class DatosRepository {
    private static List<Datos> datos;
    static {
        datos=new ArrayList<>();
        datos.add(new Datos(100,"Ingresos","Efectivo"));
        datos.add(new Datos(200,"Egresos","Ahorro"));
        datos.add(new Datos(300,"Ingresos","Efectivo"));
        datos.add(new Datos(400,"Egresos","Ahorro"));
        datos.add(new Datos(50,"Ingresos","Tarjeta de Crédito"));
        datos.add(new Datos(900,"Ingresos","Ahorro"));
        datos.add(new Datos(80,"Egresos","Ahorro"));
        datos.add(new Datos(700,"Ingresos","Efectivo"));
    }
    public static List<Datos>getDatos(){
        return datos;
    }
}
