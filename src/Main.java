import com.model.atividades.Curso;
import com.model.atividades.Desafio;
import com.model.atividades.Mentoria;
import com.model.bootcamps.Bootcamp;
import com.model.devs.Dev;
import com.model.exercicios.Exercicio;
import com.model.exercicios.ExercicioCodigo;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Bootcamp b = new Bootcamp();
        b.setNome("BootBB");
        Bootcamp c = new Bootcamp();
        c.setNome("BootCC");

        Curso c1 = new Curso("Java", "ddd", 20);
        Curso c2 = new Curso("HTTPS", "eee", 10);
        Curso c3 = new Curso("Python", "fff", 15);

        Mentoria m1 = new Mentoria("JS na pratica", "dser", LocalDate.now());
        Mentoria m2 = new Mentoria("Noções OO", "desc", LocalDate.now());


        System.out.println("\n==  Definindo atividades dos BootCamps  == \n");

        b.getAtividadesObrigatorias().add(c1);
        b.getAtividadesObrigatorias().add(c2);
        b.getAtividadesObrigatorias().add(c3);
        b.getAtividadesObrigatorias().add(m1);

        c.getAtividadesObrigatorias().add(c1);
        c.getAtividadesObrigatorias().add(c3);
        c.getAtividadesObrigatorias().add(m1);
        c.getAtividadesObrigatorias().add(m2);

        System.out.println(b);
        System.out.println(c);

        Dev devThiago = new Dev("Thiago");
        Dev devJoao = new Dev("João");

        devThiago.inscreverBootcamp(b);
        devJoao.inscreverBootcamp(c);

        devThiago.progredir();

        System.out.println("\n==  Verificando progreção e inscriçao bootcamp  == \n");

        System.out.println(devThiago);
        System.out.println(devJoao);

        devJoao.progredir();
        devJoao.progredir();
        System.out.println(devJoao);
        devJoao.progredir();
        devJoao.progredir();


        devJoao.progredir();
        System.out.println(devJoao);

        System.out.println(b.getDevsInscritos());
        devThiago.cancelarInscricao(b);
        devThiago.cancelarInscricao(c);
        System.out.println(b);
        System.out.println(c);

        System.out.println(devThiago);

        System.out.println("\n==  Definindo Desafio e verificando progressao  == \n");

        Desafio desafio1 = new Desafio("Desafio1", "Realizar atividades de programaçao");
        Exercicio exercicio1 = new ExercicioCodigo("Faça uma soma de dois numeros double ", "double somar(double a, double b) { return a + b;  }");
        Exercicio exercicio2 = new ExercicioCodigo("Faça uma divisao de dois numeros double ", "double dividir(double a, double b) { return a / b;  }");

        desafio1.setTarefas(Set.of(exercicio1, exercicio2));

        System.out.println(desafio1);

        b.getAtividadesObrigatorias().add(desafio1);

        devThiago.realizarExercicio(exercicio1, "double somar(double a, double b) { return a + b;  }");
        System.out.println("XP desafio 1 incompleto = " + desafio1.calcularXP());
        devThiago.realizarExercicio(exercicio2, "double dividir(double a, double b) { return a / b;  }");
        System.out.println("XP desafio 1 completo = " + desafio1.calcularXP());
        System.out.println(desafio1);

        System.out.println(b);

    }
}
