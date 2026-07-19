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
 * Trailing time window for the classification data. Currently only `7d` (trailing 7 days) is supported.
 */
@Serializable(with = InlinePathsClassificationsTaskGetParameters0Schema.Serializer::class)
public sealed class InlinePathsClassificationsTaskGetParameters0Schema {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `7d`.
   */
  public data object _7d : InlinePathsClassificationsTaskGetParameters0Schema() {
    public override val `value`: String = "7d"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePathsClassificationsTaskGetParameters0Schema()

  public companion object {
    public fun fromValue(`value`: String): InlinePathsClassificationsTaskGetParameters0Schema = when (value) {
      _7d.value -> _7d
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePathsClassificationsTaskGetParameters0Schema> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlinePathsClassificationsTaskGetParameters0Schema",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePathsClassificationsTaskGetParameters0Schema = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePathsClassificationsTaskGetParameters0Schema) {
      encoder.encodeString(value.value)
    }
  }
}
