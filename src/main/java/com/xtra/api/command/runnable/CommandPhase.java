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

package com.xtra.api.command.runnable;

import com.xtra.api.command.base.CommandBase;

/**
 * The phase at which a {@link CommandRunnable} will run.
 * 
 * <p>See the JavaDocs for the enums for more information.</p>
 */
public enum CommandPhase {

    /**
     * Symbolizes that the {@link CommandRunnable} will be ran when the command
     * is first executed. This is before any special checks are ran regarding
     * the initialization of a {@link CommandBase} or something similar.
     */
    PRE,

    /**
     * Symbolizes that the {@link CommandRunnable} will be ran after basic
     * initialization.
     * 
     * <p>Note that this is ran before the actual command has been
     * processed.</p>
     */
    START,

    /**
     * Symbolizes that the {@link CommandRunnable} will be ran after a command
     * has been processed. Note that you cannot cancel the execution of a
     * command in this phase, as the command has already been executed.
     */
    POST;
}
