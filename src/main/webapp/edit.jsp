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

    <title>Nhóm 4 - Quản lý kho hàng </title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

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
                    <a class="collapse-item" href="historyExport.jsp">Khu vực kho hàng</a>
                    <a class="collapse-item" href="/ImportExportServlet">Thông tin nhập xuất kho</a>
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
                <span>Thực phẩm</span></a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/ShowProductsServlet">
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

                    <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                    <li class="nav-item dropdown no-arrow d-sm-none">
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                             aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small"
                                           placeholder="Search for..." aria-label="Search"
                                           aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fas fa-search fa-sm"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </li>

                    <!-- Nav Item - Alerts -->
                    <li class="nav-item dropdown no-arrow mx-1">
                        <a class="nav-link dropdown-toggle" href="#" id="alertsDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-bell fa-fw"></i>
                            <!-- Counter - Alerts -->
                            <span class="badge badge-danger badge-counter">3+</span>
                        </a>
                        <!-- Dropdown - Alerts -->
                        <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="alertsDropdown">
                            <h6 class="dropdown-header">
                                Alerts Center
                            </h6>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="mr-3">
                                    <div class="icon-circle bg-primary">
                                        <i class="fas fa-file-alt text-white"></i>
                                    </div>
                                </div>
                                <div>
                                    <div class="small text-gray-500">December 12, 2019</div>
                                    <span class="font-weight-bold">A new monthly report is ready to download!</span>
                                </div>
                            </a>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="mr-3">
                                    <div class="icon-circle bg-success">
                                        <i class="fas fa-donate text-white"></i>
                                    </div>
                                </div>
                                <div>
                                    <div class="small text-gray-500">December 7, 2019</div>
                                    $290.29 has been deposited into your account!
                                </div>
                            </a>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="mr-3">
                                    <div class="icon-circle bg-warning">
                                        <i class="fas fa-exclamation-triangle text-white"></i>
                                    </div>
                                </div>
                                <div>
                                    <div class="small text-gray-500">December 2, 2019</div>
                                    Spending Alert: We've noticed unusually high spending for your account.
                                </div>
                            </a>
                            <a class="dropdown-item text-center small text-gray-500" href="#">Show All Alerts</a>
                        </div>
                    </li>

                    <!-- Nav Item - Messages -->
                    <li class="nav-item dropdown no-arrow mx-1">
                        <a class="nav-link dropdown-toggle" href="#" id="messagesDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-envelope fa-fw"></i>
                            <!-- Counter - Messages -->
                            <span class="badge badge-danger badge-counter">7</span>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="messagesDropdown">
                            <h6 class="dropdown-header">
                                Message Center
                            </h6>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="dropdown-list-image mr-3">
                                    <img class="rounded-circle" src="img/undraw_profile_1.svg"
                                         alt="...">
                                    <div class="status-indicator bg-success"></div>
                                </div>
                                <div class="font-weight-bold">
                                    <div class="text-truncate">Hi there! I am wondering if you can help me with a
                                        problem I've been having.
                                    </div>
                                    <div class="small text-gray-500">Emily Fowler · 58m</div>
                                </div>
                            </a>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="dropdown-list-image mr-3">
                                    <img class="rounded-circle" src="img/undraw_profile_2.svg"
                                         alt="...">
                                    <div class="status-indicator"></div>
                                </div>
                                <div>
                                    <div class="text-truncate">I have the photos that you ordered last month, how
                                        would you like them sent to you?
                                    </div>
                                    <div class="small text-gray-500">Jae Chun · 1d</div>
                                </div>
                            </a>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="dropdown-list-image mr-3">
                                    <img class="rounded-circle" src="img/undraw_profile_3.svg"
                                         alt="...">
                                    <div class="status-indicator bg-warning"></div>
                                </div>
                                <div>
                                    <div class="text-truncate">Last month's report looks great, I am very happy with
                                        the progress so far, keep up the good work!
                                    </div>
                                    <div class="small text-gray-500">Morgan Alvarez · 2d</div>
                                </div>
                            </a>
                            <a class="dropdown-item d-flex align-items-center" href="#">
                                <div class="dropdown-list-image mr-3">
                                    <img class="rounded-circle" src="https://source.unsplash.com/Mv9hjnEUHR4/60x60"
                                         alt="...">
                                    <div class="status-indicator bg-success"></div>
                                </div>
                                <div>
                                    <div class="text-truncate">Am I a good boy? The reason I ask is because someone
                                        told me that people say this to all dogs, even if they aren't good...
                                    </div>
                                    <div class="small text-gray-500">Chicken the Dog · 2w</div>
                                </div>
                            </a>
                            <a class="dropdown-item text-center small text-gray-500" href="#">Read More Messages</a>
                        </div>
                    </li>

                    <div class="topbar-divider d-none d-sm-block"></div>

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


        </div>

        <div>
            <form action="/EditServlet" method="post" accept-charset="UTF-8">
                <p class="text-dark text-md-left">ID</p>
                <input class="form-control" value="${pr.productId}" type="text" name="id1" readonly>
                <p class="text-dark text-md-left">Mã thực phẩm</p>
                <input class="form-control" type="text" value="${pr.productCode}" name="prCode1">
                <p class="text-dark text-md-left">Tên sản phẩm</p>
                <input class="form-control" type="text" value="${pr.productName}" name="prName1">
                <p class="text-dark text-md-left">Giá thực phẩm</p>
                <input class="form-control " type="text" name="prPrice1" value="${pr.productPrice}">
                <p class="text-dark text-md-left">Số lượng sản phẩm</p>
                <input class="form-control" type="text" value="${pr.productQuantity}" name="prQuantity1" readonly>
                <p class="text-dark text-md-left">Ảnh</p>
                <input class="form-control" type="text" value="${pr.productImg}" name="prImg">
                <p class="text-dark text-md-left">Ngày nhập kho</p>
                <input class="form-control" type="date" value="${pr.productInputDay}" name="prDateInput">
                <p class="text-dark text-md-left">Hạn sử dụng</p>
                <input class="form-control" type="date" value="${pr.productExpiry}" name="prDateEx">
                <p class="text-dark text-md-left">Chi tiết</p>
                <input class="form-control" type="text" value="${pr.productDetail}" name="prDetail">
                <button class="btn btn-secondary" type="button">Huỷ</button>
                <button class="btn btn-primary" type="submit" id="editProductBtn" formmethod="post">Save
                </button>
            </form>

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

