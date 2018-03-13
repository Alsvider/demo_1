package com.example.demo.db.DBManager;

import android.content.Context;

import com.example.demo.db.DaoMaster;
import com.example.demo.db.DaoSession;

/**
 * Description: //TODO
 *
 * @Author: wangch
 * @Email: wangch@huiyinxun.com
 * @Date: 2018/1/31
 */
public class DBManager {

    private final static String DB_NAME = "" ;

    private static DBManager instance;
    private DaoMaster sDaoMaster;
    private Context context;

    private static DBManager getInstance() {
        if (instance == null) {
            synchronized (DBManager.class){
                if (instance==null){
                    instance=new DBManager();
                }
            }
        }
        return instance;
    }

    /**
     * 判断是否有存在数据库，如果没有则创建
     * @return
     */
    public DaoMaster getDaoMaster(){
        if(sDaoMaster == null) {
            DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, DB_NAME, null);
            sDaoMaster = new DaoMaster(helper.getWritableDatabase());
        }
        return sDaoMaster;
    }

    /**
     * 完成对数据库的添加、删除、修改、查询操作，仅仅是一个接口
     * @return
     */
    public DaoSession getSession(){
        DaoSession daoSession = sDaoMaster.newSession();
        return daoSession;
    }

    public  void init(Context context){
        this.context=context;
         getInstance();
    }

    public DBManager() {

    }
}
