package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144DecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144NoMatchException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144DecodingException(message)

public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144AmbiguityException(
  message: String,
) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/con
 * tent/anyOf/1/items.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144
  .Serializer::class)
public sealed interface InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicTextBlockParam internal constructor(
    public val text: String,
    public val type: InlineComponentsSchemasAnthropicTextBlockParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String,
        type: InlineComponentsSchemasAnthropicTextBlockParamPropertiesType): AnthropicTextBlockParam =
          AnthropicTextBlockParam(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", "text")
        },
      )
    }
  }

  public class AnthropicImageBlockParam internal constructor(
    public val source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource,
    public val type: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource,
        type: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType): AnthropicImageBlockParam =
          AnthropicImageBlockParam(
        source = source,
        type = type,
        raw = buildJsonObject {
          put("source", SdkJson.encodeToJsonElement(source))
          put("type", "image")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144NoMatchException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144NoMatchException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144AmbiguityException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144 " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState2Matches && matches.textDecoded -> AnthropicTextBlockParam(text = requireNotNull(matches
          .text), type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState1Matches && matches.sourceDecoded -> AnthropicImageBlockParam(source = requireNotNull(matches
          .source), type = requireNotNull(matches.typeState1), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144Inspection(
  public val typeState2: InlineComponentsSchemasAnthropicTextBlockParamPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val source: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource?,
  public val sourceDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState2Matches && textDecoded) add("AnthropicTextBlockParam")
      if (typeState1Matches && sourceDecoded) add("AnthropicImageBlockParam")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144(raw: JsonObject): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144Inspection {
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextBlockParamPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "text" && typeState2Decoded
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicImageBlockParamPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "image" && typeState1Decoded
  val sourceResult = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource>(element) } }
  val source = sourceResult?.getOrNull()
  val sourceDecoded = sourceResult?.isSuccess == true
  return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSourceOneOf2Properti4887d144Inspection(
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    text = text,
    textDecoded = textDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    source = source,
    sourceDecoded = sourceDecoded,
    failures = buildList {
      if (!typeState2Matches ||
        !textDecoded) add("AnthropicTextBlockParam: required properties 'type' and 'text' do not match their declared " +
          "types")
      if (!typeState1Matches ||
        !sourceDecoded) add("AnthropicImageBlockParam: required properties 'type' and 'source' do not match their " +
          "declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
