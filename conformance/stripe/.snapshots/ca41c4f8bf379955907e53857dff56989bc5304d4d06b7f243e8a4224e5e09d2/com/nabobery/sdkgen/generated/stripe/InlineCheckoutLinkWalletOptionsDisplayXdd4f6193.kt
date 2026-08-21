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
 * Describes whether Checkout should display Link. Defaults to `auto`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_link_wallet_options/properties/display
 */
@Serializable(with = InlineCheckoutLinkWalletOptionsDisplayXdd4f6193.Serializer::class)
public sealed class InlineCheckoutLinkWalletOptionsDisplayXdd4f6193 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineCheckoutLinkWalletOptionsDisplayXdd4f6193() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlineCheckoutLinkWalletOptionsDisplayXdd4f6193() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutLinkWalletOptionsDisplayXdd4f6193()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutLinkWalletOptionsDisplayXdd4f6193 = when (value) {
      Auto.value -> Auto
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutLinkWalletOptionsDisplayXdd4f6193> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutLinkWalletOptionsDisplayXdd4f6193", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutLinkWalletOptionsDisplayXdd4f6193 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutLinkWalletOptionsDisplayXdd4f6193) {
      encoder.encodeString(value.value)
    }
  }
}
