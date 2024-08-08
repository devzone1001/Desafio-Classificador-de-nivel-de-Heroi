import java.util.*;

class Heroi {
    String nome;
    Double xp;

    Heroi(String nome, Double xp) {
        this.nome = nome;
        this.xp = xp;
    }

    @Override
    public String toString() {
        return nome + " com XP: " + xp;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Heroi> herois = new ArrayList<>();

        System.out.println("Fale o nome de quatro Heróis:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Qual o nome do herói?");
            String nome = scanner.nextLine();

            System.out.println("Qual o valor de Xp desse Herói:");
            Double xp = scanner.nextDouble();
            scanner.nextLine();

            herois.add(new Heroi(nome, xp));


            String titulo;
            if (xp < 1000) {
                titulo = "Ferro";
            } else if (xp >= 1000 && xp < 2000) {
                titulo = "Bronze";
            } else if (xp >= 2000 && xp < 5000) {
                titulo = "Prata";
            } else if (xp >= 5000 && xp < 7000) {
                titulo = "Ouro";
            } else if (xp >= 7000 && xp < 8000) {
                titulo = "Platina";
            } else if (xp >= 8000 && xp < 9000) {
                titulo = "Ascendente";
            } else if (xp >= 9000 && xp < 10000) {
                titulo = "Imortal";
            } else {
                titulo = "Radiante";
            }
            System.out.println(nome + " é " + titulo);
        }


        herois.sort((h1, h2) -> h2.xp.compareTo(h1.xp));


        System.out.println("\nRanking dos Heróis por XP:");
        for (int i = 0; i < herois.size(); i++) {
            Heroi heroi = herois.get(i);
            System.out.println((i + 1) + "º lugar: " + heroi);
        }

        scanner.close();
    }
}
