package by.training.array.creator;

import by.training.array.entity.ArrayMod;
import by.training.array.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayCreatorStream {

    private static final String CORRECT_ARRAY_REGEX = "^-?(\\d*[\\ \\-\\,]*)*";
    private static final String SPLIT_REGEX = "(\\s\\-\\s)|(\\,\\s)|(\\s)";
    static Logger logger = LogManager.getLogger();

    private ArrayCreatorStream() {
    }

    public static List<ArrayMod> createArrayList(String path) throws ArrayException{
        List<ArrayMod> arrayModList;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            arrayModList = br.lines()
                    .filter(x -> x.matches(CORRECT_ARRAY_REGEX))
                    .map(x -> x.split(SPLIT_REGEX))
                    .map(x -> (Arrays.stream(x)
                            .mapToDouble(Double::parseDouble)
                            .toArray()))
                    .map(ArrayMod::new)
                    .collect(Collectors.toList());

        }catch (FileNotFoundException ex){
            logger.error("File not found stream: " + ex);
            throw new ArrayException(ex);
        }catch (IOException ex){
            throw new ArrayException(ex);
        }

        return arrayModList;
    }

}
