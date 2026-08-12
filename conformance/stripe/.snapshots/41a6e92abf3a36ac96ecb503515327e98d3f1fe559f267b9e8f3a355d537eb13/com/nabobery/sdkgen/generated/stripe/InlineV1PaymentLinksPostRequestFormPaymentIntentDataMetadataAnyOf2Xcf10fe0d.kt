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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/metadata/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/metadata/anyOf/1
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataMetadataAnyOf2Xcf10fe0d) {
      encoder.encodeString(value.value)
    }
  }
}
