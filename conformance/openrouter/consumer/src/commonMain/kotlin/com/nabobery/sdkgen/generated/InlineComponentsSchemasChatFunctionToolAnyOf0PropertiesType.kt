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
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFunctionTool/anyOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function`.
   */
  public data object Function : InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType() {
    public override val `value`: String = "function"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType = when (value) {
      Function.value -> Function
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFunctionToolAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
