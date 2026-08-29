package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Trailing time window for the classification data. Currently only `7d` (trailing 7 days) is supported.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1classifications~1task/get/parameters/0/schema
 */
@Serializable(with = InlineClassificationsTaskGetParameterXf2b513b1.Serializer::class)
public sealed class InlineClassificationsTaskGetParameterXf2b513b1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `7d`.
   */
  public data object _7d : InlineClassificationsTaskGetParameterXf2b513b1() {
    public override val `value`: String = "7d"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineClassificationsTaskGetParameterXf2b513b1()

  public companion object {
    public fun fromValue(`value`: String): InlineClassificationsTaskGetParameterXf2b513b1 = when (value) {
      _7d.value -> _7d
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineClassificationsTaskGetParameterXf2b513b1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineClassificationsTaskGetParameterXf2b513b1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineClassificationsTaskGetParameterXf2b513b1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineClassificationsTaskGetParameterXf2b513b1) {
      encoder.encodeString(value.value)
    }
  }
}
