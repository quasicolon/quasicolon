/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package dev.qixils.quasicolon.error.syntax;

import cloud.commandframework.arguments.CommandArgument;
import cloud.commandframework.context.CommandContext;
import dev.qixils.quasicolon.Key;
import dev.qixils.quasicolon.text.Text;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class IllegalQuotationsException extends InvalidSyntaxException {
	private static final @NonNull Text ERROR_TEXT = Text.single(Key.library("exception.invalid_syntax.quotations"));

	public IllegalQuotationsException(@NonNull CommandContext<?> context) {
		super(context, ERROR_TEXT);
	}

	public IllegalQuotationsException(@NonNull String namespace, @Nullable CommandArgument<?, ?> argument) {
		super(namespace, argument, ERROR_TEXT);
	}

	public IllegalQuotationsException(@NonNull Key argumentKey) {
		super(argumentKey, ERROR_TEXT);
	}
}
