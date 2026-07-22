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
 * Email
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/email
 */
@Serializable(with = Email.Serializer::class)
public class Email(
  public val email: String,
  public val primary: Boolean,
  public val verified: Boolean,
  public val visibility: String?,
) {
  public class Builder {
    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var primaryValue: Boolean? = null

    public var primary: Boolean
      get() = requireNotNull(primaryValue) { "primary is required" }
      set(`value`) {
        primaryValue = value
      }

    private var verifiedValue: Boolean? = null

    public var verified: Boolean
      get() = requireNotNull(verifiedValue) { "verified is required" }
      set(`value`) {
        verifiedValue = value
      }

    private var visibilityState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var visibility: String?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        visibilityState = value.toNullableFieldState()
      }

    public fun build(): Email {
      check(emailValue != null) { "email is required" }
      check(primaryValue != null) { "primary is required" }
      check(verifiedValue != null) { "verified is required" }
      check(visibilityState !== FieldState.Absent) { "visibility is required, even when null" }
      return Email(
        email = email,
        primary = primary,
        verified = verified,
        visibility = visibilityState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Email = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Email> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Email {
      val jsonDecoder = decoder.requireJsonDecoder("Email")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Email must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val primary = json.decodeRequired<Boolean>(rawObject, "primary")
      val verified = json.decodeRequired<Boolean>(rawObject, "verified")
      if (!rawObject.containsKey("visibility")) {
        throw SerializationException("Email is missing required property 'visibility'")
      }
      val visibility = rawObject["visibility"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Email(
        email = email,
        primary = primary,
        verified = verified,
        visibility = visibility,
      )
    }

    override fun serialize(encoder: Encoder, `value`: Email) {
      val jsonEncoder = encoder.requireJsonEncoder("Email")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("primary", json.encodeToJsonElement(value.primary))
        put("verified", json.encodeToJsonElement(value.verified))
        put("visibility", value.visibility?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun email(block: Email.Builder.() -> Unit): Email = Email.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Email is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Email property '" + name + "' is not nullable")
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
