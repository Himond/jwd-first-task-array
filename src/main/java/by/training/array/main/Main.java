package by.training.array.main;

import by.training.array.dao.DaoService;
import by.training.array.dao.DaoServiceImpl;
import by.training.array.entity.ArrayMod;
import by.training.array.service.ArrayBuilder;
import by.training.array.service.impl.ArrayServiceImpl;
import by.training.array.service.impl.ArraySortImpl;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        DaoService daoService = new DaoServiceImpl();
        List<String> list = daoService.read();

        ArrayBuilder builder = new ArrayBuilder();
        builder.createArrayList(list);

        System.out.println(builder.arraySize());

        ArraySortImpl sort = new ArraySortImpl();
        ArrayServiceImpl service = new ArrayServiceImpl();

        for(int i = 0; i < builder.arraySize(); i++){

            ArrayMod array = builder.nextArray();
            sort.shellArraySort(array);
            service.averageValueArray(array);

        }



    }
}
