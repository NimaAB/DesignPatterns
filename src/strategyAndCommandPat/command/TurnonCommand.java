package strategyAndCommandPat.command;

import strategyAndCommandPat.client.Electronic;

public class TurnonCommand implements CommandInterface {
    Electronic item;

    public TurnonCommand(Electronic item) {
        this.item = item;
    }

    @Override
    public void execute() {
        this.item.on();
    }

    @Override
    public void unexecute() {
        this.item.off();
    }
}
