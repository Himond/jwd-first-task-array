package by.training.array.reader.impl;

import by.training.array.exception.ArrayException;
import by.training.array.reader.ReaderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderServiceImpl implements ReaderService {

    static Logger logger = LogManager.getLogger();

    @Override
    public List<String> read(String path) throws ArrayException, IOException {

        List<String> stringArrayList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null){
                stringArrayList.add(line);
            }

        }catch (FileNotFoundException ex){
            logger.error("File not found: " + path);
            throw new ArrayException(ex.getMessage());
        }

        return stringArrayList;

    }

}
