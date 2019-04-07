package cn.tantan.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

@TableName("student")
public class Student implements Serializable {

    @TableId(type = IdType.AUTO,value = "s_id")
    private Integer sId;

    @TableField("s_name")
    private String sName;

    @TableField("s_birth")
    private String sBirth;

    @TableField("s_sex")
    private String sSex;

    @TableField("class_id")
    private  Integer classId;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @TableField(exist = false)
    private Classce classce;

    public Classce getClassce() {
        return classce;
    }

    public void setClassce(Classce classce) {
        this.classce = classce;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsBirth() {
        return sBirth;
    }

    public void setsBirth(String sBirth) {
        this.sBirth = sBirth == null ? null : sBirth.trim();
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sBirth='" + sBirth + '\'' +
                ", sSex='" + sSex + '\'' +
                ", classId=" + classId +
                ", classce=" + classce +
                '}';
    }
}