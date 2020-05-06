package com.mixer.api.resource.chat.methods;

import com.mixer.api.resource.chat.AbstractChatMethod;

import java.util.Arrays;
import java.util.List;

public class GiveawayStartMethod extends AbstractChatMethod {
    public static GiveawayStartMethod of() {
        GiveawayStartMethod gsm = new GiveawayStartMethod();
        gsm.arguments = Arrays.asList();

        return gsm;
    }

    public GiveawayStartMethod() {
        super("giveaway:start");
    }

    public List<String> arguments;
}
