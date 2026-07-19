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
 */
@Serializable(with = InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apply_patch_call`.
   */
  public data object ApplyPatchCall : InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType() {
    public override val `value`: String = "apply_patch_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType =
      when (value) {
      ApplyPatchCall.value -> ApplyPatchCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemApplyPatchCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
