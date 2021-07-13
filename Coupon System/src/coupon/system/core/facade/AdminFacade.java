package coupon.system.core.facade;

import java.util.ArrayList;

import coupon.system.core.beans.Company;
import coupon.system.core.beans.Customer;
import coupon.system.core.dao.CompaniesDAODb;
import coupon.system.core.dao.CouponsDAODb;
import coupon.system.core.dao.CustomersDAODb;
import coupon.system.core.exceptions.CouponSystemException;

public class AdminFacade extends ClientFacade {

	public AdminFacade() {
		companiesDao = new CompaniesDAODb();
		customersDao = new CustomersDAODb();
		couponsDao = new CouponsDAODb();
	}

	@Override
	public boolean login(String email, String password) {
		try {
			companiesDao.isCompanyExist(email, password);
			return true;
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public void addCompany(Company company) {

	}

	public void updateCompany(Company company) {

	}

	public void deleteCompany(int companyId) {

	}

	public ArrayList<Company> getAllCompanies() {

	}

	public Company getOneCompany(int companyId) {

	}

	public void addCustomer(Customer customer) {

	}

	public void updateCustomer(Customer customer) {

	}

	public void deleteCustomer(int customerId) {

	}

	public ArrayList<Customer> getAllCustomers() {

	}

	public Customer getOneCustomer(int customerId) {

	}

}
