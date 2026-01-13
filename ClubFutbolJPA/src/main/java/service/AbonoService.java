/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Abono;
import model.Socio;

public class AbonoService {

    public void asignarAbono(EntityManager em, Socio socio, Abono nuevoAbono) {

        TypedQuery<Long> q = em.createQuery(
            "SELECT COUNT(a) FROM Abono a WHERE a.socio = :socio AND a.activo = true",
            Long.class
        );
        q.setParameter("socio", socio);

        Long activos = q.getSingleResult();
        if (activos != null && activos > 0) {
            throw new IllegalStateException("El socio ya tiene un abono activo");
        }

        nuevoAbono.setSocio(socio);
        nuevoAbono.setActivo(true);
        em.persist(nuevoAbono);
    }
}

