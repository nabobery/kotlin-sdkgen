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
 * The reason that the alert was dismissed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert/properties/dismissed_reason
 */
@Serializable(with = InlineDependabotAlertDismissedReasonX898acc69.Serializer::class)
public sealed class InlineDependabotAlertDismissedReasonX898acc69 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fix_started`.
   */
  public data object FixStarted : InlineDependabotAlertDismissedReasonX898acc69() {
    public override val `value`: String = "fix_started"
  }

  /**
   * Documented value. Wire value: `inaccurate`.
   */
  public data object Inaccurate : InlineDependabotAlertDismissedReasonX898acc69() {
    public override val `value`: String = "inaccurate"
  }

  /**
   * Documented value. Wire value: `no_bandwidth`.
   */
  public data object NoBandwidth : InlineDependabotAlertDismissedReasonX898acc69() {
    public override val `value`: String = "no_bandwidth"
  }

  /**
   * Documented value. Wire value: `not_used`.
   */
  public data object NotUsed : InlineDependabotAlertDismissedReasonX898acc69() {
    public override val `value`: String = "not_used"
  }

  /**
   * Documented value. Wire value: `tolerable_risk`.
   */
  public data object TolerableRisk : InlineDependabotAlertDismissedReasonX898acc69() {
    public override val `value`: String = "tolerable_risk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertDismissedReasonX898acc69()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertDismissedReasonX898acc69 = when (value) {
      FixStarted.value -> FixStarted
      Inaccurate.value -> Inaccurate
      NoBandwidth.value -> NoBandwidth
      NotUsed.value -> NotUsed
      TolerableRisk.value -> TolerableRisk
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDependabotAlertDismissedReasonX898acc69> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertDismissedReasonX898acc69", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertDismissedReasonX898acc69 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertDismissedReasonX898acc69) {
      encoder.encodeString(value.value)
    }
  }
}