<!-- Bootstrap core JavaScript-->
<script src="/vendor/jquery/jquery.min.js"></script>
<script src="/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="/vendor/datatables/dataTables.bootstrap4.min.js"></script>


<!-- Page level custom scripts -->
<script src="/js/demo/datatables-demo.js"></script>
<script>
    $(document).ready(function() {
        <%-- Xử lý khi sửa sản phẩm thành công --%>
        var successMsg = '<div class="alert alert-success alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Sửa sản phẩm thành công!</strong>' +
            '<a href="/EditServlet" type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</a>' +
            '</div>';

        <%-- Xử lý khi sửa sản phẩm không thành công --%>
        var errorMsg = '<div class="alert alert-danger alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Sửa sản phẩm không thành công!</strong>' +
            '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</button>' +
            '</div>';

        <%-- Thêm xử lý submit form --%>
        $("#editProductBtn").click(function(event) {
            event.preventDefault(); // Ngăn chặn việc submit form mặc định

            $.ajax({
                type: "POST",
                url: "/EditServlet",
                data: $('form').serialize(),
                success: function(data) {
                    $('#createModal').modal('hide'); // Ẩn modal khi sửa  sản phẩm thành công
                    $('body').append(successMsg); // Thêm thông báo thành công vào body
                    window.location.href = '/ShowProductsServlet'; // redirect to new page using a serverlet after success message is shown

                },
                error: function() {
                    $('#createModal').modal('hide'); // Ẩn modal khi sửa sản phẩm không thành công
                    $('body').append(errorMsg); // Thêm thông báo không thành công vào body
                    location.reload();

                }
            });
        });
    });



</script>
</body>

</html>

