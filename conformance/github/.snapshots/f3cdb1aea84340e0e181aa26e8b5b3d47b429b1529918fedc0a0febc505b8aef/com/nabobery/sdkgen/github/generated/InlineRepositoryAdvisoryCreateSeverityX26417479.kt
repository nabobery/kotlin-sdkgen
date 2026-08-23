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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-create/properties/severity
 */
@Serializable(with = InlineRepositoryAdvisoryCreateSeverityX26417479.Serializer::class)
public sealed class InlineRepositoryAdvisoryCreateSeverityX26417479 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineRepositoryAdvisoryCreateSeverityX26417479() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineRepositoryAdvisoryCreateSeverityX26417479() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineRepositoryAdvisoryCreateSeverityX26417479() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineRepositoryAdvisoryCreateSeverityX26417479() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisoryCreateSeverityX26417479()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisoryCreateSeverityX26417479 = when (value) {
      Critical.value -> Critical
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisoryCreateSeverityX26417479> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisoryCreateSeverityX26417479", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisoryCreateSeverityX26417479 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisoryCreateSeverityX26417479) {
      encoder.encodeString(value.value)
    }
  }
}
