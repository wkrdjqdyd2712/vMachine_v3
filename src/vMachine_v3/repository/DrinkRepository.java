package vMachine_v3.repository;

import vMachine_v3.dto.DrinkDto;

import java.util.List;

public interface DrinkRepository {
    int            insert(DrinkDto dto);
    DrinkDto       findById(int id);                     // 없으면 null
    List<DrinkDto> findAll();
    int            update(DrinkDto dto);
    int            delete(int id);
    int            updateStock(int id, int stock);       // 재고를 이 값으로 변경
}
