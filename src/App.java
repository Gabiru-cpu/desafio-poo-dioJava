import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(4);

        // System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso java");
        mentoria1.setDescricao("descrição curso java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("orange Tech BackEnd");
        bootcamp.setDescricao("descrição orange tech back end");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAluno1 = new Dev();
        devAluno1.setNome("Pedro");
        devAluno1.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Pedro: " + devAluno1.getConteudosInscritos());

        devAluno1.progredir();
        devAluno1.progredir();

        System.out.println("Conteúdos inscritos Pedro: " + devAluno1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Pedro: " + devAluno1.getConteudosConcluidos());
        System.out.println("XP: " + devAluno1.calcularTotalXp());

        Dev devAluno2 = new Dev();
        devAluno2.setNome("Camila");
        devAluno2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " +
                devAluno2.getConteudosInscritos());
        devAluno2.progredir();
        System.out.println("XP: " + devAluno2.calcularTotalXp());
    }
}
