package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit/properties/stats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit/properties/stats
 */
@Serializable(with = InlineCommitStatsX0f18389f.Serializer::class)
public class InlineCommitStatsX0f18389f(
  public val additions: Int? = null,
  public val deletions: Int? = null,
  public val total: Int? = null,
) {
  public class Builder {
    public var additions: Int? = null

    public var deletions: Int? = null

    public var total: Int? = null

    public fun build(): InlineCommitStatsX0f18389f = InlineCommitStatsX0f18389f(
      additions = additions,
      deletions = deletions,
      total = total,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitStatsX0f18389f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitStatsX0f18389f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitStatsX0f18389f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitStatsX0f18389f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitStatsX0f18389f must be a JSON object")
      return InlineCommitStatsX0f18389f(
        additions = rawObject["additions"]?.let { json.decodeFromJsonElement<Int>(it) },
        deletions = rawObject["deletions"]?.let { json.decodeFromJsonElement<Int>(it) },
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitStatsX0f18389f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitStatsX0f18389f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additions?.let { put("additions", json.encodeToJsonElement(it)) }
        value.deletions?.let { put("deletions", json.encodeToJsonElement(it)) }
        value.total?.let { put("total", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitStatsX0f18389f(block: InlineCommitStatsX0f18389f.Builder.() -> Unit): InlineCommitStatsX0f18389f = InlineCommitStatsX0f18389f.build(block)
