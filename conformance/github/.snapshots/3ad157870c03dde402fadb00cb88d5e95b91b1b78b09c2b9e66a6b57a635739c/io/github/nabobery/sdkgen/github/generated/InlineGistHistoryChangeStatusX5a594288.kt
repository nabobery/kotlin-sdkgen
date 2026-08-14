package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gist-history/properties/change_status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-history/properties/change_status
 */
@Serializable(with = InlineGistHistoryChangeStatusX5a594288.Serializer::class)
public class InlineGistHistoryChangeStatusX5a594288(
  public val additions: Int? = null,
  public val deletions: Int? = null,
  public val total: Int? = null,
) {
  public class Builder {
    public var additions: Int? = null

    public var deletions: Int? = null

    public var total: Int? = null

    public fun build(): InlineGistHistoryChangeStatusX5a594288 = InlineGistHistoryChangeStatusX5a594288(
      additions = additions,
      deletions = deletions,
      total = total,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistHistoryChangeStatusX5a594288 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistHistoryChangeStatusX5a594288> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistHistoryChangeStatusX5a594288 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistHistoryChangeStatusX5a594288")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistHistoryChangeStatusX5a594288 must be a JSON object")
      return InlineGistHistoryChangeStatusX5a594288(
        additions = rawObject["additions"]?.let { json.decodeFromJsonElement<Int>(it) },
        deletions = rawObject["deletions"]?.let { json.decodeFromJsonElement<Int>(it) },
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistHistoryChangeStatusX5a594288) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistHistoryChangeStatusX5a594288")
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

public fun inlineGistHistoryChangeStatusX5a594288(block: InlineGistHistoryChangeStatusX5a594288.Builder.() -> Unit): InlineGistHistoryChangeStatusX5a594288 = InlineGistHistoryChangeStatusX5a594288.build(block)
