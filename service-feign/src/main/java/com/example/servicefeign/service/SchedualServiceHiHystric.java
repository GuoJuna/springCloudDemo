package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * 功能描述:
 * 模块:
 * 项目:
 * 版本号:V1.0
 * 部门:技术研发部
 * 公司:浙江乐融融科技有限公司
 * 作者:郭军
 * 邮箱:864350301@qq.com
 * 创建时间:2018/12/27
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}
}
