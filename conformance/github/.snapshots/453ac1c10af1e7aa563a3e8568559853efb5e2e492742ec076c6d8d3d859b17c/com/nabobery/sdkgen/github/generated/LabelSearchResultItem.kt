package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Label Search Result Item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/label-search-result-item
 */
@Serializable(with = LabelSearchResultItem.Serializer::class)
public class LabelSearchResultItem internal constructor(
  public val color: String,
  public val default: Boolean,
  public val description: String?,
  public val id: Int,
  public val name: String,
  public val nodeId: String,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val score: Double,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>>,
) {
  private val textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
      textMatchesState.copyValue { fieldValue -> fieldValue.toList() }

  public val textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
    get() = textMatchesState.valueOrNull()

  public constructor(
    color: String,
    default: Boolean,
    description: String?,
    id: Int,
    name: String,
    nodeId: String,
    score: Double,
    url: String,
  ) : this(color = color,
  default = default,
  description = description,
  id = id,
  name = name,
  nodeId = nodeId,
  score = score,
  url = url,
  textMatchesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `text_matches`.
   */
  public fun textMatchesPresence(): FieldPresence = textMatchesState.presence

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

    private var idValue: Int? = null

    public var id: Int
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

    private var scoreValue: Double? = null

    public var score: Double
      get() = requireNotNull(scoreValue) { "score is required" }
      set(`value`) {
        scoreValue = value
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

    private var textMatchesState: FieldState<List<InlineSearchResultTextMatchesItemXe380e62a>> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var textMatches: List<InlineSearchResultTextMatchesItemXe380e62a>?
      get() = textMatchesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "textMatches is not nullable; call unsetTextMatches() to omit it" }
        textMatchesState = FieldState.Value(present.toList())
      }

    /**
     * Omits `text_matches` from serialized output.
     */
    public fun unsetTextMatches() {
      textMatchesState = FieldState.Absent
    }

    public fun build(): LabelSearchResultItem {
      check(colorValue != null) { "color is required" }
      check(defaultValue != null) { "default is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(scoreValue != null) { "score is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return LabelSearchResultItem(
        color = color,
        default = default,
        description = descriptionState.valueOrNull(),
        id = id,
        name = name,
        nodeId = nodeId,
        score = score,
        url = url,
        textMatchesState = textMatchesState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LabelSearchResultItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LabelSearchResultItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LabelSearchResultItem {
      val jsonDecoder = decoder.requireJsonDecoder("LabelSearchResultItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LabelSearchResultItem must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val default = json.decodeRequired<Boolean>(rawObject, "default")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val score = json.decodeRequired<Double>(rawObject, "score")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("LabelSearchResultItem is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return LabelSearchResultItem(
        color = color,
        default = default,
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        score = score,
        url = url,
        textMatchesState = json.decodeOptional(rawObject, "text_matches", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: LabelSearchResultItem) {
      val jsonEncoder = encoder.requireJsonEncoder("LabelSearchResultItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("color", value.color)
        put("default", json.encodeToJsonElement(value.default))
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("score", json.encodeToJsonElement(value.score))
        put("url", value.url)
        putState("text_matches", value.textMatchesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun labelSearchResultItem(block: LabelSearchResultItem.Builder.() -> Unit): LabelSearchResultItem = LabelSearchResultItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LabelSearchResultItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("LabelSearchResultItem property '" + name + "' is not nullable")
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
