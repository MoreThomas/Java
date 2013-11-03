package com.board.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.Hibernateutil;

public class ProcessorPerformance {
	private final MunicipalBoard mb1, mb2;
	private int hotW;
	private double price_hotW;
	private int coldW;
	private double price_coldW;
	private int electic;
	private double price_electic;
	private double sum1, sum2;

	public ProcessorPerformance(MunicipalBoard mb1, MunicipalBoard mb2) {
		this.mb1 = mb1;
		this.mb2 = mb2;
		setHotW();
		setPrice_hotW();
		setColdW();
		setPrice_coldW();
		setElectic();
		setPrice_electic();
		setSum1();
		setSum2();
	}

	public int getHotW() {
		return hotW;
	}

	private void setHotW() {
		hotW = mb2.getHot_water() - mb1.getHot_water();
	}

	public double getPrice_hotW() {
		return new BigDecimal(price_hotW).setScale(2, RoundingMode.UP)
				.doubleValue();
	}

	private void setPrice_hotW() {
		price_hotW = getHotW() * mb1.getPrice_hotwater();
	}

	public int getColdW() {
		return coldW;
	}

	private void setColdW() {
		coldW = mb2.getCold_water() - mb1.getCold_water();
	}

	public double getPrice_coldW() {
		return price_coldW;
	}

	private void setPrice_coldW() {
		price_coldW = getColdW() * mb1.getPrice_coldwater();
	}

	public int getElectic() {
		return electic;
	}

	private void setElectic() {
		electic = mb2.getElectricity() - mb1.getElectricity();
	}

	public double getPrice_electic() {
		return new BigDecimal(price_electic).setScale(2, RoundingMode.UP)
				.doubleValue();
	}

	private void setPrice_electic() {
		price_electic = getElectic() * mb1.getPrice_electricity();
	}

	public double getSum1() {
		return new BigDecimal(sum1).setScale(2, RoundingMode.UP).doubleValue();
	}

	private void setSum1() {
		sum1 = getPrice_coldW() + getPrice_hotW() + getPrice_electic()
				+ mb1.getPrice_flat() + mb1.getPrice_porch();
	}

	public double getSum2() {
		return new BigDecimal(sum2).setScale(2, RoundingMode.UP).doubleValue();
	}

	private void setSum2() {
		sum2 = getSum1() + mb1.getPrice_main();
	}

	public static void writeData(String s) {
		MunicipalBoard mb = new MunicipalBoard();
		final Session session = Hibernateutil.getSessionFactory().openSession();
		session.beginTransaction();
		String[] d = s.split(";");

		Query exQuery = session.createSQLQuery("CALL "
				+ "insertdata(:timestmp,:hw,:cw,:elec)");
		exQuery.setParameter("timestmp", d[0]);
		exQuery.setParameter("hw", d[1]);
		exQuery.setParameter("cw", d[2]);
		exQuery.setParameter("elec", d[3]);
		int exRows = exQuery.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
}