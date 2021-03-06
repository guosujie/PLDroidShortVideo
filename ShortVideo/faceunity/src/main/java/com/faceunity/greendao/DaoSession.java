package com.faceunity.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.faceunity.entity.MagicPhotoEntity;
import com.faceunity.entity.AvatarModel;

import com.faceunity.greendao.MagicPhotoEntityDao;
import com.faceunity.greendao.AvatarModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig magicPhotoEntityDaoConfig;
    private final DaoConfig avatarModelDaoConfig;

    private final MagicPhotoEntityDao magicPhotoEntityDao;
    private final AvatarModelDao avatarModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        magicPhotoEntityDaoConfig = daoConfigMap.get(MagicPhotoEntityDao.class).clone();
        magicPhotoEntityDaoConfig.initIdentityScope(type);

        avatarModelDaoConfig = daoConfigMap.get(AvatarModelDao.class).clone();
        avatarModelDaoConfig.initIdentityScope(type);

        magicPhotoEntityDao = new MagicPhotoEntityDao(magicPhotoEntityDaoConfig, this);
        avatarModelDao = new AvatarModelDao(avatarModelDaoConfig, this);

        registerDao(MagicPhotoEntity.class, magicPhotoEntityDao);
        registerDao(AvatarModel.class, avatarModelDao);
    }
    
    public void clear() {
        magicPhotoEntityDaoConfig.clearIdentityScope();
        avatarModelDaoConfig.clearIdentityScope();
    }

    public MagicPhotoEntityDao getMagicPhotoEntityDao() {
        return magicPhotoEntityDao;
    }

    public AvatarModelDao getAvatarModelDao() {
        return avatarModelDao;
    }

}
