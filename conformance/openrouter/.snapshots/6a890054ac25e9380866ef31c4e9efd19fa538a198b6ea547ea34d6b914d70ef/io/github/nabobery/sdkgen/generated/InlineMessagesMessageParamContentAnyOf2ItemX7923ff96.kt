package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineMessagesMessageParamContentAnyOf2ItemX7923ff96DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96DecodingException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96DecodingException(message)

public class InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException(
  message: String,
) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content/anyOf/1/items
 */
@Serializable(with = InlineMessagesMessageParamContentAnyOf2ItemX7923ff96Serializer::class)
public sealed interface InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicTextBlockParam internal constructor(
    public val text: String,
    public val type: InlineAnthropicTextBlockParamTypeX2f8f666a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(text: String, type: InlineAnthropicTextBlockParamTypeX2f8f666a): AnthropicTextBlockParam {
        val raw = buildJsonObject {
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicTextBlockParamMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("AnthropicTextBlockParam factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicTextBlockParam(
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicImageBlockParam internal constructor(
    public val source: InlineAnthropicImageBlockParamSourceX02b06711,
    public val type: InlineAnthropicImageBlockParamTypeXf6b1b5ef,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(source: InlineAnthropicImageBlockParamSourceX02b06711, type: InlineAnthropicImageBlockParamTypeXf6b1b5ef): AnthropicImageBlockParam {
        val raw = buildJsonObject {
          put("source", SdkJson.encodeToJsonElement(source))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicImageBlockParamMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("AnthropicImageBlockParam factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicImageBlockParam(
          source = source,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicDocumentBlockParam internal constructor(
    public val source: InlineAnthropicDocumentBlockParamSourceXb255d816,
    public val type: InlineAnthropicDocumentBlockParamTypeXe4e5a429,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(source: InlineAnthropicDocumentBlockParamSourceXb255d816, type: InlineAnthropicDocumentBlockParamTypeXe4e5a429): AnthropicDocumentBlockParam {
        val raw = buildJsonObject {
          put("source", SdkJson.encodeToJsonElement(source))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicDocumentBlockParamMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("AnthropicDocumentBlockParam factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicDocumentBlockParam(
          source = source,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882 internal constructor(
    public val id: String,
    public val name: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        name: String,
        type: InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8,
      ): InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882 {
        val raw = buildJsonObject {
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882(
          id = id,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 internal constructor(
    public val toolUseId: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(toolUseId: String, type: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d): InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 {
        val raw = buildJsonObject {
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 internal constructor(
    public val signature: String,
    public val thinking: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        signature: String,
        thinking: String,
        type: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580,
      ): InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 {
        val raw = buildJsonObject {
          put("signature", signature)
          put("thinking", thinking)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(
          signature = signature,
          thinking = thinking,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb internal constructor(
    public val `data`: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`data`: String, type: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de): InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb {
        val raw = buildJsonObject {
          put("data", data)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(
          data = data,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d internal constructor(
    public val id: String,
    public val name: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        name: String,
        type: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68,
      ): InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d {
        val raw = buildJsonObject {
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(
          id = id,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce internal constructor(
    public val content: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e,
    public val toolUseId: String,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e,
        toolUseId: String,
        type: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66,
      ): InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicSearchResultBlockParam internal constructor(
    content: List<io.github.nabobery.sdkgen.generated.AnthropicTextBlockParam>,
    public val source: String,
    public val title: String,
    public val type: InlineAnthropicSearchResultBlockParamTypeX2b91bce1,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public val content: List<io.github.nabobery.sdkgen.generated.AnthropicTextBlockParam> =
        content.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<io.github.nabobery.sdkgen.generated.AnthropicTextBlockParam>,
        source: String,
        title: String,
        type: InlineAnthropicSearchResultBlockParamTypeX2b91bce1,
      ): AnthropicSearchResultBlockParam {
        val contentOwnershipSnapshot = content.toList()
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(contentOwnershipSnapshot))
          put("source", source)
          put("title", title)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicSearchResultBlockParamMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("AnthropicSearchResultBlockParam factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicSearchResultBlockParam(
          content = contentOwnershipSnapshot,
          source = source,
          title = title,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f internal constructor(
    public val content: String?,
    public val type: InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: String?, type: InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989): InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f {
        val raw = buildJsonObject {
          put("content", content)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f(
          content = content,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class MessagesAdvisorToolResultBlock internal constructor(
    content: Map<String, JsonElement?>,
    public val toolUseId: String,
    public val type: InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    public val content: Map<String, JsonElement?> = content.toMap()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: Map<String, JsonElement?>,
        toolUseId: String,
        type: InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc,
      ): MessagesAdvisorToolResultBlock {
        val contentOwnershipSnapshot = content.toMap()
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(contentOwnershipSnapshot))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(raw)
        if (inspection.size == 0) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.messagesAdvisorToolResultBlockMatches) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96BranchValidationException("MessagesAdvisorToolResultBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return MessagesAdvisorToolResultBlock(
          content = contentOwnershipSnapshot,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineMessagesMessageParamContentAnyOf2ItemX7923ff96Serializer : KSerializer<InlineMessagesMessageParamContentAnyOf2ItemX7923ff96> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 {
    val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: expected JSON object")
    val matches = inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(rawObject)
    if (matches.size == 0) {
      throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96NoMatchException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineMessagesMessageParamContentAnyOf2ItemX7923ff96AmbiguityException("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.anthropicTextBlockParamMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.AnthropicTextBlockParam(text = requireNotNull(matches.text), type = requireNotNull(matches.typeState4), raw = rawObject)
      matches.anthropicImageBlockParamMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.AnthropicImageBlockParam(source = requireNotNull(matches.sourceState2), type = requireNotNull(matches.typeState2), raw = rawObject)
      matches.anthropicDocumentBlockParamMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.AnthropicDocumentBlockParam(source = requireNotNull(matches.sourceState1), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882(id = requireNotNull(matches.id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721(toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState8), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95(signature = requireNotNull(matches.signature), thinking = requireNotNull(matches.thinking), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb(data = requireNotNull(matches.data), type = requireNotNull(matches.typeState10), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d(id = requireNotNull(matches.id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce(content = requireNotNull(matches.contentState1), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState12), raw = rawObject)
      matches.anthropicSearchResultBlockParamMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.AnthropicSearchResultBlockParam(content = requireNotNull(matches.contentState2), source = requireNotNull(matches.sourceState3), title = requireNotNull(matches.title), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f(content = matches.contentState4, type = requireNotNull(matches.typeState6), raw = rawObject)
      matches.messagesAdvisorToolResultBlockMatches -> InlineMessagesMessageParamContentAnyOf2ItemX7923ff96.MessagesAdvisorToolResultBlock(content = requireNotNull(matches.contentState3), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState5), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentAnyOf2ItemX7923ff96) {
    encoder.requireJsonEncoder("InlineMessagesMessageParamContentAnyOf2ItemX7923ff96").encodeJsonElement(value.raw)
  }
}

internal data class InlineMessagesMessageParamContentAnyOf2ItemX7923ff96Inspection(
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState4: InlineAnthropicTextBlockParamTypeX2f8f666a?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val sourceState2: InlineAnthropicImageBlockParamSourceX02b06711?,
  public val sourceState2Decoded: Boolean,
  public val typeState2: InlineAnthropicImageBlockParamTypeXf6b1b5ef?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val sourceState1: InlineAnthropicDocumentBlockParamSourceXb255d816?,
  public val sourceState1Decoded: Boolean,
  public val typeState1: InlineAnthropicDocumentBlockParamTypeXe4e5a429?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState7: InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val toolUseId: String?,
  public val toolUseIdDecoded: Boolean,
  public val typeState8: InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val signature: String?,
  public val signatureDecoded: Boolean,
  public val thinking: String?,
  public val thinkingDecoded: Boolean,
  public val typeState9: InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val typeState10: InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState11: InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val contentState1: InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e?,
  public val contentState1Decoded: Boolean,
  public val typeState12: InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val contentState2: List<AnthropicTextBlockParam>?,
  public val contentState2Decoded: Boolean,
  public val sourceState3: String?,
  public val sourceState3Decoded: Boolean,
  public val title: String?,
  public val titleDecoded: Boolean,
  public val typeState3: InlineAnthropicSearchResultBlockParamTypeX2b91bce1?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val contentState4: String?,
  public val contentState4Present: Boolean,
  public val contentState4Decoded: Boolean,
  public val typeState6: InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val contentState3: Map<String, JsonElement?>?,
  public val contentState3Decoded: Boolean,
  public val typeState5: InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val anthropicTextBlockParamMatches: Boolean,
  public val anthropicImageBlockParamMatches: Boolean,
  public val anthropicDocumentBlockParamMatches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches: Boolean,
  public val anthropicSearchResultBlockParamMatches: Boolean,
  public val inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches: Boolean,
  public val messagesAdvisorToolResultBlockMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (anthropicTextBlockParamMatches) add("AnthropicTextBlockParam")
      if (anthropicImageBlockParamMatches) add("AnthropicImageBlockParam")
      if (anthropicDocumentBlockParamMatches) add("AnthropicDocumentBlockParam")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce")
      if (anthropicSearchResultBlockParamMatches) add("AnthropicSearchResultBlockParam")
      if (inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f")
      if (messagesAdvisorToolResultBlockMatches) add("MessagesAdvisorToolResultBlock")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineMessagesMessageParamContentAnyOf2ItemX7923ff96(rawObject: JsonObject): InlineMessagesMessageParamContentAnyOf2ItemX7923ff96Inspection {
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicTextBlockParamTypeX2f8f666a>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "text") && typeState4Decoded
  val sourceState2Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicImageBlockParamSourceX02b06711>(element) } }
  val sourceState2 = sourceState2Result?.getOrNull()
  val sourceState2Decoded = sourceState2Result?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicImageBlockParamTypeXf6b1b5ef>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "image") && typeState2Decoded
  val sourceState1Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicDocumentBlockParamSourceXb255d816>(element) } }
  val sourceState1 = sourceState1Result?.getOrNull()
  val sourceState1Decoded = sourceState1Result?.isSuccess == true
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicDocumentBlockParamTypeXe4e5a429>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "document") && typeState1Decoded
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf4TypeX37cb10c8>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "tool_use") && typeState7Decoded
  val toolUseIdResult = rawObject["tool_use_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val toolUseId = toolUseIdResult?.getOrNull()
  val toolUseIdDecoded = toolUseIdResult?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf5TypeX4f80d75d>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "tool_result") && typeState8Decoded
  val signatureResult = rawObject["signature"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val signature = signatureResult?.getOrNull()
  val signatureDecoded = signatureResult?.isSuccess == true
  val thinkingResult = rawObject["thinking"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val thinking = thinkingResult?.getOrNull()
  val thinkingDecoded = thinkingResult?.isSuccess == true
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf6TypeXdaecd580>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "thinking") && typeState9Decoded
  val dataResult = rawObject["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf7TypeXc49277de>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "redacted_thinking") && typeState10Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf8TypeX0f73af68>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "server_tool_use") && typeState11Decoded
  val contentState1Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf9ContentXe8e8d29e>(element) } }
  val contentState1 = contentState1Result?.getOrNull()
  val contentState1Decoded = contentState1Result?.isSuccess == true
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf9TypeX4e989d66>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "web_search_tool_result") && typeState12Decoded
  val contentState2Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<AnthropicTextBlockParam>>(element) } }
  val contentState2 = contentState2Result?.getOrNull()
  val contentState2Decoded = contentState2Result?.isSuccess == true
  val sourceState3Result = rawObject["source"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val sourceState3 = sourceState3Result?.getOrNull()
  val sourceState3Decoded = sourceState3Result?.isSuccess == true
  val titleResult = rawObject["title"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val title = titleResult?.getOrNull()
  val titleDecoded = titleResult?.isSuccess == true
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicSearchResultBlockParamTypeX2b91bce1>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "search_result") && typeState3Decoded
  val contentState4Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val contentState4 = contentState4Result?.getOrNull()
  val contentState4Present = rawObject.containsKey("content")
  val contentState4Decoded = contentState4Result?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesMessageParamContentAnyOf2ItemOneOf11TypeXa15a6989>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "compaction") && typeState6Decoded
  val contentState3Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Map<String, JsonElement?>>(element) } }
  val contentState3 = contentState3Result?.getOrNull()
  val contentState3Decoded = contentState3Result?.isSuccess == true
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMessagesAdvisorToolResultBlockTypeXdfb9f1bc>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "advisor_tool_result") && typeState5Decoded
  val rawEmpty = rawObject.isEmpty()
  val anthropicTextBlockParamMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicTextBlockParamBranch(rawObject) && (textDecoded && typeState4Matches)
  val anthropicImageBlockParamMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicImageBlockParamBranch(rawObject) && (sourceState2Decoded && typeState2Matches)
  val anthropicDocumentBlockParamMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicDocumentBlockParamBranch(rawObject) && (sourceState1Decoded && typeState1Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Branch(rawObject) && (idDecoded && nameDecoded && typeState7Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Branch(rawObject) && (toolUseIdDecoded && typeState8Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Branch(rawObject) && (signatureDecoded && thinkingDecoded && typeState9Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbBranch(rawObject) && (dataDecoded && typeState10Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dBranch(rawObject) && (idDecoded && nameDecoded && typeState11Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceBranch(rawObject) && (contentState1Decoded && toolUseIdDecoded && typeState12Matches)
  val anthropicSearchResultBlockParamMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicSearchResultBlockParamBranch(rawObject) && (contentState2Decoded && sourceState3Decoded && titleDecoded && typeState3Matches)
  val inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fBranch(rawObject) && (contentState4Present && contentState4Decoded && typeState6Matches)
  val messagesAdvisorToolResultBlockMatches = matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96MessagesAdvisorToolResultBlockBranch(rawObject) && (contentState3Decoded && toolUseIdDecoded && typeState5Matches)
  return InlineMessagesMessageParamContentAnyOf2ItemX7923ff96Inspection(
    text = text,
    textDecoded = textDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    sourceState2 = sourceState2,
    sourceState2Decoded = sourceState2Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    sourceState1 = sourceState1,
    sourceState1Decoded = sourceState1Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    id = id,
    idDecoded = idDecoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    toolUseId = toolUseId,
    toolUseIdDecoded = toolUseIdDecoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    signature = signature,
    signatureDecoded = signatureDecoded,
    thinking = thinking,
    thinkingDecoded = thinkingDecoded,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    data = data,
    dataDecoded = dataDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    contentState1 = contentState1,
    contentState1Decoded = contentState1Decoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    contentState2 = contentState2,
    contentState2Decoded = contentState2Decoded,
    sourceState3 = sourceState3,
    sourceState3Decoded = sourceState3Decoded,
    title = title,
    titleDecoded = titleDecoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    contentState4 = contentState4,
    contentState4Present = contentState4Present,
    contentState4Decoded = contentState4Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    contentState3 = contentState3,
    contentState3Decoded = contentState3Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    anthropicTextBlockParamMatches = anthropicTextBlockParamMatches,
    anthropicImageBlockParamMatches = anthropicImageBlockParamMatches,
    anthropicDocumentBlockParamMatches = anthropicDocumentBlockParamMatches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches = inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches = inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches = inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches = inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches = inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches = inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches,
    anthropicSearchResultBlockParamMatches = anthropicSearchResultBlockParamMatches,
    inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches = inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches,
    messagesAdvisorToolResultBlockMatches = messagesAdvisorToolResultBlockMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!anthropicTextBlockParamMatches) add("AnthropicTextBlockParam: branch predicate did not match properties 'text' and 'type'")
      if (!anthropicImageBlockParamMatches) add("AnthropicImageBlockParam: branch predicate did not match properties 'source' and 'type'")
      if (!anthropicDocumentBlockParamMatches) add("AnthropicDocumentBlockParam: branch predicate did not match properties 'source' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882: branch predicate did not match properties 'id' and 'name' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721: branch predicate did not match properties 'tool_use_id' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Matches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95: branch predicate did not match properties 'signature' and 'thinking' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cb: branch predicate did not match properties 'data' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06d: branch predicate did not match properties 'id' and 'name' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ce: branch predicate did not match properties 'content' and 'tool_use_id' and 'type'")
      if (!anthropicSearchResultBlockParamMatches) add("AnthropicSearchResultBlockParam: branch predicate did not match properties 'content' and 'source' and 'title' and 'type'")
      if (!inlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fMatches) add("InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3f: branch predicate did not match properties 'content' and 'type'")
      if (!messagesAdvisorToolResultBlockMatches) add("MessagesAdvisorToolResultBlock: branch predicate did not match properties 'content' and 'tool_use_id' and 'type'")
    },
  )
}

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicTextBlockParamBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicImageBlockParamBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicDocumentBlockParamBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf4X8bd8a882Branch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cache_control"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["ttl"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"5m\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"1h\"")))) } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ephemeral\"")))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["input"]?.let { property -> true } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"tool_use\"")))) } ?: true))))

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf5Xd9be0721Branch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf6X9e2b2d95Branch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("signature") && (rawObject as JsonObject).containsKey("thinking") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["signature"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["thinking"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"thinking\"")))) } ?: true))))

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf7X033b88cbBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("data") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["data"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"redacted_thinking\"")))) } ?: true))))

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf8Xd327e06dBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cache_control"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["ttl"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"5m\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"1h\"")))) } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ephemeral\"")))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["input"]?.let { property -> true } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"server_tool_use\"")))) } ?: true))))

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf9X574b98ceBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96AnthropicSearchResultBlockParamBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96InlineMessagesMessageParamContentAnyOf2ItemOneOf11X6fbd2a3fBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("content") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["cache_control"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["ttl"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"5m\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"1h\"")))) } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ephemeral\"")))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["content"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"compaction\"")))) } ?: true))))

