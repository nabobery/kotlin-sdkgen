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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineComponentsSchemasApplyPatchCallItemPropertiesType() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCallItemPropertiesType = when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasApplyPatchCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
