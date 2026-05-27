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
package de.alpharogroup.jgeohash.model;

import de.alpharogroup.merge.api.Mergeable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * The class {@link Section} represents a section with start and end point.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@Builder(toBuilder = true)
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Section implements Mergeable<Section> {

    /**
     * Checks the given int index is between the range from min and max.
     *
     * @param min
     *            The minimum.
     * @param max
     *            The maximum.
     * @param index
     *            The index.
     * @param includeMin
     *            if true than min value is included
     * @param includeMax
     *            if true than max value is included
     * @return Returns true if the index is between the range from min and max considered the given
     *         flags otherwise false.
     */
    public static boolean isBetween(final int min, final int max, final int index, final boolean includeMin, final boolean includeMax) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The end.
     */
    int end;

    /**
     * The start.
     */
    int start;

    /**
     * Checks if the given {@link Section} is between this {@link Section} object.
     *
     * @param other
     *            the other {@link Section} object
     * @return true, if the given {@link Section} is between this {@link Section} object otherwise
     *         false.
     */
    public boolean isBetween(final Section other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this {@link Section} is to left from the given {@link Section} object.
     *
     * @param other
     *            the other {@link Section} object
     * @return true, if this {@link Section} is to left from the given {@link Section} object
     *         otherwise false.
     */
    public boolean isToLeft(final Section other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this {@link Section} is to right from the given {@link Section} object.
     *
     * @param other
     *            the other {@link Section} object
     * @return true, if this {@link Section} is to right from the given {@link Section} object
     *         otherwise false.
     */
    public boolean isToRight(final Section other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Section merge(final Section other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Checks if this {@link Section} overlaps with the given {@link Section} object.
     *
     * @param other
     *            the other {@link Section} object
     * @return true, if this {@link Section} overlaps with the given {@link Section} object
     *         otherwise false.
     */
    public boolean overlapsWith(final Section other) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
