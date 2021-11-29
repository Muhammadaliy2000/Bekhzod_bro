package uz.pdp.model;

import uz.pdp.model.group.Group;
import uz.pdp.model.message.Message;
import uz.pdp.service.User_service.Block;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User extends BaseModel {
    private String username;
    private String phone;
    private String password;

    private Map<String, Block> myContacs = new HashMap<>();
    private LinkedList<Group> Group = new LinkedList<>();
    private Map<String, List<Message>> chat = new HashMap<>(); // 1 ta username ga-> messages are saved

    public User(String username, String phone, String password) {
        super(username);
        this.username = username;
        this.phone = phone;
        this.password = password;
    }

    public User() {
    }

    public void setMyContacs(Map<String, Block> myContacs) {
        this.myContacs = myContacs;
    }

    public void setGroup(LinkedList<uz.pdp.model.group.Group> group) {
        Group = group;
    }

    public void setChat(Map<String, List<Message>> chat) {
        this.chat = chat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, Block> getMyContacs() {
        return myContacs;
    }

    public LinkedList<uz.pdp.model.group.Group> getGroup() {
        return Group;
    }

    public Map<String, List<Message>> getChat() {
        return chat;
    }
}
