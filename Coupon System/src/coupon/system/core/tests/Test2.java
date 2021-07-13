package coupon.system.core.tests;
import coupon.system.core.beans.Category;
import coupon.system.core.beans.Company;
import coupon.system.core.beans.Coupon;
import coupon.system.core.beans.Customer;
import coupon.system.core.dao.*;
import coupon.system.core.exceptions.CouponSystemException;

import java.time.LocalDate;

public class Test2 {
    public static void main(String[] args) {
        CustomersDAO cusdb = new CustomersDAODb();
        CompaniesDAO comdb = new CompaniesDAODb();
        CouponsDAO coupondb = new CouponsDAODb();
        try{
//            coupondb.addCoupon(new Coupon(0,1, Category.FOOD, "ZIBI",
//                    "15% off", LocalDate.now(), LocalDate.now().plusMonths(1), 6, 69.99, "file"));
//            System.out.println(coupondb.getOneCoupon(2));
//            System.out.println(coupondb.getAllCoupons());
            coupondb.deleteCouponPurchase(1,2);
        }catch(CouponSystemException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}