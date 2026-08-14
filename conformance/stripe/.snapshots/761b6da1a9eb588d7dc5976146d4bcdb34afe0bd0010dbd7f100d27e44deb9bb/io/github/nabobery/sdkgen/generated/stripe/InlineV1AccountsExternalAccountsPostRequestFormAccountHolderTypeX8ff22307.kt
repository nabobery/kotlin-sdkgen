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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/account_holder_type
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307.Serializer::class)
public sealed class InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307 = when (value) {
      Value.value -> Value
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsPostRequestFormAccountHolderTypeX8ff22307) {
      encoder.encodeString(value.value)
    }
  }
}
