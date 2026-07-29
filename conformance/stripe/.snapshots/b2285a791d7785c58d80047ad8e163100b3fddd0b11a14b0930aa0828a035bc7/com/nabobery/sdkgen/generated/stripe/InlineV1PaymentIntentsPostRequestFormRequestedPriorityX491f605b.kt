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
 * /schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing/properties/requested_pri
 * ority.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing/properties/requested_pri
 * ority
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `domestic`.
   */
  public data object Domestic : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b() {
    public override val `value`: String = "domestic"
  }

  /**
   * Documented value. Wire value: `international`.
   */
  public data object International : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b() {
    public override val `value`: String = "international"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b = when (value) {
      Domestic.value -> Domestic
      International.value -> International
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormRequestedPriorityX491f605b) {
      encoder.encodeString(value.value)
    }
  }
}
