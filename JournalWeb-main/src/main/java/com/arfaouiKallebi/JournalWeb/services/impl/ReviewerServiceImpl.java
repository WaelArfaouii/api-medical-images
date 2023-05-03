package com.arfaouiKallebi.JournalWeb.services.impl;

import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;
import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;
import com.arfaouiKallebi.JournalWeb.dto.ReviewerDTO;
import com.arfaouiKallebi.JournalWeb.exception.ErrorCodes;
import com.arfaouiKallebi.JournalWeb.exception.InvalidEntityException;
import com.arfaouiKallebi.JournalWeb.repository.ReviewerRepository;
import com.arfaouiKallebi.JournalWeb.services.ReviewerService;
import com.arfaouiKallebi.JournalWeb.validator.ReviewerValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//Logger
@Slf4j
public class ReviewerServiceImpl implements ReviewerService {
    @Autowired
    private ReviewerRepository reviewerRepository ;
    @Override
    public List<ReviewerDTO> findAll() {
        return null;
    }

    @Override
    public ReviewerDTO findById(Long id) {
        return null;
    }

    @Override
    public ReviewerDTO deleteById(Long id) {

        return ReviewerDTO.fromEntity(reviewerRepository.deleteReviewerById(id));
    }

    @Override
    public ReviewerDTO save(ReviewerDTO dto) {
        List<String> errors = ReviewerValidator.validate(dto);
        if (!errors.isEmpty()) {
            log.error("Reviewer is not valid {}", dto);
            throw new InvalidEntityException("Reviewer is not valid ", ErrorCodes.REVIEWER_NOT_VALID, errors);
        }
        return ReviewerDTO.fromEntity(
                reviewerRepository.save(
                        ReviewerDTO.toEntity(dto)
                )
        );
    }
}
