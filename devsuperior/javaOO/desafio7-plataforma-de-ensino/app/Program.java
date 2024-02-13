package desafio.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafio.entities.Lesson;
import desafio.entities.Task;
import desafio.entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Dados da " +i +"a aula:" );
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char opcao = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Titulo: ");
			String titulo = sc.nextLine();
			
			if(opcao == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int segundos = sc.nextInt();
				Lesson video = new Video(titulo, url, segundos);
				list.add(video);
			}
			
			if(opcao == 't') {
				System.out.print("Descrição: ");
				String descricao = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int quantidadeQuestoes = sc.nextInt();
				Lesson task = new Task(titulo, descricao, quantidadeQuestoes);
				list.add(task);
			}
		}
		
		int total = 0;
		
		for(Lesson x : list) {
			total += x.duration();
		}
		
		System.out.println();
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + total + " segundos");
		sc.close();

	}

}
