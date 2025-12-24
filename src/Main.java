import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    private static final DateTimeFormatter DATA_FORMATADA =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Introdução ao Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO com Java");
        curso2.setDescricao("Abstração, Encapsulamento, Herança e Polimorfismo");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Carreira");
        mentoria.setDescricao("Orientação profissional");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DIO");
        bootcamp.setDescricao("Desafio de POO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz Carvalho");
        devLuiz.inscreverBootcamp(bootcamp);

        System.out.println("=================================");
        System.out.println("        DEV: " + devLuiz.getNome());
        System.out.println("=================================\n");

        System.out.println(">> Conteúdos INSCRITOS");
        devLuiz.getConteudosInscritos().forEach(conteudo -> {
            if (conteudo instanceof Curso curso) {
                System.out.println(" - Curso: " + curso.getTitulo()
                        + " (" + curso.getCargaHoraria() + "h)");
            } else if (conteudo instanceof Mentoria mentoriaItem) {
                System.out.println(" - Mentoria: " + mentoriaItem.getTitulo()
                        + " (" + mentoriaItem.getData().format(DATA_FORMATADA) + ")");
            }
        });

        System.out.println("\n>> Progresso realizado...\n");
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();

        System.out.println(">> Conteúdos CONCLUÍDOS");
        devLuiz.getConteudosConcluidos().forEach(conteudo -> {
            System.out.println(" - " + conteudo.getTitulo()
                    + " | XP: " + (int) conteudo.calcularXp());
        });

        System.out.println("\n>> XP TOTAL: " + (int) devLuiz.calcularTotalXp());
        System.out.println("=================================");
    }
}
