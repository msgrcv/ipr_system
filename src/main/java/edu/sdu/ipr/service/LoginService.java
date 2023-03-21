package edu.sdu.ipr.service;

import edu.sdu.ipr.dao.AdminDao;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private AdminDao adminDao;
    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }




    public boolean matchAdmin(String username, String password){
        return true;
    }
}
