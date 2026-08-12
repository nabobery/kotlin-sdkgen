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
 * Gist Commit
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gist-commit
 */
@Serializable(with = GistCommit.Serializer::class)
public class GistCommit(
  public val changeStatus: InlineGistCommitChangeStatusX253d0141,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val committedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  public val user: NullableSimpleUser?,
  public val version: String,
) {
  public class Builder {
    private var changeStatusValue: InlineGistCommitChangeStatusX253d0141? = null

    public var changeStatus: InlineGistCommitChangeStatusX253d0141
      get() = requireNotNull(changeStatusValue) { "changeStatus is required" }
      set(`value`) {
        changeStatusValue = value
      }

    private var committedAtValue: String? = null

    public var committedAt: String
      get() = requireNotNull(committedAtValue) { "committedAt is required" }
      set(`value`) {
        committedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    public fun build(): GistCommit {
      check(changeStatusValue != null) { "changeStatus is required" }
      check(committedAtValue != null) { "committedAt is required" }
      check(urlValue != null) { "url is required" }
      check(versionValue != null) { "version is required" }
      check(userState !== FieldState.Absent) { "user is required, even when null" }
      return GistCommit(
        changeStatus = changeStatus,
        committedAt = committedAt,
        url = url,
        user = userState.valueOrNull(),
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GistCommit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GistCommit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GistCommit {
      val jsonDecoder = decoder.requireJsonDecoder("GistCommit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GistCommit must be a JSON object")
      val changeStatus = json.decodeRequired<InlineGistCommitChangeStatusX253d0141>(rawObject, "change_status")
      val committedAt = json.decodeRequired<String>(rawObject, "committed_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val version = json.decodeRequired<String>(rawObject, "version")
      if (!rawObject.containsKey("user")) {
        throw SerializationException("GistCommit is missing required property 'user'")
      }
      val user = rawObject["user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return GistCommit(
        changeStatus = changeStatus,
        committedAt = committedAt,
        url = url,
        user = user,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: GistCommit) {
      val jsonEncoder = encoder.requireJsonEncoder("GistCommit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("change_status", json.encodeToJsonElement(value.changeStatus))
        put("committed_at", value.committedAt)
        put("url", value.url)
        put("user", value.user?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("version", value.version)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gistCommit(block: GistCommit.Builder.() -> Unit): GistCommit = GistCommit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GistCommit is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("GistCommit property '" + name + "' is not nullable")
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
