package com.nabobery.sdkgen.github.generated

import kotlin.Nothing

/**
 * Wire presence of a property, independent of Kotlin nullability.
 */
public enum class FieldPresence {
  Absent,
  PresentNull,
  PresentValue,
}

internal sealed interface FieldState<out T> {
  public data object Absent : FieldState<Nothing>

  public data object Null : FieldState<Nothing>

  public data class Value<T>(
    public val `value`: T,
  ) : FieldState<T>
}

internal val FieldState<*>.presence: FieldPresence
  get() = when (this) {
    FieldState.Absent -> FieldPresence.Absent
    FieldState.Null -> FieldPresence.PresentNull
    is FieldState.Value -> FieldPresence.PresentValue
  }

internal fun <T> FieldState<T>.valueOrNull(): T? = when (this) {
  FieldState.Absent, FieldState.Null -> null
  is FieldState.Value -> value
}
