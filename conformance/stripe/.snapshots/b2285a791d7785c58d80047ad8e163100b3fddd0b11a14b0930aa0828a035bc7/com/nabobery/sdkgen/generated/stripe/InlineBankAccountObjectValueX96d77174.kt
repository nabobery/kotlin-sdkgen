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
 * Source: sdkgen://source/openapi.json#/components/schemas/bank_account/properties/object
 */
@Serializable(with = InlineBankAccountObjectValueX96d77174.Serializer::class)
public sealed class InlineBankAccountObjectValueX96d77174 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineBankAccountObjectValueX96d77174() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBankAccountObjectValueX96d77174()

  public companion object {
    public fun fromValue(`value`: String): InlineBankAccountObjectValueX96d77174 = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineBankAccountObjectValueX96d77174> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBankAccountObjectValueX96d77174", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBankAccountObjectValueX96d77174 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBankAccountObjectValueX96d77174) {
      encoder.encodeString(value.value)
    }
  }
}
