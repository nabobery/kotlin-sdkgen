package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/lookup_key/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs~1{personalization_design}/post/requestBody
 * /content/application~1x-www-form-urlencoded/schema/properties/lookup_key/anyOf/1
 */
@Serializable(with = InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92.Serializer::class)
public sealed class InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonalizationDesignsPostRequestFormLookupKeyAnyOf2X040a8a92) {
      encoder.encodeString(value.value)
    }
  }
}
