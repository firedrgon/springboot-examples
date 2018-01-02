package com.hong.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sheny on 2018/1/2.
 * 异步Servlet
 */
@WebServlet(name = "syncServlet")
public class SyncServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取AsyncContext对象
        AsyncContext asyncContext = req.getAsyncContext();
        //申请新的线程，原线程释放回线程池
        asyncContext.start(() ->{
            try {
                new LongRunningProcess().run();
                //通过新的线程获得request,response
                asyncContext.getResponse().getWriter().write("hello world!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //处理完成调用complete告诉Servlet容器
            asyncContext.complete();
        });
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
