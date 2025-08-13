package edu.leandro.Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o volume para:" + canal);
        //canal = canal +1;
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Aumentando o volume para:" + canal);
        //canal = canal -1;
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para:" + volume);
        //volume =volume +1;
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para:" + volume);
        //volume=  volume -1;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
