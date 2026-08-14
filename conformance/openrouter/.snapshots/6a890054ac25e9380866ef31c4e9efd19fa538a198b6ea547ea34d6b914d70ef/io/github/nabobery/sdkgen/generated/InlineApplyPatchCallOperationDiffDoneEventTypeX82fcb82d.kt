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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDoneEvent/properties/type
 */
@Serializable(with = InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d.Serializer::class)
public sealed class InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.apply_patch_call_operation_diff.done`.
   */
  public data object ResponseApplyPatchCallOperationDiffDone : InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d() {
    public override val `value`: String = "response.apply_patch_call_operation_diff.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d = when (value) {
      ResponseApplyPatchCallOperationDiffDone.value -> ResponseApplyPatchCallOperationDiffDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCallOperationDiffDoneEventTypeX82fcb82d) {
      encoder.encodeString(value.value)
    }
  }
}
