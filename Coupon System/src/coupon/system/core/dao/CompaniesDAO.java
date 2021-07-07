package coupon.system.core.dao;

import java.util.ArrayList;

import coupon.system.core.Company;
import coupon.system.core.exceptions.CouponSystemException;

public interface CompaniesDAO {

	boolean isCompanyExist(String email, String password) throws CouponSystemException;

	void addCompany(Company company);

	void updateCompany(Company company);

	void deleteCompany(Company company);

	ArrayList<Company> getAllCompanies();

	Company getOneCompany(int CompanyId) throws CouponSystemException;

}
