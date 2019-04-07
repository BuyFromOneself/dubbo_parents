package cn.tantan.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("classcs")
public class Classce implements Serializable {

    @TableId(type = IdType.AUTO,value = "c_id")
    private  Integer cId;
    @TableField("c_Name")
    private  String cName;

    public Integer getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
