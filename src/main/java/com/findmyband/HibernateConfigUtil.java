package com.findmyband;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateConfigUtil {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
            try {
                if(sessionFactory == null) {
                //create the session factory
                registry = new StandardServiceRegistryBuilder().configure().build();

                //Create the metadatasource
                MetadataSources sources = new MetadataSources(registry);
                Metadata metadata = sources.getMetadataBuilder().build();

                //Create the factory
                sessionFactory = metadata.getSessionFactoryBuilder().build();
                }

            } catch (Exception e) {
                e.printStackTrace();
                shutdown();
            }
        return sessionFactory;
    }

    public static void shutdown() {
        if(registry!=null) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
