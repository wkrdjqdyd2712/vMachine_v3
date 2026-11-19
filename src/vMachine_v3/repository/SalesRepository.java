package vMachine_v3.repository;

import vMachine_v3.dto.SalesDto;

import java.util.List;

public interface SalesRepository {
    int            insert(int memberId, int menuId, int price);
    List<SalesDto> findByMember(int memberId);           // 구매 내역 (sales JOIN vending_menu)
    List<SalesDto> summaryByMenu();                      // GROUP BY menu_id
    List<SalesDto> summaryByMember();                    // GROUP BY member_id
}
