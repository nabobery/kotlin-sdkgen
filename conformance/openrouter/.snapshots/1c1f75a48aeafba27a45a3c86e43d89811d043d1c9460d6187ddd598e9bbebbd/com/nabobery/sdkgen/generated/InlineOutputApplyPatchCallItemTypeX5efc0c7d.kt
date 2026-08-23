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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputApplyPatchCallItem/properties/type
 */
@Serializable(with = InlineOutputApplyPatchCallItemTypeX5efc0c7d.Serializer::class)
public sealed class InlineOutputApplyPatchCallItemTypeX5efc0c7d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineOutputApplyPatchCallItemTypeX5efc0c7d() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputApplyPatchCallItemTypeX5efc0c7d()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputApplyPatchCallItemTypeX5efc0c7d = when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputApplyPatchCallItemTypeX5efc0c7d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputApplyPatchCallItemTypeX5efc0c7d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputApplyPatchCallItemTypeX5efc0c7d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputApplyPatchCallItemTypeX5efc0c7d) {
      encoder.encodeString(value.value)
    }
  }
}
