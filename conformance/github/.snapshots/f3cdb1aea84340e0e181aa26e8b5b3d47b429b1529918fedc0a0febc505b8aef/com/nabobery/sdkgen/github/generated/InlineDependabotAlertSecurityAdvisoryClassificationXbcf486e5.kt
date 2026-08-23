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
 * The classification of the advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-security-advisory/properties/classification
 */
@Serializable(with = InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5.Serializer::class)
public sealed class InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `general`.
   */
  public data object General : InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5() {
    public override val `value`: String = "general"
  }

  /**
   * Documented value. Wire value: `malware`.
   */
  public data object Malware : InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5() {
    public override val `value`: String = "malware"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5 = when (value) {
      General.value -> General
      Malware.value -> Malware
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertSecurityAdvisoryClassificationXbcf486e5) {
      encoder.encodeString(value.value)
    }
  }
}
