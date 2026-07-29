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
 * The status of the top-up is either `canceled`, `failed`, `pending`, `reversed`, or `succeeded`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/topup/properties/status
 */
@Serializable(with = InlineTopupStatusXd45c2890.Serializer::class)
public sealed class InlineTopupStatusXd45c2890 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineTopupStatusXd45c2890() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTopupStatusXd45c2890() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineTopupStatusXd45c2890() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `reversed`.
   */
  public data object Reversed : InlineTopupStatusXd45c2890() {
    public override val `value`: String = "reversed"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTopupStatusXd45c2890() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTopupStatusXd45c2890()

  public companion object {
    public fun fromValue(`value`: String): InlineTopupStatusXd45c2890 = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Pending.value -> Pending
      Reversed.value -> Reversed
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTopupStatusXd45c2890> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTopupStatusXd45c2890", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTopupStatusXd45c2890 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTopupStatusXd45c2890) {
      encoder.encodeString(value.value)
    }
  }
}
