package conn.entity;

import lombok.Data;

@Data
public class Dept {
    private String deptName;//部门名称
    private String superiorDeptCode;//超级部门编码
    private Integer clinicAttr;//诊所
    private Long serialNo;//序列号
    private String deptCode;//部门编码
    private String deptFlag;//部门旗?部门所在地
    private Long versionNumber;//版本号
    private Long hospitalCode;//医院代码
    private String wubiCode;//五笔代码?
    private String inputCode;//插入代码?

}
