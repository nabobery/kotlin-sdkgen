package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output/properties/annotations/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs/post/requestBody/content/application~1json/s
 * chema/properties/output/properties/annotations/items
 */
@Serializable(with = InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811.Serializer::class)
public class InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811(
  /**
   * The level of the annotation.
   */
  public val annotationLevel:
      InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9,
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
  /**
   * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
   * this parameter if `start_line` and `end_line` have different values.
   */
  public val endColumn: Int? = null,
  /**
   * Details about this annotation. The maximum size is 64 KB.
   */
  public val rawDetails: String? = null,
  /**
   * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
   * this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.
   */
  public val startColumn: Int? = null,
  /**
   * The title that represents the annotation. The maximum size is 255 characters.
   */
  public val title: String? = null,
) {
  public class Builder {
    private var annotationLevelValue:
        InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9? = null

    public var annotationLevel:
        InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9
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

    /**
     * The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit
     * this parameter if `start_line` and `end_line` have different values.
     */
    public var endColumn: Int? = null

    /**
     * Details about this annotation. The maximum size is 64 KB.
     */
    public var rawDetails: String? = null

    /**
     * The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line.
     * Omit this parameter if `start_line` and `end_line` have different values. Column numbers start at 1.
     */
    public var startColumn: Int? = null

    /**
     * The title that represents the annotation. The maximum size is 255 characters.
     */
    public var title: String? = null

    public fun build(): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 {
      check(annotationLevelValue != null) { "annotationLevel is required" }
      check(endLineValue != null) { "endLine is required" }
      check(messageValue != null) { "message is required" }
      check(pathValue != null) { "path is required" }
      check(startLineValue != null) { "startLine is required" }
      return InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811(
        annotationLevel = annotationLevel,
        endLine = endLine,
        message = message,
        path = path,
        startLine = startLine,
        endColumn = endColumn,
        rawDetails = rawDetails,
        startColumn = startColumn,
        title = title,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 must be a JSON object")
      val annotationLevel = json.decodeRequired<InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemAnnotationLevelX5ef03fd9>(rawObject, "annotation_level")
      val endLine = json.decodeRequired<Int>(rawObject, "end_line")
      val message = json.decodeRequired<String>(rawObject, "message")
      val path = json.decodeRequired<String>(rawObject, "path")
      val startLine = json.decodeRequired<Int>(rawObject, "start_line")
      return InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811(
        annotationLevel = annotationLevel,
        endLine = endLine,
        message = message,
        path = path,
        startLine = startLine,
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        rawDetails = rawObject["raw_details"]?.let { json.decodeFromJsonElement<String>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("annotation_level", json.encodeToJsonElement(value.annotationLevel))
        put("end_line", json.encodeToJsonElement(value.endLine))
        put("message", value.message)
        put("path", value.path)
        put("start_line", json.encodeToJsonElement(value.startLine))
        value.endColumn?.let { put("end_column", json.encodeToJsonElement(it)) }
        value.rawDetails?.let { put("raw_details", it) }
        value.startColumn?.let { put("start_column", json.encodeToJsonElement(it)) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811(block: InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811.Builder.() -> Unit): InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 = InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCheckRunsPostRequestJsonOutputAnnotationsItemX64e5e811 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
