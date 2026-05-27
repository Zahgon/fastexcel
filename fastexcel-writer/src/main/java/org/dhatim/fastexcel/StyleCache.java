/*
 * Copyright 2016 Dhatim.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dhatim.fastexcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/**
 * Thread-safe cache for shared styles. Check out
 * http://officeopenxml.com/SSstyles.php for more information about styles.
 */
final class StyleCache {

    private final ConcurrentMap<String, Integer> valueFormattings = new ConcurrentHashMap<>();

    private final ConcurrentMap<Font, Integer> fonts = new ConcurrentHashMap<>();

    private final ConcurrentMap<Fill, Integer> fills = new ConcurrentHashMap<>();

    private final ConcurrentMap<Border, Integer> borders = new ConcurrentHashMap<>();

    private final ConcurrentMap<Style, Integer> styles = new ConcurrentHashMap<>();

    private final ConcurrentMap<Integer, Style> styleIndexToStyle = new ConcurrentHashMap<>();

    private final ConcurrentMap<DifferentialFormat, Integer> dxfs = new ConcurrentHashMap<>();

    /**
     * Default constructor. Pre-cache Excel-reserved stuff.
     */
    StyleCache() {
        mergeAndCacheStyle(0, null, Font.DEFAULT, Fill.NONE, Border.NONE, null, null);
        cacheFill(Fill.GRAY125);
    }

    /**
     * Generic caching method.
     *
     * @param <T> Type of the cached objects.
     * @param cache Cache instance.
     * @param t Object being cached.
     * @param indexFunction Function to compute the index of the newly cached
     * object.
     * @return Index of the cached object.
     */
    private static <T> int cacheStuff(ConcurrentMap<T, Integer> cache, T t, Function<T, Integer> indexFunction) {
        return cache.computeIfAbsent(t, indexFunction);
    }

    /**
     * Cache a style and maintain reverse index for O(1) lookup.
     *
     * @param style Style to cache.
     * @param indexFunction Function to compute the index of the newly cached style.
     * @return Index of the cached style.
     */
    private int cacheStyle(Style style, Function<Style, Integer> indexFunction) {
        Integer index = styles.computeIfAbsent(style, indexFunction);
        styleIndexToStyle.putIfAbsent(index, style);
        return index;
    }

    /**
     * Caching method returning zero-based indexes.
     *
     * @param <T> Type of the cached objects.
     * @param cache Cache instance.
     * @param t Object being cached.
     * @return Index of the cached object.
     */
    private static <T> int cacheStuff(ConcurrentMap<T, Integer> cache, T t) {
        return cacheStuff(cache, t, k -> cache.size());
    }

    /**
     * Cache the given value formatting.
     *
     * @param s Value formatting.
     * @return Index of the cached format.
     */
    int cacheValueFormatting(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Cache the given font.
     *
     * @param f Font.
     * @return Index of the cached font.
     */
    int cacheFont(Font f) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Cache the given fill pattern.
     *
     * @param f Fill pattern.
     * @return Index of the cached fill pattern.
     */
    int cacheFill(Fill f) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Cache the given border.
     *
     * @param b Border.
     * @return Index of the cached border.
     */
    int cacheBorder(Border b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Cache the given fill pattern as a shading color for rows.
     *
     * @param f Fill pattern.
     * @return Index of the cached fill pattern.
     */
    int cacheDxf(DifferentialFormat f) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    int mergeAndCacheStyle(int currentStyle, String numberingFormat, Font font, Fill fill, Border border, Alignment alignment, Protection protection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void replaceDefaultFont(Font font) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write a cache as an XML element.
     *
     * @param <T> Type of the cached objects.
     * @param w Output writer.
     * @param cache Cache instance.
     * @param name Name of the XML element.
     * @param consumer Consumer to write cached elements.
     * @throws IOException If an I/O error occurs.
     */
    private static <T> void writeCache(Writer w, Map<T, Integer> cache, String name, ThrowingConsumer<Entry<T, Integer>> consumer) throws IOException {
        w.append('<').append(name).append(" count=\"").append(cache.size()).append("\">");
        List<Entry<T, Integer>> entries = new ArrayList<>(cache.entrySet());
        entries.sort(Comparator.comparingInt(Entry::getValue));
        for (Entry<T, Integer> e : entries) {
            consumer.accept(e);
        }
        w.append("</").append(name).append('>');
    }

    /**
     * Write this style cache as an XML file.
     *
     * @param w Output writer.
     * @throws IOException If an I/O error occurs.
     */
    void write(Writer w) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
