public class ExerciciosJava {

    public static void main(String[] args) {
        // Exercício 01
        escreverRepeticao(1, "Repetição");
        escreverRepeticao(2, "Repetição");
        
        // Exercício 1.2
        // Use um loop 'for' para escrever 'Repetição' 20 vezes dentro da div com o id 'resultado'.
        
        // Exercício 1.3
        // Utilize um loop 'forEach' para escrever 'Repetição' 5 vezes dentro da div com o id 'resultado'.
        
        // Exercício 1.4
        // Utilize um loop 'while' para escrever 'Repetição' 5 vezes dentro da div com o id 'resultado'.
        
        // Exercício 02
        // Utilize um loop 'for' para escrever os números de 0 a 10 dentro da div com o id 'resultado'.
        
        // Exercício 03
        // Utilize um loop 'for' para escrever os números pares até 20 dentro da div com o id 'resultado'.
        
        // Exercício 04
        Usuario[] usuarios = {
            new Usuario("Caio", 25, "Google"),
            new Usuario("Tiago", 35, "Microsoft"),
            new Usuario("Felipe", 30, "Apple")
        };
        
        // Exercício 4.1
        // Utilize o método 'map' para criar uma variável que contenha todas as idades dos usuários.
        
        // Exercício 4.2
        // Utilize o método 'filter' para criar uma variável com apenas os usuários que trabalham na Apple e têm mais de 30 anos.
        
        // Exercício 4.3
        // Utilize o método 'find' para criar uma variável que procura por um usuário que trabalhe na empresa Google.
    }

    // ... (definição da classe Usuario e métodos auxiliares)

    static void escreverRepeticao(int vezes, String conteudo) {
        // Implemente um método que utilize um loop para escrever o conteúdo 'Repetição' a quantidade de vezes especificada.
    }

    static void escreverResultado(String conteudo) {
        // Implemente um método que escreva o conteúdo fornecido dentro da div com o id 'resultado'.
    }
}
