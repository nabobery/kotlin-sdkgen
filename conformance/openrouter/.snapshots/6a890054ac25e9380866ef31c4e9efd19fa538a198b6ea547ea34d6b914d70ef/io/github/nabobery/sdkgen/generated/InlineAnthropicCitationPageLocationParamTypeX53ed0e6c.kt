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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocationParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocationParam/properties/type
 */
@Serializable(with = InlineAnthropicCitationPageLocationParamTypeX53ed0e6c.Serializer::class)
public sealed class InlineAnthropicCitationPageLocationParamTypeX53ed0e6c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `page_location`.
   */
  public data object PageLocation : InlineAnthropicCitationPageLocationParamTypeX53ed0e6c() {
    public override val `value`: String = "page_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationPageLocationParamTypeX53ed0e6c()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationPageLocationParamTypeX53ed0e6c = when (value) {
      PageLocation.value -> PageLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationPageLocationParamTypeX53ed0e6c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCitationPageLocationParamTypeX53ed0e6c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationPageLocationParamTypeX53ed0e6c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationPageLocationParamTypeX53ed0e6c) {
      encoder.encodeString(value.value)
    }
  }
}
