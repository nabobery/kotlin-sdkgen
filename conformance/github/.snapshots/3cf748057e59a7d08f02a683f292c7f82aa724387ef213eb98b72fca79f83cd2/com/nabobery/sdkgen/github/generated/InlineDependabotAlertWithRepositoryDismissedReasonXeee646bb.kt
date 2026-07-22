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
 * The reason that the alert was dismissed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/dependabot-alert-with-repository/properties/dismissed_reason
 */
@Serializable(with = InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb.Serializer::class)
public sealed class InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fix_started`.
   */
  public data object FixStarted : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb() {
    public override val `value`: String = "fix_started"
  }

  /**
   * Documented value. Wire value: `inaccurate`.
   */
  public data object Inaccurate : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb() {
    public override val `value`: String = "inaccurate"
  }

  /**
   * Documented value. Wire value: `no_bandwidth`.
   */
  public data object NoBandwidth : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb() {
    public override val `value`: String = "no_bandwidth"
  }

  /**
   * Documented value. Wire value: `not_used`.
   */
  public data object NotUsed : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb() {
    public override val `value`: String = "not_used"
  }

  /**
   * Documented value. Wire value: `tolerable_risk`.
   */
  public data object TolerableRisk : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb() {
    public override val `value`: String = "tolerable_risk"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb()

  public companion object {
    public fun fromValue(`value`: String): InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb = when (value) {
      FixStarted.value -> FixStarted
      Inaccurate.value -> Inaccurate
      NoBandwidth.value -> NoBandwidth
      NotUsed.value -> NotUsed
      TolerableRisk.value -> TolerableRisk
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDependabotAlertWithRepositoryDismissedReasonXeee646bb) {
      encoder.encodeString(value.value)
    }
  }
}
