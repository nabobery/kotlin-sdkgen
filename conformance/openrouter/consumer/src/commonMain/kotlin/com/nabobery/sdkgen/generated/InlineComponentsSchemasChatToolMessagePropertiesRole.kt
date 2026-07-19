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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatToolMessage/properties/role.
 */
@Serializable(with = InlineComponentsSchemasChatToolMessagePropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasChatToolMessagePropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool`.
   */
  public data object Tool : InlineComponentsSchemasChatToolMessagePropertiesRole() {
    public override val `value`: String = "tool"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatToolMessagePropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatToolMessagePropertiesRole = when (value) {
      Tool.value -> Tool
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatToolMessagePropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatToolMessagePropertiesRole",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatToolMessagePropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatToolMessagePropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
