package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Design Arena only: arena to query. Defaults to `models` when source is `design-arena`.
 */
@Serializable(with = InlinePathsBenchmarksGetParameters2Schema.Serializer::class)
public sealed class InlinePathsBenchmarksGetParameters2Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `models`.
   */
  public data object Models : InlinePathsBenchmarksGetParameters2Schema() {
    public override val `value`: String = "models"
  }

  /**
   * Documented value. Wire value: `builders`.
   */
  public data object Builders : InlinePathsBenchmarksGetParameters2Schema() {
    public override val `value`: String = "builders"
  }

  /**
   * Documented value. Wire value: `agents`.
   */
  public data object Agents : InlinePathsBenchmarksGetParameters2Schema() {
    public override val `value`: String = "agents"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsBenchmarksGetParameters2Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsBenchmarksGetParameters2Schema = when (value) {
      Models.value -> Models
      Builders.value -> Builders
      Agents.value -> Agents
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsBenchmarksGetParameters2Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters2Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsBenchmarksGetParameters2Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsBenchmarksGetParameters2Schema) {
      encoder.encodeString(value.value)
    }
  }
}
