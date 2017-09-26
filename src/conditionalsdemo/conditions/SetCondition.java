package conditionalsdemo.conditions;

import conditionalsdemo.Config;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class SetCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        if(null == context) return false;
        Iterator<String> iterator= context.getBeanFactory().getBeanNamesIterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals("map")) return true;
        }
        return false;
    }
}