private fun matchesInlineMessagesMessageParamContentAnyOf2ItemX7923ff96MessagesAdvisorToolResultBlockBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("content") && (rawObject as JsonObject).containsKey("tool_use_id") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["content"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).all { (name, value) -> name in setOf<String>() || true }))) } ?: true) && ((rawObject as JsonObject)["tool_use_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"advisor_tool_result\"")))) } ?: true))))

private fun schemaExactDecimal(`value`: String): SchemaDecimal? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  if (digits == "0") return SchemaDecimal(false, "0", SchemaInteger(false, "0"))
  var scale = schemaIntegerSubtract(
      SchemaInteger(false, match.groupValues[3].length.toString()),
      requireNotNull(schemaInteger(match.groupValues[4].ifEmpty { "0" })),
  )
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale = schemaIntegerSubtract(scale, SchemaInteger(false, "1"))
  }
  return SchemaDecimal(match.groupValues[1] == "-", digits, scale)
}

private fun schemaInteger(`value`: String): SchemaInteger? {
  val match = Regex("^([+-]?)(\\d+)$").matchEntire(value) ?: return null
  val digits = match.groupValues[2].trimStart('0').ifEmpty { "0" }
  return SchemaInteger(match.groupValues[1] == "-" && digits != "0", digits)
}

