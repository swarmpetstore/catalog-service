package org.packt.swarm.petstore;

import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.datasources.DatasourcesFraction;

public class Main {

    public static void main(String[] args) throws Exception {
        DatasourcesFraction datasourcesFraction = new DatasourcesFraction()
                //1
                .jdbcDriver("postgres", (d) -> {
                    d.driverClassName("org.postgresql.Driver");
                    d.xaDatasourceClass("org.postgresql.xa.PGXADataSource");
                    d.driverModuleName("org.postgresql.jdbc");
                })
                .dataSource("CatalogDS", (ds) -> {
                    ds.driverName("postgres");
                    ds.connectionUrl("jdbc:postgresql://172.30.81.105/postgres");
                    ds.userName("userR8W");
                    ds.password("g1GxalbwIkuYA0Ha");
                });
        
        Swarm swarm = new Swarm();
        swarm.fraction(datasourcesFraction);
        swarm.start().deploy();
    }
}