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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options/properties/co
 * llection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_options/properties/co
 * llection_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `paper`.
   */
  public data object Paper : InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59() {
    public override val `value`: String = "paper"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59 = when (value) {
      Value.value -> Value
      Paper.value -> Paper
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormCollectionMethodXa5174f59) {
      encoder.encodeString(value.value)
    }
  }
}
