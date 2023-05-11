package seung.springboot.semiprojectv5.service;

import seung.springboot.semiprojectv5.model.Member;

import javax.servlet.http.HttpSession;

public interface Memberservice {
    boolean checkLogin(Member m, HttpSession sess);
}
