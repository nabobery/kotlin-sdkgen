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
 * Metaproperties for Git author/committer information.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/author
 * /allOf/0
 */
@Serializable(with = InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64.Serializer::class)
public class InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 internal constructor(
  public val email: String?,
  /**
   * The git author's name.
   */
  public val name: String,
  private val dateState: FieldState<String>,
  private val usernameState: FieldState<String>,
) {
  public val date: String?
    get() = dateState.valueOrNull()

  public val username: String?
    get() = usernameState.valueOrNull()

  public constructor(email: String?, name: String) : this(email = email,
  name = name,
  dateState = FieldState.Absent,
  usernameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `date`.
   */
  public fun datePresence(): FieldPresence = dateState.presence

  /**
   * Returns the wire presence of `username`.
   */
  public fun usernamePresence(): FieldPresence = usernameState.presence

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var emailState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
      }

    private var dateState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var date: String?
      get() = dateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "date is not nullable; call unsetDate() to omit it" }
        dateState = FieldState.Value(present)
      }

    private var usernameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var username: String?
      get() = usernameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "username is not nullable; call unsetUsername() to omit it" }
        usernameState = FieldState.Value(present)
      }

    /**
     * Omits `date` from serialized output.
     */
    public fun unsetDate() {
      dateState = FieldState.Absent
    }

    /**
     * Omits `username` from serialized output.
     */
    public fun unsetUsername() {
      usernameState = FieldState.Absent
    }

    public fun build(): InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 {
      check(nameValue != null) { "name is required" }
      check(emailState !== FieldState.Absent) { "email is required, even when null" }
      return InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64(
        email = emailState.valueOrNull(),
        name = name,
        dateState = dateState,
        usernameState = usernameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      if (!rawObject.containsKey("email")) {
        throw SerializationException("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 is missing required property 'email'")
      }
      val email = rawObject["email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64(
        email = email,
        name = name,
        dateState = json.decodeOptional(rawObject, "date", nullable = false),
        usernameState = json.decodeOptional(rawObject, "username", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        putState("date", value.dateState, json::encodeToJsonElement)
        putState("username", value.usernameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64(block: InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64.Builder.() -> Unit): InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 = InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookStatusCommitCommitAuthorAllOf1X2cbe2a64 property '" + name + "' is not nullable")
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
