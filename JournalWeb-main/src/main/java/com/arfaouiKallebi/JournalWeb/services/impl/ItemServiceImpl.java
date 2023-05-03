package com.arfaouiKallebi.JournalWeb.services.impl;
import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.dto.ItemDTO;
import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import com.arfaouiKallebi.JournalWeb.model.Item;
import com.arfaouiKallebi.JournalWeb.model.Manuscript;
import com.arfaouiKallebi.JournalWeb.services.ItemService;
import com.arfaouiKallebi.JournalWeb.dto.ItemDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.ItemRepository;
import com.arfaouiKallebi.JournalWeb.validator.ItemValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
//Logger
@Slf4j
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository ;
    @Override
    public List<ItemDTO> findAll() {
        return itemRepository.findAll().stream()
                .map(ItemDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDTO findById(Long id) {
        return null;
    }

    @Override
    public ItemDTO deleteById(Long id) {

        return ItemDTO.fromEntity(itemRepository.deleteItemById(id));
    }

    @Override
    public List<ItemDTO> save(List<ItemDTO> dtos) {
//        List<String> errors = ItemValidator.validate(dto);
//        if (!errors.isEmpty()) {
//            log.error("Item is not valid {}", dto);
//            throw new InvalidEntityException("Item is not valid ", ErrorCodes.ITEM_NOT_VALID, errors);
//        }
        Manuscript manuscript = new Manuscript() ;
        List<Item> items = new ArrayList<>() ;
        List<ItemDTO> itemDTOS = new ArrayList<>() ;
        for (ItemDTO dto:dtos) {
            Item item = ItemDTO.toEntity(dto) ;
            item.setManuscript(manuscript);
            items.add(item) ;
            itemDTOS.add(ItemDTO.fromEntity(item)) ;
            itemRepository.save(item) ;
        }

        return itemDTOS ;
    }
}
