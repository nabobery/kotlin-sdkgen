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
 * The severity of the advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory/properties/severity
 */
@Serializable(with = InlineRepositoryAdvisorySeverityX6156b938.Serializer::class)
public sealed class InlineRepositoryAdvisorySeverityX6156b938 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineRepositoryAdvisorySeverityX6156b938() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineRepositoryAdvisorySeverityX6156b938() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineRepositoryAdvisorySeverityX6156b938() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineRepositoryAdvisorySeverityX6156b938() {
    public override val `value`: String = "low"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRepositoryAdvisorySeverityX6156b938()

  public companion object {
    public fun fromValue(`value`: String): InlineRepositoryAdvisorySeverityX6156b938 = when (value) {
      Critical.value -> Critical
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRepositoryAdvisorySeverityX6156b938> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineRepositoryAdvisorySeverityX6156b938", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRepositoryAdvisorySeverityX6156b938 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRepositoryAdvisorySeverityX6156b938) {
      encoder.encodeString(value.value)
    }
  }
}
