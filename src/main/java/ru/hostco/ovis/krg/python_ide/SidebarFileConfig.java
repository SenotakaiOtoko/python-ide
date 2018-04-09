/**
 * 
 */
package ru.hostco.ovis.krg.python_ide;

import java.util.List;

/**
 * @author rybakov
 *
 */
public interface SidebarFileConfig {
	/** get files of this application **/
	public List<SidebarFile> getFiles();
	
	/** get files **/
	public SidebarFile getFile(String name);
}
