package model;

import java.time.LocalTime;



public class Event implements Comparable<Event> {
	
	
	enum EventType{
		ARRIVAL, //NUOVO PAZIENTE IN TRIAGE
		TRIAGE, //ENTRO IN SALA DI ATTESA CON UN COLORE.
		TIMEOUT, //PASSA UN TEMPO DI ATTESA
		FREE_STUDIO,//SI è LBERATO UNO STUDIO, AMMETTIAMO QUALCUNO
		TREATED , //PAZIENTE CURATO
		TICK // per controllare se ci sono studi vuoti
	}
	private LocalTime time;
	private EventType type;
	private Patient patient;
	public Event(LocalTime time, EventType type, Patient patient) {
		super();
		this.time = time;
		this.type = type;
		this.patient = patient;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public int compareTo(Event other) {
		return this.time.compareTo(other.time);
	}
	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + ", patient=" + patient + "]";
	}
	
	

}

