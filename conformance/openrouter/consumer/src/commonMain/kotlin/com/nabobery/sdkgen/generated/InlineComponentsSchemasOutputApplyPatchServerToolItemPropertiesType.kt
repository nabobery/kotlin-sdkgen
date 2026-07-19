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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:apply_patch`.
   */
  public data object OpenrouterApplyPatch : InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType =
      when (value) {
      OpenrouterApplyPatch.value -> OpenrouterApplyPatch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputApplyPatchServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
