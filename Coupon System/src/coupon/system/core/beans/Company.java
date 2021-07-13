package coupon.system.core.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the company Objects.
 * 
 * @author Yossi and Avi Tuchband
 *
 */
public class Company {

	private int id;
	private String name;
	private String email;
	private String password;
	private List<Coupon> coupons = new ArrayList<Coupon>();

	/**
	 * Constructs a new Company Object with {@code null} in its fields.
	 */
	public Company() {

	}

	/**
	 * constructs a new Company Object with specified id, name, email and password.
	 * 
	 * @param id       The number of the Company (which can be retrieved by the
	 *                 {@link #getId()} method).
	 * @param name     The name of the Company (which can be retrieved by the
	 *                 {@link #getName()} method).
	 * @param email    The email of the Company (which can be retrieved by the
	 *                 {@link #getEmail()} method).
	 * @param password The password of the Company (which can be retrieved by the
	 *                 {@link #getPassword()} method).
	 */
	public Company(int id, String name, String email, String password) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	/**
	 * Constructs a new Company Object with specified name, email and password.
	 * 
	 * 
	 * @param name     The name of the Company (which can be retrieved by the
	 *                 {@link #getName()} method).
	 * @param email    The email of the Company (which can be retrieved by the
	 *                 {@link #getEmail()} method).
	 * @param password The password of the Company (which can be retrieved by the
	 *                 {@link #getPassword()} method).
	 */
	public Company(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	/**
	 * @return the id of the Company Object
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id Sets the id of the Company Object
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name of the Company Object
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name Sets the name of the Company Object
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email of the Company Object
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email Sets the email of the Company Object
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password of the Company Object
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password Sets the password of the Company Object
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the Coupon List of the the Company Object
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons Sets the coupons of the Company of the Company Object
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * @return a String representation of the Company Object
	 */
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	/**
	 * @return a hashCode for the Company Object
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	/**
	 * @param obj is the Object which is compared.
	 * @return if the Company Object is equal to obj Object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Company)) {
			return false;
		}
		Company other = (Company) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		return true;
	}

}