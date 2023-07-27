package com.yiliou.cloud.serviceregistry;

import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

/**
 * Created by yiliou on 2023/7/27.
 */
public class DbServiceRegistry implements ServiceRegistry {

	@Override
	public void register(Registration registration) {

	}

	@Override
	public void deregister(Registration registration) {

	}

	@Override
	public void close() {

	}

	@Override
	public void setStatus(Registration registration, String status) {

	}

	@Override
	public Object getStatus(Registration registration) {
		return null;
	}
}
