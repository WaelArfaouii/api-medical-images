package com.arfaouiKallebi.JournalWeb.dto;
import com.arfaouiKallebi.JournalWeb.model.Attachment;
import com.arfaouiKallebi.JournalWeb.model.Item;
import com.arfaouiKallebi.JournalWeb.model.Manuscript;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDTO {
    private Long id ;
    private String type ;
    private String description ;
    private Attachment attachment ;
    private Manuscript manuscript ;
    public static ItemDTO fromEntity(Item item) {
        if (item == null) {
            return null ;
        }

        return ItemDTO.builder()
                .id(item.getId())
                .attachment(item.getAttachment())
                .description(item.getDescription())
                .manuscript(item.getManuscript())
                .type(item.getType())
                .build();
    }
    public static Item toEntity(ItemDTO itemDTO) {
        if (itemDTO == null) {
            return null ;
        }
        Item item = new Item() ;
        item.setAttachment(itemDTO.getAttachment());
        item.setType(itemDTO.getType());
        item.setDescription(itemDTO.getDescription());


        return item ;
} }
