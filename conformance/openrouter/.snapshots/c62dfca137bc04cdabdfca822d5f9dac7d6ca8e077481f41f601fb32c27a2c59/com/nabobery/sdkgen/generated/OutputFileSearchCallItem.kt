package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputFileSearchCallItem.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFileSearchCallItem
 */
@Serializable(with = OutputFileSearchCallItem.Serializer::class)
public class OutputFileSearchCallItem(
  public val id: String,
  queries: List<String>,
  public val status: WebSearchStatus,
  public val type: InlineOutputItemFileSearchCallTypeX69a7137a,
) {
  public val queries: List<String> = queries.toList()

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var queriesValue: List<String>? = null

    public var queries: List<String>
      get() = requireNotNull(queriesValue) { "queries is required" }.toList()
      set(`value`) {
        queriesValue = value.toList()
      }

    private var statusValue: WebSearchStatus? = null

    public var status: WebSearchStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputItemFileSearchCallTypeX69a7137a? = null

    public var type: InlineOutputItemFileSearchCallTypeX69a7137a
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OutputFileSearchCallItem {
      check(idValue != null) { "id is required" }
      check(queriesValue != null) { "queries is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputFileSearchCallItem(
        id = id,
        queries = queries,
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputFileSearchCallItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputFileSearchCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFileSearchCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFileSearchCallItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputFileSearchCallItem must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val queries = json.decodeRequired<List<String>>(rawObject, "queries")
      val status = json.decodeRequired<WebSearchStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputItemFileSearchCallTypeX69a7137a>(rawObject, "type")
      return OutputFileSearchCallItem(
        id = id,
        queries = queries,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputFileSearchCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputFileSearchCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("queries", json.encodeToJsonElement(value.queries))
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputFileSearchCallItem(block: OutputFileSearchCallItem.Builder.() -> Unit): OutputFileSearchCallItem = OutputFileSearchCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputFileSearchCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
