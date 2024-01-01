//package com.example.quanlykho.controller.filter;
//
//import com.example.quanlykho.model.User;
//import org.junit.jupiter.api.Test;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//import static org.mockito.Mockito.*;
//
//public class UserFilterTest {
//
//    @Test
//    public void testDoFilter_withNullUser_shouldRedirectToLoginPage() throws ServletException, IOException {
//        // Arrange
//        UserFilter userFilter = new UserFilter();
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//        FilterChain filterChain = mock(FilterChain.class);
//        HttpSession session = mock(HttpSession.class);
//        when(request.getSession()).thenReturn(session);
//        when(session.getAttribute("user")).thenReturn(null);
//
//        // Act
//        userFilter.doFilter(request, response, filterChain);
//
//        // Assert
//        verify(response).sendRedirect("/LoginServlet");
//    }
//
//    @Test
//    public void testDoFilter_withNonNullUser_shouldDoFilter() throws ServletException, IOException {
//        // Arrange
//        UserFilter userFilter = new UserFilter();
//        HttpServletRequest request = mock(HttpServletRequest.class);
//        HttpServletResponse response = mock(HttpServletResponse.class);
//        FilterChain filterChain = mock(FilterChain.class);
//        HttpSession session = mock(HttpSession.class);
//        when(request.getSession()).thenReturn(session);
//        when(session.getAttribute("user")).thenReturn(new User());
//
//        // Act
//        userFilter.doFilter(request, response, filterChain);
//
//        // Assert
//        verify(filterChain).doFilter(request, response);
//    }
//}
