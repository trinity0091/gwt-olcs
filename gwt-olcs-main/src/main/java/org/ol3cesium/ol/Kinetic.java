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
package org.ol3cesium.ol;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Implementation of inertial deceleration for map movement.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Kinetic extends JavaScriptObject {
    protected Kinetic() {
        //
    }
    
    /**
     * Implementation of inertial deceleration for map movement.
     * @param decay Rate of decay (must be negative).
     * @param minVelocity Minimum velocity (pixels/millisecond).
     * @param delay Delay to consider to calculate the kinetic initial values (milliseconds).
     * @return 
     */
    public static native Kinetic create(double decay, double minVelocity, int delay) /*-{
        return new ol.Kinetic(decay, minVelocity, delay)
    }-*/;
}
