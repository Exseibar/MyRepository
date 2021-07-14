package coupon.system.core.facade;

import java.util.List;

import coupon.system.core.beans.Company;
import coupon.system.core.beans.Customer;
import coupon.system.core.dao.CompaniesDAODb;
import coupon.system.core.dao.CustomersDAODb;
import coupon.system.core.exceptions.CouponSystemException;

public class AdminFacade extends ClientFacade {

	public AdminFacade() {
		companiesDao = new CompaniesDAODb();
		customersDao = new CustomersDAODb();
	}

	/**
	 * this method will set the field {@link #loggedIn} to true if returns true.
	 * 
	 * @param email    The email of the that is entered
	 *
	 * @param password The password that is entered
	 * 
	 * @return if the credentials entered are equal to the admin's.
	 */
	@Override
	public boolean login(String email, String password) {
		if (email == "admin@admin.com" && password == "admin") {
			System.out.println("Welcome adminstrator");
			return true;
		}
		System.out.println("login failed");
		return false;

	}

	/**
	 * This method checks if a company already exists and if not , adds it.
	 * 
	 * @param company
	 * 
	 * @throws CouponSystemException
	 */
	public void addCompany(Company company) throws CouponSystemException {
		try {
			if (companiesDao.isCompanyExist(company.getEmail(), company.getPassword())) {
				throw new CouponSystemException("add company failed. email already exists in db");
			}
			companiesDao.addCompany(company);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}

	}

	public void updateCompany(Company company) {
		try {
			companiesDao.updateCompany(company);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}

	}

	public void deleteCompany(int companyId) {
		try {
			companiesDao.deleteCompany(companyId);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Company> getAllCompanies() throws CouponSystemException {

		return companiesDao.getAllCompanies();

	}

	public Company getOneCompany(int companyId) throws CouponSystemException {
		return companiesDao.getOneCompany(companyId);
	}

	public void addCustomer(Customer customer) {

		try {
			customersDao.addCustomer(customer);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}

	}

	public void updateCustomer(Customer customer) {
		try {
			customersDao.updateCustomer(customer);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteCustomer(int customerId) {
		try {
			customersDao.deleteCustomer(customerId);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
		}

	}

	public List<Customer> getAllCustomers() throws CouponSystemException {
		return customersDao.getAllCustomers();
	}

	public Customer getOneCustomer(int customerId) throws CouponSystemException {
		return customersDao.getOneCustomer(customerId);
	}

}
