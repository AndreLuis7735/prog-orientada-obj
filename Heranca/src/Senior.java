public class Senior extends Desenvolvedor {
    private float VerbaLideranca;

    public Senior(){
        super();
    }
    public Senior(String nome, String linguagem, float salario, float verbaLideranca ) {
        super(nome, linguagem, salario);
        this.VerbaLideranca = verbaLideranca;
    }

    public float getVerbaLideranca() {
        return VerbaLideranca;
    }

    public void setVerbaLideranca(float verbaLideranca) {
        VerbaLideranca = verbaLideranca;
    }

    @Override
    public void codar(){
        System.out.println("Sênior desenvolvendo arquitetura e orientando a equipe");
    }

    @Override
    public double calcularBonus(){
        return super.calcularBonus() + this.salario * 0.15 + this.VerbaLideranca;
    }

    @Override
    public String toString() {
        return "Senior{" +
                "VerbaLideranca=" + VerbaLideranca +
                ", nome='" + nome + '\'' +
                ", linguagem='" + linguagem + '\'' +
                ", salario=" + salario +
                '}';
    }
}
