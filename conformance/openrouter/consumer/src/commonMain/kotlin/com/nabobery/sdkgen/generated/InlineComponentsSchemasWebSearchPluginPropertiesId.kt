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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasWebSearchPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web`.
   */
  public data object Web : InlineComponentsSchemasWebSearchPluginPropertiesId() {
    public override val `value`: String = "web"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchPluginPropertiesId = when (value) {
      Web.value -> Web
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebSearchPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
