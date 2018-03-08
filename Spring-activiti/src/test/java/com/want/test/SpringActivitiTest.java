package com.want.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:conf/spring-*.xml" })
public class SpringActivitiTest {

	@Autowired
	ProcessEngine processEngine;
	
    @Autowired // 注入运行服务类
    private RuntimeService runtimeService;
    
    @Autowired // 注入任务服务类
    private TaskService taskService;
    
    @Autowired // 注入任务服务类
    private RepositoryService repositoryService;
    
	/**
	 * 
	 * <p>
	 * Title: createTable
	 * </p>
	 * <p>
	 * Description: 创建流程对象
	 * <p>
	 * <p>
	 * Company: want-want<／p> void
	 * 
	 * @throws ------╮(￣▽￣)╭------
	 */
	@Test
	public void createTable() {

		System.out.println("processEngine:" + processEngine);

	}

	/** 部署流程定义 */
	@Test
	public void deploymentProcessDefinition() {

		Deployment deployment = repositoryService// 与流程定义和部署对象相关的Service
				.createDeployment()// 创建一个部署对象
				.name("请假入门程序")// 添加部署的名称
				.addClasspathResource("process/leave.bpmn")// 从classpath的资源中加载，一次只能加载一个文件
				.deploy();// 完成部署
		System.out.println("部署ID：" + deployment.getId());// 1
		System.out.println("部署名称：" + deployment.getName());// helloworld入门程序

	}

	/** 启动流程实例 */
	@Test
	public void startProcessInstance() {
		// 流程定义的key
		String processDefinitionKey = "leave";
		ProcessInstance pi = runtimeService// 与正在执行的流程实例和执行对象相关的Service
				.startProcessInstanceByKey(processDefinitionKey);// 使用流程定义的key启动流程实例，key对应helloworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动
		System.out.println("流程实例ID:" + pi.getId());// 流程实例ID 101
		System.out.println("流程定义ID:" + pi.getProcessDefinitionId());// 流程定义ID 
	}

}
