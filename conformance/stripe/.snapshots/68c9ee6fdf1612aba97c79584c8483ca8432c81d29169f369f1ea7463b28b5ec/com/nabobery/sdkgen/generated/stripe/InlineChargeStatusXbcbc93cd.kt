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
 * The status of the payment is either `succeeded`, `pending`, or `failed`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/status
 */
@Serializable(with = InlineChargeStatusXbcbc93cd.Serializer::class)
public sealed class InlineChargeStatusXbcbc93cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineChargeStatusXbcbc93cd() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineChargeStatusXbcbc93cd() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineChargeStatusXbcbc93cd() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChargeStatusXbcbc93cd()

  public companion object {
    public fun fromValue(`value`: String): InlineChargeStatusXbcbc93cd = when (value) {
      Failed.value -> Failed
      Pending.value -> Pending
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChargeStatusXbcbc93cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineChargeStatusXbcbc93cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChargeStatusXbcbc93cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChargeStatusXbcbc93cd) {
      encoder.encodeString(value.value)
    }
  }
}
