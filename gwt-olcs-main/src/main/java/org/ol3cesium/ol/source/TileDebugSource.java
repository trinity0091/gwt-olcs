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

import org.ol3cesium.olx.source.TileDebugSourceOptions;

/**
 * A pseudo tile source, which does not fetch tiles from a server, but renders 
 * a grid outline for the tile grid/projection along with the coordinates for 
 * each tile. See examples/canvas-tiles for an example.
 * 
 * Uses Canvas context2d, so requires Canvas support.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileDebugSource extends TileSource {
    protected TileDebugSource() {
        //
    }
    
    public static native TileDebugSource create(TileDebugSourceOptions options) /*-{
        return new ol.source.TileDebug(options);
    }-*/;
}
