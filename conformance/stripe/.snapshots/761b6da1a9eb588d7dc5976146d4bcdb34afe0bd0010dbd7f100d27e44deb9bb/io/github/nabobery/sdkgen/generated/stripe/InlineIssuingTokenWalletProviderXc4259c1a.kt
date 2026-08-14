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
 * The digital wallet for this token, if one was used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token/properties/wallet_provider
 */
@Serializable(with = InlineIssuingTokenWalletProviderXc4259c1a.Serializer::class)
public sealed class InlineIssuingTokenWalletProviderXc4259c1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_pay`.
   */
  public data object ApplePay : InlineIssuingTokenWalletProviderXc4259c1a() {
    public override val `value`: String = "apple_pay"
  }

  /**
   * Documented value. Wire value: `google_pay`.
   */
  public data object GooglePay : InlineIssuingTokenWalletProviderXc4259c1a() {
    public override val `value`: String = "google_pay"
  }

  /**
   * Documented value. Wire value: `samsung_pay`.
   */
  public data object SamsungPay : InlineIssuingTokenWalletProviderXc4259c1a() {
    public override val `value`: String = "samsung_pay"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingTokenWalletProviderXc4259c1a()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingTokenWalletProviderXc4259c1a = when (value) {
      ApplePay.value -> ApplePay
      GooglePay.value -> GooglePay
      SamsungPay.value -> SamsungPay
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTokenWalletProviderXc4259c1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingTokenWalletProviderXc4259c1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingTokenWalletProviderXc4259c1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTokenWalletProviderXc4259c1a) {
      encoder.encodeString(value.value)
    }
  }
}
