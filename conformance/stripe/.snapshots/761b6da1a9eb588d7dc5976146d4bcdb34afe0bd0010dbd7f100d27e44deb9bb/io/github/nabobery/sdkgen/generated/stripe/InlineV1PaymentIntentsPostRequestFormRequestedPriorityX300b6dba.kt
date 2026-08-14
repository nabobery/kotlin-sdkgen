package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing/properties/req
 * uested_priority.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing/properties/req
 * uested_priority
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `domestic`.
   */
  public data object Domestic : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba() {
    public override val `value`: String = "domestic"
  }

  /**
   * Documented value. Wire value: `international`.
   */
  public data object International : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba() {
    public override val `value`: String = "international"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba = when (value) {
      Domestic.value -> Domestic
      International.value -> International
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba) {
      encoder.encodeString(value.value)
    }
  }
}
