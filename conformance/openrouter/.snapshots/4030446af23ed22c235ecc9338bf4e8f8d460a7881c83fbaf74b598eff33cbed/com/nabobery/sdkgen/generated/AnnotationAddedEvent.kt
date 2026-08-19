package com.nabobery.sdkgen.generated

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
 * Event emitted when a text annotation is added to output
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnnotationAddedEvent
 */
@Serializable(with = AnnotationAddedEvent.Serializer::class)
public class AnnotationAddedEvent(
  public val `annotation`: OpenAiResponsesAnnotation,
  public val annotationIndex: Int,
  public val contentIndex: Int,
  public val itemId: String,
  public val outputIndex: Int,
  public val sequenceNumber: Int,
  public val type: InlineBaseAnnotationAddedEventTypeXbc690cd8,
) {
  public class Builder {
    private var annotationValue: OpenAiResponsesAnnotation? = null

    public var `annotation`: OpenAiResponsesAnnotation
      get() = requireNotNull(annotationValue) { "annotation is required" }
      set(`value`) {
        annotationValue = value
      }

    private var annotationIndexValue: Int? = null

    public var annotationIndex: Int
      get() = requireNotNull(annotationIndexValue) { "annotationIndex is required" }
      set(`value`) {
        annotationIndexValue = value
      }

    private var contentIndexValue: Int? = null

    public var contentIndex: Int
      get() = requireNotNull(contentIndexValue) { "contentIndex is required" }
      set(`value`) {
        contentIndexValue = value
      }

    private var itemIdValue: String? = null

    public var itemId: String
      get() = requireNotNull(itemIdValue) { "itemId is required" }
      set(`value`) {
        itemIdValue = value
      }

    private var outputIndexValue: Int? = null

    public var outputIndex: Int
      get() = requireNotNull(outputIndexValue) { "outputIndex is required" }
      set(`value`) {
        outputIndexValue = value
      }

    private var sequenceNumberValue: Int? = null

    public var sequenceNumber: Int
      get() = requireNotNull(sequenceNumberValue) { "sequenceNumber is required" }
      set(`value`) {
        sequenceNumberValue = value
      }

    private var typeValue: InlineBaseAnnotationAddedEventTypeXbc690cd8? = null

    public var type: InlineBaseAnnotationAddedEventTypeXbc690cd8
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): AnnotationAddedEvent {
      check(annotationValue != null) { "annotation is required" }
      check(annotationIndexValue != null) { "annotationIndex is required" }
      check(contentIndexValue != null) { "contentIndex is required" }
      check(itemIdValue != null) { "itemId is required" }
      check(outputIndexValue != null) { "outputIndex is required" }
      check(sequenceNumberValue != null) { "sequenceNumber is required" }
      check(typeValue != null) { "type is required" }
      return AnnotationAddedEvent(
        annotation = annotation,
        annotationIndex = annotationIndex,
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnnotationAddedEvent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnnotationAddedEvent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnnotationAddedEvent {
      val jsonDecoder = decoder.requireJsonDecoder("AnnotationAddedEvent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnnotationAddedEvent must be a JSON object")
      val annotation = json.decodeRequired<OpenAiResponsesAnnotation>(rawObject, "annotation")
      val annotationIndex = json.decodeRequired<Int>(rawObject, "annotation_index")
      val contentIndex = json.decodeRequired<Int>(rawObject, "content_index")
      val itemId = json.decodeRequired<String>(rawObject, "item_id")
      val outputIndex = json.decodeRequired<Int>(rawObject, "output_index")
      val sequenceNumber = json.decodeRequired<Int>(rawObject, "sequence_number")
      val type = json.decodeRequired<InlineBaseAnnotationAddedEventTypeXbc690cd8>(rawObject, "type")
      return AnnotationAddedEvent(
        annotation = annotation,
        annotationIndex = annotationIndex,
        contentIndex = contentIndex,
        itemId = itemId,
        outputIndex = outputIndex,
        sequenceNumber = sequenceNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnnotationAddedEvent) {
      val jsonEncoder = encoder.requireJsonEncoder("AnnotationAddedEvent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("annotation", json.encodeToJsonElement(value.annotation))
        put("annotation_index", json.encodeToJsonElement(value.annotationIndex))
        put("content_index", json.encodeToJsonElement(value.contentIndex))
        put("item_id", value.itemId)
        put("output_index", json.encodeToJsonElement(value.outputIndex))
        put("sequence_number", json.encodeToJsonElement(value.sequenceNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun annotationAddedEvent(block: AnnotationAddedEvent.Builder.() -> Unit): AnnotationAddedEvent = AnnotationAddedEvent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnnotationAddedEvent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
