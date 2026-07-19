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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOperationDiffDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.apply_patch_call_operation_diff.done`.
   */
  public data object ResponseApplyPatchCallOperationDiffDone : InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType() {
    public override val `value`: String = "response.apply_patch_call_operation_diff.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType =
      when (value) {
      ResponseApplyPatchCallOperationDiffDone.value -> ResponseApplyPatchCallOperationDiffDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasApplyPatchCallOperationDiffDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
