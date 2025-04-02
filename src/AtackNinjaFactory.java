class AtackNinjaFactory extends NinjaTipoFactory {
    @Override
    public Nome criarNome() {
        return new NinjaAtack();
    }

    @Override
    public Dano criarDano() {
        return new DMGAtk();
    }

    @Override
    public Vida criarVida() {
        return new HPAtk();
    }
}
