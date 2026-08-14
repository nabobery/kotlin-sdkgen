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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall/properties/status
 */
@Serializable(with = InlineOutputItemApplyPatchCallStatusX79afd49e.Serializer::class)
public sealed class InlineOutputItemApplyPatchCallStatusX79afd49e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `in_progress`.
   */
  public data object InProgress : InlineOutputItemApplyPatchCallStatusX79afd49e() {
    public override val `value`: String = "in_progress"
  }

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineOutputItemApplyPatchCallStatusX79afd49e() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemApplyPatchCallStatusX79afd49e()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemApplyPatchCallStatusX79afd49e = when (value) {
      InProgress.value -> InProgress
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemApplyPatchCallStatusX79afd49e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemApplyPatchCallStatusX79afd49e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemApplyPatchCallStatusX79afd49e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemApplyPatchCallStatusX79afd49e) {
      encoder.encodeString(value.value)
    }
  }
}
