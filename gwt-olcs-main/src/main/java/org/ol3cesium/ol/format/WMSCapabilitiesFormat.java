/*
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.ol.format;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Format for reading WMS capabilities data
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMSCapabilitiesFormat extends XMLFormat {
    protected WMSCapabilitiesFormat() {
        //
    }
    
    public static native WMSCapabilitiesFormat create() /*-{
        return new ol.format.WMSCapabilities();
    }-*/;
    
    /**
     * Read a WMS capabilities document.
     * @param source The XML source.
     * @return An object representing the WMS capabilities.
     */
    public final native JavaScriptObject read(String source) /*-{
        return this.read(source);
    }-*/;
}
