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
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.apply_patch_call_operation_diff.delta`.
   */
  public data object ResponseApplyPatchCallOperationDiffDelta : InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType() {
    public override val `value`: String = "response.apply_patch_call_operation_diff.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType =
      when (value) {
      ResponseApplyPatchCallOperationDiffDelta.value -> ResponseApplyPatchCallOperationDiffDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasApplyPatchCallOperationDiffDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
