package com.alura.conversormoneda.principal;

import com.alura.conversormoneda.modelos.Moneda;
import com.alura.conversormoneda.modelos.MonedaOmdb;
import com.alura.conversormoneda.servicios.ApiConversion;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;
        double monto = 0.0;

        String menu = """
        ****************************
        Sea bienvenido/a al Conversor de Moneda =]
        
        1) Dolar =>> Peso argentino
        2) Peso argentino =>> Dolar
        3) Dolar =>> Real brasileño
        4) Real brasileño =>> Dolar
        5) Dolar =>> Peso colombiano
        6) Peso colombiano=>> Dolar
        7) Salir");
        Elija una opción válida:
        ****************************
        """;

        // Setting URL



            Scanner teclado = new Scanner(System.in);
            while (opcion != 7){
                System.out.println(menu);
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"USD","ARS");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"ARS","USD");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"USD","BRL");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"BRL","USD");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"USD","COP");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        monto = teclado.nextDouble();
                        lanzarConversion(monto,"COP","USD");
                        break;
                    case 7:
                        System.out.println("Saliendo del programa, gracias");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

    }

    public static void lanzarConversion(double monto, String origen, String destino){
        String cadenaApi = "";
        ApiConversion api = new ApiConversion();
        String url_str = "https://v6.exchangerate-api.com/v6/"+
                "d0895a31916ca7671251f6d1/pair/";
        cadenaApi = url_str + origen +"/"+destino+"/";
        String datos = api.obtenerDatos(cadenaApi);
        if (datos != "0"){
            Gson gson = new Gson();
            Moneda moneda = gson.fromJson(datos, Moneda.class);
            moneda.setMontoConvertir(monto);
            moneda.calculaConversion(monto,moneda.getTasaDeConversion());
            System.out.println(moneda.toString());
        }else{
            System.out.println("Ocurrio un error");
        }
    }
}