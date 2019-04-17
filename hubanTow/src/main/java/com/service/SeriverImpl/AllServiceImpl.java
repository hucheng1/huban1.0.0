package com.service.SeriverImpl;

import com.dao.*;
import com.entity.Categorize;
import com.service.IAllSerivce;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@MapperScan("com.dao")
@Service("AllServiceImpl")
public class AllServiceImpl implements IAllSerivce {

    private ICategorize cdao;
    private IDesigner ddao;
    private IDesignerGood dgdao;
    private IExtended edao;
    private IExtendeds esdao;
    private IGood gdao;
    private IOrder odao;
    private IOriginal ordao;
    private IService sdao;
    private ISubclassification sudao;

    public ICategorize getCdao() {
        return cdao;
    }

    @Autowired
    public void setCdao(ICategorize cdao) {
        this.cdao = cdao;
    }

    public IDesigner getDdao() {
        return ddao;
    }
    @Autowired
    public void setDdao(IDesigner ddao) {
        this.ddao = ddao;
    }

    public IDesignerGood getDgdao() {
        return dgdao;
    }
    @Autowired
    public void setDgdao(IDesignerGood dgdao) {
        this.dgdao = dgdao;
    }

    public IExtended getEdao() {
        return edao;
    }
    @Autowired
    public void setEdao(IExtended edao) {
        this.edao = edao;
    }

    public IExtendeds getEsdao() {
        return esdao;
    }
    @Autowired
    public void setEsdao(IExtendeds esdao) {
        this.esdao = esdao;
    }

    public IGood getGdao() {
        return gdao;
    }
    @Autowired
    public void setGdao(IGood gdao) {
        this.gdao = gdao;
    }

    public IOrder getOdao() {
        return odao;
    }
    @Autowired
    public void setOdao(IOrder odao) {
        this.odao = odao;
    }

    public IOriginal getOrdao() {
        return ordao;
    }
    @Autowired
    public void setOrdao(IOriginal ordao) {
        this.ordao = ordao;
    }

    public IService getSdao() {
        return sdao;
    }
    @Autowired
    public void setSdao(IService sdao) {
        this.sdao = sdao;
    }

    public ISubclassification getSudao() {
        return sudao;
    }
    @Autowired
    public void setSudao(ISubclassification sudao) {
        this.sudao = sudao;
    }




    @Override
    public List<Categorize> selectAllc() {//查询全部父分类
        return cdao.selectAllc();
    }

}