private fun schemaIntegerCompare(left: SchemaInteger, right: SchemaInteger): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  return if (left.negative) -comparison else comparison
}

private fun schemaIntegerMagnitudeCompare(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaIntegerSubtract(left: SchemaInteger, right: SchemaInteger): SchemaInteger = schemaIntegerAdd(left, SchemaInteger(!right.negative && right.digits != "0", right.digits))

private fun schemaIntegerAdd(left: SchemaInteger, right: SchemaInteger): SchemaInteger {
  if (left.negative == right.negative) return SchemaInteger(left.negative, schemaIntegerMagnitudeAdd(left.digits, right.digits))
  val comparison = schemaIntegerMagnitudeCompare(left.digits, right.digits)
  if (comparison == 0) return SchemaInteger(false, "0")
  return if (comparison > 0) {
      SchemaInteger(left.negative, schemaIntegerMagnitudeSubtract(left.digits, right.digits))
  } else {
      SchemaInteger(right.negative, schemaIntegerMagnitudeSubtract(right.digits, left.digits))
  }
}

private fun schemaIntegerMagnitudeAdd(left: String, right: String): String {
  val result = StringBuilder()
  var carry = 0
  val width = maxOf(left.length, right.length)
  for (offset in 0 until width) {
      val leftDigit = left.getOrNull(left.length - 1 - offset)?.minus('0') ?: 0
      val rightDigit = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      val total = leftDigit + rightDigit + carry
      result.append(('0'.code + total % 10).toChar())
      carry = total / 10
  }
  if (carry > 0) result.append(('0'.code + carry).toChar())
  return result.reverse().toString()
}

private fun schemaIntegerMagnitudeSubtract(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (offset in left.indices) {
      var digit = left[left.length - 1 - offset] - '0' - borrow
      val subtrahend = right.getOrNull(right.length - 1 - offset)?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun schemaExactCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  if (left.negative != right.negative) return if (left.negative) -1 else 1
  val comparison = schemaExactMagnitudeCompare(left, right)
  return if (left.negative) -comparison else comparison
}

private fun schemaExactMagnitudeCompare(left: SchemaDecimal, right: SchemaDecimal): Int {
  val leftPower = schemaIntegerSubtract(SchemaInteger(false, (left.digits.length - 1).toString()), left.scale)
  val rightPower = schemaIntegerSubtract(SchemaInteger(false, (right.digits.length - 1).toString()), right.scale)
  val powerComparison = schemaIntegerCompare(leftPower, rightPower)
  if (powerComparison != 0) return powerComparison
  val width = maxOf(left.digits.length, right.digits.length)
  for (index in 0 until width) {
      val leftDigit = left.digits.getOrNull(index) ?: '0'
      val rightDigit = right.digits.getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaExactIsMultipleOf(`value`: SchemaDecimal, divisor: SchemaDecimal): Boolean {
  if (divisor.digits == "0") return false
  if (value.digits == "0") return true
  val shift = schemaIntegerSubtract(divisor.scale, value.scale)
  if (schemaIntegerCompare(shift, SchemaInteger(false, "0")) < 0) return false
  val divisorTwos = schemaFactorCount(divisor.digits, 2)
  val divisorFives = schemaFactorCount(divisorTwos.first, 5)
  if (schemaExactRemainder(value.digits, divisorFives.first) != "0") return false
  val valueTwos = schemaFactorCount(value.digits, 2).second
  val valueFives = schemaFactorCount(value.digits, 5).second
  val requiredTwos = (divisorTwos.second - valueTwos).coerceAtLeast(0)
  val requiredFives = (divisorFives.second - valueFives).coerceAtLeast(0)
  return schemaIntegerCompare(shift, SchemaInteger(false, requiredTwos.toString())) >= 0 &&
      schemaIntegerCompare(shift, SchemaInteger(false, requiredFives.toString())) >= 0
}

private fun schemaFactorCount(`value`: String, factor: Int): Pair<String, Int> {
  var remainder = value
  var count = 0
  while (remainder != "0") {
      val division = schemaDivideBySmall(remainder, factor)
      if (division.second != 0) break
      remainder = division.first
      count += 1
  }
  return remainder to count
}

private fun schemaDivideBySmall(`value`: String, divisor: Int): Pair<String, Int> {
  val quotient = StringBuilder()
  var remainder = 0
  value.forEach { digit ->
      val combined = remainder * 10 + (digit - '0')
      quotient.append(('0'.code + combined / divisor).toChar())
      remainder = combined % divisor
  }
  return quotient.toString().trimStart('0').ifEmpty { "0" } to remainder
}

private fun schemaExactRemainder(dividend: String, divisor: String): String {
  if (divisor == "1") return "0"
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaIntegerMagnitudeCompare(remainder, divisor) >= 0) {
          remainder = schemaIntegerMagnitudeSubtract(remainder, divisor)
      }
  }
  return remainder
}

private fun JsonElement.isJsonSchemaNumber(): Boolean {
  val primitive = this as? JsonPrimitive ?: return false
  if (primitive.isString || primitive.content == "true" || primitive.content == "false" || this is JsonNull) return false
  return schemaExactDecimal(primitive.content) != null
}

private fun JsonElement.isJsonSchemaInteger(): Boolean {
  val parts = (this as? JsonPrimitive)?.takeIf { isJsonSchemaNumber() }?.let { schemaExactDecimal(it.content) }
      ?: return false
  return schemaIntegerCompare(parts.scale, SchemaInteger(false, "0")) <= 0
}

private fun JsonElement.matchesJsonSchemaNumber(
  minimum: String?,
  maximum: String?,
  exclusiveMinimum: String?,
  exclusiveMaximum: String?,
  multipleOf: String?,
): Boolean {
  if (!isJsonSchemaNumber()) return true
  val value = requireNotNull(schemaExactDecimal((this as JsonPrimitive).content))
  minimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) < 0) return false }
  maximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) > 0) return false }
  exclusiveMinimum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) <= 0) return false }
  exclusiveMaximum?.let { if (schemaExactCompare(value, requireNotNull(schemaExactDecimal(it))) >= 0) return false }
  multipleOf?.let { if (!schemaExactIsMultipleOf(value, requireNotNull(schemaExactDecimal(it)))) return false }
  return true
}

