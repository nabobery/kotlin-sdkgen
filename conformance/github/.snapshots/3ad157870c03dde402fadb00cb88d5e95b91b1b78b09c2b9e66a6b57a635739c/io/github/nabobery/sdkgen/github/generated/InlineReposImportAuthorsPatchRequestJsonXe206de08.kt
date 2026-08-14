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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import~1authors~1{author_id}/patch/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import~1authors~1{author_id}/patch/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineReposImportAuthorsPatchRequestJsonXe206de08.Serializer::class)
public class InlineReposImportAuthorsPatchRequestJsonXe206de08 internal constructor(
  private val emailState: FieldState<String>,
  private val nameState: FieldState<String>,
) {
  /**
   * The new Git author email.
   */
  public val email: String?
    get() = emailState.valueOrNull()

  /**
   * The new Git author name.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public constructor() : this(emailState = FieldState.Absent,
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var emailState: FieldState<String> = FieldState.Absent

    /**
     * The new Git author email.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "email is not nullable; call unsetEmail() to omit it" }
        emailState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The new Git author name.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    /**
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): InlineReposImportAuthorsPatchRequestJsonXe206de08 = InlineReposImportAuthorsPatchRequestJsonXe206de08(
      emailState = emailState,
      nameState = nameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposImportAuthorsPatchRequestJsonXe206de08 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposImportAuthorsPatchRequestJsonXe206de08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposImportAuthorsPatchRequestJsonXe206de08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposImportAuthorsPatchRequestJsonXe206de08")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposImportAuthorsPatchRequestJsonXe206de08 must be a JSON object")
      return InlineReposImportAuthorsPatchRequestJsonXe206de08(
        emailState = json.decodeOptional(rawObject, "email", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposImportAuthorsPatchRequestJsonXe206de08) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposImportAuthorsPatchRequestJsonXe206de08")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposImportAuthorsPatchRequestJsonXe206de08(block: InlineReposImportAuthorsPatchRequestJsonXe206de08.Builder.() -> Unit): InlineReposImportAuthorsPatchRequestJsonXe206de08 = InlineReposImportAuthorsPatchRequestJsonXe206de08.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposImportAuthorsPatchRequestJsonXe206de08 property '" + name + "' is not nullable")
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
