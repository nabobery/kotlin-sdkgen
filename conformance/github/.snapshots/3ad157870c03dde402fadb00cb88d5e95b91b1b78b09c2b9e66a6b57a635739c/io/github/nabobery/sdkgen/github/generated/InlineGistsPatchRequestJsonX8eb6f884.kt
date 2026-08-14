package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}/patch/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineGistsPatchRequestJsonX8eb6f884.Serializer::class)
public class InlineGistsPatchRequestJsonX8eb6f884 internal constructor(
  private val descriptionState: FieldState<String>,
  filesState: FieldState<Map<String, InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd?>>,
) {
  private val filesState:
      FieldState<Map<String, InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd?>> =
      filesState.copyValue { fieldValue -> fieldValue.toMap() }

  /**
   * The description of the gist.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
   * (including extension) of the targeted gist file. For example: `hello.py`.
   *
   * To delete a file, set the whole file to null. For example: `hello.py : null`. The file will also be
   * deleted if the specified object does not contain at least one of `content` or `filename`.
   */
  public val files: Map<String, InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd?>?
    get() = filesState.valueOrNull()

  public constructor() : this(descriptionState = FieldState.Absent,
  filesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `files`.
   */
  public fun filesPresence(): FieldPresence = filesState.presence

  public class Builder {
    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * The description of the gist.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var filesState:
        FieldState<Map<String, InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd?>> =
        FieldState.Absent

    /**
     * The gist files to be updated, renamed, or deleted. Each `key` must match the current filename
     * (including extension) of the targeted gist file. For example: `hello.py`.
     *
     * To delete a file, set the whole file to null. For example: `hello.py : null`. The file will also be
     * deleted if the specified object does not contain at least one of `content` or `filename`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var files: Map<String, InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd?>?
      get() = filesState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        val present = requireNotNull(value) { "files is not nullable; call unsetFiles() to omit it" }
        filesState = FieldState.Value(present.toMap())
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `files` from serialized output.
     */
    public fun unsetFiles() {
      filesState = FieldState.Absent
    }

    public fun build(): InlineGistsPatchRequestJsonX8eb6f884 = InlineGistsPatchRequestJsonX8eb6f884(
      descriptionState = descriptionState,
      filesState = filesState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsPatchRequestJsonX8eb6f884 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGistsPatchRequestJsonX8eb6f884> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsPatchRequestJsonX8eb6f884 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsPatchRequestJsonX8eb6f884")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsPatchRequestJsonX8eb6f884 must be a JSON object")
      return InlineGistsPatchRequestJsonX8eb6f884(
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        filesState = json.decodeOptional(rawObject, "files", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsPatchRequestJsonX8eb6f884) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsPatchRequestJsonX8eb6f884")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("files", value.filesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsPatchRequestJsonX8eb6f884(block: InlineGistsPatchRequestJsonX8eb6f884.Builder.() -> Unit): InlineGistsPatchRequestJsonX8eb6f884 = InlineGistsPatchRequestJsonX8eb6f884.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineGistsPatchRequestJsonX8eb6f884 property '" + name + "' is not nullable")
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
