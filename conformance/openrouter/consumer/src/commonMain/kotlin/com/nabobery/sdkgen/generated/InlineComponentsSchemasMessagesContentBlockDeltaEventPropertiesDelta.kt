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

public sealed class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaDecodingException(message)

public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesContentBlockDeltaEvent/properties/delta.
 */
@Serializable(with = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta.Serializer::class)
public sealed interface InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 internal constructor(
    public val text: String,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(
        text = text,
        type = type,
        raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1 internal constructor(
    public val partialJson: String,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(partialJson: String,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1(
        partialJson = partialJson,
        type = type,
        raw = buildJsonObject {
          put("partial_json", partialJson)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 internal constructor(
    public val thinking: String,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(thinking: String,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(
        thinking = thinking,
        type = type,
        raw = buildJsonObject {
          put("thinking", thinking)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 internal constructor(
    public val signature: String,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(signature: String,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(
        signature = signature,
        type = type,
        raw = buildJsonObject {
          put("signature", signature)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 internal constructor(
    public val citation:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(citation: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(
        citation = citation,
        type = type,
        raw = buildJsonObject {
          put("citation", SdkJson.encodeToJsonElement(citation))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 internal constructor(
    public val content: String?,
    public val type:
        InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: String?,
        type: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5 = InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(
        content = content,
        type = type,
        raw = buildJsonObject {
          put("content", content)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaNoMatchException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaNoMatchException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaAmbiguityException("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.textDecoded && matches.typeState1Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0(text = requireNotNull(matches
            .text), type = requireNotNull(matches.typeState1), raw = raw)
        matches.partialJsonDecoded && matches.typeState2Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1(partialJson =
            requireNotNull(matches.partialJson), type = requireNotNull(matches.typeState2), raw = raw)
        matches.thinkingDecoded && matches.typeState3Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2(thinking = requireNotNull(matches
            .thinking), type = requireNotNull(matches.typeState3), raw = raw)
        matches.signatureDecoded && matches.typeState4Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3(signature = requireNotNull(matches
            .signature), type = requireNotNull(matches.typeState4), raw = raw)
        matches.citationDecoded && matches.typeState5Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4(citation = requireNotNull(matches
            .citation), type = requireNotNull(matches.typeState5), raw = raw)
        matches.contentPresent && matches.contentDecoded && matches.typeState6Decoded ->
          InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5(content = matches.content, type =
            requireNotNull(matches.typeState6), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState1:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType?,
  public val typeState1Decoded: Boolean,
  public val partialJson: String?,
  public val partialJsonDecoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType?,
  public val typeState2Decoded: Boolean,
  public val thinking: String?,
  public val thinkingDecoded: Boolean,
  public val typeState3:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType?,
  public val typeState3Decoded: Boolean,
  public val signature: String?,
  public val signatureDecoded: Boolean,
  public val typeState4:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType?,
  public val typeState4Decoded: Boolean,
  public val citation:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6?,
  public val citationDecoded: Boolean,
  public val typeState5:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType?,
  public val typeState5Decoded: Boolean,
  public val content: String?,
  public val contentPresent: Boolean,
  public val contentDecoded: Boolean,
  public val typeState6:
      InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType?,
  public val typeState6Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded &&
        typeState1Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0")
      if (partialJsonDecoded &&
        typeState2Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1")
      if (thinkingDecoded &&
        typeState3Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2")
      if (signatureDecoded &&
        typeState4Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3")
      if (citationDecoded &&
        typeState5Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4")
      if (contentPresent && contentDecoded &&
        typeState6Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDelta(raw: JsonObject): InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaInspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0PropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val partialJsonResult = raw["partial_json"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val partialJson = partialJsonResult?.getOrNull()
  val partialJsonDecoded = partialJsonResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1PropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val thinkingResult = raw["thinking"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val thinking = thinkingResult?.getOrNull()
  val thinkingDecoded = thinkingResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2PropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val signatureResult = raw["signature"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val signature = signatureResult?.getOrNull()
  val signatureDecoded = signatureResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3PropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val citationResult = raw["citation"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4Proper6739e8d6>(element) } }
  val citation = citationResult?.getOrNull()
  val citationDecoded = citationResult?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4PropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val contentResult = raw["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val content = contentResult?.getOrNull()
  val contentPresent = raw.containsKey("content")
  val contentDecoded = contentResult?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson


























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5PropertiesType>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  return InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaInspection(
    text = text,
    textDecoded = textDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    partialJson = partialJson,
    partialJsonDecoded = partialJsonDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    thinking = thinking,
    thinkingDecoded = thinkingDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    signature = signature,
    signatureDecoded = signatureDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    citation = citation,
    citationDecoded = citationDecoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    content = content,
    contentPresent = contentPresent,
    contentDecoded = contentDecoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    failures = buildList {
      if (!textDecoded ||
        !typeState1Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf0: required " +
          "properties 'text' and 'type' do not match their declared types")
      if (!partialJsonDecoded ||
        !typeState2Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf1: required " +
          "properties 'partial_json' and 'type' do not match their declared types")
      if (!thinkingDecoded ||
        !typeState3Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf2: required " +
          "properties 'thinking' and 'type' do not match their declared types")
      if (!signatureDecoded ||
        !typeState4Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf3: required " +
          "properties 'signature' and 'type' do not match their declared types")
      if (!citationDecoded ||
        !typeState5Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf4: required " +
          "properties 'citation' and 'type' do not match their declared types")
      if (!contentPresent || !contentDecoded ||
        !typeState6Decoded) add("InlineComponentsSchemasMessagesContentBlockDeltaEventPropertiesDeltaOneOf5: required " +
          "properties 'content' and 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
