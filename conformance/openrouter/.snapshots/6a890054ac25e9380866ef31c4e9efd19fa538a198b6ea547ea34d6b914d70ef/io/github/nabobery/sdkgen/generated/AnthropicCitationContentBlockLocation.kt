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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocation
 */
@Serializable(with = AnthropicCitationContentBlockLocation.Serializer::class)
public class AnthropicCitationContentBlockLocation(
  public val citedText: String,
  public val documentIndex: Int,
  public val documentTitle: String?,
  public val endBlockIndex: Int,
  public val fileId: String?,
  public val startBlockIndex: Int,
  public val type: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c,
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

    private var endBlockIndexValue: Int? = null

    public var endBlockIndex: Int
      get() = requireNotNull(endBlockIndexValue) { "endBlockIndex is required" }
      set(`value`) {
        endBlockIndexValue = value
      }

    private var startBlockIndexValue: Int? = null

    public var startBlockIndex: Int
      get() = requireNotNull(startBlockIndexValue) { "startBlockIndex is required" }
      set(`value`) {
        startBlockIndexValue = value
      }

    private var typeValue: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c? = null

    public var type: InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c
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

    public fun build(): AnthropicCitationContentBlockLocation {
      check(citedTextValue != null) { "citedText is required" }
      check(documentIndexValue != null) { "documentIndex is required" }
      check(endBlockIndexValue != null) { "endBlockIndex is required" }
      check(startBlockIndexValue != null) { "startBlockIndex is required" }
      check(typeValue != null) { "type is required" }
      check(documentTitleState !== FieldState.Absent) { "documentTitle is required, even when null" }
      check(fileIdState !== FieldState.Absent) { "fileId is required, even when null" }
      return AnthropicCitationContentBlockLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitleState.valueOrNull(),
        endBlockIndex = endBlockIndex,
        fileId = fileIdState.valueOrNull(),
        startBlockIndex = startBlockIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationContentBlockLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCitationContentBlockLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationContentBlockLocation {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationContentBlockLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCitationContentBlockLocation must be a JSON object")
      val citedText = json.decodeRequired<String>(rawObject, "cited_text")
      val documentIndex = json.decodeRequired<Int>(rawObject, "document_index")
      val endBlockIndex = json.decodeRequired<Int>(rawObject, "end_block_index")
      val startBlockIndex = json.decodeRequired<Int>(rawObject, "start_block_index")
      val type = json.decodeRequired<InlineAnthropicCitationContentBlockLocationTypeXdd14ff0c>(rawObject, "type")
      if (!rawObject.containsKey("document_title")) {
        throw SerializationException("AnthropicCitationContentBlockLocation is missing required property 'document_title'")
      }
      val documentTitle = rawObject["document_title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("file_id")) {
        throw SerializationException("AnthropicCitationContentBlockLocation is missing required property 'file_id'")
      }
      val fileId = rawObject["file_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationContentBlockLocation(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endBlockIndex = endBlockIndex,
        fileId = fileId,
        startBlockIndex = startBlockIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationContentBlockLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationContentBlockLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("document_index", json.encodeToJsonElement(value.documentIndex))
        put("document_title", value.documentTitle?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("end_block_index", json.encodeToJsonElement(value.endBlockIndex))
        put("file_id", value.fileId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("start_block_index", json.encodeToJsonElement(value.startBlockIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationContentBlockLocation(block: AnthropicCitationContentBlockLocation.Builder.() -> Unit): AnthropicCitationContentBlockLocation = AnthropicCitationContentBlockLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCitationContentBlockLocation is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicCitationContentBlockLocation property '" + name + "' is not nullable")
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
