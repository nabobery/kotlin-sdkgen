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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call_output`.
   */
  public data object ApplyPatchCallOutput : InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType() {
    public override val `value`: String = "apply_patch_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType =
      when (value) {
      ApplyPatchCallOutput.value -> ApplyPatchCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasApplyPatchCallOutputItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
