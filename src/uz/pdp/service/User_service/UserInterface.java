package uz.pdp.service.User_service;

import uz.pdp.model.User;
import uz.pdp.service.BaseServiceModel;

import java.util.List;

public interface UserInterface extends BaseServiceModel <User, Boolean, List<User>> {
    User logIn(String phone, String password);
}
