/**
 * This file is part of XtraAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 - 2016 XtraStudio <https://github.com/XtraStudio>
 * Copyright (c) Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.xtra.api.entity;

import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.event.cause.entity.spawn.SpawnType;
import org.spongepowered.api.event.cause.entity.spawn.SpawnTypes;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * A class for convenient entity handling methods.
 */
public interface EntityHandler {

    /**
     * Creates and spawns an entity, handling all checks, and returns if the
     * entity spawned successfully.
     * 
     * @param loc The spawn location
     * @param type The type of the entity
     * @return If the entity spawned successfully
     */
    default boolean spawnEntity(Location<World> loc, EntityType type) {
        return spawnEntity(loc, type, SpawnTypes.PLUGIN);
    }

    /**
     * Creates and spawns an entity, handling all checks, and returns if the
     * entity spawned successfully.
     * 
     * @param loc The spawn location
     * @param type The type of the entity
     * @param spawnType The spawn type
     * @return If the entity spawned successfully
     */
    boolean spawnEntity(Location<World> loc, EntityType type, SpawnType spawnType);

    /**
     * Spawns an item with a default spawn cause of {@link SpawnTypes#PLUGIN}
     * and a quantity of one.
     * 
     * @param loc The location to spawn the item in
     * @param type The item type to spawn in
     * @return If the item spawned successfully
     */
    default boolean spawnItem(Location<World> loc, ItemType type) {
        return spawnItem(loc, type, SpawnTypes.PLUGIN, 1);
    }

    /**
     * Spawns an item with the specified spawn type as its spawn cause, with a
     * default quantity of one.
     * 
     * @param loc The location to spawn the item in
     * @param type The item type to spawn in
     * @param spawnType The spawn type
     * @return If the item spawned successfully
     */
    default boolean spawnItem(Location<World> loc, ItemType type, SpawnType spawnType) {
        return spawnItem(loc, type, spawnType, 1);
    }

    /**
     * Spawns an item with the specified quantity and a default spawn cause of
     * {@link SpawnTypes#PLUGIN}.
     * 
     * @param loc The location to spawn the item in
     * @param type The item type to spawn in
     * @param quantity The number to spawn in
     * @return If the item spawned successfully
     */
    default boolean spawnItem(Location<World> loc, ItemType type, int quantity) {
        return spawnItem(loc, type, SpawnTypes.PLUGIN, quantity);
    }

    /**
     * Spawns an item with the specified location, type, spawn type, and
     * quantity.
     * 
     * @param loc The location to spawn the item in
     * @param type The item type to spawn in
     * @param spawnType The spawn type
     * @param quantity The number to spawn in
     * @return If the item spawned successfully
     */
    boolean spawnItem(Location<World> loc, ItemType type, SpawnType spawnType, int quantity);
}
