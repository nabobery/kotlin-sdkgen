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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/bank_account/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/bank_account/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be.Serializer::class)
public sealed class InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormBankAccountAnyOf1ObjectValueXa65f79be) {
      encoder.encodeString(value.value)
    }
  }
}
