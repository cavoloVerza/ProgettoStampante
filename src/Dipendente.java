public class Dipendente extends Thread{

    private String nome;
    private Stampante print;
    private Semaforo semaforo;
    
    public Dipendente(String nome, Stampante print, Semaforo semaforo) {
        this.nome = nome;
        this.print = print;
        this.semaforo = semaforo;
    }

    public String getNome() {
        return nome;
    }

    public Stampante getPrint() {
        return print;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    @Override
    public void run(){

        int secondiSleep = (int) (Math.random() * 5) + 1;
        try {

            Thread.sleep(secondiSleep * 1000);
        }

        catch(Exception e) {

            e.printStackTrace();
        }

        int randomNumFogli = (int) (Math.random() * 3) + 1;

        semaforo.P();

        System.out.println(nome + " deve stampare: " + randomNumFogli + " fogli");
        System.out.println("");

        print.stampa(this.getNome(), randomNumFogli);

        System.out.println(nome + " ha finito");
        System.out.println("");

        semaforo.V();
             
    }
    
}
 