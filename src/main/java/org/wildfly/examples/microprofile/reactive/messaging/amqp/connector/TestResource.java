/*
 * Copyright The WildFly Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.wildfly.examples.microprofile.reactive.messaging.amqp.connector;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/last")
public class TestResource {

	@Inject
	ConsumingBean bean;

	@GET
	public long getLast() {
		return bean.get();
	}

}
