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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocation/properties/type
 */
@Serializable(with = InlineAnthropicCitationPageLocationTypeXdb1d2570.Serializer::class)
public sealed class InlineAnthropicCitationPageLocationTypeXdb1d2570 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `page_location`.
   */
  public data object PageLocation : InlineAnthropicCitationPageLocationTypeXdb1d2570() {
    public override val `value`: String = "page_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationPageLocationTypeXdb1d2570()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationPageLocationTypeXdb1d2570 = when (value) {
      PageLocation.value -> PageLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationPageLocationTypeXdb1d2570> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCitationPageLocationTypeXdb1d2570", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationPageLocationTypeXdb1d2570 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationPageLocationTypeXdb1d2570) {
      encoder.encodeString(value.value)
    }
  }
}
