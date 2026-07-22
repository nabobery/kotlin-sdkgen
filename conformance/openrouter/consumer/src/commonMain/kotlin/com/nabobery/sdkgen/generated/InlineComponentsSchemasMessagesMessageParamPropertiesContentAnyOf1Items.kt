package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
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

public sealed class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsDecodingException(message)

public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsDecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items.
 */
@Serializable(with = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items.Serializer::class)
public sealed interface InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
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
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
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
          put("type", SdkJson.encodeToJsonElement(type))
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
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
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
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class AnthropicDocumentBlockParam internal constructor(
    public val source: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource,
    public val type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(source: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource,
        type: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType): AnthropicDocumentBlockParam =
          AnthropicDocumentBlockParam(
        source = source,
        type = type,
        raw = buildJsonObject {
          put("source", SdkJson.encodeToJsonElement(source))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3 internal constructor(
    public val id: String,
    public val name: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3Pro37cb10c8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        name: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3Pro37cb10c8,
      ): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3 =
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3(
        id = id,
        name = name,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4 internal constructor(
    public val toolUseId: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro4f80d75d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolUseId: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro4f80d75d): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4(
        toolUseId = toolUseId,
        type = type,
        raw = buildJsonObject {
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 internal constructor(
    public val signature: String,
    public val thinking: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        signature: String,
        thinking: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580,
      ): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5 =
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(
        signature = signature,
        thinking = thinking,
        type = type,
        raw = buildJsonObject {
          put("signature", signature)
          put("thinking", thinking)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 internal constructor(
    public val `data`: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`data`: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(
        data = data,
        type = type,
        raw = buildJsonObject {
          put("data", data)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 internal constructor(
    public val id: String,
    public val name: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        name: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68,
      ): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7 =
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(
        id = id,
        name = name,
        type = type,
        raw = buildJsonObject {
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8 internal constructor(
    public val content:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e,
    public val toolUseId: String,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro4e989d66,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e,
        toolUseId: String,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro4e989d66,
      ): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8 =
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8(
        content = content,
        toolUseId = toolUseId,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class AnthropicSearchResultBlockParam internal constructor(
    public val content: List<com.nabobery.sdkgen.generated.AnthropicTextBlockParam>,
    public val source: String,
    public val title: String,
    public val type: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<com.nabobery.sdkgen.generated.AnthropicTextBlockParam>,
        source: String,
        title: String,
        type: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType,
      ): AnthropicSearchResultBlockParam = AnthropicSearchResultBlockParam(
        content = content,
        source = source,
        title = title,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("source", source)
          put("title", title)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 internal constructor(
    public val content: String?,
    public val type:
        InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: String?,
        type: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10 = InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10(
        content = content,
        type = type,
        raw = buildJsonObject {
          put("content", content)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class MessagesAdvisorToolResultBlock internal constructor(
    public val content: Map<String, JsonElement?>,
    public val toolUseId: String,
    public val type: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: Map<String, JsonElement?>,
        toolUseId: String,
        type: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType,
      ): MessagesAdvisorToolResultBlock = MessagesAdvisorToolResultBlock(
        content = content,
        toolUseId = toolUseId,
        type = type,
        raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsNoMatchException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsNoMatchException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsAmbiguityException("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.textDecoded && matches.typeState4Decoded -> AnthropicTextBlockParam(text = requireNotNull(matches
          .text), type = requireNotNull(matches.typeState4), raw = raw)
        matches.sourceState2Decoded && matches.typeState2Decoded -> AnthropicImageBlockParam(source =
          requireNotNull(matches.sourceState2), type = requireNotNull(matches.typeState2), raw = raw)
        matches.sourceState1Decoded && matches.typeState1Decoded -> AnthropicDocumentBlockParam(source =
          requireNotNull(matches.sourceState1), type = requireNotNull(matches.typeState1), raw = raw)
        matches.idDecoded && matches.nameDecoded && matches.typeState7Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3(id = requireNotNull(matches
            .id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState7), raw = raw)
        matches.toolUseIdDecoded && matches.typeState8Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4(toolUseId =
            requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState8), raw = raw)
        matches.signatureDecoded && matches.thinkingDecoded && matches.typeState9Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5(signature =
            requireNotNull(matches.signature), thinking = requireNotNull(matches.thinking), type =
              requireNotNull(matches.typeState9), raw = raw)
        matches.dataDecoded && matches.typeState10Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6(data = requireNotNull(matches
            .data), type = requireNotNull(matches.typeState10), raw = raw)
        matches.idDecoded && matches.nameDecoded && matches.typeState11Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7(id = requireNotNull(matches
            .id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState11), raw = raw)
        matches.contentState1Decoded && matches.toolUseIdDecoded && matches.typeState12Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8(content =
            requireNotNull(matches.contentState1), toolUseId = requireNotNull(matches.toolUseId), type =
              requireNotNull(matches.typeState12), raw = raw)
        matches.contentState2Decoded && matches.sourceState3Decoded && matches.titleDecoded && matches
          .typeState3Decoded -> AnthropicSearchResultBlockParam(content = requireNotNull(matches.contentState2),
            source = requireNotNull(matches.sourceState3), title = requireNotNull(matches.title), type =
              requireNotNull(matches.typeState3), raw = raw)
        matches.contentState4Present && matches.contentState4Decoded && matches.typeState6Decoded ->
          InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10(content = matches
            .contentState4, type = requireNotNull(matches.typeState6), raw = raw)
        matches.contentState3Decoded && matches.toolUseIdDecoded && matches.typeState5Decoded ->
          MessagesAdvisorToolResultBlock(content = requireNotNull(matches.contentState3), toolUseId =
            requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState5), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items) {
      encoder.requireJsonEncoder("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsInspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasAnthropicTextBlockParamPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val sourceState2: InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource?,
  public val sourceState2Decoded: Boolean,
  public val typeState2: InlineComponentsSchemasAnthropicImageBlockParamPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val sourceState1: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource?,
  public val sourceState1Decoded: Boolean,
  public val typeState1: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState7:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3Pro37cb10c8?,
  public val typeState7Decoded: Boolean,
  public val toolUseId: String?,
  public val toolUseIdDecoded: Boolean,
  public val typeState8:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro4f80d75d?,
  public val typeState8Decoded: Boolean,
  public val signature: String?,
  public val signatureDecoded: Boolean,
  public val thinking: String?,
  public val thinkingDecoded: Boolean,
  public val typeState9:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580?,
  public val typeState9Decoded: Boolean,
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val typeState10:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de?,
  public val typeState10Decoded: Boolean,
  public val typeState11:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68?,
  public val typeState11Decoded: Boolean,
  public val contentState1:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e?,
  public val contentState1Decoded: Boolean,
  public val typeState12:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro4e989d66?,
  public val typeState12Decoded: Boolean,
  public val contentState2: List<AnthropicTextBlockParam>?,
  public val contentState2Decoded: Boolean,
  public val sourceState3: String?,
  public val sourceState3Decoded: Boolean,
  public val title: String?,
  public val titleDecoded: Boolean,
  public val typeState3: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val contentState4: String?,
  public val contentState4Present: Boolean,
  public val contentState4Decoded: Boolean,
  public val typeState6:
      InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989?,
  public val typeState6Decoded: Boolean,
  public val contentState3: Map<String, JsonElement?>?,
  public val contentState3Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (textDecoded && typeState4Decoded) add("AnthropicTextBlockParam")
      if (sourceState2Decoded && typeState2Decoded) add("AnthropicImageBlockParam")
      if (sourceState1Decoded && typeState1Decoded) add("AnthropicDocumentBlockParam")
      if (idDecoded && nameDecoded &&
        typeState7Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3")
      if (toolUseIdDecoded &&
        typeState8Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4")
      if (signatureDecoded && thinkingDecoded &&
        typeState9Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5")
      if (dataDecoded &&
        typeState10Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6")
      if (idDecoded && nameDecoded &&
        typeState11Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7")
      if (contentState1Decoded && toolUseIdDecoded &&
        typeState12Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8")
      if (contentState2Decoded && sourceState3Decoded && titleDecoded &&
        typeState3Decoded) add("AnthropicSearchResultBlockParam")
      if (contentState4Present && contentState4Decoded &&
        typeState6Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10")
      if (contentState3Decoded && toolUseIdDecoded && typeState5Decoded) add("MessagesAdvisorToolResultBlock")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1Items(raw: JsonObject): InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsInspection {
  val textResult = raw["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicTextBlockParamPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val sourceState2Result = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicImageBlockParamPropertiesSource>(element) } }
  val sourceState2 = sourceState2Result?.getOrNull()
  val sourceState2Decoded = sourceState2Result?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicImageBlockParamPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val sourceState1Result = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesSource>(element) } }
  val sourceState1 = sourceState1Result?.getOrNull()
  val sourceState1Decoded = sourceState1Result?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val idResult = raw["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val nameResult = raw["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState7Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3Pro37cb10c8>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val toolUseIdResult = raw["tool_use_id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val toolUseId = toolUseIdResult?.getOrNull()
  val toolUseIdDecoded = toolUseIdResult?.isSuccess == true
  val typeState8Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4Pro4f80d75d>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val signatureResult = raw["signature"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val signature = signatureResult?.getOrNull()
  val signatureDecoded = signatureResult?.isSuccess == true
  val thinkingResult = raw["thinking"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val thinking = thinkingResult?.getOrNull()
  val thinkingDecoded = thinkingResult?.isSuccess == true
  val typeState9Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5Prodaecd580>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val dataResult = raw["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val typeState10Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6Proc49277de>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState11Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7Pro0f73af68>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val contentState1Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Proe8e8d29e>(element) } }
  val contentState1 = contentState1Result?.getOrNull()
  val contentState1Decoded = contentState1Result?.isSuccess == true
  val typeState12Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8Pro4e989d66>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val contentState2Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<AnthropicTextBlockParam>>(element) } }
  val contentState2 = contentState2Result?.getOrNull()
  val contentState2Decoded = contentState2Result?.isSuccess == true
  val sourceState3Result = raw["source"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val sourceState3 = sourceState3Result?.getOrNull()
  val sourceState3Decoded = sourceState3Result?.isSuccess == true
  val titleResult = raw["title"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val title = titleResult?.getOrNull()
  val titleDecoded = titleResult?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val contentState4Result = raw["content"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String?>(element) } }
  val contentState4 = contentState4Result?.getOrNull()
  val contentState4Present = raw.containsKey("content")
  val contentState4Decoded = contentState4Result?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10Pra15a6989>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val contentState3Result = raw["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Map<String,
    JsonElement?>>(element) } }
  val contentState3 = contentState3Result?.getOrNull()
  val contentState3Decoded = contentState3Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMessagesAdvisorToolResultBlockPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  return InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsInspection(
    text = text,
    textDecoded = textDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    sourceState2 = sourceState2,
    sourceState2Decoded = sourceState2Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    sourceState1 = sourceState1,
    sourceState1Decoded = sourceState1Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    id = id,
    idDecoded = idDecoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    toolUseId = toolUseId,
    toolUseIdDecoded = toolUseIdDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    signature = signature,
    signatureDecoded = signatureDecoded,
    thinking = thinking,
    thinkingDecoded = thinkingDecoded,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    data = data,
    dataDecoded = dataDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    contentState1 = contentState1,
    contentState1Decoded = contentState1Decoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    contentState2 = contentState2,
    contentState2Decoded = contentState2Decoded,
    sourceState3 = sourceState3,
    sourceState3Decoded = sourceState3Decoded,
    title = title,
    titleDecoded = titleDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    contentState4 = contentState4,
    contentState4Present = contentState4Present,
    contentState4Decoded = contentState4Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    contentState3 = contentState3,
    contentState3Decoded = contentState3Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    failures = buildList {
      if (!textDecoded ||
        !typeState4Decoded) add("AnthropicTextBlockParam: required properties 'text' and 'type' do not match their " +
          "declared types")
      if (!sourceState2Decoded ||
        !typeState2Decoded) add("AnthropicImageBlockParam: required properties 'source' and 'type' do not match their " +
          "declared types")
      if (!sourceState1Decoded ||
        !typeState1Decoded) add("AnthropicDocumentBlockParam: required properties 'source' and 'type' do not match " +
          "their declared types")
      if (!idDecoded || !nameDecoded ||
        !typeState7Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf3: " +
          "required properties 'id' and 'name' and 'type' do not match their declared types")
      if (!toolUseIdDecoded ||
        !typeState8Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf4: " +
          "required properties 'tool_use_id' and 'type' do not match their declared types")
      if (!signatureDecoded || !thinkingDecoded ||
        !typeState9Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf5: " +
          "required properties 'signature' and 'thinking' and 'type' do not match their declared types")
      if (!dataDecoded ||
        !typeState10Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf6: " +
          "required properties 'data' and 'type' do not match their declared types")
      if (!idDecoded || !nameDecoded ||
        !typeState11Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf7: " +
          "required properties 'id' and 'name' and 'type' do not match their declared types")
      if (!contentState1Decoded || !toolUseIdDecoded ||
        !typeState12Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf8: " +
          "required properties 'content' and 'tool_use_id' and 'type' do not match their declared types")
      if (!contentState2Decoded || !sourceState3Decoded || !titleDecoded ||
        !typeState3Decoded) add("AnthropicSearchResultBlockParam: required properties 'content' and 'source' and " +
          "'title' and 'type' do not match their declared types")
      if (!contentState4Present || !contentState4Decoded ||
        !typeState6Decoded) add("InlineComponentsSchemasMessagesMessageParamPropertiesContentAnyOf1ItemsOneOf10: " +
          "required properties 'content' and 'type' do not match their declared types")
      if (!contentState3Decoded || !toolUseIdDecoded ||
        !typeState5Decoded) add("MessagesAdvisorToolResultBlock: required properties 'content' and 'tool_use_id' and " +
          "'type' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
