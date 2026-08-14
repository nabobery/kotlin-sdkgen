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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/us_bank_account/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/us_bank_account/properties/account_type
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976() {
    public override val `value`: String = "savings"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976 = when (value) {
      Checking.value -> Checking
      Savings.value -> Savings
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormUsBankAccountAccountTypeX07faa976) {
      encoder.encodeString(value.value)
    }
  }
}
