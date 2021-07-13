package coupon.system.core.facade;

import coupon.system.core.dao.CompaniesDAO;
import coupon.system.core.dao.CouponsDAO;
import coupon.system.core.dao.CustomersDAO;

public abstract class ClientFacade {

	protected static CompaniesDAO companiesDao;
	protected static CustomersDAO customersDao;
	protected static CouponsDAO couponsDao;

	public abstract boolean login(String email, String password);
}
