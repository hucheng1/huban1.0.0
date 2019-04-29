package com.service.SeriverImpl;

import com.dao.*;
import com.entity.*;
import com.entity.Services;
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
    public List<Categorize> selectAllc() {
        return cdao.selectAllc();
    }

    @Override
    public List<Services> seelctSon(Integer fcid, Integer fsid,int pageIndex,int pageSize) {//设计服务，高级查询，分页
        return sdao.seelctSon(fcid,fsid,pageIndex,pageSize);
    }
//高级查询

    @Override//服务查询全部
    public List<Services> selectSeAll() {//查询全部服务
        return sdao.selectSeAll();
    }

    @Override
    public int findTotalPage(Integer fcid, Integer fsid) {//页面总数
        return sdao.findTotalPage(fcid,fsid);
    }//设计服务总页数

    @Override
    public List<Good> selectGood() {
        return gdao.selectGood();
    }//查询全部设计师分类

    @Override
    public int pageCount(Integer fdid) {
        return ddao.pageCount(fdid);//设计师总页数
    }

    @Override
    public List<Designer> selectAlld(Integer fgid, int pageIndex, int pageSize) {//分页，查询全部设计师
        List<Designer>des=ddao.selectAlld(fgid, pageIndex, pageSize);
        for(Designer dd:des){
            List<Good>good=gdao.selectByDesid(dd.getFdId());
            int cou=sdao.ByfesidCount(dd.getFdId());
            dd.setCounts(cou);
            dd.setGood(good);
        }
        return des;
}

    @Override
    public List<Good> selectByDesid(Integer fdid) {
        return gdao.selectByDesid(fdid);
    }

    @Override
    public int ByfesidCount(Integer fdid) {
        return sdao.ByfesidCount(fdid);
    }

    @Override
    public List<Services> fesidCount(Integer fdid) {
        return sdao.fesidCount(fdid);
    }

    @Override
    public List<Designer> toSelectAll(Integer fdid) {
        List<Designer>des=ddao.toSelectAll(fdid);
        for(Designer dd:des) {
            List<Good> good = gdao.selectByDesid(dd.getFdId());
            int cou = sdao.ByfesidCount(dd.getFdId());
            dd.setCounts(cou);
            dd.setGood(good);
        }
        return des;
    }

    @Override
    public List<Services> ByfdidSelect(Integer fdid) {
        return sdao.ByfdidSelect(fdid);
    }

    @Override
    public Services selectSeall(Integer fseid) {
        return sdao.selectSeall(fseid);
    }


    @Override
    public String selectText(Integer fseid) {
        return sdao.selectText(fseid);
    }
}

