package conversormoedas;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

    public class GeradorDeArquivo {

        public void salvaJson(MoedasDados endereco) throws IOException {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter escrita = new FileWriter( endereco +".json");
            escrita.write(gson.toJson(endereco));
            escrita.close();
        }
    }

