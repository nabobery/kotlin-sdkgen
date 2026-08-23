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
 * The bank account type. This can only be `checking` or `savings` in most countries. In Japan, this can only be `futsu`
 * or `toza`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1external_accounts~1{id}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/account_type
 */
@Serializable(with = InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f.Serializer::class)
public sealed class InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `futsu`.
   */
  public data object Futsu : InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f() {
    public override val `value`: String = "futsu"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f() {
    public override val `value`: String = "savings"
  }

  /**
   * Documented value. Wire value: `toza`.
   */
  public data object Toza : InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f() {
    public override val `value`: String = "toza"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f = when (value) {
      Checking.value -> Checking
      Futsu.value -> Futsu
      Savings.value -> Savings
      Toza.value -> Toza
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ExternalAccountsPostRequestFormAccountTypeX39c8b49f) {
      encoder.encodeString(value.value)
    }
  }
}
