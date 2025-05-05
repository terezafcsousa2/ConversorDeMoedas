package conversormoedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMoedas {

    public MoedasDados convertemoedas(String base_code, String target_code, String valorParaConverter){


        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/YOURAPIKEY/pair/" + base_code + "/" + target_code +"/"+valorParaConverter);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), MoedasDados.class);
        } catch (Exception e) {
            throw new RuntimeException("Saiu sem converter.");

        }

    }


}
