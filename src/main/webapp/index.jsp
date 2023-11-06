<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Minh Mon store</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Playfair+Display:wght@700;900&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<!-- Spinner Start -->
<div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
    <div class="spinner-border text-primary" role="status" style="width: 3rem; height: 3rem;"></div>
</div>
<!-- Spinner End -->


<!-- Navbar Start -->
<div class="container-fluid bg-white sticky-top">
    <div class="container">
        <nav class="navbar navbar-expand-lg bg-white navbar-light py-2 py-lg-0">
            <!--                login-->
            <a href="/home" class="navbar-brand">
                <!--                    <img class="img-fluid" src="img/logo.png" alt="Logo">-->

            </a>
            <button type="button" class="navbar-toggler ms-auto me-0" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarCollapse">
                <div class="navbar-nav ms-auto">
                    <a href="/BroadServlet" class="nav-item nav-link active">Trang chủ</a>
                    <a href="/store" methods="get" class="nav-item nav-link">Cửa hàng</a>
                </div>
                <div class="border-start ps-4 d-none d-lg-block">
                    <a type="button" href="CartServlet"  class="btn btn-sm p-0"><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
                    </svg></a>


                </div>
                <div class="ps-5 d-non d-lg-block">
                    <div class="nav-item dropdown">
                        <a href="#" type="button" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
                            <path d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6Zm2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0Zm4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4Zm-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10c-2.29 0-3.516.68-4.168 1.332-.678.678-.83 1.418-.832 1.664h10Z"/>
                        </svg></a>
                        <div class="dropdown-menu bg-light rounded-0 m-0">
                            <% if (request.getSession().getAttribute("user")== null){ %>
                            <a href="/LoginServlet" class="dropdown-item">Đăng nhập</a>
                            <a href="/signup" class="dropdown-item">Đăng ký</a>
                            <%}%>
                            <% if (request.getSession().getAttribute("user")!= null){ %>

                            <a  class="dropdown-item" href="/logout">Logout </a></li>
                            <%}%>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<!-- Navbar End -->


<!-- Carousel Start -->
<div class="container-fluid px-0 mb-5">
    <div id="header-carousel" class="carousel slide carousel-fade" data-bs-ride="carousel">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img class="w-100" src="img/background.jpg" alt="Image">
                <div class="carousel-caption">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7 text-center">
                                <p class="fs-4 text-white animated zoomIn">Chào mừng đến với <strong class="text-dark">Minh Mon store</strong></p>
                                <h1 class="display-1 text-dark mb-4 animated zoomIn">Quần áo boi phố số 1 Việt Nam</h1>
                                <a href="" class="btn btn-light rounded-pill py-3 px-5 animated zoomIn">Xem thêm</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <img class="w-100" src="img/bg2.jpg" alt="Image">
                <div class="carousel-caption">
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7 text-center">
                                <p class="fs-4 text-white animated zoomIn">Chào mừng đến với <strong class="text-dark">Minh Mon store</strong></p>
                                <h1 class="display-1 text-dark mb-4 animated zoomIn">Quần áo boi phố số 1 Việt Nam</h1>
                                <a href="" class="btn btn-light rounded-pill py-3 px-5 animated zoomIn">Xem thêm</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#header-carousel"
                data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#header-carousel"
                data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</div>
<!-- Carousel End -->


<!-- About Start -->
<div class="container-xxl py-5">
    <div class="container">
        <div class="row g-5">
            <div class="col-lg-6">
                <div class="row g-3">
                    <div class="col-6 text-end">
                        <img class="img-fluid bg-white w-100 mb-3 wow fadeIn" data-wow-delay="0.1s" src="img/aboutus1.jpg" alt="">
                        <img class="img-fluid bg-white w-50 wow fadeIn" data-wow-delay="0.2s" src="img/ab2.jpg" alt="">
                    </div>
                    <div class="col-6">
                        <img class="img-fluid bg-white w-50 mb-3 wow fadeIn" data-wow-delay="0.3s" src="img/ab3.jpg" alt="">
                        <img class="img-fluid bg-white w-100 wow fadeIn" data-wow-delay="0.4s" src="img/ab4.jpg" alt="">
                    </div>
                </div>
            </div>
            <div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                <div class="section-title">
                    <p class="fs-5 fw-medium fst-italic text-primary">Về chúng tôi</p>
                    <h1 class="display-6">Thành công bây giờ được tĩnh luỹ qua 25 năm kinh nghiệm</h1>
                </div>
                <div class="row g-3 mb-4">
                    <div class="col-sm-4">
                        <img class="img-fluid bg-white w-100" src="img/ab5.jpg" alt="">
                    </div>
                    <div class="col-sm-8">
                        <h5>Chất lượng sản phẩm số 1 Việt Nam</h5>
                        <p class="mb-0">Với hơn 1000 chuỗi cửa hàng có mặt trên khắp lãnh thổ Việt Nam</p>
                    </div>
                </div>
                <div class="border-top mb-4"></div>
                <div class="row g-3">
                    <div class="col-sm-8">
                        <h5>Sản phẩm được mặc hằng ngày tại Việt Nam</h5>
                        <p class="mb-0">Với hơn 5 triệu người mặc tại Việt Nam</p>
                    </div>
                    <div class="col-sm-4">
                        <img class="img-fluid bg-white w-100" src="img/ab6.jpg" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- About End -->


