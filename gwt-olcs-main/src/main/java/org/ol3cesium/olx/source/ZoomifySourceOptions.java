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
package org.ol3cesium.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Attribution;
import org.ol3cesium.ol.Size;
import org.ol3cesium.ol.source.ZoomifyTiezSizeCalculation;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ZoomifySourceOptions extends JavaScriptObject {
    protected ZoomifySourceOptions() {
        //
    }
    
    public static native ZoomifySourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide 
     * a crossOrigin value if you are using the WebGL renderer or if you want to 
     * access pixel data with the Canvas renderer. See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     * @param crossOrigin 
     */
    public final native void setCrossOrigin(String crossOrigin) /*-{
        this.crossOrigin = crossOrigin;
    }-*/;
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;
    
    /**
     * 
     * @param url Prefix of URL template. Required.
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;

    /**
     * 
     * @param tierSizeCalculation Tier size calculation method: default or truncated.
     */
    public final native void setTierSizeCalculation(ZoomifyTiezSizeCalculation tierSizeCalculation) /*-{
        this.tierSizeCalculation = tierSizeCalculation.toString();
    }-*/;

    /**
     * 
     * @param size Size of the image. Required.
     */
    public final native void setSize(Size size) /*-{
        this.size = size;
    }-*/;
}
