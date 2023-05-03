package com.arfaouiKallebi.JournalWeb.services;

import com.arfaouiKallebi.JournalWeb.model.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
