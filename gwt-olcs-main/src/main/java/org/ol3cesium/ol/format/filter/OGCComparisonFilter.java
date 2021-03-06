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

/**
 * Abstract class; normally only used for creating subclasses and not instantiated 
 * in apps. Base class for WFS GetFeature property comparison filters.
 * @author iserge
 */
public class OGCComparisonFilter extends OGCFilter {
    protected OGCComparisonFilter() {
        //
    }
    
    /**
     * 
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @return 
     */
    public static native OGCComparisonFilter create(String tagName, String propertyName) /*-{
        return new ol.format.ogc.filter.Comparison(tagName, propertyName);
    }-*/;
}
