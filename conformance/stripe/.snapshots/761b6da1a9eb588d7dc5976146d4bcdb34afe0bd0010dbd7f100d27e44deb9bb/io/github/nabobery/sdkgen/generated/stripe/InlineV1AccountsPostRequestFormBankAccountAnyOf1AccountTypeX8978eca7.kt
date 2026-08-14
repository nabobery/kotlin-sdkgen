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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account/anyOf/0/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account/anyOf/0/properties/account_type
 */
@Serializable(with = InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `futsu`.
   */
  public data object Futsu : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7() {
    public override val `value`: String = "futsu"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7() {
    public override val `value`: String = "savings"
  }

  /**
   * Documented value. Wire value: `toza`.
   */
  public data object Toza : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7() {
    public override val `value`: String = "toza"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7 = when (value) {
      Checking.value -> Checking
      Futsu.value -> Futsu
      Savings.value -> Savings
      Toza.value -> Toza
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountTypeX8978eca7) {
      encoder.encodeString(value.value)
    }
  }
}
