package cn.szu.tech.controller_admin.sys.syssetting.repository;

import cn.szu.tech.controller_admin.common.repository.CommonRepository;
import cn.szu.tech.controller_admin.sys.syssetting.pojo.SysSetting;
import org.springframework.stereotype.Repository;

@Repository
public interface SysSettingRepository extends CommonRepository<SysSetting, String> {
}
