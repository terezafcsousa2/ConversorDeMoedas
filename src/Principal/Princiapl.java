package Principal;

import conversormoedas.ConversorDeMoedas;
import conversormoedas.GeradorDeArquivo;
import conversormoedas.MoedasDados;

import java.io.IOException;
import java.util.Scanner;

public class Princiapl {
    public static void main(String[] args) throws IOException {


        String base_code = "";
        String target_code = "";
        int resposta = 0;
        String valorParaConverter= "";

        while(resposta != 7) {
            Scanner leitura = new Scanner(System.in);
            ConversorDeMoedas conversor = new ConversorDeMoedas();
            System.out.println("""
                    ----------------------------------------------------
                    Digite o número correspondente a conversão da moeda:
                    1 - Dolar  = > Peso chileno
                    2 - Dolar  => Real brasileiro
                    3 - Dolar => Libra esterlina
                    4 - Libra esterlina => Dolar
                    5 - Euro => Real  brasileirro 
                    6 - Real  brasileiro  => Euro
                    7 - sair  
                    -----------------------------------------------------             
                    """);

            resposta = leitura.nextInt();
            leitura.nextLine();


            if(resposta == 1){
                base_code = "USD";
                target_code = "CLP";
            } else if (resposta==2) {
                base_code = "USD";
                target_code = "BRL";
            } else if (resposta==3) {
                base_code = "USD";
                target_code = "GBP";
            } else if (resposta ==4) {
                base_code = "GBP";
                target_code = "USD";
            } else if (resposta==5) {
                base_code = "EUR";
                target_code = "BRL";
            } else if (resposta==6) {
                base_code = "BRL";
                target_code = "EUR";
            }  else if (resposta == 7){
                System.out.println("Saiu! Obrigada por visitar o nosso conversor de moedas!");
                break;
            }
            System.out.println("Digite o valor à converter");
            valorParaConverter = leitura.nextLine();

            try {
                MoedasDados novoMoedaDados = conversor.convertemoedas(base_code, target_code, valorParaConverter);
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvaJson(novoMoedaDados);
                System.out.println(novoMoedaDados);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Aplicação finalizada");

            }





        }
    }
}
