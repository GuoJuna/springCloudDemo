package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

