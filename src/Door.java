public class Door {
    private boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }
}
