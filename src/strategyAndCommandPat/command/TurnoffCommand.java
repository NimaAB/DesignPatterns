package strategyAndCommandPat.command;

import strategyAndCommandPat.client.Electronic;

public class TurnoffCommand implements CommandInterface {
    Electronic item;

    public TurnoffCommand(Electronic item) {
        this.item = item;
    }

    @Override
    public void execute() {
        this.item.off();
    }

    @Override
    public void unexecute() {
        this.item.on();
    }
}