private fun JsonElement.matchesJsonSchemaString(
  minLength: Int?,
  maxLength: Int?,
  format: String?,
): Boolean {
  val primitive = this as? JsonPrimitive ?: return true
  if (!primitive.isString) return true
  val value = primitive.content
  val length = value.jsonSchemaCodePointCount()
  if (minLength != null && length < minLength) return false
  if (maxLength != null && length > maxLength) return false
  return when (format) {
      null -> true
      "date" -> value.isRfc3339Date()
      "date-time" -> value.isRfc3339DateTime()
      else -> false
  }
}

private fun JsonElement.jsonSchemaEquals(other: JsonElement): Boolean {
  if (this is JsonNull || other is JsonNull) return this is JsonNull && other is JsonNull
  if (this is JsonArray && other is JsonArray) return size == other.size && indices.all { this[it].jsonSchemaEquals(other[it]) }
  if (this is JsonObject && other is JsonObject) return keys == other.keys && keys.all { key -> getValue(key).jsonSchemaEquals(other.getValue(key)) }
  if (this !is JsonPrimitive || other !is JsonPrimitive) return false
  if (isString || other.isString) return isString && other.isString && content == other.content
  if (isJsonSchemaNumber() && other.isJsonSchemaNumber()) {
      return schemaExactCompare(
          requireNotNull(schemaExactDecimal(content)),
          requireNotNull(schemaExactDecimal(other.content)),
      ) == 0
  }
  return content == other.content
}

