package helper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.*;
import java.nio.file.Paths;

public class ConfigProperties {

    public static String getTestProperty(String key) throws FileNotFoundException {
        String path = "config.json";
        Gson gson = new Gson();

        File jsonFile = Paths.get(path).toFile();
        JsonObject jsonObject = gson.fromJson(new FileReader(jsonFile), JsonObject.class);

        return jsonObject.get(key).getAsString();
    }
}
