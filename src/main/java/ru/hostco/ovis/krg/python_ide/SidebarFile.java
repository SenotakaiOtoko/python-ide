package ru.hostco.ovis.krg.python_ide;

import java.io.Serializable;

/**
 * @author rybakov
 *
 */
public class SidebarFile implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	String label;
	String content;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public SidebarFile(String name, String label, String content) {
		this.name = name;
		this.label = label;
		this.content = content;
	}
	

}
