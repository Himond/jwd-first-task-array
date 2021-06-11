package by.training.array.reader;

import by.training.array.exception.ArrayException;

import java.io.IOException;
import java.util.List;

public interface ReaderService {

    List<String> read(String path) throws IOException, ArrayException;

}
