/*FreeMind - A Program for creating and viewing Mindmaps
 *Copyright (C) 2000-2004  Joerg Mueller, Daniel Polansky, Christian Foltin and others.
 *
 *See COPYING for Details
 *
 *This program is free software; you can redistribute it and/or
 *modify it under the terms of the GNU General Public License
 *as published by the Free Software Foundation; either version 2
 *of the License, or (at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, write to the Free Software
 *Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Created on 25.08.2004
 */
/*$Id: NewSiblingAction.java,v 1.1.4.1 2004/10/17 23:00:10 dpolivaev Exp $*/
package freemind.modes.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import freemind.modes.ControllerAdapter;


public class NewSiblingAction extends AbstractAction {
    private final ControllerAdapter controller;
	public NewSiblingAction(ControllerAdapter controller) {
        super(controller.getText("new_sibling_behind"));
		this.controller = controller;
    }
    public void actionPerformed(ActionEvent e) {
        controller.addNew(controller.getSelected(), ControllerAdapter.NEW_SIBLING_BEHIND, null);
    }
}