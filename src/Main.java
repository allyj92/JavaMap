import java.util.TreeSet;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();

        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim","Park"));

    }
}