private fun String.jsonSchemaCodePointCount(): Int {
  var count = 0
  var index = 0
  while (index < length) {
      val highSurrogate = this[index].code in 55296..56319
      val lowSurrogate = index + 1 < length && this[index + 1].code in 56320..57343
      index += if (highSurrogate && lowSurrogate) 2 else 1
      count += 1
  }
  return count
}

private fun String.isRfc3339Date(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})$").matchEntire(this) ?: return false
  return isValidRfc3339Date(match.groupValues[1].toInt(), match.groupValues[2].toInt(), match.groupValues[3].toInt())
}

private fun String.isRfc3339DateTime(): Boolean {
  val match = Regex("^(\\d{4})-(\\d{2})-(\\d{2})[Tt](\\d{2}):(\\d{2}):(\\d{2})(?:\\.\\d+)?([Zz]|[+-]\\d{2}:\\d{2})$")
      .matchEntire(this) ?: return false
  val hour = match.groupValues[4].toInt()
  val minute = match.groupValues[5].toInt()
  val second = match.groupValues[6].toInt()
  val offset = match.groupValues[7]
  val year = match.groupValues[1].toInt()
  val month = match.groupValues[2].toInt()
  val day = match.groupValues[3].toInt()
  if (!isValidRfc3339Date(year, month, day)) return false
  if (hour !in 0..23 || minute !in 0..59 || second !in 0..60) return false
  if (offset.length != 1) {
      val offsetHour = offset.substring(1, 3).toInt()
      val offsetMinute = offset.substring(4, 6).toInt()
      if (offsetHour !in 0..23 || offsetMinute !in 0..59) return false
  }
  return second != 60 || isKnownRfc3339LeapSecond(year, month, day, hour, minute, offset)
}

