interface Nome {
    String getNome();
}

class NinjaAtack implements Nome {
    @Override
    public String getNome() {
        return "Ninja de Ataque";
    }
}

class NinjaDefesa implements Nome {
    @Override
    public String getNome() {
        return "Ninja de Defesa";
    }
}
