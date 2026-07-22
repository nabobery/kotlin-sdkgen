package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-gollum/properties/pages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-gollum/properties/pages/items
 */
@Serializable(with = InlineWebhookGollumPagesItemXe35e567d.Serializer::class)
public class InlineWebhookGollumPagesItemXe35e567d(
  /**
   * The action that was performed on the page. Can be `created` or `edited`.
   */
  public val action: InlineWebhookGollumPagesItemActionX13a7c79e,
  /**
   * Points to the HTML wiki page.
   */
  public val htmlUrl: String,
  /**
   * The name of the page.
   */
  public val pageName: String,
  /**
   * The latest commit SHA of the page.
   */
  public val sha: String,
  public val summary: String?,
  /**
   * The current page title.
   */
  public val title: String,
) {
  public class Builder {
    private var actionValue: InlineWebhookGollumPagesItemActionX13a7c79e? = null

    public var action: InlineWebhookGollumPagesItemActionX13a7c79e
      get() = requireNotNull(actionValue) { "action is required" }
      set(`value`) {
        actionValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var pageNameValue: String? = null

    public var pageName: String
      get() = requireNotNull(pageNameValue) { "pageName is required" }
      set(`value`) {
        pageNameValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var summaryState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var summary: String?
      get() = summaryState.valueOrNull()
      set(`value`) {
        summaryState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookGollumPagesItemXe35e567d {
      check(actionValue != null) { "action is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(pageNameValue != null) { "pageName is required" }
      check(shaValue != null) { "sha is required" }
      check(titleValue != null) { "title is required" }
      check(summaryState !== FieldState.Absent) { "summary is required, even when null" }
      return InlineWebhookGollumPagesItemXe35e567d(
        action = action,
        htmlUrl = htmlUrl,
        pageName = pageName,
        sha = sha,
        summary = summaryState.valueOrNull(),
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookGollumPagesItemXe35e567d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookGollumPagesItemXe35e567d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookGollumPagesItemXe35e567d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookGollumPagesItemXe35e567d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookGollumPagesItemXe35e567d must be a JSON object")
      val action = json.decodeRequired<InlineWebhookGollumPagesItemActionX13a7c79e>(rawObject, "action")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val pageName = json.decodeRequired<String>(rawObject, "page_name")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val title = json.decodeRequired<String>(rawObject, "title")
      if (!rawObject.containsKey("summary")) {
        throw SerializationException("InlineWebhookGollumPagesItemXe35e567d is missing required property 'summary'")
      }
      val summary = rawObject["summary"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookGollumPagesItemXe35e567d(
        action = action,
        htmlUrl = htmlUrl,
        pageName = pageName,
        sha = sha,
        summary = summary,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookGollumPagesItemXe35e567d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookGollumPagesItemXe35e567d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("action", json.encodeToJsonElement(value.action))
        put("html_url", value.htmlUrl)
        put("page_name", value.pageName)
        put("sha", value.sha)
        put("summary", value.summary?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("title", value.title)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookGollumPagesItemXe35e567d(block: InlineWebhookGollumPagesItemXe35e567d.Builder.() -> Unit): InlineWebhookGollumPagesItemXe35e567d = InlineWebhookGollumPagesItemXe35e567d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookGollumPagesItemXe35e567d is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookGollumPagesItemXe35e567d property '" + name + "' is not nullable")
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
