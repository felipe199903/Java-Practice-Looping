public class aperfeioamento04 {

	public static void main(String[] args) {
		// Exercício 01
        escreverRepeticao(1, "Repetição");
        escreverRepeticao(2, "Repetição");
       
        // Exercício 04
        Usuario[] usuarios = {
            new Usuario("Caio", 25, "Google"),
            new Usuario("Tiago", 35, "Microsoft"),
            new Usuario("Felipe", 30, "Apple")
        };
        
	}
	
    static void escreverRepeticao(int vezes, String conteudo) {
    }

    static void escreverResultado(String conteudo) {
    }
    
    // Definição da classe Usuario
    static class Usuario {
        private String nome;
        private int idade;
        private String empresa;

        public Usuario(String nome, int idade, String empresa) {
            this.nome = nome;
            this.idade = idade;
            this.empresa = empresa;
        }
    }
}