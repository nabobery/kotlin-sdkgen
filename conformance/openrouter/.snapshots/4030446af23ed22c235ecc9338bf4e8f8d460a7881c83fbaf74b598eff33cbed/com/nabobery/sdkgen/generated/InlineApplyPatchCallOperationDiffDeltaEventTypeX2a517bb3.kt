package com.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDeltaEvent/properties/type
 */
@Serializable(with = InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3.Serializer::class)
public sealed class InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.apply_patch_call_operation_diff.delta`.
   */
  public data object ResponseApplyPatchCallOperationDiffDelta : InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3() {
    public override val `value`: String = "response.apply_patch_call_operation_diff.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3 = when (value) {
      ResponseApplyPatchCallOperationDiffDelta.value -> ResponseApplyPatchCallOperationDiffDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCallOperationDiffDeltaEventTypeX2a517bb3) {
      encoder.encodeString(value.value)
    }
  }
}
