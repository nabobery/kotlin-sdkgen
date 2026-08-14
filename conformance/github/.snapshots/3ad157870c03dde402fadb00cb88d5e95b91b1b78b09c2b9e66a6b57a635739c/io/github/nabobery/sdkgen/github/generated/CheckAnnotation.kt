package io.github.nabobery.sdkgen.github.generated

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
 * Check Annotation
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-annotation
 */
@Serializable(with = CheckAnnotation.Serializer::class)
public class CheckAnnotation(
  public val annotationLevel: String?,
  public val blobHref: String,
  public val endColumn: Int?,
  public val endLine: Int,
  public val message: String?,
  public val path: String,
  public val rawDetails: String?,
  public val startColumn: Int?,
  public val startLine: Int,
  public val title: String?,
) {
  public class Builder {
    private var blobHrefValue: String? = null

    public var blobHref: String
      get() = requireNotNull(blobHrefValue) { "blobHref is required" }
      set(`value`) {
        blobHrefValue = value
      }

    private var endLineValue: Int? = null

    public var endLine: Int
      get() = requireNotNull(endLineValue) { "endLine is required" }
      set(`value`) {
        endLineValue = value
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

    private var annotationLevelState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var annotationLevel: String?
      get() = annotationLevelState.valueOrNull()
      set(`value`) {
        annotationLevelState = value.toNullableFieldState()
      }

    private var endColumnState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var endColumn: Int?
      get() = endColumnState.valueOrNull()
      set(`value`) {
        endColumnState = value.toNullableFieldState()
      }

    private var messageState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var message: String?
      get() = messageState.valueOrNull()
      set(`value`) {
        messageState = value.toNullableFieldState()
      }

    private var rawDetailsState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var rawDetails: String?
      get() = rawDetailsState.valueOrNull()
      set(`value`) {
        rawDetailsState = value.toNullableFieldState()
      }

    private var startColumnState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var startColumn: Int?
      get() = startColumnState.valueOrNull()
      set(`value`) {
        startColumnState = value.toNullableFieldState()
      }

    private var titleState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        titleState = value.toNullableFieldState()
      }

    public fun build(): CheckAnnotation {
      check(blobHrefValue != null) { "blobHref is required" }
      check(endLineValue != null) { "endLine is required" }
      check(pathValue != null) { "path is required" }
      check(startLineValue != null) { "startLine is required" }
      check(annotationLevelState !== FieldState.Absent) { "annotationLevel is required, even when null" }
      check(endColumnState !== FieldState.Absent) { "endColumn is required, even when null" }
      check(messageState !== FieldState.Absent) { "message is required, even when null" }
      check(rawDetailsState !== FieldState.Absent) { "rawDetails is required, even when null" }
      check(startColumnState !== FieldState.Absent) { "startColumn is required, even when null" }
      check(titleState !== FieldState.Absent) { "title is required, even when null" }
      return CheckAnnotation(
        annotationLevel = annotationLevelState.valueOrNull(),
        blobHref = blobHref,
        endColumn = endColumnState.valueOrNull(),
        endLine = endLine,
        message = messageState.valueOrNull(),
        path = path,
        rawDetails = rawDetailsState.valueOrNull(),
        startColumn = startColumnState.valueOrNull(),
        startLine = startLine,
        title = titleState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckAnnotation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckAnnotation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckAnnotation {
      val jsonDecoder = decoder.requireJsonDecoder("CheckAnnotation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckAnnotation must be a JSON object")
      val blobHref = json.decodeRequired<String>(rawObject, "blob_href")
      val endLine = json.decodeRequired<Int>(rawObject, "end_line")
      val path = json.decodeRequired<String>(rawObject, "path")
      val startLine = json.decodeRequired<Int>(rawObject, "start_line")
      if (!rawObject.containsKey("annotation_level")) {
        throw SerializationException("CheckAnnotation is missing required property 'annotation_level'")
      }
      val annotationLevel = rawObject["annotation_level"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("end_column")) {
        throw SerializationException("CheckAnnotation is missing required property 'end_column'")
      }
      val endColumn = rawObject["end_column"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("message")) {
        throw SerializationException("CheckAnnotation is missing required property 'message'")
      }
      val message = rawObject["message"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("raw_details")) {
        throw SerializationException("CheckAnnotation is missing required property 'raw_details'")
      }
      val rawDetails = rawObject["raw_details"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("start_column")) {
        throw SerializationException("CheckAnnotation is missing required property 'start_column'")
      }
      val startColumn = rawObject["start_column"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("title")) {
        throw SerializationException("CheckAnnotation is missing required property 'title'")
      }
      val title = rawObject["title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CheckAnnotation(
        annotationLevel = annotationLevel,
        blobHref = blobHref,
        endColumn = endColumn,
        endLine = endLine,
        message = message,
        path = path,
        rawDetails = rawDetails,
        startColumn = startColumn,
        startLine = startLine,
        title = title,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckAnnotation) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckAnnotation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("annotation_level", value.annotationLevel?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("blob_href", value.blobHref)
        put("end_column", value.endColumn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("end_line", json.encodeToJsonElement(value.endLine))
        put("message", value.message?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("path", value.path)
        put("raw_details", value.rawDetails?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_column", value.startColumn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_line", json.encodeToJsonElement(value.startLine))
        put("title", value.title?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkAnnotation(block: CheckAnnotation.Builder.() -> Unit): CheckAnnotation = CheckAnnotation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckAnnotation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CheckAnnotation property '" + name + "' is not nullable")
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
