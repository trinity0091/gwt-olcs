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
package org.ol3cesium.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragRotateInteractionOptions extends JavaScriptObject {
    protected DragRotateInteractionOptions() {
        //
    }
    
    public static native DragRotateInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Animation duration in milliseconds. Default is 250.
     * @param duration Animation duration.
     */
    public final native void setDuration(int duration) /*-{
        this.duration = duration;
    }-*/;
}
