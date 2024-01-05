package excecao6.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import excecao6.entities.Reservation;
import excecao6.exceptions.ReservaException;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Dados da reserva:");
			System.out.print("Numero do quarto: ");
			int numero = s.nextInt();
			System.out.print("Data de Checkin: ");
			
			LocalDate dataCheckin = LocalDate.parse(s.next(), fmt);
			System.out.print("Data de Checkout: ");
			LocalDate dataCheckout = LocalDate.parse(s.next(), fmt);
			
			Reservation reserva = new Reservation(numero, dataCheckin, dataCheckout);
			
			reserva.duration();
			System.out.println();
			System.out.println("DADOS DA RESERVA");
			System.out.println(reserva);
			
			System.out.println("ATUALIZAÇÃO DA RESERVA");
			
			System.out.println();
			System.out.print("Data de Checkin: ");
			dataCheckin = LocalDate.parse(s.next(), fmt);
			System.out.print("Data de Checkout: ");
			dataCheckout = LocalDate.parse(s.next(), fmt);
			reserva.updateDates(dataCheckin, dataCheckout);
			
			System.out.println("Reserva atualizadas");
			System.out.println(reserva);
		}
		
		catch(InputMismatchException e) {
			System.out.println("Erro: Favor digitar um número inteiro para o quarto da reserva" );
		}
		
		catch (java.time.format.DateTimeParseException e) {
			System.out.println("Erro: Digite as datas no formato dd/MM/yyyy");
		}
		catch(ReservaException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		s.close();

	}

}
