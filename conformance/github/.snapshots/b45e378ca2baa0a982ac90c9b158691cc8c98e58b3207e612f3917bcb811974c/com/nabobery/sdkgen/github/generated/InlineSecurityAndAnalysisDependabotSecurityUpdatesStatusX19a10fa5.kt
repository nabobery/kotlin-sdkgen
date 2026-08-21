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
 * The enablement status of Dependabot security updates for the repository.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/dependabot_security_updates/propert
 * ies/status
 */
@Serializable(with = InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5.Serializer::class)
public sealed class InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `enabled`.
   */
  public data object Enabled : InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5() {
    public override val `value`: String = "enabled"
  }

  /**
   * Documented value. Wire value: `disabled`.
   */
  public data object Disabled : InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5() {
    public override val `value`: String = "disabled"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5()

  public companion object {
    public fun fromValue(`value`: String): InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5 = when (value) {
      Enabled.value -> Enabled
      Disabled.value -> Disabled
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5) {
      encoder.encodeString(value.value)
    }
  }
}
