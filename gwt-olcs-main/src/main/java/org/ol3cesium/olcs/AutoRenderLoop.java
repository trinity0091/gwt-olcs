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
package org.ol3cesium.olcs;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AutoRenderLoop extends JavaScriptObject {
    protected AutoRenderLoop() {
        //
    }

    /**
     * Restart render loop. Force a restart of the render loop.
     */
    public final native void restartRenderLoop() /*-{
        this.restartRenderLoop();
    }-*/;
    
    /**
     * 
     * @param debug Set out put debug information flag.
     */
    public final native void setDebug(boolean debug) /*-{
        this.setDebug(debug);
    }-*/;
}
