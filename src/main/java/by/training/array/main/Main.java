package by.training.array.main;

import by.training.array.entity.ArrayMod;
import by.training.array.exception.ArrayException;
import by.training.array.reader.impl.ReaderServiceImpl;
import by.training.array.util.ArrayCreator;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ArrayException, IOException {

        ReaderServiceImpl reader = new ReaderServiceImpl();
        List<String> stringArrayList = reader.read("src\\main\\resources\\arrays.txt");
        System.out.println(stringArrayList);

        List<ArrayMod> arrayModList = ArrayCreator.createArrayList(stringArrayList);
        System.out.println(arrayModList);

    }
}
