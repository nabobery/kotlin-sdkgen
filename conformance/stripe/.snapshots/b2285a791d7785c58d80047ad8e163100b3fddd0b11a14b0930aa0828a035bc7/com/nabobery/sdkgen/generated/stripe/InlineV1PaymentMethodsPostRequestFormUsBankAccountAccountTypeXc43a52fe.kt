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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/us_bank_account/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/us_bank_account/properties/account_type
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeXc43a52fe) {
      encoder.encodeString(value.value)
    }
  }
}
