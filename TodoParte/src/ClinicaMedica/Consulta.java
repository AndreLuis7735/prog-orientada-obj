package ClinicaMedica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private int id;
    private LocalDateTime data;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(int id, Paciente paciente, LocalDateTime data, Medico medico) {
        this.id = id;
        this.paciente = paciente;
        this.data = data;
        this.medico = medico;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'mm");

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", data=" + data.format(formatoBR) +
                ", medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