<!-- Products Start -->
<div class="container-fluid product py-5 my-5">
    <div class="container py-5">
        <div class="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
            <p class="fs-5 fw-medium fst-italic text-primary">Sản phẩm của chúng tôi</p>
            <h1 class="display-6">Thiết kế mang lại cảm giác thoải mái nhất</h1>
        </div>
        <div class="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">
            <a href="" class="d-block product-item rounded">
                <img src="img/hong.jpeg" alt="">
                <div class="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                    <h4 class="text-primary">Pink Polo</h4>
                    <span class="text-body">Phong cách mới mẻ</span>
                </div>
            </a>
            <a href="" class="d-block product-item rounded">
                <img src="img/denTron.jpeg" alt="">
                <div class="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                    <h4 class="text-primary">Black Polo</h4>
                    <span class="text-body">Tối giản lịch sự</span>
                </div>
            </a>
            <a href="" class="d-block product-item rounded">
                <img src="img/midgreen.jpeg" alt="">
                <div class="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                    <h4 class="text-primary">Polo midgreen</h4>
                    <span class="text-body">Tươi mới, sáng tạo</span>
                </div>
            </a>
            <a href="" class="d-block product-item rounded">
                <img src="img/vang.jpeg" alt="">
                <div class="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                    <h4 class="text-primary">Polo Vàng </h4>
                    <span class="text-body">Năng động trẻ trung</span>
                </div>
            </a>
        </div>
    </div>
</div>
<!-- Products End -->


<!-- Article Start -->
<div class="container-xxl py-5">
    <div class="container">
        <div class="row g-5">
            <div class="col-lg-5 wow fadeIn" data-wow-delay="0.1s">
                <img class="img-fluid" src="img/ab7.jpg" alt="">
            </div>
            <div class="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                <div class="section-title">
                    <p class="fs-5 fw-medium fst-italic text-primary">Áo polo</p>
                    <h1 class="display-6">Lịch sử phát triển</h1>
                </div>
                <p class="mb-4">
                    Đi lên từ một xưởng may nhỏ của 1 góc Hà Nội.
                </p>
                <p class="mb-4">
                    Với tầm nhìn và sự linh hoạt đối với xu hướng hiện nay, chúng tôi đã vươn lên thành thương hiệu số 1 tại Việt Nam.
                </p>
                <a href="" class="btn btn-primary rounded-pill py-3 px-5">Đọc thêm</a>
            </div>
        </div>
    </div>
</div>
<!-- Article End -->

<!-- Store Start -->
<div class="container-xxl py-5">
    <div class="container">
        <div class="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
            <p class="fs-5 fw-medium fst-italic text-primary">Online Store</p>
            <h1 class="display-6">Muốn thoải mái khi diện đồ? Mặc áo của chúng tôi</h1>
        </div>
        <div class="row g-4">
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                <div class="store-item position-relative text-center">
                    <img class="img-fluid" src="img/midgreen.jpeg" alt="">
                    <div class="p-4">
                        <div class="text-center mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <h4 class="mb-3">Polo midgreen</h4>
                        <p>Năng động trẻ trung</p>
                        <h4 class="text-primary">200.000 vnđ</h4>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
                <div class="store-item position-relative text-center">
                    <img class="img-fluid" src="img/vang.jpeg" alt="">
                    <div class="p-4">
                        <div class="text-center mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <h4 class="mb-3">Polo vàng</h4>
                        <p>Thích hợp với các bạn da trắng</p>
                        <h4 class="text-primary">200.000 vnđ</h4>
                    </div>

                </div>
            </div>
            <div class="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
                <div class="store-item position-relative text-center">
                    <img class="img-fluid" src="img/kem.jpeg" alt="">
                    <div class="p-4">
                        <div class="text-center mb-3">
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                            <small class="fa fa-star text-primary"></small>
                        </div>
                        <h4 class="mb-3">Polo kem </h4>
                        <p>Phù hợp với mọi người </p>
                        <h4 class="text-primary">200.000 vnđ</h4>
                    </div>

                </div>
            </div>
            <div class="col-12 text-center wow fadeInUp" data-wow-delay="0.1s">
                <a href="" class="btn btn-primary rounded-pill py-3 px-5">Xem Thêm</a>
            </div>
        </div>
    </div>
</div>
<!-- Store End -->


