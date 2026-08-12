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
 * Page Build
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/page-build
 */
@Serializable(with = PageBuild.Serializer::class)
public class PageBuild(
  public val commit: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val duration: Int,
  public val error: InlinePageBuildErrorX781d0699,
  public val pusher: NullableSimpleUser?,
  public val status: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public class Builder {
    private var commitValue: String? = null

    public var commit: String
      get() = requireNotNull(commitValue) { "commit is required" }
      set(`value`) {
        commitValue = value
      }

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

    private var errorValue: InlinePageBuildErrorX781d0699? = null

    public var error: InlinePageBuildErrorX781d0699
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

    private var pusherState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pusher: NullableSimpleUser?
      get() = pusherState.valueOrNull()
      set(`value`) {
        pusherState = value.toNullableFieldState()
      }

    public fun build(): PageBuild {
      check(commitValue != null) { "commit is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(durationValue != null) { "duration is required" }
      check(errorValue != null) { "error is required" }
      check(statusValue != null) { "status is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(pusherState !== FieldState.Absent) { "pusher is required, even when null" }
      return PageBuild(
        commit = commit,
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
    public fun build(block: Builder.() -> Unit): PageBuild = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PageBuild> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PageBuild {
      val jsonDecoder = decoder.requireJsonDecoder("PageBuild")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PageBuild must be a JSON object")
      val commit = json.decodeRequired<String>(rawObject, "commit")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val duration = json.decodeRequired<Int>(rawObject, "duration")
      val error = json.decodeRequired<InlinePageBuildErrorX781d0699>(rawObject, "error")
      val status = json.decodeRequired<String>(rawObject, "status")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("pusher")) {
        throw SerializationException("PageBuild is missing required property 'pusher'")
      }
      val pusher = rawObject["pusher"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return PageBuild(
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

    override fun serialize(encoder: Encoder, `value`: PageBuild) {
      val jsonEncoder = encoder.requireJsonEncoder("PageBuild")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit", value.commit)
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

public fun pageBuild(block: PageBuild.Builder.() -> Unit): PageBuild = PageBuild.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PageBuild is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PageBuild property '" + name + "' is not nullable")
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
