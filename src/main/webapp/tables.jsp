<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: maccuacu
  Date: 21/03/2023
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


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
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>


</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/BroadServlet">

            <div class="sidebar-brand-text mx-3">Chào quản lý: BoyPho</div>
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
        <hr class="sidebar-divider">

        <!-- Heading -->
        <div class="sidebar-heading">
            Tuỳ chọn nhanh
        </div>

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
                <h1 class="h3 mb-2 text-gray-800">Danh sách thực phẩm thực phẩm </h1>

                <!-- DataTales Example -->
                <div class="card shadow mb-4">
                    <div class="card-header py-3">
                        <h6 class="m-0 font-weight-bold text-primary">Danh sách toàn bộ thực phẩm có trong kho
                            <a class="btn btn-info" id="addBtn" type="button" data-toggle="modal" data-target="#createModal">
                                Thêm mới
                            </a>
                        </h6>

                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                <thead>
                                <tr>
                                    <th>Mã thực phẩm</th>
                                    <th>Tên thực phẩm</th>
                                    <th>Giá thực phẩm</th>
                                    <th>Số lượng sản phẩm</th>
                                    <th>Ảnh</th>
                                    <th>Ngày nhập kho</th>
                                    <th>Trạng thái</th>
                                    <th>Chi tiết</th>
                                    <th>Hành động</th>
                                </tr>
                                </thead>
                                <tfoot>
                                <tr>
                                    <th>Mã thực phẩm</th>
                                    <th>Tên thực phẩm</th>
                                    <th>Giá thực phẩm</th>
                                    <th>Số lượng sản phẩm</th>
                                    <th>Ảnh</th>
                                    <th>Ngày nhập kho</th>
                                    <th>Trạng thái</th>
                                    <th>Chi tiết</th>
                                    <th>Hành động</th>
                                </tr>
                                </tfoot>
                                <tbody>
                                <c:forEach items="${products}" var="p">
                                    <tr>
                                        <td>${p.productCode}</td>
                                        <td>${p.productName}</td>
                                        <td>${p.productPrice} vnđ</td>
                                        <td>${p.productQuantity}</td>
                                        <td><img src="${p.productImg}" width="150" height="100" alt="loading"></td>
                                        <td>${p.productInputDay}</td>
                                        <c:if test="${p.productStatus == 1}">
                                            <td>Còn hàng</td>
                                        </c:if>
                                        <td>${p.productDetail}</td>
                                        <td>
                                            <a type="button" class="btn btn-warning"
                                               href="/EditServlet?id=${p.productId}">Edit</a>

                                            <!-- Button trigger modal -->
                                            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#confirmDeleteModal${p.productId}">
                                                Xoá
                                            </button>
                                            <!-- Confirm Delete Modal -->
                                            <div class="modal fade" id="confirmDeleteModal${p.productId}" tabindex="-1" role="dialog" aria-labelledby="confirmDeleteModalLabel" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="confirmDeleteModalLabel${p.productId}">Xác nhận xóa sản phẩm</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            Bạn có chắc chắn muốn xóa sản phẩm này không?
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy bỏ</button>
                                                            <a type="button" class="btn btn-danger" href="/delete?id=${p.productId} ">Xoá</a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </td>
                                    </tr>
                                </c:forEach>

                                </tbody>
                            </table>
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

<form action="/CreateProductServlet" method="post" accept-charset="UTF-8">
<!-- Create Modal-->
<div class="modal fade" id="createModal" tabindex="-1" role="dialog" aria-labelledby="createModalProduct"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="createModalProduct">Thêm mới sản phẩm</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <%--            nội dung thêm sản phẩm --%>

                <div class="modal-body">


                        <p class="text-dark text-md-left">Mã thực phẩm</p>
                        <input class="form-control" type="text" name="prCode" required>

                        <p class="text-dark text-md-left">Tên sản phẩm</p>
                        <input class="form-control" type="text" name="prName" required>

                        <p class="text-dark text-md-left">Giá thực phẩm</p>
                        <input class="form-control" type="number" name="prPrice" required>

                        <p class="text-dark text-md-left">Số lượng sản phẩm</p>
                        <input class="form-control" type="number" name="prQuantity" required>

                        <p class="text-dark text-md-left">Ảnh</p>
                        <input class="form-control" type="text" name="prImg">

                        <p class="text-dark text-md-left">Ngày nhập kho</p>
                        <input class="form-control" type="date" name="prDateInput" required>

                        <p class="text-dark text-md-left">Chi tiết</p>
                        <textarea class="form-control" name="prDetail" required></textarea>



                </div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Huỷ</button>
                    <button class="btn btn-primary" type="submit" id="addProductBtn" formmethod="postadd">Thêm</button>
                </div>
        </div>
    </div>
</div>
</form>


<script>
    $(document).ready(function() {
        <%-- Xử lý khi thêm sản phẩm thành công --%>
        var successMsg = '<div class="alert alert-success alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Thêm sản phẩm thành công!</strong>' +
            '<a href="/ShowProductsServlet" type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</a>' +
            '</div>';

        <%-- Xử lý khi thêm sản phẩm không thành công --%>
        var errorMsg = '<div class="alert alert-danger alert-dismissible fade show" role="alert" style="position: fixed; top: 0; left: 0; right: 0; z-index: 9999">' +
            '<strong>Thêm sản phẩm không thành công!</strong>' +
            '<a href="/ShowProductsServlet" type="button" class="close" data-dismiss="alert" aria-label="Close">' +
            '<span aria-hidden="true">&times;</span>' +
            '</a>' +
            '</div>';

        <%-- Thêm xử lý submit form --%>
        $("#addProductBtn").click(function(event) {
            event.preventDefault(); // Ngăn chặn việc submit form mặc định

            $.ajax({
                type: "POST",
                url: "/CreateProductServlet",
                data: $('form').serialize(),
                success: function(data) {
                    $('#createModal').modal('hide'); // Ẩn modal khi thêm sản phẩm thành công
                    $('body').append(successMsg); // Thêm thông báo thành công vào body
                },
                error: function() {
                    $('#createModal').modal('hide'); // Ẩn modal khi thêm sản phẩm không thành công
                    $('body').append(errorMsg); // Thêm thông báo không thành công vào body
                }
            });
        });
    });



</script>




<!-- Bootstrap core JavaScript-->

<script src="adminView/vendor/jquery/jquery.min.js"></script>
<script src="adminView/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="adminView/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="adminView/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="adminView/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="adminView/vendor/datatables/dataTables.bootstrap4.min.js"></script>


<!-- Page level custom scripts -->
<script src="adminView/js/demo/datatables-demo.js"></script>
</body>

</html>
