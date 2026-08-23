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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/groups/properties/payments_pricing/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/groups/properties/payments_pricing/anyOf/1
 */
@Serializable(with = InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba) {
      encoder.encodeString(value.value)
    }
  }
}
