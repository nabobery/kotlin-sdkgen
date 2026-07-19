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

public sealed class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceDecodingException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesToolChoiceDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tool_choice.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesToolChoice.Serializer::class)
public sealed interface InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 internal constructor(
    public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 internal constructor(
    public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 internal constructor(
    public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 internal constructor(
    public val name: String,
    public val type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(name: String,
        type: InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3 = InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(
        name = name,
        type = type,
        raw = buildJsonObject {
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesToolChoice> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesToolChoice {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoice")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesRequestPropertiesToolChoiceNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesToolChoice " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesRequestPropertiesToolChoice(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesToolChoiceNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesToolChoice " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesRequestPropertiesToolChoiceAmbiguityException("InlineComponentsSchemasMessagesRequestPropertiesToolChoice " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Decoded -> InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0(type =
          requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Decoded -> InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1(type =
          requireNotNull(matches.typeState2), raw = raw)
        matches.typeState3Decoded -> InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2(type =
          requireNotNull(matches.typeState3), raw = raw)
        matches.nameDecoded && matches.typeState4Decoded ->
          InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3(name = requireNotNull(matches.name), type =
            requireNotNull(matches.typeState4), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesToolChoice) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesToolChoice").encodeJsonElement(value
        .raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesRequestPropertiesToolChoiceInspection(
  public val typeState1:
      InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState2:
      InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState3:
      InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType?,
  public val typeState3Decoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState4:
      InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType?,
  public val typeState4Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0")
      if (typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1")
      if (typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2")
      if (nameDecoded && typeState4Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesToolChoice(raw: JsonObject): InlineComponentsSchemasMessagesRequestPropertiesToolChoiceInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0PropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1PropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2PropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val nameResult = raw["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3PropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  return InlineComponentsSchemasMessagesRequestPropertiesToolChoiceInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    failures = buildList {
      if (!typeState1Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf0: required " +
        "properties 'type' do not match their declared types")
      if (!typeState2Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf1: required " +
        "properties 'type' do not match their declared types")
      if (!typeState3Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf2: required " +
        "properties 'type' do not match their declared types")
      if (!nameDecoded ||
        !typeState4Decoded) add("InlineComponentsSchemasMessagesRequestPropertiesToolChoiceOneOf3: required " +
          "properties 'name' and 'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
