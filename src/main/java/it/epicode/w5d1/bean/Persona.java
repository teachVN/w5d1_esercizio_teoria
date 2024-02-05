package it.epicode.w5d1.bean;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Persona {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;

    private List<Veicolo> veicoli;

    public void stampaPersona(){
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Data di nascita: " + dataNascita);
        veicoli.stream().forEach(veicolo -> System.out.println(veicolo));
    }

}
