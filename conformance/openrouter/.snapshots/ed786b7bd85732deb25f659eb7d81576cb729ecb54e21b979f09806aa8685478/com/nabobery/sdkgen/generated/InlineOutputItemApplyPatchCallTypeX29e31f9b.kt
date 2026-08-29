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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemApplyPatchCall/properties/type
 */
@Serializable(with = InlineOutputItemApplyPatchCallTypeX29e31f9b.Serializer::class)
public sealed class InlineOutputItemApplyPatchCallTypeX29e31f9b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineOutputItemApplyPatchCallTypeX29e31f9b() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemApplyPatchCallTypeX29e31f9b()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemApplyPatchCallTypeX29e31f9b = when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemApplyPatchCallTypeX29e31f9b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputItemApplyPatchCallTypeX29e31f9b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemApplyPatchCallTypeX29e31f9b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemApplyPatchCallTypeX29e31f9b) {
      encoder.encodeString(value.value)
    }
  }
}
