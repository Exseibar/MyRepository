package coupon.system.core.facade;

import java.util.List;

import coupon.system.core.beans.Category;
import coupon.system.core.beans.Company;
import coupon.system.core.beans.Coupon;
import coupon.system.core.dao.CouponsDAODb;

public class CompanyFacade extends ClientFacade {

	private int CompanyId;

	public CompanyFacade() {
//		companiesDao = new CompaniesDAODb();
		couponsDao = new CouponsDAODb();
	}

	@Override
	public boolean login(String email, String password) {

		return false;
	}

	public void addCoupon() {

	}

	public void updateCoupon() {

	}

	public void deleteCoupon() {

	}

	public List<Coupon> getCompanyCoupons() {

	}

	public List<Coupon> getCompanyCoupons(Category category) {

	}

	public List<Coupon> getCompanyCoupons(double maxPrice) {

	}

	public Company getCompanyDetails() {

	}

}
