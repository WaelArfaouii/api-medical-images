package com.arfaouiKallebi.JournalWeb.repository;

import com.arfaouiKallebi.JournalWeb.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {
    @Query(value = "delete  from Invitation a where a.id =:id")
    Invitation deleteInvitationById(Long id);
}
