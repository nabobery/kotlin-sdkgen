package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationContentBlockLocationParam.
 */
@Serializable(with = AnthropicCitationContentBlockLocationParam.Serializer::class)
public class AnthropicCitationContentBlockLocationParam(
  public val citedText: String,
  public val documentIndex: Int,
  public val documentTitle: String?,
  public val endBlockIndex: Int,
  public val startBlockIndex: Int,
  public val type: InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType,
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

    private var typeValue:
        InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType? = null

    public var type: InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType
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

    public fun build(): AnthropicCitationContentBlockLocationParam {
      check(citedTextValue != null) { "citedText is required" }
      check(documentIndexValue != null) { "documentIndex is required" }
      check(endBlockIndexValue != null) { "endBlockIndex is required" }
      check(startBlockIndexValue != null) { "startBlockIndex is required" }
      check(typeValue != null) { "type is required" }
      check(documentTitleState !== FieldState.Absent) { "documentTitle is required, even when null" }
      return AnthropicCitationContentBlockLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitleState.valueOrNull(),
        endBlockIndex = endBlockIndex,
        startBlockIndex = startBlockIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationContentBlockLocationParam = Builder().apply(block)
      .build()
  }

  public object Serializer : KSerializer<AnthropicCitationContentBlockLocationParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationContentBlockLocationParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationContentBlockLocationParam")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("AnthropicCitationContentBlockLocationParam must be a JSON object")
      val citedText = json.decodeRequired<String>(raw, "cited_text")
      val documentIndex = json.decodeRequired<Int>(raw, "document_index")
      val endBlockIndex = json.decodeRequired<Int>(raw, "end_block_index")
      val startBlockIndex = json.decodeRequired<Int>(raw, "start_block_index")
      val type = json
        .decodeRequired<InlineComponentsSchemasAnthropicCitationContentBlockLocationParamPropertiesType>(raw, "type")
      if (!raw.containsKey("document_title")) {
        throw SerializationException("AnthropicCitationContentBlockLocationParam is missing required property " +
          "'document_title'")
      }
      val documentTitle = raw["document_title"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationContentBlockLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endBlockIndex = endBlockIndex,
        startBlockIndex = startBlockIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationContentBlockLocationParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationContentBlockLocationParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("document_index", json.encodeToJsonElement(value.documentIndex))
        put("document_title", value.documentTitle?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("end_block_index", json.encodeToJsonElement(value.endBlockIndex))
        put("start_block_index", json.encodeToJsonElement(value.startBlockIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationContentBlockLocationParam(block: AnthropicCitationContentBlockLocationParam.Builder.() ->
  Unit): AnthropicCitationContentBlockLocationParam = AnthropicCitationContentBlockLocationParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("AnthropicCitationContentBlockLocationParam is missing required property '" + name +
      "'")
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
    if (!nullable) throw SerializationException("AnthropicCitationContentBlockLocationParam property '" + name +
      "' is not nullable")
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
