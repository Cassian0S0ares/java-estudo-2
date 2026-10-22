public class main {
    public static void main(String[] args){
        personagem personagem1 = new personagem("Arthas", 100, 20,5,3);
        personagem personagem2 = new personagem("bargas", 40, 40,6,3);
    
        personagem1.exibirStatus();
        personagem2.exibirStatus();

        personagem1.atacar(personagem2);
        personagem2.exibirStatus();
        personagem2.atacar(personagem1);
        personagem1.exibirStatus();
        personagem1.atacar(personagem2);
        personagem2.exibirStatus();
        personagem2.atacar(personagem1);
        personagem1.exibirStatus();
        personagem1.atacar(personagem2);
        personagem2.exibirStatus();
        personagem2.atacar(personagem1);
        personagem1.exibirStatus();

        

    }
}
