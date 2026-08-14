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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocationParam.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCitationCharLocationParam
 */
@Serializable(with = AnthropicCitationCharLocationParam.Serializer::class)
public class AnthropicCitationCharLocationParam(
  public val citedText: String,
  public val documentIndex: Int,
  public val documentTitle: String?,
  public val endCharIndex: Int,
  public val startCharIndex: Int,
  public val type: InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f,
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

    private var endCharIndexValue: Int? = null

    public var endCharIndex: Int
      get() = requireNotNull(endCharIndexValue) { "endCharIndex is required" }
      set(`value`) {
        endCharIndexValue = value
      }

    private var startCharIndexValue: Int? = null

    public var startCharIndex: Int
      get() = requireNotNull(startCharIndexValue) { "startCharIndex is required" }
      set(`value`) {
        startCharIndexValue = value
      }

    private var typeValue: InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f? = null

    public var type: InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f
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

    public fun build(): AnthropicCitationCharLocationParam {
      check(citedTextValue != null) { "citedText is required" }
      check(documentIndexValue != null) { "documentIndex is required" }
      check(endCharIndexValue != null) { "endCharIndex is required" }
      check(startCharIndexValue != null) { "startCharIndex is required" }
      check(typeValue != null) { "type is required" }
      check(documentTitleState !== FieldState.Absent) { "documentTitle is required, even when null" }
      return AnthropicCitationCharLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitleState.valueOrNull(),
        endCharIndex = endCharIndex,
        startCharIndex = startCharIndex,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AnthropicCitationCharLocationParam = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AnthropicCitationCharLocationParam> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCitationCharLocationParam {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCitationCharLocationParam")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AnthropicCitationCharLocationParam must be a JSON object")
      val citedText = json.decodeRequired<String>(rawObject, "cited_text")
      val documentIndex = json.decodeRequired<Int>(rawObject, "document_index")
      val endCharIndex = json.decodeRequired<Int>(rawObject, "end_char_index")
      val startCharIndex = json.decodeRequired<Int>(rawObject, "start_char_index")
      val type = json.decodeRequired<InlineAnthropicCitationCharLocationParamTypeXaf2ecc9f>(rawObject, "type")
      if (!rawObject.containsKey("document_title")) {
        throw SerializationException("AnthropicCitationCharLocationParam is missing required property 'document_title'")
      }
      val documentTitle = rawObject["document_title"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return AnthropicCitationCharLocationParam(
        citedText = citedText,
        documentIndex = documentIndex,
        documentTitle = documentTitle,
        endCharIndex = endCharIndex,
        startCharIndex = startCharIndex,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCitationCharLocationParam) {
      val jsonEncoder = encoder.requireJsonEncoder("AnthropicCitationCharLocationParam")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("cited_text", value.citedText)
        put("document_index", json.encodeToJsonElement(value.documentIndex))
        put("document_title", value.documentTitle?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("end_char_index", json.encodeToJsonElement(value.endCharIndex))
        put("start_char_index", json.encodeToJsonElement(value.startCharIndex))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun anthropicCitationCharLocationParam(block: AnthropicCitationCharLocationParam.Builder.() -> Unit): AnthropicCitationCharLocationParam = AnthropicCitationCharLocationParam.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AnthropicCitationCharLocationParam is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("AnthropicCitationCharLocationParam property '" + name + "' is not nullable")
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
