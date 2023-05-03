package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.dto.ManuscriptDTO;
import com.arfaouiKallebi.JournalWeb.model.Manuscript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Arrays;
import java.util.List;

public interface ManuscriptRepository extends JpaRepository<Manuscript,Long> {
    @Query("SELECT m FROM Manuscript m WHERE m.status = 'processed'")
    List<Manuscript> getProcessedManuscripts();
    @Query("SELECT m FROM Manuscript m WHERE m.status = 'sentBack'")
    List<Manuscript> getSentBackManuscripts();
    @Query("SELECT m FROM Manuscript m WHERE m.status is null  ")
    List<Manuscript> getIncompleteManuscripts();
    @Query("SELECT m FROM Manuscript m WHERE m.status = 'waiting'  ")
    List<Manuscript>  getWaitingManuscripts();
    @Query(value = "delete  from Manuscript a where a.id =:id")
    Manuscript deleteManuscriptById(Long id);
}
