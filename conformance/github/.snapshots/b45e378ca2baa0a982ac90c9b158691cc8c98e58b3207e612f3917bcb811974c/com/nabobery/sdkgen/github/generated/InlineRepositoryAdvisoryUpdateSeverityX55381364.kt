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
 * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update/properties/severity
 */
@Serializable(with = InlineRepositoryAdvisoryUpdateSeverityX55381364.Serializer::class)
public sealed class InlineRepositoryAdvisoryUpdateSeverityX55381364 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineRepositoryAdvisoryUpdateSeverityX55381364() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineRepositoryAdvisoryUpdateSeverityX55381364() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineRepositoryAdvisoryUpdateSeverityX55381364() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineRepositoryAdvisoryUpdateSeverityX55381364() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryUpdateSeverityX55381364()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryUpdateSeverityX55381364 = when (value) {
      Critical.value -> Critical
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryUpdateSeverityX55381364> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryUpdateSeverityX55381364", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryUpdateSeverityX55381364 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryUpdateSeverityX55381364) {
      encoder.encodeString(value.value)
    }
  }
}
