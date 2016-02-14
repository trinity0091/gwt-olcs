/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.client.olx.format;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class IGCFormatOptions extends JavaScriptObject {
    protected IGCFormatOptions() {
        //
    }
    
    public static final native IGCFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Altitude mode. Possible values are barometric, gps, and none. Default is none.
     * @param altitudeMode 
     */
    public final native void setAltitudeMode(String altitudeMode) /*-{
        this.altitudeMode = altitudeMode;
    }-*/;
}