package com.yiliou.cloud.serviceregistry;

import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.context.ApplicationEvent;

/**
 * Created by yiliou on 2023/7/27.
 */
public class DbAutoServiceRegistration extends AbstractAutoServiceRegistration {

	private DbRegistration dbRegistration;

	private DbDiscoveryProperties dbDiscoveryProperties;

	protected DbAutoServiceRegistration(ServiceRegistry serviceRegistry,
			DbRegistration dbRegistration,
			DbDiscoveryProperties dbDiscoveryProperties,
			AutoServiceRegistrationProperties properties) {
		super(serviceRegistry, properties);
		this.dbRegistration = dbRegistration;
		this.dbDiscoveryProperties=dbDiscoveryProperties;
	}

	@Override
	protected Object getConfiguration() {
		return null;
	}

	@Override
	protected boolean isEnabled() {
		return false;
	}

	@Override
	protected Registration getRegistration() {
		return null;
	}

	@Override
	protected Registration getManagementRegistration() {
		return null;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {

	}
}
