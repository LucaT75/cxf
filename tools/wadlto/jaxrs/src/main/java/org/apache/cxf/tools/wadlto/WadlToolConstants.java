/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.tools.wadlto;

import org.apache.cxf.tools.common.ToolConstants;

public final class WadlToolConstants {

    public static final String CFG_OUTPUTDIR = ToolConstants.CFG_OUTPUTDIR;
    public static final String CFG_COMPILE = ToolConstants.CFG_COMPILE;
    public static final String CFG_CLASSDIR = ToolConstants.CFG_CLASSDIR;
    
    /**
     * Default
     */
    public static final String CFG_INTERFACE = ToolConstants.CFG_INTERFACE;
    public static final String CFG_SERVER = ToolConstants.CFG_SERVER;
    public static final String CFG_TYPES = ToolConstants.CFG_TYPES;
    public static final String CFG_PACKAGENAME = ToolConstants.CFG_PACKAGENAME;
    public static final String CFG_RESOURCENAME = "resourcename";
    
    public static final String CFG_CATALOG = ToolConstants.CFG_CATALOG;
    public static final String CFG_BINDING = ToolConstants.CFG_BINDING;
    
    public static final String CFG_WADLURL = "wadl";
    
    
    
    private WadlToolConstants() {
        //utility class
    }
}
