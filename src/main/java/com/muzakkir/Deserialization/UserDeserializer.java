package com.muzakkir.Deserialization;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.muzakkir.Student_Data.UserModel;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class UserDeserializer implements Deserializer {
    @Override public void close() {
    }
    @Override public void configure(Map arg0, boolean arg1) {
    }
    @Override
    public UserModel deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        UserModel user = null;
        try {
            user = mapper.readValue(arg1, UserModel.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
