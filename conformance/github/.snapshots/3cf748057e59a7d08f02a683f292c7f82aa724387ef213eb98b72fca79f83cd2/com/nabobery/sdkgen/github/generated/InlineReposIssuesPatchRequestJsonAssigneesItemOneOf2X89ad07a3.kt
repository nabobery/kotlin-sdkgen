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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/assignees/items/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/assignees/items/oneOf/1
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3.Serializer::class)
public class InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 internal constructor(
  private val loginState: FieldState<String>,
) {
  public val login: String?
    get() = loginState.valueOrNull()

  public constructor() : this(loginState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `login`.
   */
  public fun loginPresence(): FieldPresence = loginState.presence

  public class Builder {
    private var loginState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var login: String?
      get() = loginState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "login is not nullable; call unsetLogin() to omit it" }
        loginState = FieldState.Value(present)
      }

    /**
     * Omits `login` from serialized output.
     */
    public fun unsetLogin() {
      loginState = FieldState.Absent
    }

    public fun build(): InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 = InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3(
      loginState = loginState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 must be a JSON object")
      return InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3(
        loginState = json.decodeOptional(rawObject, "login", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("login", value.loginState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3(block: InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3.Builder.() -> Unit): InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 = InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposIssuesPatchRequestJsonAssigneesItemOneOf2X89ad07a3 property '" + name + "' is not nullable")
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
