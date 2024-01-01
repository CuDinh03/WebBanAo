//package com.example.quanlykho.controller;
//
//import com.example.quanlykho.dao.LoginDao;
//import com.example.quanlykho.model.User;
//import org.junit.jupiter.api.Test;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//import static org.mockito.Mockito.*;
//
//public class LoginServletTest {
//
//    @Test
//    public void testDoGet() throws ServletException, IOException {
//        // Arrange
//        LoginServlet loginServlet = new LoginServlet();
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//        RequestDispatcher requestDispatcher = mock(RequestDispatcher.class);
//        when(request.getRequestDispatcher("/login.jsp")).thenReturn(requestDispatcher);
//
//        // Act
//        loginServlet.doGet(request, response);
//
//        // Assert
//        verify(requestDispatcher).forward(request, response);
//    }
//
//    @Test
//    public void testDoPost_withCorrectCredentials_shouldSetSessionAndRedirect() throws ServletException, IOException {
//        // Arrange
//        LoginServlet loginServlet = new LoginServlet();
//        LoginDao loginDao = mock(LoginDao.class);
//        User user = new User();
//        user.setId(1);
//        user.setUserName("admin@gmail.com");
//        user.setPassWord("admin");
//        when(loginDao.login("admin@gmail.com", "admin")).thenReturn(user);
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//        HttpSession session = mock(HttpSession.class);
//        when(request.getSession()).thenReturn(session);
//
//        // Act
//        loginServlet.doPost(request, response);
//
//        // Assert
//        verify(session).setAttribute("id", user.getId());
//        verify(session).setAttribute("userName", user.getUserName());
//        verify(session).setAttribute("passWord", user.getPassWord());
//        verify(response).sendRedirect("/BroadServlet");
//    }
//
//    @Test
//    public void testDoPost_withIncorrectCredentials_shouldRedirectToLoginPage() throws ServletException, IOException {
//        // Arrange
//        LoginServlet loginServlet = new LoginServlet();
//        LoginDao loginDao = mock(LoginDao.class);
//        when(loginDao.login("admin@gmail.com", "admin")).thenReturn(null);
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//
//        // Act
//        loginServlet.doPost(request, response);
//
//        // Assert
//        verify(response).sendRedirect("/LoginServlet");
//    }
//}
