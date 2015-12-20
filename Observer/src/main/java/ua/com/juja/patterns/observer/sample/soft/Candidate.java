package ua.com.juja.patterns.observer.sample.soft;

import java.util.Collection;
import java.util.Set;

public interface Candidate {
    
    // кандидат умеет получать уведомления о вакансиях
	void haveANew(Collection<Vacancy> vacancies);

	Set<String> getTechnologies();
}
