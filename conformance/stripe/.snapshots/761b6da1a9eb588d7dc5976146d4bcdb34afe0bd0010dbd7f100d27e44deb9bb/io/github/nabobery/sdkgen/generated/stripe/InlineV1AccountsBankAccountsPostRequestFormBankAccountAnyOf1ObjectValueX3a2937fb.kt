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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1bank_accounts/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/object
 */
@Serializable(with = InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb.Serializer::class)
public sealed class InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1ObjectValueX3a2937fb) {
      encoder.encodeString(value.value)
    }
  }
}
