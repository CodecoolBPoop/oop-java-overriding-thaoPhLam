package com.codecool.uml.overriding;

public class Order implements Orderable {
    enum Status {
        NEW,
        CHECKED,
        PAID
    }

    private int id;
    private Status status = Status.NEW;

    private static int ID_COUNTER = 0;

    public Order() {
        this.id = Order.ID_COUNTER++;
    }

    /**
     * It is not used currenty but was required in the UML diagram
     * @return
     */
    public String getStatus() {
        return status.toString();
    }

    @Override
    public boolean checkout() {
        if (status.equals(Status.NEW)) {
            status = Status.CHECKED;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay() {
        if (status.equals(Status.CHECKED)) {
            status = Status.PAID;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(
                "[ig:%d, status:%s]",
                this.id,
                this.status
        );
    }
}
