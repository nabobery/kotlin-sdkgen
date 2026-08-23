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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/carrier_text/properties/header_body/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/carrier_text/properties/header_body/anyOf/1
 */
@Serializable(with = InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6.Serializer::class)
public sealed class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X99efebc6) {
      encoder.encodeString(value.value)
    }
  }
}
