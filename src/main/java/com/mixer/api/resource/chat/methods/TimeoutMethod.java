package com.mixer.api.resource.chat.methods;

import com.google.common.collect.ImmutableList;
import com.mixer.api.resource.MixerUser;
import com.mixer.api.resource.chat.AbstractChatMethod;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;

public class TimeoutMethod extends AbstractChatMethod {
    public static TimeoutMethod.Builder builder() {
        return new TimeoutMethod.Builder();
    }

    public static class Builder {
        protected MixerUser who;
        protected String time;

        public TimeoutMethod.Builder to(MixerUser u) {
            this.who = u;
            return this;
        }

        public TimeoutMethod.Builder time(String time) {
            this.time = time;
            return this;
        }

        public TimeoutMethod build(int id) {
            TimeoutMethod method = new TimeoutMethod(id);
            method.arguments = ImmutableList.of(this.who.username, this.time);

            return method;
        }

        public TimeoutMethod build() {
            return this.build(AbstractChatMethod.nextId());
        }
    }

    public TimeoutMethod(int id) {
        super(id, "timeout");
    }

    public List<String> arguments;
}
