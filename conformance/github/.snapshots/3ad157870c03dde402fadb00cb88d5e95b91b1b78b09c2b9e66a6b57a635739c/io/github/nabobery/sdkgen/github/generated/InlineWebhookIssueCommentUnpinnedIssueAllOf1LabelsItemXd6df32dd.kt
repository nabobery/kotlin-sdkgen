package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/l
 * abels/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/l
 * abels/items
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd.Serializer::class)
public class InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd(
  /**
   * 6-character hex code, without the leading #, identifying the color
   */
  public val color: String,
  public val default: Boolean,
  public val description: String?,
  public val id: Int,
  /**
   * The name of the label.
   */
  public val name: String,
  public val nodeId: String,
  /**
   * URL for the label
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
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

    public fun build(): InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd {
      check(colorValue != null) { "color is required" }
      check(defaultValue != null) { "default is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(urlValue != null) { "url is required" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd must be a JSON object")
      val color = json.decodeRequired<String>(rawObject, "color")
      val default = json.decodeRequired<Boolean>(rawObject, "default")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("description")) {
        throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd(
        color = color,
        default = default,
        description = description,
        id = id,
        name = name,
        nodeId = nodeId,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd")
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

public fun inlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd(block: InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd.Builder.() -> Unit): InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd = InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookIssueCommentUnpinnedIssueAllOf1LabelsItemXd6df32dd property '" + name + "' is not nullable")
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
