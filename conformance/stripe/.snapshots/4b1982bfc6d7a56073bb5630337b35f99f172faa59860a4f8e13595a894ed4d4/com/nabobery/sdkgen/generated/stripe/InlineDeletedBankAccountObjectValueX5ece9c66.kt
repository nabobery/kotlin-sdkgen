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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_bank_account/properties/object
 */
@Serializable(with = InlineDeletedBankAccountObjectValueX5ece9c66.Serializer::class)
public sealed class InlineDeletedBankAccountObjectValueX5ece9c66 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineDeletedBankAccountObjectValueX5ece9c66() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedBankAccountObjectValueX5ece9c66()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedBankAccountObjectValueX5ece9c66 = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedBankAccountObjectValueX5ece9c66> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedBankAccountObjectValueX5ece9c66", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedBankAccountObjectValueX5ece9c66 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedBankAccountObjectValueX5ece9c66) {
      encoder.encodeString(value.value)
    }
  }
}
