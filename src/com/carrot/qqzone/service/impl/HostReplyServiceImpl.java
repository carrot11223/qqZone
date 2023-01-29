package com.carrot.qqzone.service.impl;

import com.carrot.qqzone.dao.HostReplyDAO;
import com.carrot.qqzone.pojo.HostReply;
import com.carrot.qqzone.service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO ;

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}
