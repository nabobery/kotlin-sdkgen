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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem/properties/status
 */
@Serializable(with = InlineApplyPatchCallOutputItemStatusX79b31ade.Serializer::class)
public sealed class InlineApplyPatchCallOutputItemStatusX79b31ade {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineApplyPatchCallOutputItemStatusX79b31ade() {
    public override val `value`: String = "completed"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineApplyPatchCallOutputItemStatusX79b31ade() {
    public override val `value`: String = "failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCallOutputItemStatusX79b31ade()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCallOutputItemStatusX79b31ade = when (value) {
      Completed.value -> Completed
      Failed.value -> Failed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCallOutputItemStatusX79b31ade> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchCallOutputItemStatusX79b31ade", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCallOutputItemStatusX79b31ade = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCallOutputItemStatusX79b31ade) {
      encoder.encodeString(value.value)
    }
  }
}
