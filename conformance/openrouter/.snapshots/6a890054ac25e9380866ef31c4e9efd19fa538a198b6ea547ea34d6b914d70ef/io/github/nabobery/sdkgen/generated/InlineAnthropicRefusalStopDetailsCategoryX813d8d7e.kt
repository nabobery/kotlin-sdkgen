package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicRefusalStopDetails/properties/category.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicRefusalStopDetails/properties/category
 */
@Serializable(with = InlineAnthropicRefusalStopDetailsCategoryX813d8d7e.Serializer::class)
public sealed class InlineAnthropicRefusalStopDetailsCategoryX813d8d7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cyber`.
   */
  public data object Cyber : InlineAnthropicRefusalStopDetailsCategoryX813d8d7e() {
    public override val `value`: String = "cyber"
  }

  /**
   * Documented value. Wire value: `bio`.
   */
  public data object Bio : InlineAnthropicRefusalStopDetailsCategoryX813d8d7e() {
    public override val `value`: String = "bio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicRefusalStopDetailsCategoryX813d8d7e()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicRefusalStopDetailsCategoryX813d8d7e = when (value) {
      Cyber.value -> Cyber
      Bio.value -> Bio
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicRefusalStopDetailsCategoryX813d8d7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicRefusalStopDetailsCategoryX813d8d7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicRefusalStopDetailsCategoryX813d8d7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicRefusalStopDetailsCategoryX813d8d7e) {
      encoder.encodeString(value.value)
    }
  }
}