<!-- Contact Start -->
<div class="container-xxl contact py-5">
    <div class="container">
        <div class="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s" style="max-width: 500px;">
            <p class="fs-5 fw-medium fst-italic text-primary">Liên hệ với chúng tôi</p>
            <h1 class="display-6">Liên hệ với chúng tôi ngay</h1>
        </div>
        <div class="row justify-content-center wow fadeInUp" data-wow-delay="0.1s">
            <div class="col-lg-8">
                <p class="text-center mb-5">Để nhận thêm sự hỗ trợ về phía đội ngũ </p>
                <div class="row g-5">
                    <div class="col-md-4 text-center wow fadeInUp" data-wow-delay="0.3s">
                        <div class="btn-square mx-auto mb-3">
                            <i class="fa fa-envelope fa-2x text-white"></i>
                        </div>
                        <p class="mb-2">minhmontlu@gmail.com</p>
                        <p class="mb-0">minhmonstore@example.com</p>
                    </div>
                    <div class="col-md-4 text-center wow fadeInUp" data-wow-delay="0.4s">
                        <div class="btn-square mx-auto mb-3">
                            <i class="fa fa-phone fa-2x text-white"></i>
                        </div>
                        <p class="mb-2">+012 345 67890</p>
                        <p class="mb-0">+012 345 67890</p>
                    </div>
                    <div class="col-md-4 text-center wow fadeInUp" data-wow-delay="0.5s">
                        <div class="btn-square mx-auto mb-3">
                            <i class="fa fa-map-marker-alt fa-2x text-white"></i>
                        </div>
                        <p class="mb-2">123 Street</p>
                        <p class="mb-0">New York, USA</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Contact Start -->


<!-- Footer Start -->
<div class="container-fluid bg-dark footer mt-5 py-5 wow fadeIn" data-wow-delay="0.1s">
    <div class="container py-5">
        <div class="row g-5">
            <div class="col-lg-3 col-md-6">
                <h4 class="text-primary mb-4">Văn phòng</h4>
                <p class="mb-2"><i class="fa fa-map-marker-alt text-primary me-3"></i>123 Street, New York, USA</p>
                <p class="mb-2"><i class="fa fa-phone-alt text-primary me-3"></i>+012 345 67890</p>
                <div class="d-flex pt-3">
                    <a class="btn btn-square btn-primary rounded-circle me-2" href=""><i class="fab fa-twitter"></i></a>
                    <a class="btn btn-square btn-primary rounded-circle me-2" href=""><i class="fab fa-facebook-f"></i></a>
                    <a class="btn btn-square btn-primary rounded-circle me-2" href=""><i class="fab fa-youtube"></i></a>
                    <a class="btn btn-square btn-primary rounded-circle me-2" href=""><i class="fab fa-linkedin-in"></i></a>
                </div>
            </div>
            <div class="col-lg-3 col-md-6">
                <h4 class="text-primary mb-4">Đường dẫn nhanh</h4>
                <a class="btn btn-link" href="">Về chúng tôi</a>
                <a class="btn btn-link" href="">Liên hệ</a>
                <a class="btn btn-link" href="">Dịch vụ</a>
                <a class="btn btn-link" href="">Hỗ trợ</a>
            </div>
            <div class="col-lg-3 col-md-6">
                <h4 class="text-primary mb-4">Giờ làm việc</h4>
                <p class="mb-1">Thứ 2 - Thứ 6</p>
                <h6 class="text-light">09:00 sáng - 07:00 chiều</h6>
                <p class="mb-1">Thứ 7</p>
                <h6 class="text-light">09:00 sáng - 12:00 chiều</h6>
                <p class="mb-1">Chủ nhật</p>
                <h6 class="text-light">Đóng cửa</h6>
            </div>
            <div class="col-lg-3 col-md-6">
                <h4 class="text-primary mb-4">Nhận thông tin mới</h4>
                <div class="position-relative w-100">
                    <input class="form-control bg-transparent w-100 py-3 ps-4 pe-5" type="text" placeholder="Your email">
                    <a type="button" href="/signup" class="btn btn-primary py-2 position-absolute top-0 end-0 mt-2 me-2">Đăng ký</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Footer End -->


<!-- Copyright Start -->
<div class="container-fluid copyright py-4">
    <div class="container">
        <div class="row">
            <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                &copy; <a class="fw-medium" href="#">Minh Mon shop</a>, All Right Reserved.
            </div>
            <!--                <div class="col-md-6 text-center text-md-end">-->
            <!--                    &lt;!&ndash;/*** This template is free as long as you keep the footer author’s credit link/attribution link/backlink. If you'd like to use the template without the footer author’s credit link/attribution link/backlink, you can purchase the Credit Removal License from "https://htmlcodex.com/credit-removal". Thank you for your support. ***/&ndash;&gt;-->
            <!--                    Designed By <a class="fw-medium" href="https://htmlcodex.com">HTML Codex</a> Distributed By <a class="fw-medium" href="https://themewagon.com">ThemeWagon</a>-->
            <!--                </div>-->
        </div>
    </div>
</div>
<!-- Copyright End -->


<!-- Back to Top -->
<a href="#" class="btn btn-lg btn-primary btn-lg-square rounded-circle back-to-top"><i class="bi bi-arrow-up"></i></a>


<!-- JavaScript Libraries -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="lib/wow/wow.min.js"></script>
<script src="lib/easing/easing.min.js"></script>
<script src="lib/waypoints/waypoints.min.js"></script>
<script src="lib/owlcarousel/owl.carousel.min.js"></script>

<!-- Template Javascript -->
<script src="js/main.js"></script>
</body>

</html>