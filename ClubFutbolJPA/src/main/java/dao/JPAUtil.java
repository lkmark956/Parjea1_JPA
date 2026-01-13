/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

    // ⚠️ Debe coincidir EXACTO con el name="" del persistence.xml
    private static final String PU = "com.club_ClubFutbolJPA_jar_1.0-SNAPSHOTPU";

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(PU);

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}



