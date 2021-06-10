package by.training.array.main;

import by.training.array.dao.DaoService;
import by.training.array.dao.DaoServiceImpl;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        DaoService daoService = new DaoServiceImpl();
        List<String> list = daoService.read();


    }
}
