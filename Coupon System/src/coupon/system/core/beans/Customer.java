package coupon.system.core.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the customers.
 * 
 * @author Yossi and Avi Tuchband
 *
 */
public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<Coupon> coupons = new ArrayList<Coupon>();

	/**
	 * Constructs a Customer Object with {@code null} in its fields.
	 */
	public Customer() {

	}

	/**
	 * Constructs a Customer Object with a specified id, firstName, lastName, email
	 * and password.
	 * 
	 * @param id        The id of The Customer which can be retrieved by the
	 *                  {@link #getId()} method
	 * @param firstName The firstName of The Customer which can be retrieved by the
	 *                  {@link #getFirstName()} method
	 * @param lastName  The lastName of The Customer which can be retrieved by the
	 *                  {@link #getLastName()} method
	 * @param email     The email of The Customer which can be retrieved by the
	 *                  {@link #getEmail()} method
	 * @param password  The password of The Customer which can be retrieved by the
	 *                  {@link #getPassword()} method
	 */
	public Customer(int id, String firstName, String lastName, String email, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	/**
	 * @return the id of the Customer Object.
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id Sets the id of the Customer Object.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName of the Customer Object.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName Sets the firstName of the Customer Object.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName of the Customer Object.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName Sets the lastName of the Customer Object.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email of the Customer Object.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email Sets the email of the Customer Object.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password of the Customer Object.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password Sets the password of the Customer Object.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the coupons of the Customer Object.
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons Sets the coupons of the Customer Object.
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * @return a String representation of the Coupon Object.
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", coupons=" + coupons + "]";
	}

}
