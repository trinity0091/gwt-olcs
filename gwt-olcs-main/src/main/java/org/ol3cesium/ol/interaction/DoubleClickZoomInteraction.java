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
package org.ol3cesium.ol.interaction;

import org.ol3cesium.olx.interaction.DoubleClickZoomInteractionOptions;

/**
 * Allows the user to zoom by double-clicking on the map.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DoubleClickZoomInteraction extends Interaction {
    protected DoubleClickZoomInteraction() {
        //
    }
    
    public static native DoubleClickZoomInteraction create() /*-{
        return new ol.interaction.DoubleClickZoom();
    }-*/;
    
    public static native DoubleClickZoomInteraction create(DoubleClickZoomInteractionOptions options) /*-{
        return new ol.interaction.DoubleClickZoom(options);
    }-*/;
}
