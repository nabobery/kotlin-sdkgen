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
 * Actor
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actor
 */
@Serializable(with = Actor.Serializer::class)
public class Actor internal constructor(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val avatarUrl: String,
  public val gravatarId: String?,
  public val id: Int,
  public val login: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val displayLoginState: FieldState<String>,
) {
  public val displayLogin: String?
    get() = displayLoginState.valueOrNull()

  public constructor(
    avatarUrl: String,
    gravatarId: String?,
    id: Int,
    login: String,
    url: String,
  ) : this(avatarUrl = avatarUrl,
  gravatarId = gravatarId,
  id = id,
  login = login,
  url = url,
  displayLoginState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `display_login`.
   */
  public fun displayLoginPresence(): FieldPresence = displayLoginState.presence

  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var gravatarIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var gravatarId: String?
      get() = gravatarIdState.valueOrNull()
      set(`value`) {
        gravatarIdState = value.toNullableFieldState()
      }

    private var displayLoginState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var displayLogin: String?
      get() = displayLoginState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "displayLogin is not nullable; call unsetDisplayLogin() to omit it" }
        displayLoginState = FieldState.Value(present)
      }

    /**
     * Omits `display_login` from serialized output.
     */
    public fun unsetDisplayLogin() {
      displayLoginState = FieldState.Absent
    }

    public fun build(): Actor {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(idValue != null) { "id is required" }
      check(loginValue != null) { "login is required" }
      check(urlValue != null) { "url is required" }
      check(gravatarIdState !== FieldState.Absent) { "gravatarId is required, even when null" }
      return Actor(
        avatarUrl = avatarUrl,
        gravatarId = gravatarIdState.valueOrNull(),
        id = id,
        login = login,
        url = url,
        displayLoginState = displayLoginState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Actor = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Actor> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Actor {
      val jsonDecoder = decoder.requireJsonDecoder("Actor")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Actor must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val login = json.decodeRequired<String>(rawObject, "login")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("gravatar_id")) {
        throw SerializationException("Actor is missing required property 'gravatar_id'")
      }
      val gravatarId = rawObject["gravatar_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Actor(
        avatarUrl = avatarUrl,
        gravatarId = gravatarId,
        id = id,
        login = login,
        url = url,
        displayLoginState = json.decodeOptional(rawObject, "display_login", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Actor) {
      val jsonEncoder = encoder.requireJsonEncoder("Actor")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("avatar_url", value.avatarUrl)
        put("gravatar_id", value.gravatarId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("login", value.login)
        put("url", value.url)
        putState("display_login", value.displayLoginState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actor(block: Actor.Builder.() -> Unit): Actor = Actor.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Actor is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Actor property '" + name + "' is not nullable")
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
