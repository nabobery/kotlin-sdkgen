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
@Serializable(with = InlineComponentsSchemasSpeechRequestPropertiesProvider.Serializer::class)
public class InlineComponentsSchemasSpeechRequestPropertiesProvider(
  public val options: ProviderOptions? = null,
) {
  public class Builder {
    public var options: ProviderOptions? = null

    public fun build(): InlineComponentsSchemasSpeechRequestPropertiesProvider =
      InlineComponentsSchemasSpeechRequestPropertiesProvider(
      options = options,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasSpeechRequestPropertiesProvider = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSpeechRequestPropertiesProvider> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSpeechRequestPropertiesProvider {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasSpeechRequestPropertiesProvider")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasSpeechRequestPropertiesProvider must be a JSON object")
      return InlineComponentsSchemasSpeechRequestPropertiesProvider(
        options = raw["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasSpeechRequestPropertiesProvider) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasSpeechRequestPropertiesProvider")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasSpeechRequestPropertiesProvider(block: InlineComponentsSchemasSpeechRequestPropertiesProvider.Builder.() -> Unit): InlineComponentsSchemasSpeechRequestPropertiesProvider = InlineComponentsSchemasSpeechRequestPropertiesProvider.build(block)
