package ClinicaMedica;

import java.time.LocalDateTime;

public class TestaClinica {
    public static void main(String[] args) {
        Medico m1 = new Medico(1,"Cardiologista","Carlos" );
        Paciente p1= new Paciente(1, "123","João");
        LocalDateTime data = LocalDateTime.of(2026,05);
        Consulta c1 = new Consulta(1,p1, 20/05/2026,m1);
        System.out.println(c1.toString());


    }
}
