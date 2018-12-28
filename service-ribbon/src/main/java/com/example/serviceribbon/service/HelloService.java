package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-Client/hi?name="+name,String.class);
	}

	public String hiError(String name){
		return "hi,"+name+",sorry,error!";
	}

}
