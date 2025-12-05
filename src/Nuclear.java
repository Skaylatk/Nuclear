import java.util.Random;
import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args) {
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
                    System.out.println("Que bom que voce executou essa opçao, mais ela ainda esta em desenvolvimento");
                    break;

                default:
                    System.err.println("Digite o NUmero Correto");
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
}
