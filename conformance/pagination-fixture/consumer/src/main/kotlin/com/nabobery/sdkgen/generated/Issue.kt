package com.nabobery.sdkgen.generated

import kotlin.Long
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://pagination-fixture/openapi.yaml#/components/schemas/Issue.
 *
 * Source: sdkgen://pagination-fixture/openapi.yaml#/components/schemas/Issue
 */
@Serializable(with = Issue.Serializer::class)
public class Issue(
  public val id: Long,
  public val title: String,
) {
  public class Builder {
    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public fun build(): Issue {
      check(idValue != null) { "id is required" }
      check(titleValue != null) { "title is required" }
      return Issue(
        id = id,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Issue = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Issue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Issue {
      val jsonDecoder = decoder.requireJsonDecoder("Issue")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("Issue must be a JSON object")
      val id = json.decodeRequired<Long>(raw, "id")
      val title = json.decodeRequired<String>(raw, "title")
      return Issue(
        id = id,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Issue) {
      val jsonEncoder = encoder.requireJsonEncoder("Issue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("title", value.title)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issue(block: Issue.Builder.() -> Unit): Issue = Issue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Issue is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
