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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallOutputItem/properties/type
 */
@Serializable(with = InlineApplyPatchCallOutputItemTypeX5c4c3c3c.Serializer::class)
public sealed class InlineApplyPatchCallOutputItemTypeX5c4c3c3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call_output`.
   */
  public data object ApplyPatchCallOutput : InlineApplyPatchCallOutputItemTypeX5c4c3c3c() {
    public override val `value`: String = "apply_patch_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCallOutputItemTypeX5c4c3c3c()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCallOutputItemTypeX5c4c3c3c = when (value) {
      ApplyPatchCallOutput.value -> ApplyPatchCallOutput
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCallOutputItemTypeX5c4c3c3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineApplyPatchCallOutputItemTypeX5c4c3c3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCallOutputItemTypeX5c4c3c3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCallOutputItemTypeX5c4c3c3c) {
      encoder.encodeString(value.value)
    }
  }
}
