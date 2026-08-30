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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/VideoGenerationRequest/properties/provider
 */
@Serializable(with = InlineVideoGenerationRequestProviderX41ede147.Serializer::class)
public class InlineVideoGenerationRequestProviderX41ede147(
  public val options: ProviderOptions? = null,
) {
  public class Builder {
    public var options: ProviderOptions? = null

    public fun build(): InlineVideoGenerationRequestProviderX41ede147 = InlineVideoGenerationRequestProviderX41ede147(
      options = options,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineVideoGenerationRequestProviderX41ede147 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineVideoGenerationRequestProviderX41ede147> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineVideoGenerationRequestProviderX41ede147 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineVideoGenerationRequestProviderX41ede147")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineVideoGenerationRequestProviderX41ede147 must be a JSON object")
      return InlineVideoGenerationRequestProviderX41ede147(
        options = rawObject["options"]?.let { json.decodeFromJsonElement<ProviderOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineVideoGenerationRequestProviderX41ede147) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineVideoGenerationRequestProviderX41ede147")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineVideoGenerationRequestProviderX41ede147(block: InlineVideoGenerationRequestProviderX41ede147.Builder.() -> Unit): InlineVideoGenerationRequestProviderX41ede147 = InlineVideoGenerationRequestProviderX41ede147.build(block)
