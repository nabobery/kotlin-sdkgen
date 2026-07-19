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
 */
@Serializable(with = InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType =
      when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputApplyPatchCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
