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
 * Thread
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/thread
 */
@Serializable(with = Thread.Serializer::class)
public class Thread(
  public val id: String,
  public val lastReadAt: String?,
  public val reason: String,
  public val repository: MinimalRepository,
  public val subject: InlineThreadSubjectX3ce14fbf,
  public val subscriptionUrl: String,
  public val unread: Boolean,
  public val updatedAt: String,
  public val url: String,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var subjectValue: InlineThreadSubjectX3ce14fbf? = null

    public var subject: InlineThreadSubjectX3ce14fbf
      get() = requireNotNull(subjectValue) { "subject is required" }
      set(`value`) {
        subjectValue = value
      }

    private var subscriptionUrlValue: String? = null

    public var subscriptionUrl: String
      get() = requireNotNull(subscriptionUrlValue) { "subscriptionUrl is required" }
      set(`value`) {
        subscriptionUrlValue = value
      }

    private var unreadValue: Boolean? = null

    public var unread: Boolean
      get() = requireNotNull(unreadValue) { "unread is required" }
      set(`value`) {
        unreadValue = value
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

    private var lastReadAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var lastReadAt: String?
      get() = lastReadAtState.valueOrNull()
      set(`value`) {
        lastReadAtState = value.toNullableFieldState()
      }

    public fun build(): Thread {
      check(idValue != null) { "id is required" }
      check(reasonValue != null) { "reason is required" }
      check(repositoryValue != null) { "repository is required" }
      check(subjectValue != null) { "subject is required" }
      check(subscriptionUrlValue != null) { "subscriptionUrl is required" }
      check(unreadValue != null) { "unread is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(lastReadAtState !== FieldState.Absent) { "lastReadAt is required, even when null" }
      return Thread(
        id = id,
        lastReadAt = lastReadAtState.valueOrNull(),
        reason = reason,
        repository = repository,
        subject = subject,
        subscriptionUrl = subscriptionUrl,
        unread = unread,
        updatedAt = updatedAt,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Thread = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Thread> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Thread {
      val jsonDecoder = decoder.requireJsonDecoder("Thread")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Thread must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val subject = json.decodeRequired<InlineThreadSubjectX3ce14fbf>(rawObject, "subject")
      val subscriptionUrl = json.decodeRequired<String>(rawObject, "subscription_url")
      val unread = json.decodeRequired<Boolean>(rawObject, "unread")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("last_read_at")) {
        throw SerializationException("Thread is missing required property 'last_read_at'")
      }
      val lastReadAt = rawObject["last_read_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Thread(
        id = id,
        lastReadAt = lastReadAt,
        reason = reason,
        repository = repository,
        subject = subject,
        subscriptionUrl = subscriptionUrl,
        unread = unread,
        updatedAt = updatedAt,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Thread) {
      val jsonEncoder = encoder.requireJsonEncoder("Thread")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("last_read_at", value.lastReadAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("reason", value.reason)
        put("repository", json.encodeToJsonElement(value.repository))
        put("subject", json.encodeToJsonElement(value.subject))
        put("subscription_url", value.subscriptionUrl)
        put("unread", json.encodeToJsonElement(value.unread))
        put("updated_at", value.updatedAt)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun thread(block: Thread.Builder.() -> Unit): Thread = Thread.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Thread is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Thread property '" + name + "' is not nullable")
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
