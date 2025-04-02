interface Vida {
    int getVida();
}

class HPAtk implements Vida {
    @Override
    public int getVida() {
        return 150;
    }
}

class HPDfs implements Vida {
    @Override
    public int getVida() {
        return 200;
    }
}
