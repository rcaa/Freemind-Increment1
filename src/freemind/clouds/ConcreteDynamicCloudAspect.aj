package freemind.clouds;

import freemind.main.XMLElement;
import freemind.util.AroundAdvice;
import freemind.util.Driver;
import freemind.view.mindmapview.NodeView;

public aspect ConcreteDynamicCloudAspect extends AbstractCloudAspect {

	pointcut driver(): if(Driver.isActivated("cloud"));

	pointcut instanceofCloudAdapter(XMLElement child) : AbstractCloudAspect.instanceofCloudAdapter(child) 
		&& driver();

	pointcut getAdditionalCloudHeight(NodeView node) : AbstractCloudAspect.getAdditionalCloudHeight(node) 
		&& driver();

	void around() : adviceexecution() && within(freemind.clouds.AbstractCloudAspect) 
		&& !@annotation(AroundAdvice) {
		if (Driver.isActivated("cloud")){
			proceed();
		}
	}
}
