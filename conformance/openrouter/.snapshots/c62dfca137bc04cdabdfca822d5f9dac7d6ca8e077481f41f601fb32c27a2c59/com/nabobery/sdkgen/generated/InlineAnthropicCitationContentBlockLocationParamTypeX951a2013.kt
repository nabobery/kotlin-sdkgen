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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocationParam/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocationParam/properties/type
 */
@Serializable(with = InlineAnthropicCitationContentBlockLocationParamTypeX951a2013.Serializer::class)
public sealed class InlineAnthropicCitationContentBlockLocationParamTypeX951a2013 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content_block_location`.
   */
  public data object ContentBlockLocation : InlineAnthropicCitationContentBlockLocationParamTypeX951a2013() {
    public override val `value`: String = "content_block_location"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCitationContentBlockLocationParamTypeX951a2013()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCitationContentBlockLocationParamTypeX951a2013 = when (value) {
      ContentBlockLocation.value -> ContentBlockLocation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCitationContentBlockLocationParamTypeX951a2013> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCitationContentBlockLocationParamTypeX951a2013", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCitationContentBlockLocationParamTypeX951a2013 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCitationContentBlockLocationParamTypeX951a2013) {
      encoder.encodeString(value.value)
    }
  }
}
