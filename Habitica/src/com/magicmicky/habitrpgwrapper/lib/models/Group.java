package com.magicmicky.habitrpgwrapper.lib.models;

import com.google.gson.annotations.SerializedName;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.ArrayList;

/**
 * Created by Negue on 16.09.2015.
 */
public class Group extends BaseModel {

    @SerializedName("_id")
    public String id;

    public double balance;

    public String description;

    // TODO Leader
    // GET /groups?type={0} => leader is string
    // GET /groups/{gid} => leader is user-object

    public String name;

    public int memberCount;

    public String type;

    public String logo;

    public Quest quest;

    public ArrayList<ChatMessage> chat;

    public ArrayList<HabitRPGUser> members;

    public int challengeCount;

    // TODO Challenges
}
