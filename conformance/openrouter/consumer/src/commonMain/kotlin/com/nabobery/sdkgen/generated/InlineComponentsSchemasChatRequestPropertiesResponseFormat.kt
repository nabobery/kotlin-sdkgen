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

public sealed class InlineComponentsSchemasChatRequestPropertiesResponseFormatDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasChatRequestPropertiesResponseFormatNoMatchException(
  message: String,
) : InlineComponentsSchemasChatRequestPropertiesResponseFormatDecodingException(message)

public class InlineComponentsSchemasChatRequestPropertiesResponseFormatAmbiguityException(
  message: String,
) : InlineComponentsSchemasChatRequestPropertiesResponseFormatDecodingException(message)

/**
 * Response format configuration
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesResponseFormat.Serializer::class)
public sealed interface InlineComponentsSchemasChatRequestPropertiesResponseFormat {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ChatFormatTextConfig internal constructor(
    public val type: InlineComponentsSchemasChatFormatTextConfigPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasChatRequestPropertiesResponseFormat {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasChatFormatTextConfigPropertiesType): ChatFormatTextConfig =
        ChatFormatTextConfig(
        type = type,
        raw = buildJsonObject {
          put("type", "text")
        },
      )
    }
  }

  public class ChatFormatJsonObjectConfig internal constructor(
    public val type: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasChatRequestPropertiesResponseFormat {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType): ChatFormatJsonObjectConfig = ChatFormatJsonObjectConfig(
        type = type,
        raw = buildJsonObject {
          put("type", "json_object")
        },
      )
    }
  }

  public class ChatFormatJsonSchemaConfig internal constructor(
    public val jsonSchema: ChatJsonSchemaConfig,
    public val type: InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasChatRequestPropertiesResponseFormat {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(jsonSchema: ChatJsonSchemaConfig,
        type: InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType): ChatFormatJsonSchemaConfig =
          ChatFormatJsonSchemaConfig(
        jsonSchema = jsonSchema,
        type = type,
        raw = buildJsonObject {
          put("json_schema", SdkJson.encodeToJsonElement(jsonSchema))
          put("type", "json_schema")
        },
      )
    }
  }

  public class ChatFormatGrammarConfig internal constructor(
    public val grammar: String,
    public val type: InlineComponentsSchemasChatFormatGrammarConfigPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasChatRequestPropertiesResponseFormat {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(grammar: String,
        type: InlineComponentsSchemasChatFormatGrammarConfigPropertiesType): ChatFormatGrammarConfig =
          ChatFormatGrammarConfig(
        grammar = grammar,
        type = type,
        raw = buildJsonObject {
          put("grammar", grammar)
          put("type", "grammar")
        },
      )
    }
  }

  public class ChatFormatPythonConfig internal constructor(
    public val type: InlineComponentsSchemasChatFormatPythonConfigPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasChatRequestPropertiesResponseFormat {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasChatFormatPythonConfigPropertiesType): ChatFormatPythonConfig =
        ChatFormatPythonConfig(
        type = type,
        raw = buildJsonObject {
          put("type", "python")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesResponseFormat> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesResponseFormat {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatRequestPropertiesResponseFormat")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasChatRequestPropertiesResponseFormatNoMatchException("InlineComponentsSchemasChatRequestPropertiesResponseFormat " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasChatRequestPropertiesResponseFormat(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasChatRequestPropertiesResponseFormatNoMatchException("InlineComponentsSchemasChatRequestPropertiesResponseFormat " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasChatRequestPropertiesResponseFormatAmbiguityException("InlineComponentsSchemasChatRequestPropertiesResponseFormat " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState5Matches -> ChatFormatTextConfig(type = requireNotNull(matches.typeState5), raw = raw)
        matches.typeState2Matches -> ChatFormatJsonObjectConfig(type = requireNotNull(matches.typeState2), raw = raw)
        matches.typeState3Matches && matches.jsonSchemaDecoded -> ChatFormatJsonSchemaConfig(jsonSchema =
          requireNotNull(matches.jsonSchema), type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Matches && matches.grammarDecoded -> ChatFormatGrammarConfig(grammar = requireNotNull(matches
          .grammar), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState4Matches -> ChatFormatPythonConfig(type = requireNotNull(matches.typeState4), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesResponseFormat) {
      encoder.requireJsonEncoder("InlineComponentsSchemasChatRequestPropertiesResponseFormat").encodeJsonElement(value
        .raw)
    }
  }
}

private data class InlineComponentsSchemasChatRequestPropertiesResponseFormatInspection(
  public val typeState5: InlineComponentsSchemasChatFormatTextConfigPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val typeState2: InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val typeState3: InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val jsonSchema: ChatJsonSchemaConfig?,
  public val jsonSchemaDecoded: Boolean,
  public val typeState1: InlineComponentsSchemasChatFormatGrammarConfigPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val grammar: String?,
  public val grammarDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasChatFormatPythonConfigPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState5Matches) add("ChatFormatTextConfig")
      if (typeState2Matches) add("ChatFormatJsonObjectConfig")
      if (typeState3Matches && jsonSchemaDecoded) add("ChatFormatJsonSchemaConfig")
      if (typeState1Matches && grammarDecoded) add("ChatFormatGrammarConfig")
      if (typeState4Matches) add("ChatFormatPythonConfig")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasChatRequestPropertiesResponseFormat(raw: JsonObject): InlineComponentsSchemasChatRequestPropertiesResponseFormatInspection {
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatFormatTextConfigPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = raw.stringValue("type") == "text" && typeState5Decoded
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatFormatJsonObjectConfigPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "json_object" && typeState2Decoded
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "json_schema" && typeState3Decoded
  val jsonSchemaResult = raw["json_schema"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<ChatJsonSchemaConfig>(element) } }
  val jsonSchema = jsonSchemaResult?.getOrNull()
  val jsonSchemaDecoded = jsonSchemaResult?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatFormatGrammarConfigPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "grammar" && typeState1Decoded
  val grammarResult = raw["grammar"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val grammar = grammarResult?.getOrNull()
  val grammarDecoded = grammarResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasChatFormatPythonConfigPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = raw.stringValue("type") == "python" && typeState4Decoded
  return InlineComponentsSchemasChatRequestPropertiesResponseFormatInspection(
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    jsonSchema = jsonSchema,
    jsonSchemaDecoded = jsonSchemaDecoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    grammar = grammar,
    grammarDecoded = grammarDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    failures = buildList {
      if (!typeState5Matches) add("ChatFormatTextConfig: required properties 'type' do not match their declared types")
      if (!typeState2Matches) add("ChatFormatJsonObjectConfig: required properties 'type' do not match their declared " +
        "types")
      if (!typeState3Matches ||
        !jsonSchemaDecoded) add("ChatFormatJsonSchemaConfig: required properties 'type' and 'json_schema' do not " +
          "match their declared types")
      if (!typeState1Matches ||
        !grammarDecoded) add("ChatFormatGrammarConfig: required properties 'type' and 'grammar' do not match their " +
          "declared types")
      if (!typeState4Matches) add("ChatFormatPythonConfig: required properties 'type' do not match their declared " +
        "types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
