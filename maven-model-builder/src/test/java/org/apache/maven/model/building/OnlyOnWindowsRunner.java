package org.apache.maven.model.building;

import org.apache.commons.lang3.SystemUtils;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 *
 * @author Fabiano
 */
public class OnlyOnWindowsRunner extends BlockJUnit4ClassRunner 
{
    
    public OnlyOnWindowsRunner(Class klass) throws InitializationError 
    {
        super(klass);
    }
    
    @Override
    public void run(RunNotifier notifier) {
        if (SystemUtils.IS_OS_WINDOWS) {
            super.run(notifier);            
        }
    }    
}
