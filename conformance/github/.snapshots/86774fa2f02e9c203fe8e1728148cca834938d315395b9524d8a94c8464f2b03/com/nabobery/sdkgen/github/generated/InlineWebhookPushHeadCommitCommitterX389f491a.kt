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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/head_commit/properties/committer
 */
@Serializable(with = InlineWebhookPushHeadCommitCommitterX389f491a.Serializer::class)
public class InlineWebhookPushHeadCommitCommitterX389f491a internal constructor(
  /**
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val email: String?,
  /**
   * The git author's name.
   */
  public val name: String,
  private val dateState: FieldState<String>,
  private val usernameState: FieldState<String>,
) {
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
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
     * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        emailState = value.toNullableFieldState()
      }

    private var dateState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
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

    public fun build(): InlineWebhookPushHeadCommitCommitterX389f491a {
      check(nameValue != null) { "name is required" }
      check(emailState !== FieldState.Absent) { "email is required, even when null" }
      return InlineWebhookPushHeadCommitCommitterX389f491a(
        email = emailState.valueOrNull(),
        name = name,
        dateState = dateState,
        usernameState = usernameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPushHeadCommitCommitterX389f491a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPushHeadCommitCommitterX389f491a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPushHeadCommitCommitterX389f491a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPushHeadCommitCommitterX389f491a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPushHeadCommitCommitterX389f491a must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      if (!rawObject.containsKey("email")) {
        throw SerializationException("InlineWebhookPushHeadCommitCommitterX389f491a is missing required property 'email'")
      }
      val email = rawObject["email"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPushHeadCommitCommitterX389f491a(
        email = email,
        name = name,
        dateState = json.decodeOptional(rawObject, "date", nullable = false),
        usernameState = json.decodeOptional(rawObject, "username", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushHeadCommitCommitterX389f491a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPushHeadCommitCommitterX389f491a")
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

public fun inlineWebhookPushHeadCommitCommitterX389f491a(block: InlineWebhookPushHeadCommitCommitterX389f491a.Builder.() -> Unit): InlineWebhookPushHeadCommitCommitterX389f491a = InlineWebhookPushHeadCommitCommitterX389f491a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPushHeadCommitCommitterX389f491a is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPushHeadCommitCommitterX389f491a property '" + name + "' is not nullable")
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
