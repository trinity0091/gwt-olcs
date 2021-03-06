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
package org.ol3cesium.ol.event;

import org.ol3cesium.ol.Collection;
import org.ol3cesium.ol.Feature;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ModifyInteractionEvent extends Event {
    public enum Type{MODIFY_END, MODIFY_START, UNKNOWN}

    protected ModifyInteractionEvent() {
        //
    }
    
    public native final Collection<Feature> getFeatures() /*-{
        return this.features;
    }-*/;
    
    public final Type getType() {
        String type = getNativeType();
        switch (type) {
            case "modifyend":
                return Type.MODIFY_END;
            case "modifystart":
                return Type.MODIFY_START;
            default:
                return Type.UNKNOWN;
        }
    }
}
