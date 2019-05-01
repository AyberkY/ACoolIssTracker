package edu.illinois.cs.cs125.spring2019.lab12;

import android.os.UserHandle;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/** setting cluster/icon.
 *
 */
public class ClusterMarker implements ClusterItem {
    /** position.
     */
    private LatLng postion;
    /** comment.
     */
    private String title;
    /** comment.
     */
    private String snippet;
    /** comment.
     */
    private int iconPicture;

    /** comment.
     */
    private UserHandle user;
    /** does LATLING.
     * @return
     */
    public LatLng getPosition() {
        return null;
    }

    /**\String to getTitle.
     * @return
     */
    public String getTitle() {
        return null;
    }

    /** String to getSnippet.
     * @return
     */
    public String getSnippet() {
        return null;
    }
}
