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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionCallInProgressEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionCallInProgressEvent/properties/type
 */
@Serializable(with = InlineFusionCallInProgressEventTypeXd4ded992.Serializer::class)
public sealed class InlineFusionCallInProgressEventTypeXd4ded992 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.fusion_call.in_progress`.
   */
  public data object ResponseFusionCallInProgress : InlineFusionCallInProgressEventTypeXd4ded992() {
    public override val `value`: String = "response.fusion_call.in_progress"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionCallInProgressEventTypeXd4ded992()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionCallInProgressEventTypeXd4ded992 = when (value) {
      ResponseFusionCallInProgress.value -> ResponseFusionCallInProgress
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionCallInProgressEventTypeXd4ded992> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFusionCallInProgressEventTypeXd4ded992", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionCallInProgressEventTypeXd4ded992 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionCallInProgressEventTypeXd4ded992) {
      encoder.encodeString(value.value)
    }
  }
}
