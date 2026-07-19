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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebFetchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebFetchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebFetchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_fetch`.
   */
  public data object OpenrouterWebFetch : InlineComponentsSchemasWebFetchServerToolPropertiesType() {
    public override val `value`: String = "openrouter:web_fetch"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebFetchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebFetchServerToolPropertiesType = when (value) {
      OpenrouterWebFetch.value -> OpenrouterWebFetch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebFetchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebFetchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebFetchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebFetchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
