This project demonstrates on how to define a custom configuration to a specific ribbon client, instead of to all ribbon clients. This allows us to configure different client side load balance behaviour for different services.

@RibbonClient(name="serviceName", configuration=AServiceConfig.class)

The class AServiceConfig.class would contain the custom configurations that can be assigned to a specific ribbon client. THe custom configurations would be defined by the methods annotated with @Beans annotation. Since this configuration class pertains to a specific ribbon client, it should not be subjected to any @ComponentScan. Otherwise, this configuration would end up getting applied to all ribbon clients.

There are a number of different classes that are used to setup a ribbon client. By default spring cloud defines those as @Beans and allows you to override any of them for custom configurations.

The IRule bean controls the load balancing algorithm and the IPing bean controls the availability checks on the instances that are being load balanced. The existing IRule implementations are RoundRobinRule, ResponseTimeWeightedRule and RandomRule and ZoneAvoidanceRule. The existing IPing implementations are DummyPing, (which always returns true regardless of the liveliness of instances), PingUrl, NIWSDiscoveryPing

 