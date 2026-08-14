package io.github.nabobery.sdkgen.github.generated

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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/global-advisory/properties/severity
 */
@Serializable(with = InlineGlobalAdvisorySeverityXc542f37a.Serializer::class)
public sealed class InlineGlobalAdvisorySeverityXc542f37a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `critical`.
   */
  public data object Critical : InlineGlobalAdvisorySeverityXc542f37a() {
    public override val `value`: String = "critical"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineGlobalAdvisorySeverityXc542f37a() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineGlobalAdvisorySeverityXc542f37a() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineGlobalAdvisorySeverityXc542f37a() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineGlobalAdvisorySeverityXc542f37a() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGlobalAdvisorySeverityXc542f37a()

  public companion object {
    public fun fromValue(`value`: String): InlineGlobalAdvisorySeverityXc542f37a = when (value) {
      Critical.value -> Critical
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGlobalAdvisorySeverityXc542f37a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineGlobalAdvisorySeverityXc542f37a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGlobalAdvisorySeverityXc542f37a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGlobalAdvisorySeverityXc542f37a) {
      encoder.encodeString(value.value)
    }
  }
}
