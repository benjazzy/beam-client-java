package com.mixer.api.resource.chat.methods;

import com.mixer.api.resource.chat.AbstractChatMethod;

import java.util.Arrays;
import java.util.List;

public class ClearMessagesMethod extends AbstractChatMethod {
    public static ClearMessagesMethod of() {
        ClearMessagesMethod ccm = new ClearMessagesMethod();
        ccm.arguments = Arrays.asList();

        return ccm;
    }

    public ClearMessagesMethod() {
        super("clearMessages");
    }

    public List<String> arguments;
}
