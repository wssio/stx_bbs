package com.stx.xc.BBS.serviet;

import com.stx.xc.BBS.dao.ArticleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/article/delete")
public class DeleteArticleServlet extends HttpServlet {
    ArticleDao articleDao = new ArticleDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aid = request.getParameter("id");
        articleDao.deleteByid(aid);
        response.sendRedirect("/intel");
    }
}
