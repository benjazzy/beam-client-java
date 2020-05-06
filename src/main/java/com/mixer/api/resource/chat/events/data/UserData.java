package com.mixer.api.resource.chat.events.data;

import com.google.gson.annotations.SerializedName;
import com.mixer.api.resource.MixerUser;

import java.util.List;

public class UserData {
    @SerializedName("user_name") public String username;
    @SerializedName("user_id") public int userId;
    @SerializedName("user_roles") public List<MixerUser.Role> userRole;
    @SerializedName("user_level") public int userLevel;
}
