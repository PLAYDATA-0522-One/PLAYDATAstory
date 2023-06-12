package service;

import domain.ConditonDto;
import domain.InventoryDto;
import domain.SignupDto;
import repository.ConditionRepository;
import repository.InventoryRepository;
import repository.UserRepository;

public class UserInventory {
    private static UserInventory inventory;

    public static UserInventory getInstance() {
        if (inventory == null) inventory = new UserInventory();
        return inventory;
    }

    public void checkUserInventory(){


        new InventoryRepository().checkUserInventory();
    }
    public void changeUserInvetentory(InventoryDto dto){
        //인벤토리 추가

        new InventoryRepository().changeUserInventory(dto);
    }
}