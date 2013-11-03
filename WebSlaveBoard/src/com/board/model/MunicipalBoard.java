package com.board.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MunicipalBoard implements Serializable {

	private static final long serialVersionUID = -3687497890085313579L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String paydate;

	private int hot_water;
	private double price_hotwater = 17.41;

	private int cold_water;
	private double price_coldwater = 3.5;

	private int electricity;
	private double price_electricity = 0.24;
	private double price_flat = 218.55;
	private double price_porch = 24;
	private int price_main = 3000;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaydate() {
		return paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	public int getHot_water() {
		return hot_water;
	}

	public void setHot_water(int hot_water) {
		this.hot_water = hot_water;
	}

	public double getPrice_hotwater() {
		return price_hotwater;
	}

	public void setPrice_hotwater(double price_hotwater) {
		this.price_hotwater = price_hotwater;
	}

	public int getCold_water() {
		return cold_water;
	}

	public void setCold_water(int cold_water) {
		this.cold_water = cold_water;
	}

	public double getPrice_coldwater() {
		return price_coldwater;
	}

	public void setPrice_coldwater(double price_coldwater) {
		this.price_coldwater = price_coldwater;
	}

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}

	public double getPrice_electricity() {
		return price_electricity;
	}

	public void setPrice_electricity(double price_electricity) {
		this.price_electricity = price_electricity;
	}

	public double getPrice_flat() {
		return price_flat;
	}

	public void setPrice_flat(double price_flat) {
		this.price_flat = price_flat;
	}

	public double getPrice_porch() {
		return price_porch;
	}

	public void setPrice_porch(double price_porch) {
		this.price_porch = price_porch;
	}

	public int getPrice_main() {
		return price_main;
	}

	public void setPrice_main(int price_main) {
		this.price_main = price_main;
	}
}
