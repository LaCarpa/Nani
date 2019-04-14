/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * La classe Nani crea 7 thread che partiranno in successione ed ogni
 * thread ha il nome di un nano che verrà stampato 7 volte
 * @author 73734062
 */
public class Nani {

    /**
     * Creazione dei thread e scrittura del codice che farà partire i 7 thread
     * l'uno successivamente all'altro
     */
    public static void main(String[] args) throws InterruptedException {
        ContaNani thr1 = new ContaNani("brontolo");
        ContaNani thr2 = new ContaNani("mammolo");
        ContaNani thr3 = new ContaNani("pisolo");
        ContaNani thr4 = new ContaNani("dotto");
        ContaNani thr5 = new ContaNani("eolo");
        ContaNani thr6 = new ContaNani("cucciolo");
        ContaNani thr7 = new ContaNani("gongolo");
        thr1.start();
        Thread.sleep(1000);
        thr2.start();
        Thread.sleep(1000); 
        thr3.start();
        Thread.sleep(1000);
        thr4.start();
        Thread.sleep(1000);
        thr5.start();
        Thread.sleep(1000);
        thr6.start();
        Thread.sleep(1000);
        thr7.start();
        //System.out.println(Thread.currentThread().getName());
    }
    
}
