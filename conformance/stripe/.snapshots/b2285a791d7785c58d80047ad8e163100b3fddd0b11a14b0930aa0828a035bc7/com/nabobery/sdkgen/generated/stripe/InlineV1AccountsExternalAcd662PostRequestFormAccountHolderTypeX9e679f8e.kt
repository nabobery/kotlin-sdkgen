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
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/bank_account/anyOf/0/properties/account_holder_type
 */
@Serializable(with = InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e.Serializer::class)
public sealed class InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `company`.
   */
  public data object Company : InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e() {
    public override val `value`: String = "company"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e = when (value) {
      Company.value -> Company
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAcd662PostRequestFormAccountHolderTypeX9e679f8e) {
      encoder.encodeString(value.value)
    }
  }
}
