package pagemodel;

/**
 * 
* <p>Title: Process<／p>
* <p>Description: 进程实体类<／p>
* <p>Company: want-want<／p> 
* @author 00319159
* @date 2018年3月8日 下午4:50:18
------\(˙<>˙)/------
 */
public class Process {
	String id;
	String DeploymentId;
	String name;
	String ResourceName;
	String key;
	String diagramresourcename;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeploymentId() {
		return DeploymentId;
	}
	public void setDeploymentId(String deploymentId) {
		DeploymentId = deploymentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResourceName() {
		return ResourceName;
	}
	public void setResourceName(String resourceName) {
		ResourceName = resourceName;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getDiagramresourcename() {
		return diagramresourcename;
	}
	public void setDiagramresourcename(String diagramresourcename) {
		this.diagramresourcename = diagramresourcename;
	}
	
}
