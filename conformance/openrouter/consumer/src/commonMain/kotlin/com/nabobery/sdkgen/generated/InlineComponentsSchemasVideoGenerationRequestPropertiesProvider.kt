package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Provider-specific passthrough configuration
 */
@Serializable(with = InlineComponentsSchemasVideoGenerationRequestPropertiesProvider.Serializer::class)
public class InlineComponentsSchemasVideoGenerationRequestPropertiesProvider(
  public val options: ProviderOptions? = null,
) {
  public class Builder {
    public var options: ProviderOptions? = null

    public fun build(): InlineComponentsSchemasVideoGenerationRequestPropertiesProvider =
      InlineComponentsSchemasVideoGenerationRequestPropertiesProvider(
      options = options,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasVideoGenerationRequestPropertiesProvider =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasVideoGenerationRequestPropertiesProvider> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasVideoGenerationRequestPropertiesProvider {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasVideoGenerationRequestPropertiesProvider")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasVideoGenerationRequestPropertiesProvider must be a JSON " +
          "object")
      return InlineComponentsSchemasVideoGenerationRequestPropertiesProvider(
        options = raw["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasVideoGenerationRequestPropertiesProvider) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasVideoGenerationRequestPropertiesProvider")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasVideoGenerationRequestPropertiesProvider(block: InlineComponentsSchemasVideoGenerationRequestPropertiesProvider.Builder.() -> Unit): InlineComponentsSchemasVideoGenerationRequestPropertiesProvider = InlineComponentsSchemasVideoGenerationRequestPropertiesProvider.build(block)
