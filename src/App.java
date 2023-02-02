import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(4);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso java");
        mentoria1.setDescricao("descrição curso java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
