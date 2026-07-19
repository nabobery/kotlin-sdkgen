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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebFetchPlugin/properties/id.
 */
@Serializable(with = InlineComponentsSchemasWebFetchPluginPropertiesId.Serializer::class)
public sealed class InlineComponentsSchemasWebFetchPluginPropertiesId {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web-fetch`.
   */
  public data object WebFetch : InlineComponentsSchemasWebFetchPluginPropertiesId() {
    public override val `value`: String = "web-fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebFetchPluginPropertiesId()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebFetchPluginPropertiesId = when (value) {
      WebFetch.value -> WebFetch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebFetchPluginPropertiesId> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebFetchPluginPropertiesId",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebFetchPluginPropertiesId = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebFetchPluginPropertiesId) {
      encoder.encodeString(value.value)
    }
  }
}
