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
 * sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/replacements/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/forwarding.request/properties/replacements/items
 */
@Serializable(with = InlineForwardingRequestReplacementsItemXe1b219c9.Serializer::class)
public sealed class InlineForwardingRequestReplacementsItemXe1b219c9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card_cvc`.
   */
  public data object CardCvc : InlineForwardingRequestReplacementsItemXe1b219c9() {
    public override val `value`: String = "card_cvc"
  }

  /**
   * Documented value. Wire value: `card_expiry`.
   */
  public data object CardExpiry : InlineForwardingRequestReplacementsItemXe1b219c9() {
    public override val `value`: String = "card_expiry"
  }

  /**
   * Documented value. Wire value: `card_number`.
   */
  public data object CardNumber : InlineForwardingRequestReplacementsItemXe1b219c9() {
    public override val `value`: String = "card_number"
  }

  /**
   * Documented value. Wire value: `cardholder_name`.
   */
  public data object CardholderName : InlineForwardingRequestReplacementsItemXe1b219c9() {
    public override val `value`: String = "cardholder_name"
  }

  /**
   * Documented value. Wire value: `request_signature`.
   */
  public data object RequestSignature : InlineForwardingRequestReplacementsItemXe1b219c9() {
    public override val `value`: String = "request_signature"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineForwardingRequestReplacementsItemXe1b219c9()

  public companion object {
    public fun fromValue(`value`: String): InlineForwardingRequestReplacementsItemXe1b219c9 = when (value) {
      CardCvc.value -> CardCvc
      CardExpiry.value -> CardExpiry
      CardNumber.value -> CardNumber
      CardholderName.value -> CardholderName
      RequestSignature.value -> RequestSignature
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineForwardingRequestReplacementsItemXe1b219c9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineForwardingRequestReplacementsItemXe1b219c9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineForwardingRequestReplacementsItemXe1b219c9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineForwardingRequestReplacementsItemXe1b219c9) {
      encoder.encodeString(value.value)
    }
  }
}
