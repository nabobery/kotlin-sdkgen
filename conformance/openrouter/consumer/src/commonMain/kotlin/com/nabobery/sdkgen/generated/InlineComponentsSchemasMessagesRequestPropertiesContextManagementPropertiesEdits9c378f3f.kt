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

public sealed class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fDecodingException(message)

public class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/context_management/properties/edits/items
 * /oneOf/0/properties/trigger.
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f
  .Serializer::class)
public sealed interface InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicInputTokensTrigger internal constructor(
    public val type: InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType,
    public val `value`: Int,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType,
        `value`: Int): AnthropicInputTokensTrigger = AnthropicInputTokensTrigger(
        type = type,
        value = value,
        raw = buildJsonObject {
          put("type", "input_tokens")
          put("value", SdkJson.encodeToJsonElement(value))
        },
      )
    }
  }

  public class AnthropicToolUsesTrigger internal constructor(
    public val type: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType,
    public val `value`: Int,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType,
        `value`: Int): AnthropicToolUsesTrigger = AnthropicToolUsesTrigger(
        type = type,
        value = value,
        raw = buildJsonObject {
          put("type", "tool_uses")
          put("value", SdkJson.encodeToJsonElement(value))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fNoMatchException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fAmbiguityException("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.typeState1Matches && matches.valueDecoded -> AnthropicInputTokensTrigger(type = requireNotNull(matches
          .typeState1), value = requireNotNull(matches.value), raw = raw)
        matches.typeState2Matches && matches.valueDecoded -> AnthropicToolUsesTrigger(type = requireNotNull(matches
          .typeState2), value = requireNotNull(matches.value), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f) {
      encoder
        .requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f")
          .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fInspection(
  public val typeState1: InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val `value`: Int?,
  public val valueDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (typeState1Matches && valueDecoded) add("AnthropicInputTokensTrigger")
      if (typeState2Matches && valueDecoded) add("AnthropicToolUsesTrigger")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3f(raw: JsonObject): InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fInspection {
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = raw.stringValue("type") == "input_tokens" && typeState1Decoded
  val valueResult = raw["value"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val value = valueResult?.getOrNull()
  val valueDecoded = valueResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicToolUsesTriggerPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = raw.stringValue("type") == "tool_uses" && typeState2Decoded
  return InlineComponentsSchemasMessagesRequestPropertiesContextManagementPropertiesEdits9c378f3fInspection(
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    value = value,
    valueDecoded = valueDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    failures = buildList {
      if (!typeState1Matches ||
        !valueDecoded) add("AnthropicInputTokensTrigger: required properties 'type' and 'value' do not match their " +
          "declared types")
      if (!typeState2Matches ||
        !valueDecoded) add("AnthropicToolUsesTrigger: required properties 'type' and 'value' do not match their " +
          "declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
