package coupon.system.core.dao;

import java.util.ArrayList;
import java.util.List;

import coupon.system.core.Company;
import coupon.system.core.connection.ConnectionPool;
import coupon.system.core.exceptions.CouponSystemException;

public class CompaniesDBDAO implements CompaniesDAO {

	private ConnectionPool connectionPool;
	private List<Company> companies = new ArrayList<Company>();

	@Override
	public boolean isCompanyExist(String email, String password) throws CouponSystemException {

	}

	@Override
	public void addCompany(Company company) {

	}

	@Override
	public void updateCompany(Company company) {

	}

	@Override
	public void deleteCompany(Company company) {

	}

	@Override
	public ArrayList<Company> getAllCompanies() {
		return null;
	}

	@Override
	public Company getOneCompany(int CompanyId) throws CouponSystemException {
		if (companies == null) {
			try {
				companies = new ArrayList<Company>();
			} catch (Exception e) {
				throw new CouponSystemException("Error, the companies have not been initialized yet.");
			}
		}
		try {

			for (Company company : companies) {
				if (CompanyId == company.getId()) {
					return company;
				}
			}
		} catch (Exception e) {
			throw new CouponSystemException("Error, Company does not exist in database.");
		}
	}

}
