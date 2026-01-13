package app;

import dao.JPAUtil;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import model.Abono;
import model.Pago;
import model.Socio;
import service.AbonoService;

public class Main {

    public static void main(String[] args) {

        EntityManager em = JPAUtil.getEntityManager();
        AbonoService abonoService = new AbonoService();

        try {
            em.getTransaction().begin();

            // 1) Crear Socio
            Socio s = new Socio();
            s.setDni("44444444D");
            s.setNombre("Lucía Martínez");
            s.setEmail("lucia@correo.com");
            s.setFechaAlta(LocalDate.now());
            s.setCuotaMensual(new BigDecimal("40.00"));
            em.persist(s);

            // 2) Crear 1 abono activo
            Abono a1 = new Abono();
            a1.setNumero(5001);
            a1.setZona("Tribuna");
            a1.setFila(2);
            a1.setAsiento(8);
            a1.setPrecio(new BigDecimal("250.00"));
            abonoService.asignarAbono(em, s, a1);

            // 3) Crear 1 pago
            Pago p1 = new Pago();
            p1.setSocio(s);
            p1.setFecha(LocalDate.now());
            p1.setImporte(new BigDecimal("40.00"));
            p1.setConcepto("Cuota Enero");
            em.persist(p1);

            em.getTransaction().commit();
            System.out.println("✅ OK: tablas creadas y datos insertados en club_futbol_jpa");

            // 4) Consultas JPQL (para enseñar)
            List<Pago> pagos = em.createQuery(
                    "SELECT p FROM Pago p WHERE p.socio.id = :id ORDER BY p.fecha DESC",
                    Pago.class
            ).setParameter("id", s.getId())
             .getResultList();

            System.out.println("Pagos del socio " + s.getNombre() + ": " + pagos.size());

        } catch (Exception ex) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            System.out.println("⚠️ ROLLBACK por: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            em.close();
            JPAUtil.close();
        }
    }
}

