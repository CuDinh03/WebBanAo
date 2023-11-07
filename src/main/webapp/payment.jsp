<%--
Created by IntelliJ IDEA.
User: maccuacu
Date: 06/07/2023
Time: 11:53
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>BoyPho Shop</title>

  <link
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
          rel="stylesheet"
  />
  <!-- Google Fonts -->
  <link
          href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
          rel="stylesheet"
  />
  <!-- MDB -->
  <link
          href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.css"
          rel="stylesheet"
  />

  <!-- MDB -->
  <script
          type="text/javascript"
          src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.js"
  ></script>

  <style>
    @media (min-width: 1025px) {
      .h-custom {
        height: 100vh !important;
      }
    }

    .card-registration .select-input.form-control[readonly]:not([disabled]) {
      font-size: 1rem;
      line-height: 2.15;
      padding-left: .75em;
      padding-right: .75em;
    }

    .card-registration .select-arrow {
      top: 13px;
    }

    .bg-grey {
      background-color: #eae8e8;
    }

    @media (min-width: 992px) {
      .card-registration-2 .bg-grey {
        border-top-right-radius: 16px;
        border-bottom-right-radius: 16px;
      }
    }

    @media (max-width: 991px) {
      .card-registration-2 .bg-grey {
        border-bottom-left-radius: 16px;
        border-bottom-right-radius: 16px;
      }
    }
  </style>
</head>

<body>

<section style="background-color: #eee;">
  <div class="container py-5">
    <div class="card">
      <div class="card-body">
        <div class="row d-flex justify-content-center pb-5">
          <div class="col-md-7 col-xl-5 mb-4 mb-md-0">
            <div class="py-4 d-flex flex-row">
              <h5><span class="far fa-check-square pe-2"></span><b>Hoá đơn</b> |</h5>
              <span class="ps-2">Thanh toán</span>
            </div>
            <hr />
            <div class="pt-2">
              <div class="d-flex pb-2">
                <div>
                </div>
                <div class="ms-auto">
                  <p class="text-primary">
                    <i class="fas fa-plus-circle text-primary pe-1"></i>Thêm phương thức thanh toán
                  </p>
                </div>
              </div>
              <form class="pb-3" action="/saveOrder" method="post">
                <div class="d-flex flex-row pb-3">
                  <div class="d-flex align-items-center pe-2">
                    <input class="form-check-input" type="radio" name="radioNoLabel" id="radioNoLabel1"
                           value="" aria-label="..." checked />
                  </div>
                  <div class="rounded border d-flex w-100 p-3 align-items-center">
                    <p class="mb-0">
                      <i class="fab fa-cc-visa fa-lg text-primary pe-2"></i>Visa Debit
                      Card
                    </p>
                    <div class="ms-auto">************3456</div>
                  </div>
                </div>
                <input type="hidden" name="userid" value="${sessionScope.user.id}">
                <input type="hidden" name="total_amount" value="${totalPriceAfter}">
                <input type="hidden" name="status" value="1">


                <div class="d-flex flex-row">
                  <div class="d-flex align-items-center pe-2">
                    <input class="form-check-input" type="radio" name="radioNoLabel" id="radioNoLabel2"
                           value="" aria-label="..." />
                  </div>
                  <div class="rounded border d-flex w-100 p-3 align-items-center">
                    <p class="mb-0">
                      <i class="fab fa-cc-mastercard fa-lg text-dark pe-2"></i>Mastercard
                      Card
                    </p>
                    <div class="ms-auto">************1038</div>
                  </div>
                </div>
                <button type="submit"  class="btn btn-primary btn-block btn-lg" >Thanh toán  </button>
              </form>
            </div>
          </div>

          <div class="col-md-5 col-xl-4 offset-xl-1">
            <div class="py-4 d-flex justify-content-end">
              <h6><a href="/store" >Huỷ thanh toán quay trở lại trang chủ</a></h6>
            </div>
            <div class="rounded d-flex flex-column p-2" style="background-color: #f8f9fa;">
              <div class="p-2 me-3">
                <h4>Hoá đơn chi tiết </h4>
              </div>

              <div class="p-2 d-flex">
                <div class="col-8">Tên khách hàng  </div>
                <div class="ms-auto">${sessionScope.account.accountName}</div>
              </div>

              <div class="p-2 d-flex">
                <div class="col-8">Tổng đơn giá </div>
                <div class="ms-auto">${totalPrice}</div>
              </div>

<c:forEach var="items" items="${sessionScope.cart}">
              <div class="p-2 d-flex">
                <div class="col-8">${items.products.productName} | SL ${items.quantity}</div>
                <div class="ms-auto">${items.products.productPrice * items.quantity}</div>
              </div>
</c:forEach>

              <div class="p-2 d-flex">
                <div class="col-8">Thuế( 10% )</div>
                <div class="ms-auto">${tax}</div>
              </div>
              <div class="p-2 d-flex">
                <div class="col-8">Phí vận chuyển</div>
                <div class="ms-auto">+ 25000 vnd</div>
              </div>

            </div>
            <div class="border-top px-2 mx-2"></div>
            <div class="p-2 d-flex pt-3">
              <div class="col-8">Đơn giá</div>
              <div class="ms-auto"><b>${totalPriceShip}</b></div>
            </div>
            <div class="p-2 d-flex">
              <div class="col-8">
                Sau thuế <span class="fa fa-question-circle text-dark"></span>
              </div>
              <div class="ms-auto"><b>${totalPriceAfter}</b></div>
            </div>
            <div class="border-top px-2 mx-2"></div>
            <div class="p-2 d-flex pt-3">
              <div class="col-8"><b>Tổng đơn</b></div>
              <div class="ms-auto"><b class="text-success">${totalPriceAfter}</b></div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  </div>
</section>

</body>
</html>
