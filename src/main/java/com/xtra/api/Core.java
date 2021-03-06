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

package com.xtra.api;

import java.util.Optional;

import com.xtra.api.ban.BanHandler;
import com.xtra.api.command.CommandHandler;
import com.xtra.api.command.annotation.CommandAnnotationHelper;
import com.xtra.api.config.ConfigHandler;
import com.xtra.api.config.annotation.ConfigAnnotationHelper;
import com.xtra.api.entity.EntityHandler;
import com.xtra.api.listener.ListenerHandler;
import com.xtra.api.logger.LoggerHandler;
import com.xtra.api.plugin.XtraCorePluginHandler;
import com.xtra.api.registry.CommandRegistry;
import com.xtra.api.registry.ConfigRegistry;
import com.xtra.api.text.HelpPaginationHandler;
import com.xtra.api.world.direction.DirectionHandler;

/**
 * A core class for accessing various parts of the API.
 */
public class Core {

    // Set by the implementation
    private static ICore CORE = null;

    /**
     * Gets the {@link CommandHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a command handler does not exist for the provided class
     */
    public static Optional<CommandHandler> getCommandHandler(Class<?> clazz) {
        return CORE.getCommandHandler(clazz);
    }

    /**
     * Gets the {@link ConfigHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a config handler does not exist for the provided class
     */
    public static Optional<ConfigHandler> getConfigHandler(Class<?> clazz) {
        return CORE.getConfigHandler(clazz);
    }

    /**
     * Gets the {@link ListenerHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a listener handler does not exist for the provided class
     */
    public static Optional<ListenerHandler> getListenerHandler(Class<?> clazz) {
        return CORE.getListenerHandler(clazz);
    }

    /**
     * Creates a {@link HelpPaginationHandler.Builder} for creating help
     * pagination lists.
     * 
     * @param clazz The plugin class
     * @return The help pagination builder
     */
    public static HelpPaginationHandler.Builder createHelpPaginationBuilder(Class<?> clazz) {
        return CORE.createHelpPaginationBuilder(clazz);
    }

    /**
     * Gets the {@link HelpPaginationHandler} for the specified plugin class.
     * 
     * @param clazz The plugin class
     * @return {@link Optional#empty()} if the plugin class could not be found,
     *         or if a help pagination handler does not exist for the provided
     *         class
     */
    public static Optional<HelpPaginationHandler> getHelpPaginationHandler(Class<?> clazz) {
        return CORE.getHelpPaginationHandler(clazz);
    }

    /**
     * Gets the {@link BanHandler}.
     * 
     * @return The ban handler
     */
    public static BanHandler getBanHandler() {
        return CORE.getBanHandler();
    }

    /**
     * Gets the {@link CommandAnnotationHelper}.
     * 
     * @return The command annotation helper
     */
    public static CommandAnnotationHelper getCommandAnnotationHelper() {
        return CORE.getCommandAnnotationHelper();
    }

    /**
     * Gets the {@link ConfigAnnotationHelper}.
     * 
     * @return The config annotation helper
     */
    public static ConfigAnnotationHelper getConfigAnnotationHelper() {
        return CORE.getConfigAnnotationHelper();
    }

    /**
     * Gets the {@link EntityHandler}.
     * 
     * @return The entity handler
     */
    public static EntityHandler getEntityHandler() {
        return CORE.getEntityHandler();
    }

    /**
     * Gets the {@link XtraCorePluginHandler}.
     * 
     * @return The plugin handler
     */
    public static XtraCorePluginHandler getPluginHandler() {
        return CORE.getPluginHandler();
    }

    /**
     * Gets the {@link CommandRegistry}.
     * 
     * @return The command registry
     */
    public static CommandRegistry getCommandRegistry() {
        return CORE.getCommandRegistry();
    }

    /**
     * Gets the {@link ConfigRegistry}.
     * 
     * @return The config registry
     */
    public static ConfigRegistry getConfigRegistry() {
        return CORE.getConfigRegistry();
    }

    /**
     * Gets the {@link DirectionHandler}.
     * 
     * @return The direction handler
     */
    public static DirectionHandler getDirectionHandler() {
        return CORE.getDirectionHandler();
    }

    /**
     * Gets the {@link LoggerHandler}.
     * 
     * @return The logger handler
     */
    public static LoggerHandler getLoggerHandler() {
        return CORE.getLoggerHandler();
    }

    /**
     * Gets the current XtraAPI version.
     * 
     * @return The version
     */
    public static String getVersion() {
        return CORE.getVersion();
    }
}
