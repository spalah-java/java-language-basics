/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package ua.spalah.hibernate;

import ua.spalah.hibernate.models.CheckingAccount;
import ua.spalah.hibernate.models.Client;
import ua.spalah.hibernate.models.SavingAccount;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountsMain {

    public static void main(String... args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kukuruza");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        SavingAccount acc1 = new SavingAccount(1500.0);
        SavingAccount acc2 = new SavingAccount(270.8);
        CheckingAccount acc3 = new CheckingAccount(700, 500);

//        entityManager.persist(acc1);
//        entityManager.persist(acc2);
//        entityManager.persist(acc3);

        Client client = new Client();
        client.setName("Benedict Camerbasdfdjdfgadch");

        client.setActiveAccount(acc1);
        client.getAccounts().add(acc1);
        client.getAccounts().add(acc2);
        client.getAccounts().add(acc3);

        entityManager.persist(client);

        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
