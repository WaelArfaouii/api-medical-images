package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;
import com.arfaouiKallebi.JournalWeb.dto.EditorDTO;
import com.arfaouiKallebi.JournalWeb.repository.EditorRepository;
import com.arfaouiKallebi.JournalWeb.services.EditorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//Logger
@Slf4j
public class EditorServiceImpl implements EditorService {
    @Autowired
    private EditorRepository editorRepository ;
    @Override
    public List<EditorDTO> findAll() {
        return null;
    }

    @Override
    public EditorDTO findById(Long id) {
        return null;
    }

    @Override
    public EditorDTO deleteById(Long id) {

        return EditorDTO.fromEntity(editorRepository.deleteEditorById(id));
    }

    @Override
    public EditorDTO save(EditorDTO dto) {
        return null;
    }
}
