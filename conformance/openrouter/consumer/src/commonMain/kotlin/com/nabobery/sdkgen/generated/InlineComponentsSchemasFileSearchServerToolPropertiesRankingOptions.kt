package com.nabobery.sdkgen.generated

import kotlin.Double
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/ranking_options.
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions.Serializer::class)
public class InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions(
  public val ranker:
      InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker? = null,
  public val scoreThreshold: Double? = null,
) {
  public class Builder {
    public var ranker:
        InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker? = null

    public var scoreThreshold: Double? = null

    public fun build(): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions =
      InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions(
      ranker = ranker,
      scoreThreshold = scoreThreshold,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions must be a " +
          "JSON object")
      return InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions(
        ranker = raw["ranker"]?.let { json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptionsPropertiesRanker>(it) },
        scoreThreshold = raw["score_threshold"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ranker?.let { put("ranker", json.encodeToJsonElement(it)) }
        value.scoreThreshold?.let { put("score_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions(block: InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions.Builder.() -> Unit): InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions = InlineComponentsSchemasFileSearchServerToolPropertiesRankingOptions.build(block)
