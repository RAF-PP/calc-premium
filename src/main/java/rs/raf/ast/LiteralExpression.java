package rs.raf.ast;

public class LiteralExpression extends Expression {
    private final Object value;

    public LiteralExpression(Location location, Object value) {
        super(location, Operation.VALUE, null, null);
        this.value = value;
    }

    @Override
    public void prettyPrint(ASTPrettyPrinter pp) {
        pp.node("Literal", () -> {
            pp.terminal("Value: " + value);
        });
    }
}
