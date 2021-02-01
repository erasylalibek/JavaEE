package com.test;

import com.test.Model.CarType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.Executor;

@WebServlet(
        name = "selectCarservlet",
        urlPatterns = "/SelectCar"
)

public class SelectCarServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carType = req.getParameter("Type");

        CarService carService = new CarService();
        CarType carT = CarType.valueOf(carType);

        List carBrands = carService.getAvailableCars(carT);

        req.setAttribute("brands", carBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }

}
