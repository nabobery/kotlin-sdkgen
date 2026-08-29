package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request-simple/properties/labels/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request-simple/properties/labels/items
 */
@Serializable(with = InlinePullRequestSimpleLabelsItemX5ec3a33e.Serializer::class)
public class InlinePullRequestSimpleLabelsItemX5ec3a33e(
  public val color: String,
  public val default: Boolean,
  public val description: String,
  public val id: Long,
  public val name: String,
  public val nodeId: String,
  public val url: String,
) {
  public class Builder {
    private var colorValue: String? = null

    public var color: String
      get() = requireNotNull(colorValue) { "color is required" }
      set(`value`) {
        colorValue = value
      }

    private var defaultValue: Boolean? = null

    public var default: Boolean
      get() = requireNotNull(defaultValue) { "default is required" }
      set(`value`) {
        defaultValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlinePullRequestSimpleLabelsItemX5ec3a33e {
      check(colorValue != null) { "color is required" }
      check(defaultValue != null) { "default is required" }
      check(descriptionValue != null) { "description is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(urlValue != null) { "url is required" }
      return InlinePullRequestSimpleLabelsItemX5ec3a33e(
        color = color,
        default = default,
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestSimpleLabelsItemX5ec3a33e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestSimpleLabelsItemX5ec3a33e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestSimpleLabelsItemX5ec3a33e {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestSimpleLabelsItemX5ec3a33e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestSimpleLabelsItemX5ec3a33e must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val default = json.decodeRequired<Boolean>(rawObject, "default")
      val description = json.decodeRequired<String>(rawObject, "description")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlinePullRequestSimpleLabelsItemX5ec3a33e(
        color = color,
        default = default,
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestSimpleLabelsItemX5ec3a33e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestSimpleLabelsItemX5ec3a33e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("default", json.encodeToJsonElement(value.default))
        put("description", value.description)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestSimpleLabelsItemX5ec3a33e(block: InlinePullRequestSimpleLabelsItemX5ec3a33e.Builder.() -> Unit): InlinePullRequestSimpleLabelsItemX5ec3a33e = InlinePullRequestSimpleLabelsItemX5ec3a33e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestSimpleLabelsItemX5ec3a33e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
