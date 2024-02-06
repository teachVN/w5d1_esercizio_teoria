package it.epicode.w5d1.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@PropertySource("application.properties")
public class Auto extends Veicolo{
    @Value("${it.epicode.w5d1.numeroPorte}")
    private  String numeroPorte;

    @Override
    public String toString() {
        return "Auto{" + super.toString() +
                "numeroPorte=" + numeroPorte +
                '}';
    }
}
