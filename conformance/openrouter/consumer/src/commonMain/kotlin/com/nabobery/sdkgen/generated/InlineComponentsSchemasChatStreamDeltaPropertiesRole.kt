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
 * The role of the message author
 */
@Serializable(with = InlineComponentsSchemasChatStreamDeltaPropertiesRole.Serializer::class)
public sealed class InlineComponentsSchemasChatStreamDeltaPropertiesRole {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `assistant`.
   */
  public data object Assistant : InlineComponentsSchemasChatStreamDeltaPropertiesRole() {
    public override val `value`: String = "assistant"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatStreamDeltaPropertiesRole()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatStreamDeltaPropertiesRole = when (value) {
      Assistant.value -> Assistant
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatStreamDeltaPropertiesRole> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatStreamDeltaPropertiesRole",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatStreamDeltaPropertiesRole =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatStreamDeltaPropertiesRole) {
      encoder.encodeString(value.value)
    }
  }
}
