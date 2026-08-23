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
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/us_bank_account/properties/account_type
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6.Serializer::class)
public sealed class InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormAccountTypeX4aef74a6) {
      encoder.encodeString(value.value)
    }
  }
}
