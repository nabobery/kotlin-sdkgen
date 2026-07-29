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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/nickname/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/nickname/anyOf/1
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c.Serializer::class)
public sealed class InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormNicknameAnyOf2X5fd1855c) {
      encoder.encodeString(value.value)
    }
  }
}
