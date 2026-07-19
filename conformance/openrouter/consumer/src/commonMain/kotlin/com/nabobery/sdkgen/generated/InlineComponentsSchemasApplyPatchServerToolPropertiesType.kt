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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch`.
   */
  public data object ApplyPatch : InlineComponentsSchemasApplyPatchServerToolPropertiesType() {
    public override val `value`: String = "apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchServerToolPropertiesType = when (value) {
      ApplyPatch.value -> ApplyPatch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasApplyPatchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
