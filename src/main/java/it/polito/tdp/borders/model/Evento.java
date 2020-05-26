package it.polito.tdp.borders.model;

public class Evento implements Comparable<Evento>{
	private Integer t;//tempo al quale avviene l'evento
	private Country stato;//stato in cui arrivano i migranti al tempo t
	private Integer n;//numero di migranti che arrivano in "stato" al tempo t (la metà di essi si sposterà)
	/**
	 * @param t
	 * @param stato
	 * @param n
	 */
	public Evento(Integer t, Country stato, Integer n) {
		super();
		this.t = t;
		this.stato = stato;
		this.n = n;
	}
	public Integer getT() {
		return t;
	}
	public void setT(Integer t) {
		this.t = t;
	}
	public Country getStato() {
		return stato;
	}
	public void setStato(Country stato) {
		this.stato = stato;
	}
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
	@Override
	public int compareTo(Evento o) {
		return this.t.compareTo(o.t);
	}
	
}
