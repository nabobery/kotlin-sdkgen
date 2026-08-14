package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallItem/properties/type
 */
@Serializable(with = InlineApplyPatchCallItemTypeX3b26d518.Serializer::class)
public sealed class InlineApplyPatchCallItemTypeX3b26d518 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineApplyPatchCallItemTypeX3b26d518() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCallItemTypeX3b26d518()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCallItemTypeX3b26d518 = when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCallItemTypeX3b26d518> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchCallItemTypeX3b26d518", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCallItemTypeX3b26d518 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCallItemTypeX3b26d518) {
      encoder.encodeString(value.value)
    }
  }
}
