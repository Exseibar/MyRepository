package coupon.system.core.facade;

import java.util.ArrayList;

import coupon.system.core.beans.Category;
import coupon.system.core.beans.Coupon;
import coupon.system.core.beans.Customer;
import coupon.system.core.dao.CouponsDAODb;

public class CustomerFacade extends ClientFacade {

	private int CustomerId;

	public CustomerFacade() {
		couponsDao = new CouponsDAODb();
	}

	@Override
	public boolean login(String email, String password) {
		return false;
	}

	public void purchaseCoupon(Coupon coupon) {

	}

	public ArrayList<Coupon> getCustomerCoupons() {

	}

	public ArrayList<Coupon> getCustomerCoupons(Category category) {

	}

	public ArrayList<Coupon> getCustomerCoupons(double maxPrice) {

	}

	public Customer getCustomerDetails() {

	}

}
