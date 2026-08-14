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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1bank_accounts/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb.Serializer::class)
public sealed class InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersBankAccountsPostRequestFormAccountHolderTypeXd8298fcb) {
      encoder.encodeString(value.value)
    }
  }
}
