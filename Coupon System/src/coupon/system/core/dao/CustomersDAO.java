package coupon.system.core.dao;

import coupon.system.core.beans.Customer;
import coupon.system.core.exceptions.CouponSystemException;

import java.util.List;

public interface CustomersDAO {

	public boolean isCustomerExist(String email, String password) throws CouponSystemException;

	void addCustomer(Customer Customer) throws CouponSystemException;

	void updateCustomer(Customer Customer) throws  CouponSystemException;

	void deleteCustomer(int customerId) throws CouponSystemException;

	List<Customer> getAllCustomers() throws CouponSystemException;

	Customer getOneCustomer(int CustomerId) throws CouponSystemException;

}
