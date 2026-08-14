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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gist-commit/properties/change_status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-commit/properties/change_status
 */
@Serializable(with = InlineGistCommitChangeStatusX253d0141.Serializer::class)
public class InlineGistCommitChangeStatusX253d0141(
  public val additions: Int? = null,
  public val deletions: Int? = null,
  public val total: Int? = null,
) {
  public class Builder {
    public var additions: Int? = null

    public var deletions: Int? = null

    public var total: Int? = null

    public fun build(): InlineGistCommitChangeStatusX253d0141 = InlineGistCommitChangeStatusX253d0141(
      additions = additions,
      deletions = deletions,
      total = total,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistCommitChangeStatusX253d0141 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistCommitChangeStatusX253d0141> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistCommitChangeStatusX253d0141 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistCommitChangeStatusX253d0141")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistCommitChangeStatusX253d0141 must be a JSON object")
      return InlineGistCommitChangeStatusX253d0141(
        additions = rawObject["additions"]?.let { json.decodeFromJsonElement<Int>(it) },
        deletions = rawObject["deletions"]?.let { json.decodeFromJsonElement<Int>(it) },
        total = rawObject["total"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistCommitChangeStatusX253d0141) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistCommitChangeStatusX253d0141")
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

public fun inlineGistCommitChangeStatusX253d0141(block: InlineGistCommitChangeStatusX253d0141.Builder.() -> Unit): InlineGistCommitChangeStatusX253d0141 = InlineGistCommitChangeStatusX253d0141.build(block)
