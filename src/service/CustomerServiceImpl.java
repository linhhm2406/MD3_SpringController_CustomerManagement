package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList;
    private static long autoIncrementId = 0;
    static {
        customerList = asList(
                new Customer(autoIncrementId++, "T", "t@codegym.vn", "Da Nang"),
                new Customer(autoIncrementId++, "Nhat", "nhat@codegym.vn", "Quang Tri"),
                new Customer(autoIncrementId++, "Trang", "trang@codegym.vn", "Ha Noi"),
                new Customer(autoIncrementId++, "Nguyen Binh Son", "son@codegym.vn", "Sai Gon"),
                new Customer(autoIncrementId++, "Dang Xuan Hoa", "hoa.dang@codegym.vn", "Da Nang")
        );
    }

    @Override
    public List<Customer> showAll() {
        return customerList;
    }
}
