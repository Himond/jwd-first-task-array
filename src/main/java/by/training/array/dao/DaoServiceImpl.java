package by.training.array.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DaoServiceImpl implements DaoService {

    private File file = new File("src\\main\\resources\\arrays.txt");

    @Override
    public List<String> read() throws IOException {

        List<String> notes = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null){
                notes.add(line);
            }

        }catch (FileNotFoundException ex){
            throw new FileNotFoundException(ex.getMessage());
        }
        return notes;
    }

}
