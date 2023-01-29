package com.carrot.qqzone.dao.impl;

import com.carrot.myssm.basedao.BaseDAO;
import com.carrot.qqzone.dao.HostReplyDAO;
import com.carrot.qqzone.pojo.HostReply;

public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("select * from t_host_reply where reply = ? " , replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("delete from t_host_reply where id = ? " , id) ;
    }
}
