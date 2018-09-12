package com.foodTrackerApp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter("/*")
public class AuthorizationFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String path = req.getServletPath();
        if (path.startsWith("/resources/")) {
            filterChain.doFilter(req, resp);
        } else if (path.startsWith("/admin/") || path.startsWith("/user/")) {
            HttpSession session = req.getSession();
            String role = (String) session.getAttribute("role");
            if (role != null) {
                if ("admin".equals(role) || ("user".equals(role) && path.startsWith("/user/"))) {
                    req.getRequestDispatcher("/" + path).forward(req, resp);
                }
            } else {
                req.getRequestDispatcher("/pages/error.jsp").forward(req, resp);
            }
        } else {
            req.getRequestDispatcher("/" + path).forward(req, resp);
        }
    }

    @Override
    public void destroy() {
    }
}
