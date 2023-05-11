package seung.springboot.semiprojectv5.dao;

import seung.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
