package observerPattern;

import java.util.ArrayList;

// know as: IObservable
public interface ISubject {
    void attach(IObserver observer );
    void detach(IObserver observer);
    void notifyObserver();
}

