package com.example.demo.data.dataobject;

import javax.persistence.*;

/**
 * @author xxy
 * @date 2019/5/15
 * @description
 */
@Entity
@Table(name = "digitdata", schema = "digits", catalog = "")
public class DigitdataDO {
    private int index;
    private String value;
    private Integer kind;

    @Id
    @Column(name = "index")
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "kind")
    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DigitdataDO that = (DigitdataDO) o;

        if (index != that.index) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = index;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        return result;
    }
}
