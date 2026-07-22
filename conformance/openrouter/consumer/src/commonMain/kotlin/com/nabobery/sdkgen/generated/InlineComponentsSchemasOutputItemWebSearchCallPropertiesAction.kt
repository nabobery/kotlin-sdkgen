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

public sealed class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionNoMatchException(
  message: String,
) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionDecodingException(message)

public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionAmbiguityException(
  message: String,
) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction.Serializer::class)
public sealed interface InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 internal constructor(
    public val query: String,
    public val type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(query: String,
        type: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0 = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(
        query = query,
        type = type,
        raw = buildJsonObject {
          put("query", query)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 internal constructor(
    public val type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1 = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 internal constructor(
    public val pattern: String,
    public val type:
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType,
    public val url: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        pattern: String,
        type: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType,
        url: String,
      ): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2 =
        InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(
        pattern = pattern,
        type = type,
        url = url,
        raw = buildJsonObject {
          put("pattern", pattern)
          put("type", SdkJson.encodeToJsonElement(type))
          put("url", url)
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionNoMatchException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasOutputItemWebSearchCallPropertiesAction(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionNoMatchException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionAmbiguityException("InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.queryDecoded && matches.typeState1Decoded ->
          InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0(query = requireNotNull(matches.query),
            type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Decoded -> InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1(type =
          requireNotNull(matches.typeState2), raw = raw)
        matches.patternDecoded && matches.typeState3Decoded && matches.urlDecoded ->
          InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2(pattern = requireNotNull(matches
            .pattern), type = requireNotNull(matches.typeState3), url = requireNotNull(matches.url), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOutputItemWebSearchCallPropertiesAction")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionInspection(
  public val query: String?,
  public val queryDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType?,
  public val typeState2Decoded: Boolean,
  public val pattern: String?,
  public val patternDecoded: Boolean,
  public val typeState3:
      InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType?,
  public val typeState3Decoded: Boolean,
  public val url: String?,
  public val urlDecoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (queryDecoded && typeState1Decoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0")
      if (typeState2Decoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1")
      if (patternDecoded && typeState3Decoded &&
        urlDecoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasOutputItemWebSearchCallPropertiesAction(raw: JsonObject): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionInspection {
  val queryResult = raw["query"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val query = queryResult?.getOrNull()
  val queryDecoded = queryResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0PropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val patternResult = raw["pattern"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pattern = patternResult?.getOrNull()
  val patternDecoded = patternResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val urlResult = raw["url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val url = urlResult?.getOrNull()
  val urlDecoded = urlResult?.isSuccess == true
  return InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionInspection(
    query = query,
    queryDecoded = queryDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    pattern = pattern,
    patternDecoded = patternDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    url = url,
    urlDecoded = urlDecoded,
    failures = buildList {
      if (!queryDecoded ||
        !typeState1Decoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf0: required " +
          "properties 'query' and 'type' do not match their declared types")
      if (!typeState2Decoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1: required " +
        "properties 'type' do not match their declared types")
      if (!patternDecoded || !typeState3Decoded ||
        !urlDecoded) add("InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2: required properties " +
          "'pattern' and 'type' and 'url' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
