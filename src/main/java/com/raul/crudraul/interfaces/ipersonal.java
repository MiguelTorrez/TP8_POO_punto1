
package com.raul.crudraul.interfaces;

import com.raul.crudraul.modelo.personal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ipersonal extends CrudRepository <personal, Integer> {
    
}
