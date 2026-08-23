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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/bank_account/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/bank_account/properties/account_holder_type
 */
@Serializable(with = InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed.Serializer::class)
public sealed class InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormBankAccountAccountHolderTypeXd17551ed) {
      encoder.encodeString(value.value)
    }
  }
}
