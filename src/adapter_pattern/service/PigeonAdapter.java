package adapter_pattern.service;

import adapter_pattern.Pigeon;
import adapter_pattern.Quackable;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }


    @Override
    public void quack() {
        pigeon.coo();
    }
}
