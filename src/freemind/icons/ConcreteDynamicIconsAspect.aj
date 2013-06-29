package freemind.icons;

import freemind.util.AroundAdvice;
import freemind.util.Driver;
import freemind.view.mindmapview.EditNodeTextField;

public aspect ConcreteDynamicIconsAspect extends AbstractIconsAspect {

	pointcut driver(): if(Driver.isActivated("icons"));
	
	pointcut getIcons(EditNodeTextField cthis) : AbstractIconsAspect.getIcons(cthis) 
		&& driver();

	pointcut linkIconWidth(EditNodeTextField cthis, int xOffset,
			int linkIconWidth) 
	 : AbstractIconsAspect.linkIconWidth(cthis, xOffset, linkIconWidth) 
	 	&& driver();

	void around() : adviceexecution() && within(freemind.icons.AbstractIconsAspect) 
		&& !@annotation(AroundAdvice) {
		if (Driver.isActivated("icons")){
			proceed();
		}
	}
}
