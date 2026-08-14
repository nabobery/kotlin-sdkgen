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
 * /properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871 = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormBankAccountAnyOf1AccountHolderTypeX2ebc0871) {
      encoder.encodeString(value.value)
    }
  }
}
