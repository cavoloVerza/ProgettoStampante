public class Semaforo {

    private int valore;

    public Semaforo(int valore) {

        this.valore = valore;
    }

    public int getValore() {

        return valore;
    }

    public void setValore(int valore) {

        this.valore = valore;
    }

    public synchronized void P(){

        while(valore == 0) {

            try {

                System.out.println(Thread.currentThread().getName() + " in attesa");
                System.out.println("");
                wait();
            }

            catch (Exception e) {
                e.printStackTrace();
            }

        }

        valore=0;

    }

    public synchronized void V(){

        valore=1;
        notify();
    }
    
}
