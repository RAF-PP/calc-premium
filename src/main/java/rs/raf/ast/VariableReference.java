package rs.raf.ast;

public class VariableReference extends Expression {

    String name;

    public VariableReference(Location location, String text) {
        super(location);
        this.name = text;
    }

    @Override
    public void prettyPrint(ASTPrettyPrinter pp) {
        pp.node("VariableReference", () -> {
            pp.terminal("Name: " + name);
        });
    }
}
