/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package dev.qixils.quasicolon;

import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * An object which builds a certain immutable object.
 *
 * @param <R> the type of object being built
 */
public interface Builder<R> {

	/**
	 * Builds the object.
	 *
	 * @return the built object
	 * @throws IllegalStateException a required field is missing
	 */
	@NonNull R build() throws IllegalStateException;
}
