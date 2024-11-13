import ru.p3xi.pokemon.*;
import ru.ifmo.se.pokemon.*;

public final class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Comfey());
        battle.addAlly(new Slowpoke());
        battle.addAlly(new Slowking());
        battle.addFoe(new NidoranM());
        battle.addFoe(new Nidorino());
        battle.addFoe(new Nidoking());
        battle.go();
    }
}
