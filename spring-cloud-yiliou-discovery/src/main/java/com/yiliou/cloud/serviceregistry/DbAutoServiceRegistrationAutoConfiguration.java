package com.yiliou.cloud.serviceregistry;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationAutoConfiguration;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yiliou on 2023/7/27.
 */
@Configuration(proxyBeanMethods = false)
@AutoConfigureAfter({DbServiceRegistryAutoConfiguration.class})
@AutoConfigureBefore({AutoServiceRegistrationAutoConfiguration.class})
public class DbAutoServiceRegistrationAutoConfiguration {

	@Bean
	public DbAutoServiceRegistration dbAutoServiceRegistration(DbServiceRegistry serviceRegistry,
			DbRegistration dbRegistration,
			DbDiscoveryProperties dbDiscoveryProperties) {
		return new DbAutoServiceRegistration(serviceRegistry, dbRegistration, dbDiscoveryProperties, null);
	}

	@Bean
	public Registration registration() {
		return new DbRegistration();
	}
}
