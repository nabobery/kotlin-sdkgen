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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/description/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/description/anyOf/1
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c) {
      encoder.encodeString(value.value)
    }
  }
}
