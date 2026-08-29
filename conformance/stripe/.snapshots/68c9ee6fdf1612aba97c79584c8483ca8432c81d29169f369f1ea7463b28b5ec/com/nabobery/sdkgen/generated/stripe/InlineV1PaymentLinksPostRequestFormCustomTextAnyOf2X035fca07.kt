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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/terms_of_service_acceptance/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/terms_of_service_acceptance/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextAnyOf2X035fca07) {
      encoder.encodeString(value.value)
    }
  }
}
