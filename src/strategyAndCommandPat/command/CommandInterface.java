package strategyAndCommandPat.command;

import strategyAndCommandPat.client.Electronic;

public interface CommandInterface {
    void execute();
    void unexecute();
}

