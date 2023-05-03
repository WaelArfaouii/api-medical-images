package com.arfaouiKallebi.JournalWeb.controller.api;

import com.arfaouiKallebi.JournalWeb.dto.InvitationDTO;
import com.arfaouiKallebi.JournalWeb.services.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/invitations")
public class InvitationController {
    @Autowired
    private InvitationService invitationService ;
    @GetMapping
    public List<InvitationDTO> getInvitations(){
        return invitationService.findAll() ;
    }
    @GetMapping("/{id}")
    public InvitationDTO getInvitationById(@PathVariable Long id){
        return invitationService.findById(id) ;
    }
    @DeleteMapping("delete/{id}")
    public InvitationDTO deleteInvitationById(@PathVariable Long id){
        return invitationService.deleteById(id);
    }
    @PostMapping("save")
    public InvitationDTO saveInvitation(@RequestBody InvitationDTO invitation){
        return invitationService.save(invitation);
    }
}
