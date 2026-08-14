package io.github.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationPageLocation
 */
@Serializable(with = AnthropicCitationPageLocation.Serializer::class)
public class AnthropicCitationPageLocation(
  public val citedText: String,
  public val documentIndex: Int,
  public val documentTitle: String?,
  public val endPageNumber: Int,
  public val fileId: String?,
  public val startPageNumber: Int,
  public val type: InlineAnthropicCitationPageLocationTypeXdb1d2570,
) {
  public class Builder {
    private var citedTextValue: String? = null

    public var citedText: String
      get() = requireNotNull(citedTextValue) { "citedText is required" }
      set(`value`) {
        citedTextValue = value
      }

    private var documentIndexValue: Int? = null

    public var documentIndex: Int
      get() = requireNotNull(documentIndexValue) { "documentIndex is required" }
      set(`value`) {
        documentIndexValue = value
      }

    private var endPageNumberValue: Int? = null

    public var endPageNumber: Int
      get() = requireNotNull(endPageNumberValue) { "endPageNumber is required" }
      set(`value`) {
        endPageNumberValue = value
      }

    private var startPageNumberValue: Int? = null

    public var startPageNumber: Int
      get() = requireNotNull(startPageNumberValue) { "startPageNumber is required" }
      set(`value`) {
        startPageNumberValue = value
      }

    private var typeValue: InlineAnthropicCitationPageLocationTypeXdb1d2570? = null

    public var type: InlineAnthropicCitationPageLocationTypeXdb1d2570
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var documentTitleState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var documentTitle: String?
      get() = documentTitleState.valueOrNull()
      set(`value`) {
        documentTitleState = value.toNullableFieldState()
      }

    private var fileIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var fileId: String?
      get() = fileIdState.valueOrNull()
      set(`value`) {
        fileIdState = value.toNullableFieldState()
      }

    public fun build(): AnthropicCitationPageLocation {
      check(citedTextValue != null) { "citedText is required" }
      check(documentIndexValue != null) { "documentIndex is required" }
      check(endPageNumberValue != null) { "endPageNumber is required" }
      check(startPageNumberValue != null) { "startPageNumber is required" }
      check(typeValue != null) { "type is required" }
      check(documentTitleState !== FieldState.Absent) { "documentTitle is required, even when null" }
      check(fileIdState !== FieldState.Absent) { "fileId is required, even when null" }
      return AnthropicCitationPageLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitleState.valueOrNull(),
        endPageNumber = endPageNumber,
        fileId = fileIdState.valueOrNull(),
        startPageNumber = startPageNumber,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationPageLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCitationPageLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationPageLocation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationPageLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCitationPageLocation must be a JSON object")
      val citedText = json.decodeRequired<String>(rawObject, "cited_text")
      val documentIndex = json.decodeRequired<Int>(rawObject, "document_index")
      val endPageNumber = json.decodeRequired<Int>(rawObject, "end_page_number")
      val startPageNumber = json.decodeRequired<Int>(rawObject, "start_page_number")
      val type = json.decodeRequired<InlineAnthropicCitationPageLocationTypeXdb1d2570>(rawObject, "type")
      if (!rawObject.containsKey("document_title")) {
        throw SerializationException("AnthropicCitationPageLocation is missing required property 'document_title'")
      }
      val documentTitle = rawObject["document_title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("file_id")) {
        throw SerializationException("AnthropicCitationPageLocation is missing required property 'file_id'")
      }
      val fileId = rawObject["file_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationPageLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endPageNumber = endPageNumber,
        fileId = fileId,
        startPageNumber = startPageNumber,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationPageLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationPageLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("document_index", json.encodeToJsonElement(value.documentIndex))
        put("document_title", value.documentTitle?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("end_page_number", json.encodeToJsonElement(value.endPageNumber))
        put("file_id", value.fileId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_page_number", json.encodeToJsonElement(value.startPageNumber))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationPageLocation(block: AnthropicCitationPageLocation.Builder.() -> Unit): AnthropicCitationPageLocation = AnthropicCitationPageLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCitationPageLocation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicCitationPageLocation property '" + name + "' is not nullable")
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
