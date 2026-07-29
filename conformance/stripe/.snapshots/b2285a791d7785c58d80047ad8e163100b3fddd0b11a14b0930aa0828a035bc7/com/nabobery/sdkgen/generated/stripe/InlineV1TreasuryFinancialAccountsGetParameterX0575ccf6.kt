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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6.Serializer::class)
public sealed class InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6() {
    public override val `value`: String = "open"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6 = when (value) {
      Closed.value -> Closed
      Open.value -> Open
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsGetParameterX0575ccf6) {
      encoder.encodeString(value.value)
    }
  }
}
