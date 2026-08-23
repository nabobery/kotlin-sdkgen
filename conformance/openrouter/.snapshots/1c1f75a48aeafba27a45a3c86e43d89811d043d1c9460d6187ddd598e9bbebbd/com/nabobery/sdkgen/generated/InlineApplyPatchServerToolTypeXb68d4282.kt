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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchServerTool/properties/type
 */
@Serializable(with = InlineApplyPatchServerToolTypeXb68d4282.Serializer::class)
public sealed class InlineApplyPatchServerToolTypeXb68d4282 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch`.
   */
  public data object ApplyPatch : InlineApplyPatchServerToolTypeXb68d4282() {
    public override val `value`: String = "apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchServerToolTypeXb68d4282()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchServerToolTypeXb68d4282 = when (value) {
      ApplyPatch.value -> ApplyPatch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchServerToolTypeXb68d4282> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineApplyPatchServerToolTypeXb68d4282", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchServerToolTypeXb68d4282 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchServerToolTypeXb68d4282) {
      encoder.encodeString(value.value)
    }
  }
}
