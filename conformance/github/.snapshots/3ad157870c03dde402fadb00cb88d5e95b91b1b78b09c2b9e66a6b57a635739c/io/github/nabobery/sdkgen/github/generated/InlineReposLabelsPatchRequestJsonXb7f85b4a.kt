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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1labels~1{name}/patch/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1labels~1{name}/patch/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineReposLabelsPatchRequestJsonXb7f85b4a.Serializer::class)
public class InlineReposLabelsPatchRequestJsonXb7f85b4a internal constructor(
  private val colorState: FieldState<String>,
  private val descriptionState: FieldState<String>,
  private val newNameState: FieldState<String>,
) {
  /**
   * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
   */
  public val color: String?
    get() = colorState.valueOrNull()

  /**
   * A short description of the label. Must be 100 characters or fewer.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For
   * example, typing `:strawberry:` will render the emoji
   * ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full
   * list of available emoji and codes, see "[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet)."
   */
  public val newName: String?
    get() = newNameState.valueOrNull()

  public constructor() : this(colorState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  newNameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `color`.
   */
  public fun colorPresence(): FieldPresence = colorState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `new_name`.
   */
  public fun newNamePresence(): FieldPresence = newNameState.presence

  public class Builder {
    private var colorState: FieldState<String> = FieldState.Absent

    /**
     * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var color: String?
      get() = colorState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "color is not nullable; call unsetColor() to omit it" }
        colorState = FieldState.Value(present)
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A short description of the label. Must be 100 characters or fewer.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var newNameState: FieldState<String> = FieldState.Absent

    /**
     * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup.
     * For example, typing `:strawberry:` will render the emoji
     * ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full
     * list of available emoji and codes, see "[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var newName: String?
      get() = newNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "newName is not nullable; call unsetNewName() to omit it" }
        newNameState = FieldState.Value(present)
      }

    /**
     * Omits `color` from serialized output.
     */
    public fun unsetColor() {
      colorState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `new_name` from serialized output.
     */
    public fun unsetNewName() {
      newNameState = FieldState.Absent
    }

    public fun build(): InlineReposLabelsPatchRequestJsonXb7f85b4a = InlineReposLabelsPatchRequestJsonXb7f85b4a(
      colorState = colorState,
      descriptionState = descriptionState,
      newNameState = newNameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposLabelsPatchRequestJsonXb7f85b4a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposLabelsPatchRequestJsonXb7f85b4a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposLabelsPatchRequestJsonXb7f85b4a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposLabelsPatchRequestJsonXb7f85b4a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposLabelsPatchRequestJsonXb7f85b4a must be a JSON object")
      return InlineReposLabelsPatchRequestJsonXb7f85b4a(
        colorState = json.decodeOptional(rawObject, "color", nullable = false),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        newNameState = json.decodeOptional(rawObject, "new_name", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposLabelsPatchRequestJsonXb7f85b4a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposLabelsPatchRequestJsonXb7f85b4a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("color", value.colorState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("new_name", value.newNameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposLabelsPatchRequestJsonXb7f85b4a(block: InlineReposLabelsPatchRequestJsonXb7f85b4a.Builder.() -> Unit): InlineReposLabelsPatchRequestJsonXb7f85b4a = InlineReposLabelsPatchRequestJsonXb7f85b4a.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposLabelsPatchRequestJsonXb7f85b4a property '" + name + "' is not nullable")
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
