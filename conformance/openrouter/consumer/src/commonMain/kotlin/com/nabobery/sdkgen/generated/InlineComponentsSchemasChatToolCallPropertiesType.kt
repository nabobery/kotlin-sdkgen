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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolCall/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineComponentsSchemasChatToolCallPropertiesType() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatToolCallPropertiesType = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatToolCallPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolCallPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
