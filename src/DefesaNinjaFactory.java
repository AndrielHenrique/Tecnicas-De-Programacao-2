class DefesaNinjaFactory extends NinjaTipoFactory {
    @Override
    public Nome criarNome() {
        return new NinjaDefesa();
    }

    @Override
    public Dano criarDano() {
        return new DMGDfs();
    }

    @Override
    public Vida criarVida() {
        return new HPDfs();
    }
}
