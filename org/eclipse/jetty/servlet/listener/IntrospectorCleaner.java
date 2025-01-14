//
//  ========================================================================
//  Copyright (c) 1995-2022 Mort Bay Consulting Pty Ltd and others.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.servlet.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

/**
 * IntrospectorCleaner
 *
 * Cleans a static cache of Methods held by java.beans.Introspector
 * class when a context is undeployed.
 *
 * @see java.beans.Introspector
 */
public class IntrospectorCleaner implements ServletContextListener
{

    @Override
    public void contextInitialized(ServletContextEvent sce)
    {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)
    {
        java.beans.Introspector.flushCaches();
    }
}
