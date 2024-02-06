package it.epicode.w5d1;

import it.epicode.w5d1.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean("p1")
    @Scope("singleton")
    public Persona getPersona(){
        Persona p = new Persona();
        p.setNome("Silvia");
        p.setCognome("Romero");
        p.setDataNascita(LocalDate.of(2020,4,5));
        return p;
    }

    @Bean("p2")
    @Scope("prototype")
    public Persona getPersona2(){
        Persona p = new Persona();
        p.setNome("Antonio");
        p.setCognome("Sondrio");
        p.setDataNascita(LocalDate.of(2021,4,5));
        return p;
    }
    @Bean("panda")
    public Auto getPanda(){
        Auto auto = new Auto();
        auto.setNome("Panda");
        auto.setMarca("Fiat");
        //auto.setNumeroPorte(5);
        auto.setNumeroRuote(4);
        return auto;
    }
    @Bean("ferrari")
    public Auto getFerrari(){
        Auto auto = new Auto();
        auto.setNumeroRuote(4);
        auto.setNome("Portofino");
        auto.setMarca("Ferrari");
        auto.setNumeroPorte("3");
        return auto;
    }
    @Bean("ninja")
    public Moto getNinja(){
        Moto moto = new Moto();
        moto.setNome("Ninja");
        moto.setMarca("Kawasaki");
        moto.setTipologia(Tipologia.SUPERSPORT);
        moto.setNumeroRuote(2);
        return moto;
    }
    @Bean("personaConVeicoli")
    public Persona getPersonaConVeicoli(){
        Persona persona = new Persona();
        persona.setNome("Roberto");
        persona.setCognome("Cavalli");
        persona.setDataNascita(LocalDate.of(1990, 6,4));

        List<Veicolo> veicoli = List.of(getPanda(), getFerrari(), getNinja());
        persona.setVeicoli(veicoli);

        return persona;
    }


}
