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
package org.ol3cesium.ol.source;

import org.ol3cesium.olx.source.OSMSourceOptions;

/**
 * Layer source for the OpenStreetMap tile server.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OSMSource extends XYZSource {
    protected OSMSource() {
        //
    }
    
    public static native OSMSource create() /*-{
        return new ol.source.OSM();
    }-*/;
    
    public static native OSMSource create(OSMSourceOptions options) /*-{
        return new ol.source.OSM(options);
    }-*/;
}
