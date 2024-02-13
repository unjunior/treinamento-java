package excecao6.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import excecao6.exceptions.ReservaException;

public class Reservation {
	
	private Integer numero;
	private LocalDate checkin;
	private LocalDate checkout;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {
	}
	
	public Reservation(Integer numero, LocalDate checkin, LocalDate checkout) {
		if(checkin.isAfter(checkout)) {
			throw new ReservaException("A data de chekin não pode ser posterior a de checkout");
		}
		
		this.numero = numero;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public Long duration() {
		Duration x = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
		return x.toDays();
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		LocalDate agora = LocalDate.now();
		
		if(checkIn.isBefore(agora) || checkOut.isBefore(agora)) {
			throw new ReservaException("A atualização deve ser com datas futuras");
		}
		
		if(checkIn.isAfter(checkOut)) {
			throw new ReservaException("A data de chekin tem que ser antes da data de checkout");
		}
		
		this.checkin = checkIn;
		this.checkout = checkOut;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CHECKIN: " + checkin.format(fmt) + "\n");
		sb.append("CHECKOUT: " + checkout.format(fmt) + "\n");
		sb.append("DURAÇÃO DA RESERVA: " + duration() + " dias");
		return sb.toString();
	}
}
