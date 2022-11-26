package com.venta.venta.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.venta.venta.model.Factura;
import com.venta.venta.repository.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;

    //public List<PersonaDireccionDTO> getPersonaDireccion(){
      //  return personaRepository.findAll().stream().map(this::convertirEntidadToDTO).collect(Collectors.toList());
    //}

    /**private PersonaDireccionDTO convertirEntidadToDTO(Persona persona){
        PersonaDireccionDTO personaDireccionDTO = new PersonaDireccionDTO();
        personaDireccionDTO.setPersonaId(persona.getId());        
        return personaDireccionDTO;
    }

    **/

    public Factura create(Factura factura){
        return facturaRepository.save(factura);
    }

    public List<Factura> listarFacturas(){
        return facturaRepository.findAll();
    }

    public void eliminarFactura(Factura factura){
        facturaRepository.delete(factura);
    }


    public Factura buscarId(Long id){
        return facturaRepository.findById(id).get();
    }
}
