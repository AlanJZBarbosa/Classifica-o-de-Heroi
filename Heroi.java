public class Heroi {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome e a quantidade de experiência (XP) do herói
        String nome = "FireGhost";
        int xp = 10500;

        // Estrutura de decisão para determinar a classificação do herói com base na XP
        if (xp < 1000) {
            System.out.println(nome + " sua classe é Ferro");
        } else if (xp >= 1001 && xp <= 2000) {
            System.out.println(nome + " sua classe é Bronze");
        } else if (xp >= 2001 && xp <= 6000) {
            System.out.println(nome + " sua classe é Prata");
        } else if (xp >= 6001 && xp <= 7000) {
            System.out.println(nome + " sua classe é Ouro");
        } else if (xp >= 7001 && xp <= 8000) {
            System.out.println(nome + " sua classe é Platina");
        } else if (xp >= 8001 && xp <= 9000) {
            System.out.println(nome + " sua classe é Ascendente");
        } else if (xp >= 9001 && xp <= 10000) {
            System.out.println(nome + " sua classe é Imortal");
        } else if (xp >= 10001) {
            System.out.println(nome + " sua classe é Radiante");
        } else {
            System.out.println("XP inválido");
        }
    }
}
