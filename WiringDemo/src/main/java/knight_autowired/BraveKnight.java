package knight_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// When we use @Component the bean is automatically found and instantiated by Spring Framework.
@Component
public class BraveKnight implements Knight{
	
	// Request autowiring. Spring Frameworkd will assign here an object that is the most suitable for this field.
	// @Qualified allows us to specify which concrete class
	// should be autowired here if there are more than one suitable beans.
	@Autowired
	@Qualifier("princessQuest")
	private Quest quest;
	
	public BraveKnight() {
		System.out.println("Brave Knight created!");
	}
	
	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
	
}
