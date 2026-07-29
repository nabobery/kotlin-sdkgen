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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/6/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/6/schema
 */
@Serializable(with = InlineV1TopupsGetParameterXfde1522f.Serializer::class)
public sealed class InlineV1TopupsGetParameterXfde1522f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TopupsGetParameterXfde1522f() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TopupsGetParameterXfde1522f() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineV1TopupsGetParameterXfde1522f() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineV1TopupsGetParameterXfde1522f() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TopupsGetParameterXfde1522f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TopupsGetParameterXfde1522f = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Pending.value -> Pending
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TopupsGetParameterXfde1522f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TopupsGetParameterXfde1522f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TopupsGetParameterXfde1522f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsGetParameterXfde1522f) {
      encoder.encodeString(value.value)
    }
  }
}
