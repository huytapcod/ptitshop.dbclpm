# PTITShop DBCLPM

RESTful API backend cho hệ thống thương mại điện tử **PTITShop**.

## Công nghệ sử dụng

* Java 17
* Spring Boot
* Spring Security + JWT
* Spring Data JPA
* MySQL
* Maven
* VNPay Payment Gateway

---

## Chức năng chính

### Người dùng

* Đăng ký / đăng nhập
* Xác thực OTP email
* Quản lý thông tin cá nhân
* Quản lý địa chỉ giao hàng
* Yêu thích sản phẩm
* Lịch sử xem sản phẩm
* Giỏ hàng
* Đặt hàng
* Thanh toán VNPay
* Đánh giá sản phẩm

### Admin

* Quản lý danh mục
* Quản lý sản phẩm
* Quản lý voucher
* Quản lý đơn hàng
* Thống kê doanh thu
* Thống kê khách hàng

---

## RESTful API

## 1. Auth

POST `/api/v1/auth/register`
POST `/api/v1/auth/login`
POST `/api/v1/auth/verify-otp`
POST `/api/v1/auth/resend-otp`
POST `/api/v1/auth/refresh-token`
POST `/api/v1/auth/logout`

## 2. Users

GET `/api/v1/users/me`
PUT `/api/v1/users/me`
PUT `/api/v1/users/me/password`
DELETE `/api/v1/users/me`

## 3. Products

GET `/api/v1/products`
GET `/api/v1/products/{id}`
GET `/api/v1/products/newest`
GET `/api/v1/products/best-sellers`

Example:

GET `/api/v1/products?page=1&size=10&keyword=iphone&categoryId=2&sort=price,asc`

## 4. Cart

GET `/api/v1/carts/me`
POST `/api/v1/carts/me/items`

## 5. Orders

POST `/api/v1/orders`
GET `/api/v1/orders`

## 6. Payments

POST `/api/v1/payments/vnpay/create`

---

## Cách chạy project

```bash
mvn clean install
mvn spring-boot:run
```

---

## Tác giả

PTIT HCM - Đồ án DBCLPM
