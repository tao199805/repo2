package conn.dao;

import conn.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    List<Dept> selectAllDept();
}
