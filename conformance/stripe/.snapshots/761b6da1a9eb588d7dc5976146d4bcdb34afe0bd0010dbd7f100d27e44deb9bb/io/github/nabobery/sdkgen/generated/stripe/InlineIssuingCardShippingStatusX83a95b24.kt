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
 * The delivery status of the card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/status
 */
@Serializable(with = InlineIssuingCardShippingStatusX83a95b24.Serializer::class)
public sealed class InlineIssuingCardShippingStatusX83a95b24 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `delivered`.
   */
  public data object Delivered : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "delivered"
  }

  /**
   * Documented value. Wire value: `failure`.
   */
  public data object Failure : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "failure"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `returned`.
   */
  public data object Returned : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "returned"
  }

  /**
   * Documented value. Wire value: `shipped`.
   */
  public data object Shipped : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "shipped"
  }

  /**
   * Documented value. Wire value: `submitted`.
   */
  public data object Submitted : InlineIssuingCardShippingStatusX83a95b24() {
    public override val `value`: String = "submitted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingStatusX83a95b24()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingStatusX83a95b24 = when (value) {
      Canceled.value -> Canceled
      Delivered.value -> Delivered
      Failure.value -> Failure
      Pending.value -> Pending
      Returned.value -> Returned
      Shipped.value -> Shipped
      Submitted.value -> Submitted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingStatusX83a95b24> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingStatusX83a95b24", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingStatusX83a95b24 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingStatusX83a95b24) {
      encoder.encodeString(value.value)
    }
  }
}
