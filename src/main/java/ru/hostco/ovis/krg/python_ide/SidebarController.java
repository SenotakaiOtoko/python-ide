/**
 * 
 */
package ru.hostco.ovis.krg.python_ide;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.event.SerializableEventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Grid;
import org.zkoss.zul.Image;
import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.Rows;;

/**
 * @author rybakov
 *
 */
public class SidebarController extends SelectorComposer<Component> {
	@Wire
	Grid fnList;
	
	SidebarFileConfig pageConfig = new SidebarFileConfigImpl();
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		Rows rows = fnList.getRows();
		
		for (SidebarFile file : pageConfig.getFiles()) {
			Row row = constructFileRow(file.getLabel());
			rows.appendChild(row);
		}
	}

	private Row constructFileRow(String label) {
		Row row = new Row();
		Label lab = new Label(label);
		row.appendChild(lab);
		
		row.setClass("sidebar-file");
		
		EventListener<Event> actionListener = new SerializableEventListener<Event>() {

			public void onEvent(Event event) throws Exception {
				//redirect
				//Executions.getCurrent().sendRedirect("http://python.com/");
				//event.getPage().get
				
			}
		};
		
		row.addEventListener(Events.ON_CLICK, actionListener);
		
		return row;
	}
}
