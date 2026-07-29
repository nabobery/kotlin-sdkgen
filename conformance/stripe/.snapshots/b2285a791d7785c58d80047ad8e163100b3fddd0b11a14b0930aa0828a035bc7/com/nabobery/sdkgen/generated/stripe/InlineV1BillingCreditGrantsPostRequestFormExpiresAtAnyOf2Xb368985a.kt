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
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/expires_at/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/expires_at/anyOf/1
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a.Serializer::class)
public sealed class InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a) {
      encoder.encodeString(value.value)
    }
  }
}
