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
 * The type of entity that holds the account. This can be either `individual` or `company`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/account_holder_type
 */
@Serializable(with = InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d.Serializer::class)
public sealed class InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d = when (value) {
      Value.value -> Value
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ExternalAccountsPostRequestFormAccountHolderTypeXa928777d) {
      encoder.encodeString(value.value)
    }
  }
}
