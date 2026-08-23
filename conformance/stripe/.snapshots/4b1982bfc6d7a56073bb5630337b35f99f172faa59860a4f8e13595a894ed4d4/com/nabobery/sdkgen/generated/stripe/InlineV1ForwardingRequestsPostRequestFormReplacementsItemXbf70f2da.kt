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
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/replacements/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1forwarding~1requests/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/replacements/items
 */
@Serializable(with = InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da.Serializer::class)
public sealed class InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card_cvc`.
   */
  public data object CardCvc : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da() {
    public override val `value`: String = "card_cvc"
  }

  /**
   * Documented value. Wire value: `card_expiry`.
   */
  public data object CardExpiry : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da() {
    public override val `value`: String = "card_expiry"
  }

  /**
   * Documented value. Wire value: `card_number`.
   */
  public data object CardNumber : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da() {
    public override val `value`: String = "card_number"
  }

  /**
   * Documented value. Wire value: `cardholder_name`.
   */
  public data object CardholderName : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da() {
    public override val `value`: String = "cardholder_name"
  }

  /**
   * Documented value. Wire value: `request_signature`.
   */
  public data object RequestSignature : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da() {
    public override val `value`: String = "request_signature"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da()

  public companion object {
    public fun fromValue(`value`: String): InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da = when (value) {
      CardCvc.value -> CardCvc
      CardExpiry.value -> CardExpiry
      CardNumber.value -> CardNumber
      CardholderName.value -> CardholderName
      RequestSignature.value -> RequestSignature
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1ForwardingRequestsPostRequestFormReplacementsItemXbf70f2da) {
      encoder.encodeString(value.value)
    }
  }
}
