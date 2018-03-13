package com.example.demo.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Description: //TODO
 *
 * @Author: wangch
 * @Email: wangch@huiyinxun.com
 * @Date: 2018/1/31
 */
@Entity
public class UserInfo {
    @Id
    private Long id;

    public String uid;

    public String walletId;

    public String tk;//用户token

    public String mobile;

    public String mark;

    public String sjlx;

    @Generated(hash = 433973243)
    public UserInfo(Long id, String uid, String walletId, String tk, String mobile,
            String mark, String sjlx) {
        this.id = id;
        this.uid = uid;
        this.walletId = walletId;
        this.tk = tk;
        this.mobile = mobile;
        this.mark = mark;
        this.sjlx = sjlx;
    }

    @Generated(hash = 1279772520)
    public UserInfo() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUid() {
        return this.uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getWalletId() {
        return this.walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getTk() {
        return this.tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSjlx() {
        return this.sjlx;
    }

    public void setSjlx(String sjlx) {
        this.sjlx = sjlx;
    }
}
