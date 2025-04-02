interface Dano {
    int getDano();
}

class DMGAtk implements Dano {
    @Override
    public int getDano() {
        return 100;
    }
}

class DMGDfs implements Dano {
    @Override
    public int getDano() {
        return 50;
    }
}
