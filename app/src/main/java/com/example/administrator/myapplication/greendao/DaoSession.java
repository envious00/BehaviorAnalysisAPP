package com.example.administrator.myapplication.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.example.administrator.myapplication.Model.CheckinInfo;
import com.example.administrator.myapplication.Model.nodeInfo;
import com.example.administrator.myapplication.Model.UserInfo;

import com.example.administrator.myapplication.greendao.CheckinInfoDao;
import com.example.administrator.myapplication.greendao.nodeInfoDao;
import com.example.administrator.myapplication.greendao.UserInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig checkinInfoDaoConfig;
    private final DaoConfig nodeInfoDaoConfig;
    private final DaoConfig userInfoDaoConfig;

    private final CheckinInfoDao checkinInfoDao;
    private final nodeInfoDao nodeInfoDao;
    private final UserInfoDao userInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        checkinInfoDaoConfig = daoConfigMap.get(CheckinInfoDao.class).clone();
        checkinInfoDaoConfig.initIdentityScope(type);

        nodeInfoDaoConfig = daoConfigMap.get(nodeInfoDao.class).clone();
        nodeInfoDaoConfig.initIdentityScope(type);

        userInfoDaoConfig = daoConfigMap.get(UserInfoDao.class).clone();
        userInfoDaoConfig.initIdentityScope(type);

        checkinInfoDao = new CheckinInfoDao(checkinInfoDaoConfig, this);
        nodeInfoDao = new nodeInfoDao(nodeInfoDaoConfig, this);
        userInfoDao = new UserInfoDao(userInfoDaoConfig, this);

        registerDao(CheckinInfo.class, checkinInfoDao);
        registerDao(nodeInfo.class, nodeInfoDao);
        registerDao(UserInfo.class, userInfoDao);
    }
    
    public void clear() {
        checkinInfoDaoConfig.clearIdentityScope();
        nodeInfoDaoConfig.clearIdentityScope();
        userInfoDaoConfig.clearIdentityScope();
    }

    public CheckinInfoDao getCheckinInfoDao() {
        return checkinInfoDao;
    }

    public nodeInfoDao getNodeInfoDao() {
        return nodeInfoDao;
    }

    public UserInfoDao getUserInfoDao() {
        return userInfoDao;
    }

}
