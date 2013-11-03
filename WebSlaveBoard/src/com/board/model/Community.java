package com.board.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.Hibernateutil;

public class Community {

	private final MunicipalBoard mb = new MunicipalBoard();

	// public static void main(String[] args) {
	// try {
	// Session session = Hibernateutil.getSessionFactory().openSession();
	// session.beginTransaction();
	// session.save(add("2012-11-23", 175, 274, 11391));
	// StringBuffer buff = new StringBuffer();
	// Iterator<MunicipalBoard> it = selectAll().iterator();
	// if (it.hasNext()) {
	// buff.append(it.next().getId() + " | "
	// + it.next().getHot_water() + " | "
	// + it.next().getCold_water() + "\n");
	// }
	// System.out.println(buff.toString());
	// session.getTransaction().commit();
	// session.close();
	// } catch (HibernateException e) {
	// e.printStackTrace();
	// }
	//
	// }

	public List<MunicipalBoard> selectAll() {
		final Session session = Hibernateutil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from MunicipalBoard");
		List<MunicipalBoard> list = query.list();
		session.getTransaction().commit();
		session.close();
		return list;
	}

	/**
	 * Changing main columns in table MunicipalBoard (without autoIncrement id!)
	 * 
	 * @param d
	 *            - date
	 * @param hot
	 * @param cold
	 * @param electr
	 * @return Object (MunicipalBoard)
	 */
	private MunicipalBoard add(String d, int hot, int cold, int electr) {
		mb.setPaydate(d);
		mb.setHot_water(hot);
		mb.setCold_water(cold);
		mb.setElectricity(electr);
		return mb;
	}

	/**
	 * Changing all columns in table MunicipalBoard (without autoIncrement id!)
	 * 
	 * @param d
	 *            - date
	 * @param hot
	 * @param pr_hot
	 * @param cold
	 * @param pr_cold
	 * @param electr
	 * @param pr_electr
	 * @param pr_flat
	 * @param pr_porch
	 * @param pr_main
	 * @return Object (MunicipalBoard)
	 */
	private MunicipalBoard add(String d, int hot, double pr_hot, int cold,
			double pr_cold, int electr, double pr_electr, double pr_flat,
			double pr_porch, int pr_main) {
		mb.setPaydate(d);
		mb.setHot_water(hot);
		mb.setPrice_hotwater(pr_hot);
		mb.setCold_water(cold);
		mb.setPrice_coldwater(pr_cold);
		mb.setElectricity(electr);
		mb.setPrice_electricity(pr_electr);
		mb.setPrice_flat(pr_flat);
		mb.setPrice_porch(pr_porch);
		mb.setPrice_main(pr_main);

		return mb;
	}
}
