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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/pending_invoice_item_interval/anyOf/1
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormAnyOf2X6747f87a) {
      encoder.encodeString(value.value)
    }
  }
}
