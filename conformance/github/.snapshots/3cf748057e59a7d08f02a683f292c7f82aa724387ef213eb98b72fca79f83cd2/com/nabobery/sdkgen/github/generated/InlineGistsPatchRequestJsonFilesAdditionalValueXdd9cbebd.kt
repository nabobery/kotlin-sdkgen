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
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}/patch/requestBody/content/application~1json/schema/properties/
 * files/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}/patch/requestBody/content/application~1json/schema/properties/
 * files/additionalProperties
 */
@Serializable(with = InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd.Serializer::class)
public class InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd internal constructor(
  private val contentState: FieldState<String>,
  private val filenameState: FieldState<String?>,
) {
  /**
   * The new content of the file.
   */
  public val content: String?
    get() = contentState.valueOrNull()

  /**
   * The new filename for the file.
   */
  public val filename: String?
    get() = filenameState.valueOrNull()

  public constructor() : this(contentState = FieldState.Absent,
  filenameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `content`.
   */
  public fun contentPresence(): FieldPresence = contentState.presence

  /**
   * Returns the wire presence of `filename`.
   */
  public fun filenamePresence(): FieldPresence = filenameState.presence

  public class Builder {
    private var contentState: FieldState<String> = FieldState.Absent

    /**
     * The new content of the file.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var content: String?
      get() = contentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "content is not nullable; call unsetContent() to omit it" }
        contentState = FieldState.Value(present)
      }

    private var filenameState: FieldState<String?> = FieldState.Absent

    /**
     * The new filename for the file.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var filename: String?
      get() = filenameState.valueOrNull()
      set(`value`) {
        filenameState = value.toNullableFieldState()
      }

    /**
     * Omits `content` from serialized output.
     */
    public fun unsetContent() {
      contentState = FieldState.Absent
    }

    /**
     * Omits `filename` from serialized output.
     */
    public fun unsetFilename() {
      filenameState = FieldState.Absent
    }

    public fun build(): InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd = InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd(
      contentState = contentState,
      filenameState = filenameState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd must be a JSON object")
      return InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd(
        contentState = json.decodeOptional(rawObject, "content", nullable = false),
        filenameState = json.decodeOptional(rawObject, "filename", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("content", value.contentState, json::encodeToJsonElement)
        putState("filename", value.filenameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd(block: InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd.Builder.() -> Unit): InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd = InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineGistsPatchRequestJsonFilesAdditionalValueXdd9cbebd property '" + name + "' is not nullable")
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
