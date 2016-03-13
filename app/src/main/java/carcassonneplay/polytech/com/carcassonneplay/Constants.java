package carcassonneplay.polytech.com.carcassonneplay;

/**
 * Copyright 2014 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Constants used in this sample.
 */
public final class Constants {

    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS = 30000; // 1 mile, 1.6 km

    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        // Château Comtal
        BAY_AREA_LANDMARKS.put("Château Comtal", new LatLng(43.2072481,2.36309051));

        // Basilique St Nazaire
        BAY_AREA_LANDMARKS.put("Basilique St Nazaire", new LatLng(43.20538,2.36263));

        // Porte Narbonnaise
        BAY_AREA_LANDMARKS.put("Porte Narbonnaise", new LatLng(43.20676,2.36567));

        // Grand Puits
        BAY_AREA_LANDMARKS.put("Place Marcou", new LatLng(43.20657,2.36483));

        // Grand Puits
        BAY_AREA_LANDMARKS.put("Porte Narbonnaise", new LatLng(43.20744,2.36424));
    }
}