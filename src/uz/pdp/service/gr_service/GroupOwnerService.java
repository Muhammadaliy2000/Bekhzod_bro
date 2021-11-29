package uz.pdp.service.gr_service;

import uz.pdp.model.group.Group;
import uz.pdp.service.User_service.UserService;

public class GroupOwnerService {
    public void addPeople(UserService userService, Group group, String phone) {
        group.getPeople().add(phone);
        userService.get(phone).g

    }
}
