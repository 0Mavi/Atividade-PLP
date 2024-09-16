package ui;

import service.Carro;

public class Ui {

    public void questao1() {
        Carro carro1 = new Carro ("BMW","320i",2014);
        Carro carro2 = new Carro ("Ford","Mustang Gt",2024);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }

    public void questao2() {
        Carro carro1 = new Carro ("Chevrolet","Corvette",2022);
        
        carro1.exibirDetalhes();
        carro1.acelerar(30);
        carro1.acelerar(20);
        carro1.frear(10);
        carro1.frear(5);

        carro1.exibirVelocidade();
    }
}
