/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * La classe ContaNani eredita dalla classe Thread e
 * stampa per 7 volte il nome di tutti un nano
 * il cui nome viene immesso nel main
 * 
 * @author 73734062
 */
public class ContaNani extends Thread {
    
/** Il costruttore viene ereditato dalla classe padre*/
    
    ContaNani(String nome) {
        super();
        setName(nome);
    }
    
    /**
     * Abbiamo riscritto il metodo run in modo che questo metodo
     * stampi per 7 volte il nome di un nano
    */
    @Override
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7; i++)
            System.out.println(i+1 + " " + getName());
        //System.out.println("Fine thread");
}
    
}
