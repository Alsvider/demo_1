package com.example.demo.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.demo.db.entity.UserInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_INFO".
*/
public class UserInfoDao extends AbstractDao<UserInfo, Long> {

    public static final String TABLENAME = "USER_INFO";

    /**
     * Properties of entity UserInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Uid = new Property(1, String.class, "uid", false, "UID");
        public final static Property WalletId = new Property(2, String.class, "walletId", false, "WALLET_ID");
        public final static Property Tk = new Property(3, String.class, "tk", false, "TK");
        public final static Property Mobile = new Property(4, String.class, "mobile", false, "MOBILE");
        public final static Property Mark = new Property(5, String.class, "mark", false, "MARK");
        public final static Property Sjlx = new Property(6, String.class, "sjlx", false, "SJLX");
    }


    public UserInfoDao(DaoConfig config) {
        super(config);
    }
    
    public UserInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"UID\" TEXT," + // 1: uid
                "\"WALLET_ID\" TEXT," + // 2: walletId
                "\"TK\" TEXT," + // 3: tk
                "\"MOBILE\" TEXT," + // 4: mobile
                "\"MARK\" TEXT," + // 5: mark
                "\"SJLX\" TEXT);"); // 6: sjlx
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String walletId = entity.getWalletId();
        if (walletId != null) {
            stmt.bindString(3, walletId);
        }
 
        String tk = entity.getTk();
        if (tk != null) {
            stmt.bindString(4, tk);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(5, mobile);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(6, mark);
        }
 
        String sjlx = entity.getSjlx();
        if (sjlx != null) {
            stmt.bindString(7, sjlx);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(2, uid);
        }
 
        String walletId = entity.getWalletId();
        if (walletId != null) {
            stmt.bindString(3, walletId);
        }
 
        String tk = entity.getTk();
        if (tk != null) {
            stmt.bindString(4, tk);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(5, mobile);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(6, mark);
        }
 
        String sjlx = entity.getSjlx();
        if (sjlx != null) {
            stmt.bindString(7, sjlx);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public UserInfo readEntity(Cursor cursor, int offset) {
        UserInfo entity = new UserInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // walletId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tk
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // mobile
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // mark
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // sjlx
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setWalletId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTk(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMobile(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMark(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSjlx(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UserInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UserInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UserInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}