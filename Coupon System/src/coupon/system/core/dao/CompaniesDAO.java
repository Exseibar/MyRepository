package coupon.system.core.dao;

import java.util.List;

import coupon.system.core.beans.Company;
import coupon.system.core.exceptions.CouponSystemException;

public interface CompaniesDAO {

	public boolean isCompanyExist(String email, String password) throws CouponSystemException;

	void addCompany(Company company) throws CouponSystemException;

	void updateCompany(Company company) throws  CouponSystemException;

	void deleteCompany(int companyId) throws CouponSystemException;

	List<Company> getAllCompanies() throws CouponSystemException;

	Company getOneCompany(int CompanyId) throws CouponSystemException;

}
