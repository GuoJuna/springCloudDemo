package com.example.servicefeign.controller;

import com.example.servicefeign.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
@RestController
public class HiController {


	//编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
	@Resource
	SchedualServiceHi schedualServiceHi;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		return schedualServiceHi.sayHiFromClientOne( name );
	}
}
