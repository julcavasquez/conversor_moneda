package com.alura.conversormoneda.servicios;

import com.alura.conversormoneda.modelos.MonedaOmdb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiConversion {
    public String obtenerDatos(String url_str){
        StringBuilder json = new StringBuilder();
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url_str))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

           json.append(response.body());

        }catch (Exception e){
            return "0";
        }
        return json.toString();
    }
}
