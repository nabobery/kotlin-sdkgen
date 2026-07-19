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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicDirectCaller/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDirectCallerPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicDirectCallerPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `direct`.
   */
  public data object Direct : InlineComponentsSchemasAnthropicDirectCallerPropertiesType() {
    public override val `value`: String = "direct"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicDirectCallerPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicDirectCallerPropertiesType = when (value) {
      Direct.value -> Direct
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDirectCallerPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicDirectCallerPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDirectCallerPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicDirectCallerPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
