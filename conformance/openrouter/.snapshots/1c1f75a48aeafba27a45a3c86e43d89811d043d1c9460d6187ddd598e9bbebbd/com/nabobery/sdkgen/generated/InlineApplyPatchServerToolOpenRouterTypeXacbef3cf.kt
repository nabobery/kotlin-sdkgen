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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchServerTool_OpenRouter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchServerTool_OpenRouter/properties/type
 */
@Serializable(with = InlineApplyPatchServerToolOpenRouterTypeXacbef3cf.Serializer::class)
public sealed class InlineApplyPatchServerToolOpenRouterTypeXacbef3cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:apply_patch`.
   */
  public data object OpenrouterApplyPatch : InlineApplyPatchServerToolOpenRouterTypeXacbef3cf() {
    public override val `value`: String = "openrouter:apply_patch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchServerToolOpenRouterTypeXacbef3cf()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchServerToolOpenRouterTypeXacbef3cf = when (value) {
      OpenrouterApplyPatch.value -> OpenrouterApplyPatch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchServerToolOpenRouterTypeXacbef3cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineApplyPatchServerToolOpenRouterTypeXacbef3cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchServerToolOpenRouterTypeXacbef3cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchServerToolOpenRouterTypeXacbef3cf) {
      encoder.encodeString(value.value)
    }
  }
}
