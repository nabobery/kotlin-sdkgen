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
import kotlinx.serialization.json.put

public sealed class AnthropicCallerDecodingException(
  message: String,
) : SerializationException(message)

public class AnthropicCallerNoMatchException(
  message: String,
) : AnthropicCallerDecodingException(message)

public class AnthropicCallerAmbiguityException(
  message: String,
) : AnthropicCallerDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/AnthropicCaller.
 */
@Serializable(with = AnthropicCaller.Serializer::class)
public sealed interface AnthropicCaller {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicDirectCaller internal constructor(
    public val type: InlineComponentsSchemasAnthropicDirectCallerPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCaller {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasAnthropicDirectCallerPropertiesType): AnthropicDirectCaller =
        AnthropicDirectCaller(
        type = type,
        raw = buildJsonObject {
          put("type", "direct")
        },
      )
    }
  }

  public class AnthropicCodeExecution20250825Caller internal constructor(
    public val toolId: String,
    public val type: InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCaller {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolId: String,
        type: InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType): AnthropicCodeExecution20250825Caller = AnthropicCodeExecution20250825Caller(
        toolId = toolId,
        type = type,
        raw = buildJsonObject {
          put("tool_id", toolId)
          put("type", "code_execution_20250825")
        },
      )
    }
  }

  public class AnthropicCodeExecution20260120Caller internal constructor(
    public val toolId: String,
    public val type: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : AnthropicCaller {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolId: String,
        type: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType): AnthropicCodeExecution20260120Caller = AnthropicCodeExecution20260120Caller(
        toolId = toolId,
        type = type,
        raw = buildJsonObject {
          put("tool_id", toolId)
          put("type", "code_execution_20260120")
        },
      )
    }
  }

  public object Serializer : KSerializer<AnthropicCaller> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AnthropicCaller {
      val jsonDecoder = decoder.requireJsonDecoder("AnthropicCaller")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw AnthropicCallerNoMatchException("AnthropicCaller matched 0 branches: expected JSON object")
      val matches = inspectAnthropicCaller(raw)
      if (matches.size == 0) {
        throw AnthropicCallerNoMatchException("AnthropicCaller matched 0 branches: " + matches.failures
          .joinToString("; "))
      }
      if (matches.size > 1) {
        throw AnthropicCallerAmbiguityException("AnthropicCaller matched " + matches.size +
          " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState3Matches -> AnthropicDirectCaller(type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState1Matches && matches.toolIdDecoded -> AnthropicCodeExecution20250825Caller(toolId =
          requireNotNull(matches.toolId), type = requireNotNull(matches.typeState1), raw = raw)
        matches.typeState2Matches && matches.toolIdDecoded -> AnthropicCodeExecution20260120Caller(toolId =
          requireNotNull(matches.toolId), type = requireNotNull(matches.typeState2), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: AnthropicCaller) {
      encoder.requireJsonEncoder("AnthropicCaller").encodeJsonElement(value.raw)
    }
  }
}

private data class AnthropicCallerInspection(
  public val typeState3: InlineComponentsSchemasAnthropicDirectCallerPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val toolId: String?,
  public val toolIdDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState3Matches) add("AnthropicDirectCaller")
      if (typeState1Matches && toolIdDecoded) add("AnthropicCodeExecution20250825Caller")
      if (typeState2Matches && toolIdDecoded) add("AnthropicCodeExecution20260120Caller")
    }

  public val size: Int
    get() = names.size
}

private fun inspectAnthropicCaller(raw: JsonObject): AnthropicCallerInspection {
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicDirectCallerPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = raw.stringValue("type") == "direct" && typeState3Decoded
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "code_execution_20250825" && typeState1Decoded
  val toolIdResult = raw["tool_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val toolId = toolIdResult?.getOrNull()
  val toolIdDecoded = toolIdResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "code_execution_20260120" && typeState2Decoded
  return AnthropicCallerInspection(
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    toolId = toolId,
    toolIdDecoded = toolIdDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    failures = buildList {
      if (!typeState3Matches) add("AnthropicDirectCaller: required properties 'type' do not match their declared types")
      if (!typeState1Matches ||
        !toolIdDecoded) add("AnthropicCodeExecution20250825Caller: required properties 'type' and 'tool_id' do not " +
          "match their declared types")
      if (!typeState2Matches ||
        !toolIdDecoded) add("AnthropicCodeExecution20260120Caller: required properties 'type' and 'tool_id' do not " +
          "match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
