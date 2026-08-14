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
 * **Required when `state` is `dismissed`.** A reason for dismissing the alert.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1alerts~1{alert_number}/patch/requestBody/co
 * ntent/application~1json/schema/properties/dismissed_reason
 */
@Serializable(with = InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571.Serializer::class)
public sealed class InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fix_started`.
   */
  public data object FixStarted : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571() {
    public override val `value`: String = "fix_started"
  }

  /**
   * Documented value. Wire value: `inaccurate`.
   */
  public data object Inaccurate : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571() {
    public override val `value`: String = "inaccurate"
  }

  /**
   * Documented value. Wire value: `no_bandwidth`.
   */
  public data object NoBandwidth : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571() {
    public override val `value`: String = "no_bandwidth"
  }

  /**
   * Documented value. Wire value: `not_used`.
   */
  public data object NotUsed : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571() {
    public override val `value`: String = "not_used"
  }

  /**
   * Documented value. Wire value: `tolerable_risk`.
   */
  public data object TolerableRisk : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571() {
    public override val `value`: String = "tolerable_risk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571()

  public companion object {
    public fun fromValue(`value`: String): InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571 = when (value) {
      FixStarted.value -> FixStarted
      Inaccurate.value -> Inaccurate
      NoBandwidth.value -> NoBandwidth
      NotUsed.value -> NotUsed
      TolerableRisk.value -> TolerableRisk
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotAlertsPatchRequestJsonDismissedReasonXcd642571) {
      encoder.encodeString(value.value)
    }
  }
}
