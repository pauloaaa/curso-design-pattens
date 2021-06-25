package com.paulo.designpatterns.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpClient implements HttpAdapter {

    @Override
    public void post(String URL, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(URL);
            URLConnection urlConnection = urlApi.openConnection();
            urlConnection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP", e);
        }
    }
}
