package dev.qixils.quasicolon.locale.translation.impl;

import dev.qixils.quasicolon.locale.translation.Translation;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.Locale;

/**
 * Abstract implementation of {@link Translation}.
 */
public abstract class AbstractTranslation implements Translation {
	private final @NonNull String key;
	private final @NonNull Locale locale;
	private final @NonNull Locale requestedLocale;

	/**
	 * Initializes common translation fields.
	 *
	 * @param key    the key of the translation
	 * @param locale the locale of the translation
	 */
	protected AbstractTranslation(@NonNull String key, @NonNull Locale locale, @NonNull Locale requestedLocale) {
		this.key = key;
		this.locale = locale;
		this.requestedLocale = requestedLocale;
	}

	@Override
	public @NonNull String getKey() {
		return key;
	}

	@Override
	public @NonNull Locale getLocale() {
		return locale;
	}

	@Override
	public @NonNull Locale getRequestedLocale() {
		return requestedLocale;
	}
}