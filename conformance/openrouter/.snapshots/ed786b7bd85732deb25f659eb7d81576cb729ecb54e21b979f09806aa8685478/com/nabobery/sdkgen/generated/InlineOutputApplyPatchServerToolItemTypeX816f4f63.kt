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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchServerToolItem/properties/type
 */
@Serializable(with = InlineOutputApplyPatchServerToolItemTypeX816f4f63.Serializer::class)
public sealed class InlineOutputApplyPatchServerToolItemTypeX816f4f63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:apply_patch`.
   */
  public data object OpenrouterApplyPatch : InlineOutputApplyPatchServerToolItemTypeX816f4f63() {
    public override val `value`: String = "openrouter:apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputApplyPatchServerToolItemTypeX816f4f63()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputApplyPatchServerToolItemTypeX816f4f63 = when (value) {
      OpenrouterApplyPatch.value -> OpenrouterApplyPatch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputApplyPatchServerToolItemTypeX816f4f63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputApplyPatchServerToolItemTypeX816f4f63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputApplyPatchServerToolItemTypeX816f4f63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputApplyPatchServerToolItemTypeX816f4f63) {
      encoder.encodeString(value.value)
    }
  }
}
