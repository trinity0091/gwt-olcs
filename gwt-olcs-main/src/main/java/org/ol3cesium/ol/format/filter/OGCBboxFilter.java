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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.ol.format.filter;

import org.ol3cesium.ol.Extent;

/**
 * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
 * @author iserge
 */
public class OGCBboxFilter extends OGCFilter {
    protected OGCBboxFilter() {
        //
    }
    
    /**
     * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     */
    public static native OGCBboxFilter create(String geometryName, Extent extent, String srsName) /*-{
        return new ol.format.ogc.filter.Bbox(geometryName, extent, srsName);
    }-*/;
    
        /**
     * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @return Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     */
    public static native OGCBboxFilter create(String geometryName, Extent extent) /*-{
        return new ol.format.ogc.filter.Bbox(geometryName, extent, srsName);
    }-*/;
}
