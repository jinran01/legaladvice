package com.fiee.legaladvice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fiee.legaladvice.entity.LawyerAuth;
import com.fiee.legaladvice.vo.ConditionVO;
import com.fiee.legaladvice.vo.PageResult;

/**
 * @Author: Fiee
 * @ClassName: LawyerAuthService
 * @Date: 2024/4/23
 * @Version: v1.0.0
 **/
public interface LawyerAuthService extends IService<LawyerAuth> {
    PageResult<LawyerAuth> getLawyerList(ConditionVO vo);
}
