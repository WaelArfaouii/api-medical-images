package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.ArticleDTO;
import com.arfaouiKallebi.JournalWeb.dto.CommentDTO;
import com.arfaouiKallebi.JournalWeb.dto.CommentDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.CommentRepository;
import com.arfaouiKallebi.JournalWeb.services.CommentService;
import com.arfaouiKallebi.JournalWeb.validator.ArticleValidator;
import com.arfaouiKallebi.JournalWeb.validator.CommentValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//Logger
@Slf4j
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository ;
    @Override
    public List<CommentDTO> findAll() {
        return null;
    }

    @Override
    public CommentDTO findById(Long id) {
        return null;
    }

    @Override
    public CommentDTO deleteById(Long id) {

        return CommentDTO.fromEntity(commentRepository.deleteCommentById(id));
    }

    @Override
    public CommentDTO save(CommentDTO dto) {

        List<String> errors = CommentValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Comment is not valid {}", dto);
            throw new InvalidEntityException("Comment is not valid ", ErrorCodes.COMMENT_NOT_VALID, errors);
        }
        return CommentDTO.fromEntity(
                commentRepository.save(
                        CommentDTO.toEntity(dto)
                )
        );
    }
}
