import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) throws InterruptedException {
        // NUCLEAR ACESSO

        Scanner s = new Scanner(System.in);
        UI ui = new UI();
        FE f = new FE();
        while (true) {
            int nv = new Random().nextInt(16987);
            ui.c_nucluar();
            System.out.println("Para Comfirma Que voce nao é um robo, digite esse codigo: " + nv);
            System.out.print("Porfavor digite o Codigo enviado: ");
            int cv = s.nextInt();
            s.nextLine();
            if (cv == nv) {
                f.clear(85);
                break;
            } else {
                System.err.println("Codigo Invalido");
                f.clear(85);
            }

       }

       // NUCLEAR MENU

       while (true) {
            ui.menu();
            System.out.println("Seja Bem vindo A o Painel Nuclear, Se divirta com as opçoes: ");
            System.out.println("1. Seu IP\n");
            System.out.print("Porfavor, Digite o Numero Referente a sua escolha: ");
            int op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    try {
                        System.out.println("Aguarde, Estamos Obtendo seu ip...");
                        f.userIP();
                        System.out.println("Deseja Voltar A o Painel?(S/N)");
                        String gh = s.nextLine();
                        if (gh.equalsIgnoreCase("N")) {
                            return;
                        }
                        
                    } catch (Exception e) {
                        System.out.println("Desculpe, Nao consegui acessar seu ip.");
                    }
                    break;

                default:
                    System.err.println("Digite o NUmero Correto");
                    Thread.sleep(2000);
                    break;
        }

       } 
    }
}

class UI {
    // MENUS
    public void c_nucluar() {
        System.out.println("=============================");
        System.out.println("           NUCLEAR");
        System.out.println("          V0.0.1 ALPHA");
        System.out.println("          By Skaylatk");
        System.out.println("=============================\n");
    } 

    public void menu() {
        System.out.println("============================");
        System.out.println("        MENU NUCLEAR");
        System.out.println("============================\n");
    }
}

class FE {
    // Ferramentas
    public void clear(int Q) {
        for (int i = 0; i < Q; i++) {
            System.out.println("");
        }
    }
    public void userIP() throws InterruptedException, URISyntaxException, IOException {
        HttpClient cl = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://icanhazip.com/"))
            .GET()
            .build();
        HttpResponse<String> httpResponse = cl.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Seu ip é: " + httpResponse.body());
    }
}
