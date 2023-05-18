public class App {

    public static void main(String[] args) throws Exception {

        Stampante print = new Stampante("S1");
        Semaforo semaforo = new Semaforo(1);

        Dipendente p1 = new Dipendente("Gabri", print, semaforo);
        Dipendente p2 = new Dipendente("Samu", print, semaforo);
        Dipendente p3 = new Dipendente("Giova", print, semaforo);
        Dipendente p4 = new Dipendente("Andre", print, semaforo);
        Dipendente p5 = new Dipendente("Rida", print, semaforo);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();

    }

}
