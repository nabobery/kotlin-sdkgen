package com.nabobery.sdkgen.github.generated

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
 * The [List GitHub Pages builds](https://docs.github.com/rest/pages/pages#list-github-pages-builds) itself.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-page-build/properties/build
 */
@Serializable(with = InlineWebhookPageBuildBuildX219bde42.Serializer::class)
public class InlineWebhookPageBuildBuildX219bde42(
  public val commit: String?,
  public val createdAt: String,
  public val duration: Int,
  public val error: InlineWebhookPageBuildBuildErrorXde12d476,
  public val pusher: InlineWebhookPageBuildBuildPusherX1a518a30?,
  public val status: String,
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var durationValue: Int? = null

    public var duration: Int
      get() = requireNotNull(durationValue) { "duration is required" }
      set(`value`) {
        durationValue = value
      }

    private var errorValue: InlineWebhookPageBuildBuildErrorXde12d476? = null

    public var error: InlineWebhookPageBuildBuildErrorXde12d476
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var commitState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var commit: String?
      get() = commitState.valueOrNull()
      set(`value`) {
        commitState = value.toNullableFieldState()
      }

    private var pusherState: FieldState<InlineWebhookPageBuildBuildPusherX1a518a30?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pusher: InlineWebhookPageBuildBuildPusherX1a518a30?
      get() = pusherState.valueOrNull()
      set(`value`) {
        pusherState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPageBuildBuildX219bde42 {
      check(createdAtValue != null) { "createdAt is required" }
      check(durationValue != null) { "duration is required" }
      check(errorValue != null) { "error is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(commitState !== FieldState.Absent) { "commit is required, even when null" }
      check(pusherState !== FieldState.Absent) { "pusher is required, even when null" }
      return InlineWebhookPageBuildBuildX219bde42(
        commit = commitState.valueOrNull(),
        createdAt = createdAt,
        duration = duration,
        error = error,
        pusher = pusherState.valueOrNull(),
        status = status,
        updatedAt = updatedAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPageBuildBuildX219bde42 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPageBuildBuildX219bde42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPageBuildBuildX219bde42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPageBuildBuildX219bde42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPageBuildBuildX219bde42 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val duration = json.decodeRequired<Int>(rawObject, "duration")
      val error = json.decodeRequired<InlineWebhookPageBuildBuildErrorXde12d476>(rawObject, "error")
      val status = json.decodeRequired<String>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("commit")) {
        throw SerializationException("InlineWebhookPageBuildBuildX219bde42 is missing required property 'commit'")
      }
      val commit = rawObject["commit"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pusher")) {
        throw SerializationException("InlineWebhookPageBuildBuildX219bde42 is missing required property 'pusher'")
      }
      val pusher = rawObject["pusher"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookPageBuildBuildPusherX1a518a30?>(requireNotNull(element)) }
      return InlineWebhookPageBuildBuildX219bde42(
        commit = commit,
        createdAt = createdAt,
        duration = duration,
        error = error,
        pusher = pusher,
        status = status,
        updatedAt = updatedAt,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPageBuildBuildX219bde42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPageBuildBuildX219bde42")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", value.commit?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("duration", json.encodeToJsonElement(value.duration))
        put("error", json.encodeToJsonElement(value.error))
        put("pusher", value.pusher?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", value.status)
        put("updated_at", value.updatedAt)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPageBuildBuildX219bde42(block: InlineWebhookPageBuildBuildX219bde42.Builder.() -> Unit): InlineWebhookPageBuildBuildX219bde42 = InlineWebhookPageBuildBuildX219bde42.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPageBuildBuildX219bde42 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPageBuildBuildX219bde42 property '" + name + "' is not nullable")
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
