public class NinjaFactory {
    private NinjaTipoFactory ninjaFactory;

    public void criarNinja(String tipo) {
        if (tipo.equalsIgnoreCase("Atack")) {
            ninjaFactory = new AtackNinjaFactory();
        } else if (tipo.equalsIgnoreCase("Defesa")) {
            ninjaFactory = new DefesaNinjaFactory();
        } else {
            throw new IllegalArgumentException("Tipo de ninja desconhecido");
        }

        Nome nome = ninjaFactory.criarNome();
        Dano dano = ninjaFactory.criarDano();
        Vida vida = ninjaFactory.criarVida();

        System.out
                .println("Ninja criado: " + nome.getNome() + ", Dano: " + dano.getDano() + ", Vida: " + vida.getVida());
    }
}
