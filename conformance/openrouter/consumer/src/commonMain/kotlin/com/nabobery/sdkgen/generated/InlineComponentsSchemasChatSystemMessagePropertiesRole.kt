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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatSystemMessage/properties/role.
 */
@Serializable(with = InlineComponentsSchemasChatSystemMessagePropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasChatSystemMessagePropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `system`.
   */
  public data object System : InlineComponentsSchemasChatSystemMessagePropertiesRole() {
    public override val `value`: String = "system"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatSystemMessagePropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatSystemMessagePropertiesRole = when (value) {
      System.value -> System
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatSystemMessagePropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatSystemMessagePropertiesRole", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatSystemMessagePropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatSystemMessagePropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
