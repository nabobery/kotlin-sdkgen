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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/bank_account/anyOf/0/properties/object.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/bank_account/anyOf/0/properties/object
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8.Serializer::class)
public sealed class InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bank_account`.
   */
  public data object BankAccount : InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8() {
    public override val `value`: String = "bank_account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8 = when (value) {
      BankAccount.value -> BankAccount
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormBankAccountAnyOf1ObjectValueX53d56ed8) {
      encoder.encodeString(value.value)
    }
  }
}
