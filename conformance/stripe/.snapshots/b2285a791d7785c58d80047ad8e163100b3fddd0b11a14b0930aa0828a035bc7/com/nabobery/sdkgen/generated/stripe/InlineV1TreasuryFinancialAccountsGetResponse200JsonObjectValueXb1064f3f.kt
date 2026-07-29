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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/get/responses/200/content/application~1json/sc
 * hema/properties/object
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f.Serializer::class)
public sealed class InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsGetResponse200JsonObjectValueXb1064f3f) {
      encoder.encodeString(value.value)
    }
  }
}
