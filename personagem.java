public class personagem{
    private  String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int nivel;

    public personagem(String nome, int vida, int ataque, int defesa, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }
    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("ataque: " + ataque);
        System.out.println("defesa: " + defesa);
        System.out.println("nivel: " + nivel);
      System.out.println("--------------------------------------------");
    }
    public void receberDano(int dano){
        int danoEfetivo;
        danoEfetivo = dano - defesa;
        if (danoEfetivo <= 0){
            danoEfetivo = 1;
        }
        vida = vida - danoEfetivo;
        if (vida <= 0){
            vida = 0;
        }     
    }
    public void atacar(personagem alvo){
        if (this.vida == 0){
            System.out.println(this.nome + " Não atacou porque ele morreu");
                  System.out.println("--------------------------------------------");
        }else {
        System.out.println("O personagem " + this.nome + " atacou");
        if (alvo.vida == 0){
            System.out.println(this.nome + " não atacou porque: " + alvo.nome + " morreu");
                  System.out.println("--------------------------------------------");
        }else{
        alvo.receberDano(this.ataque);
      System.out.println("--------------------------------------------");
        }
        }

    }
}