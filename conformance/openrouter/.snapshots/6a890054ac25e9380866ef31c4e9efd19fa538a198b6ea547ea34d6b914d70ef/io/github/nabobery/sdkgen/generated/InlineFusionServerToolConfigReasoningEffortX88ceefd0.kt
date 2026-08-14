package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Reasoning effort level for panelist and judge inner calls.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FusionServerToolConfig/properties/reasoning/properties/effort
 */
@Serializable(with = InlineFusionServerToolConfigReasoningEffortX88ceefd0.Serializer::class)
public sealed class InlineFusionServerToolConfigReasoningEffortX88ceefd0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `max`.
   */
  public data object Max : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "max"
  }

  /**
   * Documented value. Wire value: `xhigh`.
   */
  public data object Xhigh : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "xhigh"
  }

  /**
   * Documented value. Wire value: `high`.
   */
  public data object High : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "high"
  }

  /**
   * Documented value. Wire value: `medium`.
   */
  public data object Medium : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "medium"
  }

  /**
   * Documented value. Wire value: `low`.
   */
  public data object Low : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "low"
  }

  /**
   * Documented value. Wire value: `minimal`.
   */
  public data object Minimal : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "minimal"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineFusionServerToolConfigReasoningEffortX88ceefd0() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionServerToolConfigReasoningEffortX88ceefd0()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionServerToolConfigReasoningEffortX88ceefd0 = when (value) {
      Max.value -> Max
      Xhigh.value -> Xhigh
      High.value -> High
      Medium.value -> Medium
      Low.value -> Low
      Minimal.value -> Minimal
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionServerToolConfigReasoningEffortX88ceefd0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionServerToolConfigReasoningEffortX88ceefd0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionServerToolConfigReasoningEffortX88ceefd0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionServerToolConfigReasoningEffortX88ceefd0) {
      encoder.encodeString(value.value)
    }
  }
}
