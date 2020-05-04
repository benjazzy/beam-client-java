package com.mixer.api.resource.chat.methods;

import com.mixer.api.resource.chat.AbstractChatMethod;

import java.util.Arrays;
import java.util.List;

public class PurgeMethod extends AbstractChatMethod {
    public static PurgeMethod of(String username) {
        PurgeMethod pm = new PurgeMethod();
        pm.arguments = Arrays.asList(username);

        return pm;
    }

    public PurgeMethod() {
        super("purge");
    }

    public List<String> arguments;
}
