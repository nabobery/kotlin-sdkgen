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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatAssistantMessage/properties/role.
 */
@Serializable(with = InlineComponentsSchemasChatAssistantMessagePropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasChatAssistantMessagePropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineComponentsSchemasChatAssistantMessagePropertiesRole() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatAssistantMessagePropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatAssistantMessagePropertiesRole = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatAssistantMessagePropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatAssistantMessagePropertiesRole", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatAssistantMessagePropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatAssistantMessagePropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
