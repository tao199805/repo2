package conn.service;

import conn.entity.Dept;

import java.util.HashMap;
import java.util.List;

public interface DeptService {
    List<Dept> selectAllDept();
   void updateById(Dept dept);
   void deleteByIds(Long ids);
   void insertIntoDept(Dept dept);
}
