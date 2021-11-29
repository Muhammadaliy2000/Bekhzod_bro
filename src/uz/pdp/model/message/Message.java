package uz.pdp.model.message;

import uz.pdp.model.BaseModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message extends BaseModel {
    private String time;
    private String sender;
    private String receiver;
    private String message;
    private MessageStatus state;

    {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.time = dateTime.format(formatObj);
        state = MessageStatus.UNREAD;
    }

    public Message() {
    }

    public Message(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;

    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageStatus getState() {
        return state;
    }

    public void setState(MessageStatus state) {
        this.state = state;
    }
}
