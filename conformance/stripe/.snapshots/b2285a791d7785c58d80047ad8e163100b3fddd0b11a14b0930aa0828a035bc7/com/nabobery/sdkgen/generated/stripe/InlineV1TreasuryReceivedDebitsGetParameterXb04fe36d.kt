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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_debits/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_debits/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d.Serializer::class)
public sealed class InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d = when (value) {
      Failed.value -> Failed
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryReceivedDebitsGetParameterXb04fe36d) {
      encoder.encodeString(value.value)
    }
  }
}
