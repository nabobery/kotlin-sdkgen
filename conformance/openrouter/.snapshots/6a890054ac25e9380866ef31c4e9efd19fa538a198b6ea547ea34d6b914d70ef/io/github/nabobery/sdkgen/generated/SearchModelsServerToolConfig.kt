package io.github.nabobery.sdkgen.generated

import kotlin.Int
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
 * Configuration for the openrouter:experimental__search_models server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SearchModelsServerToolConfig
 */
@Serializable(with = SearchModelsServerToolConfig.Serializer::class)
public class SearchModelsServerToolConfig(
  /**
   * Maximum number of models to return. Defaults to 5, max 20.
   */
  public val maxResults: Int? = null,
) {
  public class Builder {
    /**
     * Maximum number of models to return. Defaults to 5, max 20.
     */
    public var maxResults: Int? = null

    public fun build(): SearchModelsServerToolConfig = SearchModelsServerToolConfig(
      maxResults = maxResults,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SearchModelsServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SearchModelsServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SearchModelsServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("SearchModelsServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SearchModelsServerToolConfig must be a JSON object")
      return SearchModelsServerToolConfig(
        maxResults = rawObject["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SearchModelsServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("SearchModelsServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maxResults?.let { put("max_results", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun searchModelsServerToolConfig(block: SearchModelsServerToolConfig.Builder.() -> Unit): SearchModelsServerToolConfig = SearchModelsServerToolConfig.build(block)
