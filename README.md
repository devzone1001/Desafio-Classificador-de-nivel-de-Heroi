# Sistema de Ranking de Heróis

Este projeto é um programa Java que permite ao usuário inserir informações sobre quatro heróis, incluindo o nome e o valor de XP (experiência) de cada herói. O programa determina a classificação dos heróis com base em seu XP e exibe um ranking do melhor ao pior.

## Funcionalidades

- **Entrada de Dados:** O programa solicita ao usuário o nome e o valor de XP para quatro heróis.
- **Classificação:** Após a entrada dos dados, o programa classifica os heróis com base no valor de XP, do maior para o menor.
- **Exibição de Resultados:** O programa exibe a classificação dos heróis, incluindo seu nome e o valor de XP, em ordem decrescente de XP.

## Estrutura do Código

1. **Classe `Heroi`:** Representa um herói com um nome e um valor de XP.
2. **Classe `Main`:** Contém o método `main` onde ocorre a execução principal do programa. Inclui a leitura de entrada, a lógica de classificação e a exibição dos resultados.

### Código

```java
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
            scanner.nextLine(); // Limpa a nova linha pendente após a leitura do número

            herois.add(new Heroi(nome, xp));

            // Determine o título baseado no XP
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

        // Classificar heróis por XP em ordem decrescente
        herois.sort((h1, h2) -> h2.xp.compareTo(h1.xp));

        // Exibir o ranking
        System.out.println("\nRanking dos Heróis por XP:");
        for (int i = 0; i < herois.size(); i++) {
            Heroi heroi = herois.get(i);
            System.out.println((i + 1) + "º lugar: " + heroi);
        }

        scanner.close();
    }
}
```
