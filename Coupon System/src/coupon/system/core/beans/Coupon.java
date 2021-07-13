package coupon.system.core.beans;

import java.time.LocalDate;

/**
 * This class represents the coupons.
 *
 * @author Yossi and Avi Tuchband
 * 
 */

public class Coupon {

	private int id;

	/**
	 * The Company id which the coupon is owned by.
	 */
	private int companyId;

	private Category category;
	private String title;
	private String description;

	/**
	 * The time when the Coupon was made.
	 */
	private LocalDate startDate;

	/**
	 * The Coupon's expiration date.
	 */
	private LocalDate endDate;

	private int amount;
	private double price;
	private String image;

	/**
	 * Constructs a Coupon with {@code null} in its fields.
	 */
	public Coupon() {

	}

	/**
	 * Constructs a new Coupon with specified id, companyId, category, title,
	 * description, startDate, endDate, amount, price and image.
	 * 
	 * @param id          The id of The Coupon which can be retrieved by the
	 *                    {@link #getId()} method.
	 * @param companyId   The Company id which owns the Coupon which can be
	 *                    retrieved by the {@link #getCompanyiD()} method.
	 * @param category    The category of the Coupon which can be retrieved by the
	 *                    {@link #getCategory()} method.
	 * @param title       The title of the Coupon which can be retrieved by the
	 *                    {@link #getTitle()} method.
	 * @param description The description of the Coupon which can be retrieved by
	 *                    the {@link #getDescription()} method.
	 * @param startDate   The startDate of the Coupon which can be retrieved by the
	 *                    {@link #getStartDate()} method.
	 * @param endDate     The endDate of the Coupon which can be retrieved by the
	 *                    {@link #getEndDate()} method.
	 * @param amount      The amount of the Coupon uses which can be retrieved by
	 *                    the {@link #getAmount()} method.
	 * @param price       The price of the Coupon which can be retrieved by the
	 *                    {@link #getPrice()} method.
	 * @param image       The image of the Coupon which can be retrieved by the
	 *                    {@link #getImage()} method.
	 */
	public Coupon(int id, int companyId, Category category, String title, String description, LocalDate startDate,
			LocalDate endDate, int amount, double price, String image) {
		this.id = id;
		this.companyId = companyId;
		this.category = category;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.price = price;
		this.image = image;
	}

	/**
	 * @return the id of the Coupon Object.
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id Sets the id of the Coupon Object.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the companyId of the Coupon Object.
	 */
	public int getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId Sets the companyId of the Coupon Object.
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the category of the Coupon Object.
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category Sets the category of the Coupon Object.
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	/**
	 * @return the title of the Coupon Object.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title Sets the title of the Coupon Object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description of the Coupon Object.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description Sets the description of the Coupon Object.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the startDate of the Coupon Object.
	 */
	public LocalDate getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate Sets the startDate of the Coupon Object.
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate of the Coupon Object.
	 */
	public LocalDate getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate Sets the endDate of the Coupon Object.
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the amount of the Coupon Object.
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount Sets the amount of the Coupon Object.
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	/**
	 * @return the price of the Coupon Object.
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price Sets the price of the Coupon Object.
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the image of the Coupon Object.
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image Sets the image of the Coupon Object.
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return a String representation of the Coupon Object.
	 */
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", companyiD=" + companyId + ", category=" + category + ", title=" + title
				+ ", description=" + description + ", startDate=" + startDate + ", endDate=" + endDate + ", amount="
				+ amount + ", price=" + price + ", image=" + image + "]";
	}
}
