package com.yiliou.cloud.serviceregistry;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.serviceregistry.ServiceRegistryAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yiliou on 2023/7/27.
 */
@Configuration(proxyBeanMethods = false)
@AutoConfigureBefore(ServiceRegistryAutoConfiguration.class)
public class DbServiceRegistryAutoConfiguration {

	@Bean
	public DbServiceRegistry dbServiceRegistry() {
		return new DbServiceRegistry();
	}

	@Bean
	@ConditionalOnMissingBean
	public DbDiscoveryProperties dbDiscoveryProperties(){
		return new DbDiscoveryProperties();
	}
}
