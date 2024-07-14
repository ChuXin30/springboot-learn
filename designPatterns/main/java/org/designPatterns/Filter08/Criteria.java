package org.designPatterns.Filter08;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
