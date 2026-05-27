/**
 * Copyright (C) 2010 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.jgeohash;

import de.alpharogroup.jgeohash.api.Position;
import lombok.Builder;
import lombok.EqualsAndHashCode;

/**
 * The class {@link Point} represents a point on earth with the latitude and longitude.
 */
@EqualsAndHashCode
@Builder(toBuilder = true)
public class Point implements Comparable<Point>, Cloneable, Position {

    /**
     * The serialVersionUID.
     */
    private static final long serialVersionUID = -4799959551221362673L;

    /**
     * The latitude.
     */
    private double latitude;

    /**
     * The longitude.
     */
    private double longitude;

    /**
     * Instantiates a new {@link Point} object.
     *
     * @param latitude
     *            the latitude
     * @param longitude
     *            the longitude
     */
    public Point(final double latitude, final double longitude) {
        if (Math.abs(latitude) > 90 || Math.abs(longitude) > 180) {
            throw new IllegalArgumentException("The given coordinates " + this.toString() + " are out of range.");
        }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object clone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(final Point other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getLatitude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getLongitude() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLatitude(final double latitude) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLongitude(final double longitude) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
