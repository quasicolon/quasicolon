/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package dev.qixils.quasicolon.utils;

import dev.qixils.quasicolon.text.Text;
import net.dv8tion.jda.api.requests.restaction.MessageAction;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.jetbrains.annotations.Contract;

import java.util.function.Consumer;

/**
 * Wrapper that stores {@link Text} to send to a channel and a modifier
 * which alters the {@link MessageAction} created when sending the message.
 * <p>
 * This wrapper is useful for sending embeds or attachments
 * from an {@code @AutoSend}-annotated method.
 */
public record QuasiMessage(@NonNull Text text, @NonNull Consumer<MessageAction> modifier) {
	/**
	 * Returns the {@link Text} to be used as the message content.
	 *
	 * @return the {@link Text} to send
	 */
	@NonNull
	@Contract(pure = true)
	public Text text() {
		return text;
	}

	/**
	 * Returns the {@link Consumer} which will modify the {@link MessageAction} just before sending.
	 *
	 * @return the {@link Consumer} to modify the message
	 */
	@NonNull
	@Contract(pure = true)
	public Consumer<MessageAction> modifier() {
		return modifier;
	}
}
