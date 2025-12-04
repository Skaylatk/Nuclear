import java.util.Random;
import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {
        // NUCLEAR ACESSO
        Scanner s = new Scanner(System.in);
        UI ui = new UI();
        while (true) {
            int nv = new Random().nextInt(16987);
            ui.c_nucluar();
            System.out.println("Para Comfirma Que voce nao é um robo, digite esse codigo: " + nv);
            System.out.print("Porfavor digite o Codigo enviado: ");
            int cv = s.nextInt();
            s.nextLine();
            if (cv == nv) {
                ui.clear(60);
                break;
            } else {
                System.err.println("Codigo Invalido");
                ui.clear(60);
            }

       }

       // NUCLEAR MENU

       while (true) {
        ui.menu();
        System.out.println("Seja Bem vindo A o Painel Nuclear, Se divirta com as opçoes: ");
        System.out.println("1. Seu IP");
        System.out.print("Porfavor, Digite o Numero Referente a sua escolha: ");
        int op = s.nextInt();
        s.nextLine();
        break;
       }
    }
}

class UI {
    public void c_nucluar() {
        System.out.println("=============================");
        System.out.println("           NUCLEAR");
        System.out.println("          V0.0.1 ALPHA");
        System.out.println("          By Skaylatk");
        System.out.println("=============================");
    } 
    public void clear(int Q) {
        for (int i = 0; i < Q; i++) {
            System.out.println("");
        }
    }
    public void menu() {
        System.out.println("============================");
        System.out.println("        MENU NUCLEAR");
        System.out.println("============================");
    }
}

class FE {
    // Ferramentas "prontas"
}
