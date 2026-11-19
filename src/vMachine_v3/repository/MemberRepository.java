package vMachine_v3.repository;

import vMachine_v3.dto.MemberDto;

import java.util.List;

public interface MemberRepository {
    int             insert(MemberDto dto);
    MemberDto       findById(int id);                    // 없으면 null
    MemberDto       findByUserId(String userId);         // 없으면 null (중복 체크, 로그인용)
    List<MemberDto> findAll();
    int             update(MemberDto dto);
    int             delete(int id);
    int             updateBalance(int id, int balance);  // 잔액을 이 값으로 변경
}