private fun isValidRfc3339Date(
  year: Int,
  month: Int,
  day: Int,
): Boolean {
  if (month !in 1..12) return false
  val days = when (month) {
      2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
      4, 6, 9, 11 -> 30
      else -> 31
  }
  return day in 1..days
}

private fun isKnownRfc3339LeapSecond(
  year: Int,
  month: Int,
  day: Int,
  hour: Int,
  minute: Int,
  offset: String,
): Boolean {
  val offsetMinutes =
      if (offset.length == 1) 0
      else {
          val value = offset.substring(1, 3).toInt() * 60 + offset.substring(4, 6).toInt()
          if (offset[0] == '-') -value else value
      }
  val instant = rfc3339DayIndex(year, month, day) * 1_440L + hour * 60L + minute + 1L - offsetMinutes
  return rfc3339LeapSecondInstants().contains(instant)
}

private fun rfc3339DayIndex(
  year: Int,
  month: Int,
  day: Int,
): Long {
  val yearDays = 365L * year + (year + 3L) / 4L - (year + 99L) / 100L + (year + 399L) / 400L
  val monthDays = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)[month - 1]
  val leapDay = if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 1 else 0
  return yearDays + monthDays + leapDay + day - 1L
}

private fun rfc3339LeapSecondInstants(): Set<Long> = setOf(
    (rfc3339DayIndex(1972, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1972, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1973, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1974, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1975, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1976, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1977, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1978, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1979, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1981, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1982, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1983, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1985, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1987, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1989, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(1990, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1992, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1993, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(1994, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1995, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(1997, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(1998, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2005, 12, 31) + 1L) * 1_440L, (rfc3339DayIndex(2008, 12, 31) + 1L) * 1_440L,
    (rfc3339DayIndex(2012, 6, 30) + 1L) * 1_440L, (rfc3339DayIndex(2015, 6, 30) + 1L) * 1_440L,
    (rfc3339DayIndex(2016, 12, 31) + 1L) * 1_440L,
)

private fun schemaDecimalParts(`value`: String): List<String>? {
  val match = Regex("^(-?)(0|[1-9]\\d*)(?:\\.(\\d+))?(?:[eE]([+-]?\\d+))?$").matchEntire(value) ?: return null
  val exponent = match.groupValues[4].ifEmpty { "0" }.toLongOrNull() ?: return null
  var digits = (match.groupValues[2] + match.groupValues[3]).trimStart('0').ifEmpty { "0" }
  var scale = match.groupValues[3].length.toLong() - exponent
  while (digits.length > 1 && digits.endsWith('0')) {
      digits = digits.dropLast(1)
      scale -= 1L
  }
  return listOf(if (digits == "0") "" else match.groupValues[1], digits, scale.toString())
}

private fun schemaCompare(left: List<String>, right: List<String>): Int {
  val leftNegative = left[0] == "-"
  val rightNegative = right[0] == "-"
  if (leftNegative != rightNegative) return if (leftNegative) -1 else 1
  val comparison = schemaCompareMagnitude(left, right)
  return if (leftNegative) -comparison else comparison
}

private fun schemaCompareMagnitude(left: List<String>, right: List<String>): Int {
  val leftScale = left[2].toLong()
  val rightScale = right[2].toLong()
  val leftPower = left[1].length.toLong() - 1L - leftScale
  val rightPower = right[1].length.toLong() - 1L - rightScale
  if (leftPower != rightPower) return leftPower.compareTo(rightPower)
  val width = maxOf(left[1].length, right[1].length)
  for (index in 0 until width) {
      val leftDigit = left[1].getOrNull(index) ?: '0'
      val rightDigit = right[1].getOrNull(index) ?: '0'
      if (leftDigit != rightDigit) return leftDigit.compareTo(rightDigit)
  }
  return 0
}

private fun schemaIsMultipleOf(`value`: List<String>, divisor: List<String>): Boolean {
  if (divisor[1] == "0") return false
  if (value[1] == "0") return true
  val shift = divisor[2].toLong() - value[2].toLong()
  return if (shift >= 0L) {
      schemaRemainderAfterZeros(value[1], divisor[1], shift) == "0"
  } else {
      val zeros = -shift
      if (zeros > value[1].length.toLong()) false
      else {
          val count = zeros.toInt()
          value[1].takeLast(count).all { it == '0' } && schemaRemainder(value[1].dropLast(count), divisor[1]) == "0"
      }
  }
}

private fun schemaRemainderAfterZeros(
  dividend: String,
  divisor: String,
  zeros: Long,
): String {
  var remainder = schemaRemainder(dividend, divisor)
  var remaining = zeros
  while (remaining > 0L) {
      remainder = schemaRemainder(remainder + "0", divisor)
      remaining -= 1L
  }
  return remainder
}

private fun schemaRemainder(dividend: String, divisor: String): String {
  var remainder = "0"
  dividend.forEach { digit ->
      remainder = (remainder + digit).trimStart('0').ifEmpty { "0" }
      while (schemaCompareInteger(remainder, divisor) >= 0) remainder = schemaSubtractInteger(remainder, divisor)
  }
  return remainder
}

private fun schemaCompareInteger(left: String, right: String): Int {
  if (left.length != right.length) return left.length.compareTo(right.length)
  return left.compareTo(right)
}

private fun schemaSubtractInteger(left: String, right: String): String {
  val result = StringBuilder()
  var borrow = 0
  for (index in left.indices.reversed()) {
      var digit = (left[index] - '0') - borrow
      val subtrahend = right.getOrNull(right.length - (left.length - index))?.minus('0') ?: 0
      if (digit < subtrahend) { digit += 10; borrow = 1 } else borrow = 0
      result.append(('0'.code + digit - subtrahend).toChar())
  }
  return result.reverse().toString().trimStart('0').ifEmpty { "0" }
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
