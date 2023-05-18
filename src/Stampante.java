public class Stampante {

    private String nome;

    public Stampante(String nome) {
        this.nome = nome;
    }

    public void stampa(String nome, int i) {

        System.out.println(nome + " sta stampando");
        System.out.println("");

        for(int j = 0; j < i; j++) {

            System.out.println("------------------");
            System.out.println("|                |");
            System.out.println("|                |");
            System.out.println("|     foglio     |");
            System.out.println("|      n:" + (j+1) + "       |");
            System.out.println("|                |");
            System.out.println("|                |");
            System.out.println("|     autore:    |");
            System.out.println("|      " + nome + "      |");
            System.out.println("|                |");
            System.out.println("|                |");
            System.out.println("------------------");

            System.out.println("");

        }

    }

    
    
}