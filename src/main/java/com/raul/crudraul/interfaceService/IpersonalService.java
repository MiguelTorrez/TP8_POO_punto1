
package com.raul.crudraul.interfaceService;

import com.raul.crudraul.modelo.personal;
import java.util.List;
import java.util.Optional;


public interface IpersonalService {
    public List<personal>listar();
    public Optional<personal>listarId(int dni);
    public int save(personal p);
    public void delete(int dni);
    
    
}
