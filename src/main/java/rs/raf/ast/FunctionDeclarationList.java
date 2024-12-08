package rs.raf.ast;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper=true)
public final class FunctionDeclarationList extends Statement {
    private List<FunctionDeclaration> funDeclarations;

    public FunctionDeclarationList(Location location, List<FunctionDeclaration> funDeclarations) {
        super(location);
        this.funDeclarations = funDeclarations;
    }

    @Override
    public void prettyPrint(ASTPrettyPrinter pp) {
        pp.node("statements", () -> funDeclarations.forEach (x -> x.prettyPrint(pp)));
    }
}