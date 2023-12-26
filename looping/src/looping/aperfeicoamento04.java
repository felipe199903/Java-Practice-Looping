
package looping;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class aperfeicoamento04 {

	public static void main(String[] args) {
		
		String[]lista = {"Repeticão","Repeticão","Repeticão","Repeticão"};	     	     
	     
		System.out.println("Exercício 01");
		escreverRepeticao(1, "Repetição");
		escreverRepeticao(2, "Repetição");
		System.out.println("\n");

		System.out.println("Exercício 01.2");
		escreverRepeticaoFor(10, "lol");
		System.out.println("\n");
		
		System.out.println("Exercicio 01.3");
		escreverRepeticaoForEach(lista);
		System.out.println("\n");
		
		System.out.println("Exercicio 01.4");
		escreverRepeticaoWhile("Repetição",50);
		System.out.println("\n");
		       
		System.out.println("Exercicio 02");
		escreverRepeticaoForNumero(11);
		System.out.println("\n");
		
		System.out.println("Exercicio 03");
		escreverRepeticaoForNumeroParImpar("IMPAR",11);
		System.out.println("\n");
		
//		System.out.println("Exercicio 04");
//		escrevaObjeto(usuarios);
//		System.out.println("\n");
		
		System.out.println("Exercicio 04.2");
		listaFilter("Apple",30);
		System.out.println("\n");
		  
	}
		
		static void escreverRepeticao(int vezes, String conteudo) {
			for(int i=0; i<vezes;i++) {
	        	System.out.println(conteudo);
	        }
		}
		static void escreverRepeticaoFor(int vezes, String conteudo) {
			for(int i=0; i<vezes;i++) {
	        	System.out.println(conteudo);
	        }
		}
		
		static void escreverRepeticaoForEach(String[] conteudo) {
			for(String i:conteudo) {
		        System.out.println(i);
		        }
		}

		static void escreverRepeticaoWhile(String conteudo, int vezes) {
			int i = 0;
	        while (i < vezes) {
	          System.out.println(conteudo);
	          i++;
	        }  
		}
		
		static void escreverRepeticaoForNumero(int vezes) {
			for(int i=0;i<vezes;i++) {
				   System.out.println(i);
			   }
		}
		
		static void escreverRepeticaoForNumeroParImpar(String tipo,int vezes) {
			if (tipo=="PAR") {
				for(int i=0; i<vezes; i+=2) {
		        	System.out.println(i);
		        }
			}else if (tipo=="IMPAR") {
				for(int i=1; i<vezes; i+=2) {
		        	System.out.println(i);
		        }
			}
		}
			
			static void listaFilter(String trabalho,int numero) {
				List<Usuario> usuarios = new ArrayList<>();
			    usuarios.add(new Usuario("Caio",25,"Google"));
			    usuarios.add(new Usuario("Tiago",35,"Microsoft"));
			    usuarios.add(new Usuario("Felipe",30,"Apple"));
			    usuarios.add(new Usuario("André",21,"Apple"));
			    
				List<String> nomesUsuariosAppleMais30 = usuarios.stream()
		                .filter(usuario -> usuario.getEmpresa().equalsIgnoreCase(trabalho)&& usuario.getIdade()>=numero)
		                .map(Usuario::getNome)               
		                .collect(Collectors.toList());
				System.out.println(nomesUsuariosAppleMais30);
			}
		
		
		static void escrevaObjeto(Usuario[] usuarios) {
			for(Usuario usuario:usuarios) {
				System.out.println("Nome: " + usuario.nome + ", Idade: " + usuario.idade);
			}
		}

		// Definição da classe Usuario
		static class Usuario {
			public String getNome() {
				return nome;
			}

			public int getIdade() {
				return idade;
			}

			public String getEmpresa() {
				return empresa;
			}

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

