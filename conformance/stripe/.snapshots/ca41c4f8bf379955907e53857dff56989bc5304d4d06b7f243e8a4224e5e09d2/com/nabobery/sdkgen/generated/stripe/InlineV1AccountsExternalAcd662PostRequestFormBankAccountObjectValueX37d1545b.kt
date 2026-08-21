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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/object
 */
@Serializable(with = InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b.Serializer::class)
public sealed class InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAcd662PostRequestFormBankAccountObjectValueX37d1545b) {
      encoder.encodeString(value.value)
    }
  }
}
