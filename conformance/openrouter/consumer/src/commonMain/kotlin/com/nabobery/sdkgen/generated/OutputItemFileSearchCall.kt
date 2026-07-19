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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OutputItemFileSearchCall.
 */
@Serializable(with = OutputItemFileSearchCall.Serializer::class)
public class OutputItemFileSearchCall(
  public val id: String,
  queries: List<String>,
  public val status: WebSearchStatus,
  public val type: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType,
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
      get() = requireNotNull(queriesValue) { "queries is required" }
      set(`value`) {
        queriesValue = value
      }

    private var statusValue: WebSearchStatus? = null

    public var status: WebSearchStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType? = null

    public var type: InlineComponentsSchemasOutputItemFileSearchCallPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): OutputItemFileSearchCall {
      check(idValue != null) { "id is required" }
      check(queriesValue != null) { "queries is required" }
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputItemFileSearchCall(
        id = id,
        queries = queries,
        status = status,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputItemFileSearchCall = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputItemFileSearchCall> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputItemFileSearchCall {
      val jsonDecoder = decoder.requireJsonDecoder("OutputItemFileSearchCall")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputItemFileSearchCall must be a JSON object")
      val id = json.decodeRequired<String>(raw, "id")
      val queries = json.decodeRequired<List<String>>(raw, "queries")
      val status = json.decodeRequired<WebSearchStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputItemFileSearchCallPropertiesType>(raw, "type")
      return OutputItemFileSearchCall(
        id = id,
        queries = queries,
        status = status,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputItemFileSearchCall) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputItemFileSearchCall")
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

public fun outputItemFileSearchCall(block: OutputItemFileSearchCall.Builder.() -> Unit): OutputItemFileSearchCall =
  OutputItemFileSearchCall.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputItemFileSearchCall is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
