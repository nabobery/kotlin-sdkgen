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
 * The token currency that the transaction was sent with.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_crypto/properties/token_currency
 */
@Serializable(with = InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529.Serializer::class)
public sealed class InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `phantom_cash`.
   */
  public data object PhantomCash : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "phantom_cash"
  }

  /**
   * Documented value. Wire value: `usdc`.
   */
  public data object Usdc : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "usdc"
  }

  /**
   * Documented value. Wire value: `usdg`.
   */
  public data object Usdg : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "usdg"
  }

  /**
   * Documented value. Wire value: `usdp`.
   */
  public data object Usdp : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "usdp"
  }

  /**
   * Documented value. Wire value: `usdsui`.
   */
  public data object Usdsui : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "usdsui"
  }

  /**
   * Documented value. Wire value: `usdt`.
   */
  public data object Usdt : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529() {
    public override val `value`: String = "usdt"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529 = when (value) {
      PhantomCash.value -> PhantomCash
      Usdc.value -> Usdc
      Usdg.value -> Usdg
      Usdp.value -> Usdp
      Usdsui.value -> Usdsui
      Usdt.value -> Usdt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsCryptoTokenCurrencyX63152529) {
      encoder.encodeString(value.value)
    }
  }
}
