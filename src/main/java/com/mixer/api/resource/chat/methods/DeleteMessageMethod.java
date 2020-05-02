package com.mixer.api.resource.chat.methods;

import com.mixer.api.resource.chat.AbstractChatMethod;

import java.util.Arrays;
import java.util.List;

public class DeleteMessageMethod extends AbstractChatMethod {
    public static DeleteMessageMethod of(String uuid) {
        DeleteMessageMethod dmm = new DeleteMessageMethod();
        dmm.arguments = Arrays.asList(uuid);

        return dmm;
    }

    public DeleteMessageMethod() {
        super("deleteMessage");
    }

    public List<String> arguments;
}
