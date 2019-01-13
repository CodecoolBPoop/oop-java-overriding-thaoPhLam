package com.codecool.uml.overriding;

public abstract class AbstractProcess {
    public void process(Orderable item) {
        this.stepBefore();
        this.action(item);
        this.stepAfter();
    }

    public void stepBefore() {
        System.out.println(
                "Step before processing [" +
                        this.getClass().getSimpleName() +
                        "]"
        );
    }

    protected abstract void action(Orderable item);

    public void stepAfter() {
        System.out.println(
                "Step after processing [" +
                        this.getClass().getSimpleName() +
                        "]"
        );
    }
}
