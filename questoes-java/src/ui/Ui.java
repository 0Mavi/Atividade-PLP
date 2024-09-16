package ui;

import java.util.ArrayList;
import java.util.List;

import service.Carro;
import service.Carro2;
import service.ContaBancaria;
import service.Som;
import util.Animal;
import util.Motor;

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

    public void questao3() {
        ContaBancaria conta = new ContaBancaria(500, "Mauro Gabirel");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo()+'\n');

        conta.depositar(1240.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo()+'\n');

        conta.sacar(50.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo()+'\n');

        conta.sacar(10.0);
        System.out.println("Saldo final: R$ " + conta.getSaldo()+'\n');
    }

    public void questao4() {

        Animal animal = new Animal();

        animal.somGato();
        animal.somCachorro();
    }

    public void questao5() {
        List<Som> animais = new ArrayList<>();

        Animal gato = new Animal() {
            @Override
            public void som() {
                somGato();
            }
        };
        
        Animal cachorro = new Animal() {
            @Override
            public void som() {
                somCachorro();
            }
        };

        animais.add(gato);
        animais.add(cachorro);

  
        Som.emitirSons(animais);
       
    }

    public void questao6(){
        
        Motor motor1 = new Motor(387,"Gasolina");
        Carro2 carro1 = new Carro2 ("BMW","320i",2014,motor1);

        carro1.exibirDetalhes();

        carro1.exibirDetalhes();
    }
}
