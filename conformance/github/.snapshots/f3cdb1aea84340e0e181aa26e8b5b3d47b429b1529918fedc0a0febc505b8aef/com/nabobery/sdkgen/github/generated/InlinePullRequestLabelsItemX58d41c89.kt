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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/labels/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/pull-request/properties/labels/items
 */
@Serializable(with = InlinePullRequestLabelsItemX58d41c89.Serializer::class)
public class InlinePullRequestLabelsItemX58d41c89(
  public val color: String,
  public val default: Boolean,
  public val description: String?,
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

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    public fun build(): InlinePullRequestLabelsItemX58d41c89 {
      check(colorValue != null) { "color is required" }
      check(defaultValue != null) { "default is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return InlinePullRequestLabelsItemX58d41c89(
        color = color,
        default = default,
        description = descriptionState.valueOrNull(),
        id = id,
        name = name,
        nodeId = nodeId,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePullRequestLabelsItemX58d41c89 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePullRequestLabelsItemX58d41c89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePullRequestLabelsItemX58d41c89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePullRequestLabelsItemX58d41c89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePullRequestLabelsItemX58d41c89 must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val default = json.decodeRequired<Boolean>(rawObject, "default")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlinePullRequestLabelsItemX58d41c89 is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlinePullRequestLabelsItemX58d41c89(
        color = color,
        default = default,
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePullRequestLabelsItemX58d41c89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePullRequestLabelsItemX58d41c89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("default", json.encodeToJsonElement(value.default))
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePullRequestLabelsItemX58d41c89(block: InlinePullRequestLabelsItemX58d41c89.Builder.() -> Unit): InlinePullRequestLabelsItemX58d41c89 = InlinePullRequestLabelsItemX58d41c89.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePullRequestLabelsItemX58d41c89 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlinePullRequestLabelsItemX58d41c89 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
