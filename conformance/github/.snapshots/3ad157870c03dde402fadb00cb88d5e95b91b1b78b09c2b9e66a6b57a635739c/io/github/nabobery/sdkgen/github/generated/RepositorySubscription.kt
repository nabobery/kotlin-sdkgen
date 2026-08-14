package io.github.nabobery.sdkgen.github.generated

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
 * Repository invitations let you manage who you collaborate with.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-subscription
 */
@Serializable(with = RepositorySubscription.Serializer::class)
public class RepositorySubscription(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Determines if all notifications should be blocked from this repository.
   */
  public val ignored: Boolean,
  public val reason: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val repositoryUrl: String,
  /**
   * Determines if notifications should be received from this repository.
   */
  public val subscribed: Boolean,
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

    private var ignoredValue: Boolean? = null

    public var ignored: Boolean
      get() = requireNotNull(ignoredValue) { "ignored is required" }
      set(`value`) {
        ignoredValue = value
      }

    private var repositoryUrlValue: String? = null

    public var repositoryUrl: String
      get() = requireNotNull(repositoryUrlValue) { "repositoryUrl is required" }
      set(`value`) {
        repositoryUrlValue = value
      }

    private var subscribedValue: Boolean? = null

    public var subscribed: Boolean
      get() = requireNotNull(subscribedValue) { "subscribed is required" }
      set(`value`) {
        subscribedValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var reasonState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var reason: String?
      get() = reasonState.valueOrNull()
      set(`value`) {
        reasonState = value.toNullableFieldState()
      }

    public fun build(): RepositorySubscription {
      check(createdAtValue != null) { "createdAt is required" }
      check(ignoredValue != null) { "ignored is required" }
      check(repositoryUrlValue != null) { "repositoryUrl is required" }
      check(subscribedValue != null) { "subscribed is required" }
      check(urlValue != null) { "url is required" }
      check(reasonState !== FieldState.Absent) { "reason is required, even when null" }
      return RepositorySubscription(
        createdAt = createdAt,
        ignored = ignored,
        reason = reasonState.valueOrNull(),
        repositoryUrl = repositoryUrl,
        subscribed = subscribed,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositorySubscription = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositorySubscription> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositorySubscription {
      val jsonDecoder = decoder.requireJsonDecoder("RepositorySubscription")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositorySubscription must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val ignored = json.decodeRequired<Boolean>(rawObject, "ignored")
      val repositoryUrl = json.decodeRequired<String>(rawObject, "repository_url")
      val subscribed = json.decodeRequired<Boolean>(rawObject, "subscribed")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("reason")) {
        throw SerializationException("RepositorySubscription is missing required property 'reason'")
      }
      val reason = rawObject["reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return RepositorySubscription(
        createdAt = createdAt,
        ignored = ignored,
        reason = reason,
        repositoryUrl = repositoryUrl,
        subscribed = subscribed,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositorySubscription) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositorySubscription")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("ignored", json.encodeToJsonElement(value.ignored))
        put("reason", value.reason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository_url", value.repositoryUrl)
        put("subscribed", json.encodeToJsonElement(value.subscribed))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositorySubscription(block: RepositorySubscription.Builder.() -> Unit): RepositorySubscription = RepositorySubscription.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositorySubscription is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("RepositorySubscription property '" + name + "' is not nullable")
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
