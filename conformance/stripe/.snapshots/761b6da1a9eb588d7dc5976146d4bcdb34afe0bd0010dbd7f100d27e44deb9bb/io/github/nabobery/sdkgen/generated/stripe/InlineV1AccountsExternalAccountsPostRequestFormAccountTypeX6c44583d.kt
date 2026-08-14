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
 * The bank account type. This can only be `checking` or `savings` in most countries. In Japan, this can only be `futsu`
 * or `toza`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1external_accounts~1{id}/post/requestBody/content/appli
 * cation~1x-www-form-urlencoded/schema/properties/account_type
 */
@Serializable(with = InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d.Serializer::class)
public sealed class InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `checking`.
   */
  public data object Checking : InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d() {
    public override val `value`: String = "checking"
  }

  /**
   * Documented value. Wire value: `futsu`.
   */
  public data object Futsu : InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d() {
    public override val `value`: String = "futsu"
  }

  /**
   * Documented value. Wire value: `savings`.
   */
  public data object Savings : InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d() {
    public override val `value`: String = "savings"
  }

  /**
   * Documented value. Wire value: `toza`.
   */
  public data object Toza : InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d() {
    public override val `value`: String = "toza"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d = when (value) {
      Checking.value -> Checking
      Futsu.value -> Futsu
      Savings.value -> Savings
      Toza.value -> Toza
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsExternalAccountsPostRequestFormAccountTypeX6c44583d) {
      encoder.encodeString(value.value)
    }
  }
}
