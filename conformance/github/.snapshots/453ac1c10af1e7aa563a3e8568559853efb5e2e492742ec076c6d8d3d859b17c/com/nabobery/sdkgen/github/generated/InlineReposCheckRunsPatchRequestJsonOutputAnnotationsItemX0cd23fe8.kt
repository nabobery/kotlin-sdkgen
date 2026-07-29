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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output/properties/annotations/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema/properties/output/properties/annotations/items
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 internal constructor(
  /**
   * The level of the annotation.
   */
  public val annotationLevel:
      InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127,
  /**
   * The end line of the annotation.
   */
  public val endLine: Int,
  /**
   * A short description of the feedback for these lines of code. The maximum size is 64 KB.
   */
  public val message: String,
  /**
   * The path of the file to add an annotation to. For example, `assets/css/main.css`.
   */
  public val path: String,
  /**
   * The start line of the annotation. Line numbers start at 1.
   */
  public val startLine: Int,
  private val endColumnState: FieldState<Int>,
  private val rawDetailsState: FieldState<String>,
  private val startColumnState: FieldState<Int>,
  private val titleState: FieldState<String>,
) {
  /**
   * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
   * this parameter if `start_line` and `end_line` have different values.
   */
  public val endColumn: Int?
    get() = endColumnState.valueOrNull()

  /**
   * Details about this annotation. The maximum size is 64 KB.
   */
  public val rawDetails: String?
    get() = rawDetailsState.valueOrNull()

  /**
   * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
   * this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.
   */
  public val startColumn: Int?
    get() = startColumnState.valueOrNull()

  /**
   * The title that represents the annotation. The maximum size is 255 characters.
   */
  public val title: String?
    get() = titleState.valueOrNull()

  public constructor(
    annotationLevel: InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127,
    endLine: Int,
    message: String,
    path: String,
    startLine: Int,
  ) : this(annotationLevel = annotationLevel,
  endLine = endLine,
  message = message,
  path = path,
  startLine = startLine,
  endColumnState = FieldState.Absent,
  rawDetailsState = FieldState.Absent,
  startColumnState = FieldState.Absent,
  titleState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `end_column`.
   */
  public fun endColumnPresence(): FieldPresence = endColumnState.presence

  /**
   * Returns the wire presence of `raw_details`.
   */
  public fun rawDetailsPresence(): FieldPresence = rawDetailsState.presence

  /**
   * Returns the wire presence of `start_column`.
   */
  public fun startColumnPresence(): FieldPresence = startColumnState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  public class Builder {
    private var annotationLevelValue:
        InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127? = null

    public var annotationLevel:
        InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127
      get() = requireNotNull(annotationLevelValue) { "annotationLevel is required" }
      set(`value`) {
        annotationLevelValue = value
      }

    private var endLineValue: Int? = null

    public var endLine: Int
      get() = requireNotNull(endLineValue) { "endLine is required" }
      set(`value`) {
        endLineValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    private var startLineValue: Int? = null

    public var startLine: Int
      get() = requireNotNull(startLineValue) { "startLine is required" }
      set(`value`) {
        startLineValue = value
      }

    private var endColumnState: FieldState<Int> = FieldState.Absent

    /**
     * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
     * this parameter if `start_line` and `end_line` have different values.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var endColumn: Int?
      get() = endColumnState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "endColumn is not nullable; call unsetEndColumn() to omit it" }
        endColumnState = FieldState.Value(present)
      }

    private var rawDetailsState: FieldState<String> = FieldState.Absent

    /**
     * Details about this annotation. The maximum size is 64 KB.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var rawDetails: String?
      get() = rawDetailsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "rawDetails is not nullable; call unsetRawDetails() to omit it" }
        rawDetailsState = FieldState.Value(present)
      }

    private var startColumnState: FieldState<Int> = FieldState.Absent

    /**
     * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line.
     * Omit this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var startColumn: Int?
      get() = startColumnState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "startColumn is not nullable; call unsetStartColumn() to omit it" }
        startColumnState = FieldState.Value(present)
      }

    private var titleState: FieldState<String> = FieldState.Absent

    /**
     * The title that represents the annotation. The maximum size is 255 characters.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "title is not nullable; call unsetTitle() to omit it" }
        titleState = FieldState.Value(present)
      }

    /**
     * Omits `end_column` from serialized output.
     */
    public fun unsetEndColumn() {
      endColumnState = FieldState.Absent
    }

    /**
     * Omits `raw_details` from serialized output.
     */
    public fun unsetRawDetails() {
      rawDetailsState = FieldState.Absent
    }

    /**
     * Omits `start_column` from serialized output.
     */
    public fun unsetStartColumn() {
      startColumnState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    public fun build(): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 {
      check(annotationLevelValue != null) { "annotationLevel is required" }
      check(endLineValue != null) { "endLine is required" }
      check(messageValue != null) { "message is required" }
      check(pathValue != null) { "path is required" }
      check(startLineValue != null) { "startLine is required" }
      return InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8(
        annotationLevel = annotationLevel,
        endLine = endLine,
        message = message,
        path = path,
        startLine = startLine,
        endColumnState = endColumnState,
        rawDetailsState = rawDetailsState,
        startColumnState = startColumnState,
        titleState = titleState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 must be a JSON object")
      val annotationLevel = json.decodeRequired<InlineReposCheckRunsPatchRequestJsonOutputAnnotationsAnnotationLevelX2ddcc127>(rawObject, "annotation_level")
      val endLine = json.decodeRequired<Int>(rawObject, "end_line")
      val message = json.decodeRequired<String>(rawObject, "message")
      val path = json.decodeRequired<String>(rawObject, "path")
      val startLine = json.decodeRequired<Int>(rawObject, "start_line")
      return InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8(
        annotationLevel = annotationLevel,
        endLine = endLine,
        message = message,
        path = path,
        startLine = startLine,
        endColumnState = json.decodeOptional(rawObject, "end_column", nullable = false),
        rawDetailsState = json.decodeOptional(rawObject, "raw_details", nullable = false),
        startColumnState = json.decodeOptional(rawObject, "start_column", nullable = false),
        titleState = json.decodeOptional(rawObject, "title", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("annotation_level", json.encodeToJsonElement(value.annotationLevel))
        put("end_line", json.encodeToJsonElement(value.endLine))
        put("message", value.message)
        put("path", value.path)
        put("start_line", json.encodeToJsonElement(value.startLine))
        putState("end_column", value.endColumnState, json::encodeToJsonElement)
        putState("raw_details", value.rawDetailsState, json::encodeToJsonElement)
        putState("start_column", value.startColumnState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8(block: InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8.Builder.() -> Unit): InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 = InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposCheckRunsPatchRequestJsonOutputAnnotationsItemX0cd23fe8 property '" + name + "' is not nullable")
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
