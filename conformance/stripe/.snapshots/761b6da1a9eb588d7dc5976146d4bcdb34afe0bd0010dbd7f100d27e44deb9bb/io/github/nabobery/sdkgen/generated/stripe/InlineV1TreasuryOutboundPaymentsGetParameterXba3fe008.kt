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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/get/parameters/7/schema
 */
@Serializable(with = InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008.Serializer::class)
public sealed class InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `returned`.
   */
  public data object Returned : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008() {
    public override val `value`: String = "returned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008 = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Posted.value -> Posted
      Processing.value -> Processing
      Returned.value -> Returned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPaymentsGetParameterXba3fe008) {
      encoder.encodeString(value.value)
    }
  }
}
