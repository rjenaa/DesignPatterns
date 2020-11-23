package builder;

public class BuilderEveryday {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("example");

        builder.append("of the builder");

        builder.append("has methods to append");

        System.out.println(builder.toString());
    }
}
