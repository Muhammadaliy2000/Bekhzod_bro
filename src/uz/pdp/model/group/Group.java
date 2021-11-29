package uz.pdp.model.group;

import uz.pdp.model.BaseModel;
import uz.pdp.model.message.Message;

import java.util.LinkedList;
import java.util.UUID;

public class Group extends BaseModel {
    private int numOfPeople;
    private GroupStatus GrStatus;
    private UUID ownerId;
    private String ownerPhone;

    private LinkedList<String> people = new LinkedList<>();
    private LinkedList<Message> messages = new LinkedList<>();
    private LinkedList<Message> request = new LinkedList<>();

    public Group(){}

    public Group(String name, int numOfPeople, GroupStatus grStatus, UUID ownerId, String ownerPhone) {
        super(name);
        this.numOfPeople = numOfPeople;
        this.GrStatus = grStatus;
        this.ownerId = ownerId;
        this.ownerPhone = ownerPhone;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public GroupStatus getGrStatus() {
        return GrStatus;
    }

    public void setGrStatus(GroupStatus grStatus) {
        GrStatus = grStatus;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public LinkedList<String> getPeople() {
        return people;
    }

    public void setPeople(LinkedList<String> people) {
        this.people = people;
    }

    public LinkedList<Message> getMessages() {
        return messages;
    }

    public void setMessages(LinkedList<Message> messages) {
        this.messages = messages;
    }

    public LinkedList<Message> getRequest() {
        return request;
    }

    public void setRequest(LinkedList<Message> request) {
        this.request = request;
    }
}
