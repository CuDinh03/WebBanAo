<%@ page import="com.example.quanlykho.model.Products" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.quanlykho.dao.CRUD_Products" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ASM4</title>

    <!-- Custom fonts for this template-->
    <link href="/adminView/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/adminView/css/sb-admin-2.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>

        .row {
            display: -ms-flexbox; /* IE10 */
            display: flex;
            -ms-flex-wrap: wrap; /* IE10 */
            flex-wrap: wrap;
            margin: 0 -16px;
        }

        .col-25 {
            -ms-flex: 25%; /* IE10 */
            flex: 25%;
        }

        .col-50 {
            -ms-flex: 50%; /* IE10 */
            flex: 50%;
        }

        .col-75 {
            -ms-flex: 75%; /* IE10 */
            flex: 75%;
        }

        .col-25,
        .col-50,
        .col-75 {
            padding: 0 16px;
        }

        .btn {
            background-color: #04AA6D;
            color: white;
            padding: 12px;
            margin: 10px 0;
            border: none;
            width: 20%;
            border-radius: 3px;
            cursor: pointer;
            font-size: 17px;
        }


        .container {
            background-color: #f2f2f2;
            padding: 5px 20px 15px 20px;
            border: 1px solid lightgrey;
            border-radius: 3px;
        }

        input[type=text] {
            width: 100%;
            margin-bottom: 20px;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        label {
            margin-bottom: 10px;
            display: block;
        }

        .icon-container {
            margin-bottom: 20px;
            padding: 7px 0;
            font-size: 24px;
        }


        a {
            color: #2196F3;
        }

        hr {
            border: 1px solid lightgrey;
        }

        span.price {
            float: right;
            color: grey;
        }

        /* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
        @media (max-width: 800px) {
            .row {
                flex-direction: column-reverse;
            }

            .col-25 {
                margin-bottom: 20px;
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

            <div class="sidebar-brand-text mx-3">Chào quản lý: Cự Đinh</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <!-- Nav Item - Dashboard -->
        <li class="nav-item active">
            <a class="nav-link" href="/BroadServlet">
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
                <h1 class="h3 mb-2 text-gray-800">Thông tin nhập xuất kho</h1>

                <div class="row">
                    <div class="col-75">
                        <div class="container">
                            <form action="/ImportExportServlet" method="post">

                                <div class="row">
                                    <div class="col-50">
                                        <h3>Chi tiết phiếu xuất </h3>
                                        <label for="prCode"><i class="fa fa-user"></i>Tên sản phẩm </label>
                                        <select name="prCode" id="prCode">
                                            <c:forEach items="${products}" var="p">
                                            <option value="${p.productName}" >${p.productName}</option>

                                            </c:forEach>
                                        </select>
                                        <div class="row">
                                            <div class="col-50">
                                                <label for="prQuantity">Số lượng muốn xuất</label>
                                                <input type="number" id="prQuantity" name="prQuantity" placeholder="00">
                                            </div>
                                        </div>

                                    </div>
                                </div>
                                <button id="save" type="submit" class="btn" formmethod="post" ></button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

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
<script>
    $(document).ready(function() {
        var successMsg = '<div class="alert alert-success alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Xuất kho thành công!</strong>' +
            '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</button>' +
            '</div>';

        var errorMsg = '<div class="alert alert-danger alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Xuất kho không thành công!</strong>' +
            '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</button>' +
            '</div>';

        $("#save").click(function(event) {
            event.preventDefault();

            $.ajax({
                type: "POST",
                url: "/ImportExportServlet",
                data: $('form').serialize(),
                success: function(data) {
                    $('#createModal').modal('hide');
                    $('body').append(successMsg);
                    location.reload();
                },
                error: function() {
                    $('#createModal').modal('hide');
                    $('body').append(errorMsg);
                    location.reload();
                }
            });
        });
    });



</script>


<!-- Bootstrap core JavaScript-->
<script src="/adminView/vendor/jquery/jquery.min.js"></script>
<script src="/adminView/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/adminView/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/adminView/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/adminView/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="/adminView/js/demo/chart-area-demo.js"></script>
<script src="/adminView/js/demo/chart-pie-demo.js"></script>
</body>

</html>