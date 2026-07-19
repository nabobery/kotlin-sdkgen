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

public sealed class InlineComponentsSchemasMessagesRequestPropertiesThinkingDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesThinkingNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesThinkingDecodingException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesThinkingAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesThinkingDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesThinking.Serializer::class)
public sealed interface InlineComponentsSchemasMessagesRequestPropertiesThinking {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 internal constructor(
    public val budgetTokens: Int,
    public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinking {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(budgetTokens: Int,
        type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(
        budgetTokens = budgetTokens,
        type = type,
        raw = buildJsonObject {
          put("budget_tokens", SdkJson.encodeToJsonElement(budgetTokens))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 internal constructor(
    public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinking {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 internal constructor(
    public val type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesThinking {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2 = InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesThinking> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesThinking {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesThinking")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesRequestPropertiesThinkingNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesThinking " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesRequestPropertiesThinking(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesThinkingNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesThinking " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesRequestPropertiesThinkingAmbiguityException("InlineComponentsSchemasMessagesRequestPropertiesThinking " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.budgetTokensDecoded && matches.typeState1Decoded ->
          InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0(budgetTokens = requireNotNull(matches
            .budgetTokens), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Decoded -> InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1(type =
          requireNotNull(matches.typeState2), raw = raw)
        matches.typeState3Decoded -> InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2(type =
          requireNotNull(matches.typeState3), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesThinking) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesThinking").encodeJsonElement(value
        .raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesRequestPropertiesThinkingInspection(
  public val budgetTokens: Int?,
  public val budgetTokensDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState3:
      InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType?,
  public val typeState3Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (budgetTokensDecoded &&
        typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0")
      if (typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1")
      if (typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesThinking(raw: JsonObject): InlineComponentsSchemasMessagesRequestPropertiesThinkingInspection {
  val budgetTokensResult = raw["budget_tokens"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val budgetTokens = budgetTokensResult?.getOrNull()
  val budgetTokensDecoded = budgetTokensResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0PropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1PropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2PropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  return InlineComponentsSchemasMessagesRequestPropertiesThinkingInspection(
    budgetTokens = budgetTokens,
    budgetTokensDecoded = budgetTokensDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    failures = buildList {
      if (!budgetTokensDecoded ||
        !typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf0: required properties " +
          "'budget_tokens' and 'type' do not match their declared types")
      if (!typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf1: required " +
        "properties 'type' do not match their declared types")
      if (!typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesThinkingOneOf2: required " +
        "properties 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
