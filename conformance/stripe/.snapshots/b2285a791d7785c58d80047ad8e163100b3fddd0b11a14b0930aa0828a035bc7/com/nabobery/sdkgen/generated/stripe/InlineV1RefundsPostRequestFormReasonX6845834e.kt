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
 * String indicating the reason for the refund. If set, possible values are `duplicate`, `fraudulent`, and
 * `requested_by_customer`. If you believe the charge to be fraudulent, specifying `fraudulent` as the reason will add
 * the associated card and email to your [block lists](https://docs.stripe.com/radar/lists), and will also help us
 * improve our fraud detection algorithms.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1refunds/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/reason
 */
@Serializable(with = InlineV1RefundsPostRequestFormReasonX6845834e.Serializer::class)
public sealed class InlineV1RefundsPostRequestFormReasonX6845834e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `duplicate`.
   */
  public data object Duplicate : InlineV1RefundsPostRequestFormReasonX6845834e() {
    public override val `value`: String = "duplicate"
  }

  /**
   * Documented value. Wire value: `fraudulent`.
   */
  public data object Fraudulent : InlineV1RefundsPostRequestFormReasonX6845834e() {
    public override val `value`: String = "fraudulent"
  }

  /**
   * Documented value. Wire value: `requested_by_customer`.
   */
  public data object RequestedByCustomer : InlineV1RefundsPostRequestFormReasonX6845834e() {
    public override val `value`: String = "requested_by_customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1RefundsPostRequestFormReasonX6845834e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1RefundsPostRequestFormReasonX6845834e = when (value) {
      Duplicate.value -> Duplicate
      Fraudulent.value -> Fraudulent
      RequestedByCustomer.value -> RequestedByCustomer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1RefundsPostRequestFormReasonX6845834e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1RefundsPostRequestFormReasonX6845834e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1RefundsPostRequestFormReasonX6845834e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1RefundsPostRequestFormReasonX6845834e) {
      encoder.encodeString(value.value)
    }
  }
}
