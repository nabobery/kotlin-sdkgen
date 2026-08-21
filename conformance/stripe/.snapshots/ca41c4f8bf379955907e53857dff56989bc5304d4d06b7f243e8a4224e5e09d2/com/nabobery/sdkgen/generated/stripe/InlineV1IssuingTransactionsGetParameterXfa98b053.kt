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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions/get/parameters/7/schema
 */
@Serializable(with = InlineV1IssuingTransactionsGetParameterXfa98b053.Serializer::class)
public sealed class InlineV1IssuingTransactionsGetParameterXfa98b053 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `capture`.
   */
  public data object Capture : InlineV1IssuingTransactionsGetParameterXfa98b053() {
    public override val `value`: String = "capture"
  }

  /**
   * Documented value. Wire value: `refund`.
   */
  public data object Refund : InlineV1IssuingTransactionsGetParameterXfa98b053() {
    public override val `value`: String = "refund"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1IssuingTransactionsGetParameterXfa98b053()

  public companion object {
    public fun fromValue(`value`: String): InlineV1IssuingTransactionsGetParameterXfa98b053 = when (value) {
      Capture.value -> Capture
      Refund.value -> Refund
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingTransactionsGetParameterXfa98b053> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1IssuingTransactionsGetParameterXfa98b053", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1IssuingTransactionsGetParameterXfa98b053 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTransactionsGetParameterXfa98b053) {
      encoder.encodeString(value.value)
    }
  }
}
