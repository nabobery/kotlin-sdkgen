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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/17/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1advisories/get/parameters/17/schema
 */
@Serializable(with = InlineAdvisoriesGetParameterXd99c6675.Serializer::class)
public sealed class InlineAdvisoriesGetParameterXd99c6675 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineAdvisoriesGetParameterXd99c6675() {
    public override val `value`: String = "updated"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineAdvisoriesGetParameterXd99c6675() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `epss_percentage`.
   */
  public data object EpssPercentage : InlineAdvisoriesGetParameterXd99c6675() {
    public override val `value`: String = "epss_percentage"
  }

  /**
   * Documented value. Wire value: `epss_percentile`.
   */
  public data object EpssPercentile : InlineAdvisoriesGetParameterXd99c6675() {
    public override val `value`: String = "epss_percentile"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAdvisoriesGetParameterXd99c6675()

  public companion object {
    public fun fromValue(`value`: String): InlineAdvisoriesGetParameterXd99c6675 = when (value) {
      Updated.value -> Updated
      Published.value -> Published
      EpssPercentage.value -> EpssPercentage
      EpssPercentile.value -> EpssPercentile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAdvisoriesGetParameterXd99c6675> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineAdvisoriesGetParameterXd99c6675", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAdvisoriesGetParameterXd99c6675 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAdvisoriesGetParameterXd99c6675) {
      encoder.encodeString(value.value)
    }
  }
}
