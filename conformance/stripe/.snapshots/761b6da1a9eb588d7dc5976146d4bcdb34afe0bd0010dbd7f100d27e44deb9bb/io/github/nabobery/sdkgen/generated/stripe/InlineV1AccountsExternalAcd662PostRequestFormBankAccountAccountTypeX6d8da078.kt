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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_type
 */
@Serializable(with = InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078.Serializer::class)
public sealed class InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `futsu`.
   */
  public data object Futsu : InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078() {
    public override val `value`: String = "futsu"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078() {
    public override val `value`: String = "savings"
  }

  /**
   * Documented value. Wire value: `toza`.
   */
  public data object Toza : InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078() {
    public override val `value`: String = "toza"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078 = when (value) {
      Checking.value -> Checking
      Futsu.value -> Futsu
      Savings.value -> Savings
      Toza.value -> Toza
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAcd662PostRequestFormBankAccountAccountTypeX6d8da078) {
      encoder.encodeString(value.value)
    }
  }
}
