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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/ranking_options
 */
@Serializable(with = InlineFileSearchServerToolRankingOptionsX5b95574c.Serializer::class)
public class InlineFileSearchServerToolRankingOptionsX5b95574c(
  public val ranker: InlineFileSearchServerToolRankingOptionsRankerX3d00a298? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val scoreThreshold: Double? = null,
) {
  public class Builder {
    public var ranker: InlineFileSearchServerToolRankingOptionsRankerX3d00a298? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var scoreThreshold: Double? = null

    public fun build(): InlineFileSearchServerToolRankingOptionsX5b95574c = InlineFileSearchServerToolRankingOptionsX5b95574c(
      ranker = ranker,
      scoreThreshold = scoreThreshold,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileSearchServerToolRankingOptionsX5b95574c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolRankingOptionsX5b95574c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolRankingOptionsX5b95574c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileSearchServerToolRankingOptionsX5b95574c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileSearchServerToolRankingOptionsX5b95574c must be a JSON object")
      return InlineFileSearchServerToolRankingOptionsX5b95574c(
        ranker = rawObject["ranker"]?.let { json.decodeFromJsonElement<InlineFileSearchServerToolRankingOptionsRankerX3d00a298>(it) },
        scoreThreshold = rawObject["score_threshold"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolRankingOptionsX5b95574c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileSearchServerToolRankingOptionsX5b95574c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ranker?.let { put("ranker", json.encodeToJsonElement(it)) }
        value.scoreThreshold?.let { put("score_threshold", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileSearchServerToolRankingOptionsX5b95574c(block: InlineFileSearchServerToolRankingOptionsX5b95574c.Builder.() -> Unit): InlineFileSearchServerToolRankingOptionsX5b95574c = InlineFileSearchServerToolRankingOptionsX5b95574c.build(block)
