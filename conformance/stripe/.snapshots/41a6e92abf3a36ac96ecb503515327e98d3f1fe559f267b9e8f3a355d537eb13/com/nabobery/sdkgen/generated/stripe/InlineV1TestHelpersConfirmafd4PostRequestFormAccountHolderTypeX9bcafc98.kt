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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_holder_type
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormAccountHolderTypeX9bcafc98) {
      encoder.encodeString(value.value)
    }
  }
}
