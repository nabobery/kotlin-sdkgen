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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_op
 * tions/properties/collection_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/us_bank_account/anyOf/0/properties/mandate_op
 * tions/properties/collection_method
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `paper`.
   */
  public data object Paper : InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef() {
    public override val `value`: String = "paper"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef = when (value) {
      Value.value -> Value
      Paper.value -> Paper
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormCollectionMethodXe9255fef) {
      encoder.encodeString(value.value)
    }
  }
}
