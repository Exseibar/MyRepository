package coupon.system.core.dao;

import coupon.system.core.beans.Coupon;
import coupon.system.core.exceptions.CouponSystemException;

import java.util.List;

public interface CouponsDAO {

    void addCoupon(Coupon coupon) throws CouponSystemException;

    void updateCoupon(Coupon coupon) throws  CouponSystemException;

    void deleteCoupon(int couponId) throws CouponSystemException;

    List<Coupon> getAllCoupons() throws CouponSystemException;

    Coupon getOneCoupon(int couponId) throws CouponSystemException;

    void addCouponPurchase(int customerId, int couponId) throws CouponSystemException;

    void deleteCouponPurchase(int customerId, int couponId) throws CouponSystemException;
}
