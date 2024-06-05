package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import model.Phone;

public class ResponseParser {

    public List<Phone> parse(String response) {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Phone> phones = null;
        try {
            phones = objectMapper.readValue(response, new TypeReference<>() {
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
        return phones;
    }
}





