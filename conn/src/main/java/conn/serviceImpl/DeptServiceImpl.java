package conn.serviceImpl;

import conn.dao.DeptDao;
import conn.entity.Dept;
import conn.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptDao deptDao;
//查找所有部门信息
    @Override
    public List<Dept> selectAllDept() {
        return deptDao.selectAllDept();
    }

    @Override
    public void updateById(Dept dept) {

    }

    @Override
    public void deleteByIds(Long ids) {

    }

    @Override
    public void insertIntoDept(Dept dept) {

    }
}
