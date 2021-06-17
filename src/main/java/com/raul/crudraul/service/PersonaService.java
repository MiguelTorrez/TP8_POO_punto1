package com.raul.crudraul.service;

import com.raul.crudraul.interfaceService.IpersonalService;
import com.raul.crudraul.interfaces.ipersonal;
import com.raul.crudraul.modelo.personal;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IpersonalService {

    @Autowired
    private ipersonal data;

    @Override
    public List<personal> listar() {
        return (List<personal>) data.findAll();
    }

    @Override
    public Optional<personal> listarId(int dni) {
       return data.findById(dni);
    }

    @Override
    public int save(personal p) {
        int res = 0;
        personal empleado = data.save(p);
        if (!empleado.equals(null)) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(int dni) {
        data.deleteById(dni);
    }

}
