package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/4/schema
 */
@Serializable(with = InlineAdvisoriesGetParameterX03370d32.Serializer::class)
public sealed class InlineAdvisoriesGetParameterX03370d32 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineAdvisoriesGetParameterX03370d32() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineAdvisoriesGetParameterX03370d32() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineAdvisoriesGetParameterX03370d32() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineAdvisoriesGetParameterX03370d32() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineAdvisoriesGetParameterX03370d32() {
    public override val `value`: String = "critical"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdvisoriesGetParameterX03370d32()

  public companion object {
    public fun fromValue(`value`: String): InlineAdvisoriesGetParameterX03370d32 = when (value) {
      Unknown.value -> Unknown
      Low.value -> Low
      Medium.value -> Medium
      High.value -> High
      Critical.value -> Critical
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAdvisoriesGetParameterX03370d32> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterX03370d32", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdvisoriesGetParameterX03370d32 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdvisoriesGetParameterX03370d32) {
      encoder.encodeString(value.value)
    }
  }
}
