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
 * The digital wallet used for this transaction. One of `apple_pay`, `google_pay`, or `samsung_pay`. Will populate as
 * `null` when no digital wallet was utilized.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/wallet
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495.Serializer::class)
public sealed class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_pay`.
   */
  public data object ApplePay : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495() {
    public override val `value`: String = "apple_pay"
  }

  /**
   * Documented value. Wire value: `google_pay`.
   */
  public data object GooglePay : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495() {
    public override val `value`: String = "google_pay"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495() {
    public override val `value`: String = "samsung_pay"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495 = when (value) {
      ApplePay.value -> ApplePay
      GooglePay.value -> GooglePay
      SamsungPay.value -> SamsungPay
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormWalletXee995495) {
      encoder.encodeString(value.value)
    }
  }
}
