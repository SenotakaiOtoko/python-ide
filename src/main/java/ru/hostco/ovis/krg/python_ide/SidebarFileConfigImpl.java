package ru.hostco.ovis.krg.python_ide;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author rybakov
 *
 */
public class SidebarFileConfigImpl implements SidebarFileConfig {
	
	HashMap<String, SidebarFile> fileMap = new LinkedHashMap<String, SidebarFile>();
	
	public SidebarFileConfigImpl() {
		fileMap.put("main", new SidebarFile("main", "main.py", ""));
	}
	
	public List<SidebarFile> getFiles() {
		return new ArrayList<SidebarFile>(fileMap.values());
	}

	public SidebarFile getFile(String name) {
		return fileMap.get(name);
	}
	
	public void addFile(String name, String label) {
		fileMap.put(name, new SidebarFile(name, label, ""));
	}

}
