<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Minh Mon store</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

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
    >

    </script>

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


<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/BroadServlet">

            <div class="sidebar-brand-text mx-3">Chào quản lý: Cự Đinh </div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="index.jsp">
                <i class="fas fa-fw fa-tachometer-alt"></i>
                <span>Trang chủ</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Mục nâng cao
        </div>

        <!-- Nav Item - Pages Collapse Menu -->
        <li class="nav-item">
            <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
               aria-expanded="true" aria-controls="collapseTwo">
                <i class="fas fa-fw fa-cog"></i>
                <span>Tuỳ chọn</span>
            </a>
            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                <div class="bg-white py-2 collapse-inner rounded">
                    <h6 class="collapse-header">Tuỳ chọn nâng cao: </h6>
                    <a class="collapse-item" href="/HistoryExportServlet">Lịch sử mua
                    </a>
                    <a class="collapse-item" href="/ImportExportServlet">Thông tin xuất kho</a>
                </div>
            </div>
        </li>

        <!-- Nav Item - Utilities Collapse Menu -->
        <!--            <li class="nav-item">-->
        <!--                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"-->
        <!--                    aria-expanded="true" aria-controls="collapseUtilities">-->
        <!--                    <i class="fas fa-fw fa-wrench"></i>-->
        <!--                    <span>Utilities</span>-->
        <!--                </a>-->
        <!--                <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"-->
        <!--                    data-parent="#accordionSidebar">-->
        <!--                    <div class="bg-white py-2 collapse-inner rounded">-->
        <!--                        <h6 class="collapse-header">Custom Utilities:</h6>-->
        <!--                        <a class="collapse-item" href="utilities-color.html">Colors</a>-->
        <!--                        <a class="collapse-item" href="utilities-border.html">Borders</a>-->
        <!--                        <a class="collapse-item" href="utilities-animation.html">Animations</a>-->
        <!--                        <a class="collapse-item" href="utilities-other.html">Other</a>-->
        <!--                    </div>-->
        <!--                </div>-->
        <!--            </li>-->

        <!-- Divider -->
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Tuỳ chọn nhanh
        </div>

        <!-- Nav Item - Pages Collapse Menu -->
        <!--            <li class="nav-item">-->
        <!--                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"-->
        <!--                    aria-expanded="true" aria-controls="collapsePages">-->
        <!--                    <i class="fas fa-fw fa-folder"></i>-->
        <!--                    <span>Pages</span>-->
        <!--                </a>-->
        <!--                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">-->
        <!--                    <div class="bg-white py-2 collapse-inner rounded">-->
        <!--                        <h6 class="collapse-header">Login Screens:</h6>-->
        <!--                        <a class="collapse-item" href="login.jsp">Login</a>-->
        <!--                        <a class="collapse-item" href="register.html">Register</a>-->
        <!--                        <a class="collapse-item" href="forgot-password.html">Forgot Password</a>-->
        <!--                        <div class="collapse-divider"></div>-->
        <!--                        <h6 class="collapse-header">Other Pages:</h6>-->
        <!--                        <a class="collapse-item" href="blank.jsp">Blank Page</a>-->
        <!--                    </div>-->
        <!--                </div>-->
        <!--            </li>-->

        <!-- Nav Item - Charts -->

        <!-- Nav Item - Tables -->
        <li class="nav-item">
            <a class="nav-link" href="/ShowProductsServlet">
                <i class="fas fa-fw fa-table"></i>
                <span>Sản phẩm</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ShowWarehouseServlet">
                <i class="fas fa-fw fa-table"></i>
                <span>Kho</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">

        <!-- Sidebar Toggler (Sidebar) -->
        <div class="text-center d-none d-md-inline">
            <button class="rounded-circle border-0" id="sidebarToggle"></button>
        </div>



    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>

                <!-- Topbar Search -->
                <form
                        class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
                    <div class="input-group">
                        <input type="text" class="form-control bg-light border-0 small" placeholder="Tìm kiếm ..."
                               aria-label="Search" aria-describedby="basic-addon2">
                        <div class="input-group-append">
                            <button class="btn btn-primary" type="button">
                                <i class="fas fa-search fa-sm"></i>
                            </button>
                        </div>
                    </div>
                </form>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">


                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
<%--                            name user--%>
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small">Douglas McGee</span>
                            <img class="img-profile rounded-circle"
                                 src="img/undraw_profile.svg">
                        </a>
                        <!-- Dropdown - User Information -->
                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="userDropdown">
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                Thông tin tài khoản
                            </a>
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                Cài đặt
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                Đăng xuất
                            </a>
                        </div>
                    </li>

                </ul>

            </nav>
            <!-- End of Topbar -->

            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <h1 class="h3 mb-2 text-gray-800">Lịch sử mua </h1>
                <div class="card shadow mb-4">
                <!-- DataTales Example -->

                    <div class="col-md-5 col-xl-4 offset-xl-1">

                        <div class="rounded d-flex flex-column p-2" style="background-color: #f8f9fa;">

                                <c:forEach items="${items}" var="item">
                                    <div class="border-top px-2 mx-2">
                                        <div class="p-2 d-flex">
                                            <div class="col-8">Username: <span>${item.userName}</span> </div>
                                        </div>

                                    <div class="p-2 d-flex">
                                        <div class="col-8">Tên sản phẩm: ${item.products.productName}</div>
                                        <div class="ms-auto">SL: ${item.quantity}</div>
                                    </div>
                                        <div class="p-2 d-flex">
                                            <div class="col-8">Ngày mua: ${item.date}</div>
                                        </div>

                                </div>
                                </c:forEach>

                        </div>

                    </div>


                </div>



            </div>

        </div>

        <!-- Footer -->
        <footer class="sticky-footer bg-white">
            <div class="container my-auto">
                <div class="copyright text-center my-auto">
                    <span>Copyright &copy; Quản lý kho hàng 2023</span>
                </div>
            </div>
        </footer>
        <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

</div>
<!-- End of Page Wrapper -->

<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>

<!-- Logout Modal-->
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Chắc chắn đăng xuất ?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Chọn "đăng xuất" nếu bạn thực sự muốn đăng xuất ra ngoài</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Huỷ</button>
                <a class="btn btn-primary" href="/logout">Đăng xuất</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="/js/demo/chart-area-demo.js"></script>
<script src="/js/demo/chart-pie-demo.js"></script>

</body>

</html>