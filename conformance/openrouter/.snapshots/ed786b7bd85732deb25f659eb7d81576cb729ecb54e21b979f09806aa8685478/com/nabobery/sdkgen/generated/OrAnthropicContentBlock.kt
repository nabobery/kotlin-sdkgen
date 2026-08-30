package com.nabobery.sdkgen.generated

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

public sealed class OrAnthropicContentBlockDecodingException(
  message: String,
) : SerializationException(message)

public class OrAnthropicContentBlockNoMatchException(
  message: String,
) : OrAnthropicContentBlockDecodingException(message)

public class OrAnthropicContentBlockAmbiguityException(
  message: String,
) : OrAnthropicContentBlockDecodingException(message)

public class OrAnthropicContentBlockBranchValidationException(
  message: String,
) : OrAnthropicContentBlockDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicContentBlock.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicContentBlock
 */
@Serializable(with = OrAnthropicContentBlockSerializer::class)
public sealed interface OrAnthropicContentBlock {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AnthropicTextBlock internal constructor(
    citations: List<AnthropicTextCitation>?,
    public val text: String,
    public val type: InlineAnthropicTextBlockTypeXbd960bad,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public val citations: List<AnthropicTextCitation>? =
        citations?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        citations: List<AnthropicTextCitation>?,
        text: String,
        type: InlineAnthropicTextBlockTypeXbd960bad,
      ): AnthropicTextBlock {
        val citationsOwnershipSnapshot = citations?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("citations", SdkJson.encodeToJsonElement(citationsOwnershipSnapshot))
          put("text", text)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicTextBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicTextBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicTextBlock(
          citations = citationsOwnershipSnapshot,
          text = text,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicToolUseBlock internal constructor(
    public val caller: AnthropicCaller,
    public val id: String,
    public val name: String,
    public val type: InlineAnthropicToolUseBlockTypeX0d530418,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        caller: AnthropicCaller,
        id: String,
        name: String,
        type: InlineAnthropicToolUseBlockTypeX0d530418,
      ): AnthropicToolUseBlock {
        val raw = buildJsonObject {
          put("caller", SdkJson.encodeToJsonElement(caller))
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicToolUseBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicToolUseBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicToolUseBlock(
          caller = caller,
          id = id,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicThinkingBlock internal constructor(
    public val signature: String,
    public val thinking: String,
    public val type: InlineAnthropicThinkingBlockTypeX4f592c6b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        signature: String,
        thinking: String,
        type: InlineAnthropicThinkingBlockTypeX4f592c6b,
      ): AnthropicThinkingBlock {
        val raw = buildJsonObject {
          put("signature", signature)
          put("thinking", thinking)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicThinkingBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicThinkingBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicThinkingBlock(
          signature = signature,
          thinking = thinking,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicRedactedThinkingBlock internal constructor(
    public val `data`: String,
    public val type: InlineAnthropicRedactedThinkingBlockTypeX8930a877,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(`data`: String, type: InlineAnthropicRedactedThinkingBlockTypeX8930a877): AnthropicRedactedThinkingBlock {
        val raw = buildJsonObject {
          put("data", data)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicRedactedThinkingBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicRedactedThinkingBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicRedactedThinkingBlock(
          data = data,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OrAnthropicServerToolUseBlock internal constructor(
    public val id: String,
    public val name: String,
    public val type: InlineOrAnthropicServerToolUseBlockTypeX72973005,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        name: String,
        type: InlineOrAnthropicServerToolUseBlockTypeX72973005,
      ): OrAnthropicServerToolUseBlock {
        val raw = buildJsonObject {
          put("id", id)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.orAnthropicServerToolUseBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("OrAnthropicServerToolUseBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OrAnthropicServerToolUseBlock(
          id = id,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicWebSearchToolResult internal constructor(
    public val caller: AnthropicCaller,
    public val content: InlineAnthropicWebSearchToolResultContentX8bf35e95,
    public val toolUseId: String,
    public val type: InlineAnthropicWebSearchToolResultTypeX0fb13727,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        caller: AnthropicCaller,
        content: InlineAnthropicWebSearchToolResultContentX8bf35e95,
        toolUseId: String,
        type: InlineAnthropicWebSearchToolResultTypeX0fb13727,
      ): AnthropicWebSearchToolResult {
        val raw = buildJsonObject {
          put("caller", SdkJson.encodeToJsonElement(caller))
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicWebSearchToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicWebSearchToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicWebSearchToolResult(
          caller = caller,
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicWebFetchToolResult internal constructor(
    public val caller: AnthropicCaller,
    public val content: AnthropicWebFetchContent,
    public val toolUseId: String,
    public val type: InlineAnthropicWebFetchToolResultTypeX43274783,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        caller: AnthropicCaller,
        content: AnthropicWebFetchContent,
        toolUseId: String,
        type: InlineAnthropicWebFetchToolResultTypeX43274783,
      ): AnthropicWebFetchToolResult {
        val raw = buildJsonObject {
          put("caller", SdkJson.encodeToJsonElement(caller))
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicWebFetchToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicWebFetchToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicWebFetchToolResult(
          caller = caller,
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCodeExecutionToolResult internal constructor(
    public val content: AnthropicCodeExecutionContent,
    public val toolUseId: String,
    public val type: InlineAnthropicCodeExecutionToolResultTypeXa2888711,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: AnthropicCodeExecutionContent,
        toolUseId: String,
        type: InlineAnthropicCodeExecutionToolResultTypeXa2888711,
      ): AnthropicCodeExecutionToolResult {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCodeExecutionToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicCodeExecutionToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCodeExecutionToolResult(
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicBashCodeExecutionToolResult internal constructor(
    public val content: AnthropicBashCodeExecutionContent,
    public val toolUseId: String,
    public val type: InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: AnthropicBashCodeExecutionContent,
        toolUseId: String,
        type: InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6,
      ): AnthropicBashCodeExecutionToolResult {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicBashCodeExecutionToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicBashCodeExecutionToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicBashCodeExecutionToolResult(
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicTextEditorCodeExecutionToolResult internal constructor(
    public val content: AnthropicTextEditorCodeExecutionContent,
    public val toolUseId: String,
    public val type: InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: AnthropicTextEditorCodeExecutionContent,
        toolUseId: String,
        type: InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294,
      ): AnthropicTextEditorCodeExecutionToolResult {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicTextEditorCodeExecutionToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicTextEditorCodeExecutionToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicTextEditorCodeExecutionToolResult(
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicToolSearchToolResult internal constructor(
    public val content: AnthropicToolSearchContent,
    public val toolUseId: String,
    public val type: InlineAnthropicToolSearchToolResultTypeXa6009ee6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: AnthropicToolSearchContent,
        toolUseId: String,
        type: InlineAnthropicToolSearchToolResultTypeXa6009ee6,
      ): AnthropicToolSearchToolResult {
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(content))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicToolSearchToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicToolSearchToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicToolSearchToolResult(
          content = content,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicContainerUpload internal constructor(
    public val fileId: String,
    public val type: InlineAnthropicContainerUploadTypeXb985c53e,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(fileId: String, type: InlineAnthropicContainerUploadTypeXb985c53e): AnthropicContainerUpload {
        val raw = buildJsonObject {
          put("file_id", fileId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicContainerUploadMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicContainerUpload factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicContainerUpload(
          fileId = fileId,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicCompactionBlock internal constructor(
    public val content: String?,
    public val type: InlineAnthropicCompactionBlockTypeX84665b30,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(content: String?, type: InlineAnthropicCompactionBlockTypeX84665b30): AnthropicCompactionBlock {
        val raw = buildJsonObject {
          put("content", content)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicCompactionBlockMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicCompactionBlock factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicCompactionBlock(
          content = content,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class AnthropicAdvisorToolResult internal constructor(
    content: Map<String, JsonElement?>,
    public val toolUseId: String,
    public val type: InlineAnthropicAdvisorToolResultTypeXe304c700,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OrAnthropicContentBlock {
    public val content: Map<String, JsonElement?> = content.toMap()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: Map<String, JsonElement?>,
        toolUseId: String,
        type: InlineAnthropicAdvisorToolResultTypeXe304c700,
      ): AnthropicAdvisorToolResult {
        val contentOwnershipSnapshot = content.toMap()
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(contentOwnershipSnapshot))
          put("tool_use_id", toolUseId)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOrAnthropicContentBlock(raw)
        if (inspection.size == 0) {
          throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.anthropicAdvisorToolResultMatches) {
          throw OrAnthropicContentBlockBranchValidationException("AnthropicAdvisorToolResult factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AnthropicAdvisorToolResult(
          content = contentOwnershipSnapshot,
          toolUseId = toolUseId,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object OrAnthropicContentBlockSerializer : KSerializer<OrAnthropicContentBlock> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): OrAnthropicContentBlock {
    val jsonDecoder = decoder.requireJsonDecoder("OrAnthropicContentBlock")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: expected JSON object")
    val matches = inspectOrAnthropicContentBlock(rawObject)
    if (matches.size == 0) {
      throw OrAnthropicContentBlockNoMatchException("OrAnthropicContentBlock matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw OrAnthropicContentBlockAmbiguityException("OrAnthropicContentBlock matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.anthropicTextBlockMatches -> OrAnthropicContentBlock.AnthropicTextBlock(citations = matches.citations, text = requireNotNull(matches.text), type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.anthropicToolUseBlockMatches -> OrAnthropicContentBlock.AnthropicToolUseBlock(caller = requireNotNull(matches.caller), id = requireNotNull(matches.id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState21), raw = rawObject)
      matches.anthropicThinkingBlockMatches -> OrAnthropicContentBlock.AnthropicThinkingBlock(signature = requireNotNull(matches.signature), thinking = requireNotNull(matches.thinking), type = requireNotNull(matches.typeState17), raw = rawObject)
      matches.anthropicRedactedThinkingBlockMatches -> OrAnthropicContentBlock.AnthropicRedactedThinkingBlock(data = requireNotNull(matches.data), type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.orAnthropicServerToolUseBlockMatches -> OrAnthropicContentBlock.OrAnthropicServerToolUseBlock(id = requireNotNull(matches.id), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState27), raw = rawObject)
      matches.anthropicWebSearchToolResultMatches -> OrAnthropicContentBlock.AnthropicWebSearchToolResult(caller = requireNotNull(matches.caller), content = requireNotNull(matches.contentState6), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState25), raw = rawObject)
      matches.anthropicWebFetchToolResultMatches -> OrAnthropicContentBlock.AnthropicWebFetchToolResult(caller = requireNotNull(matches.caller), content = requireNotNull(matches.contentState5), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState23), raw = rawObject)
      matches.anthropicCodeExecutionToolResultMatches -> OrAnthropicContentBlock.AnthropicCodeExecutionToolResult(content = requireNotNull(matches.contentState2), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.anthropicBashCodeExecutionToolResultMatches -> OrAnthropicContentBlock.AnthropicBashCodeExecutionToolResult(content = requireNotNull(matches.contentState1), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.anthropicTextEditorCodeExecutionToolResultMatches -> OrAnthropicContentBlock.AnthropicTextEditorCodeExecutionToolResult(content = requireNotNull(matches.contentState3), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.anthropicToolSearchToolResultMatches -> OrAnthropicContentBlock.AnthropicToolSearchToolResult(content = requireNotNull(matches.contentState4), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState19), raw = rawObject)
      matches.anthropicContainerUploadMatches -> OrAnthropicContentBlock.AnthropicContainerUpload(fileId = requireNotNull(matches.fileId), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.anthropicCompactionBlockMatches -> OrAnthropicContentBlock.AnthropicCompactionBlock(content = matches.contentState8, type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.anthropicAdvisorToolResultMatches -> OrAnthropicContentBlock.AnthropicAdvisorToolResult(content = requireNotNull(matches.contentState7), toolUseId = requireNotNull(matches.toolUseId), type = requireNotNull(matches.typeState1), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: OrAnthropicContentBlock) {
    encoder.requireJsonEncoder("OrAnthropicContentBlock").encodeJsonElement(value.raw)
  }
}

internal data class OrAnthropicContentBlockInspection(
  public val typeState13: InlineAnthropicTextBlockTypeXbd960bad?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val citations: List<AnthropicTextCitation>?,
  public val citationsPresent: Boolean,
  public val citationsDecoded: Boolean,
  public val text: String?,
  public val textDecoded: Boolean,
  public val typeState14: InlineAnthropicTextBlockTypeXbd960bad?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState21: InlineAnthropicToolUseBlockTypeX0d530418?,
  public val typeState21Decoded: Boolean,
  public val typeState21Matches: Boolean,
  public val caller: AnthropicCaller?,
  public val callerDecoded: Boolean,
  public val id: String?,
  public val idDecoded: Boolean,
  public val name: String?,
  public val nameDecoded: Boolean,
  public val typeState22: InlineAnthropicToolUseBlockTypeX0d530418?,
  public val typeState22Decoded: Boolean,
  public val typeState22Matches: Boolean,
  public val typeState17: InlineAnthropicThinkingBlockTypeX4f592c6b?,
  public val typeState17Decoded: Boolean,
  public val typeState17Matches: Boolean,
  public val signature: String?,
  public val signatureDecoded: Boolean,
  public val thinking: String?,
  public val thinkingDecoded: Boolean,
  public val typeState18: InlineAnthropicThinkingBlockTypeX4f592c6b?,
  public val typeState18Decoded: Boolean,
  public val typeState18Matches: Boolean,
  public val typeState11: InlineAnthropicRedactedThinkingBlockTypeX8930a877?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val `data`: String?,
  public val dataDecoded: Boolean,
  public val typeState12: InlineAnthropicRedactedThinkingBlockTypeX8930a877?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState27: InlineOrAnthropicServerToolUseBlockTypeX72973005?,
  public val typeState27Decoded: Boolean,
  public val typeState27Matches: Boolean,
  public val typeState28: InlineOrAnthropicServerToolUseBlockTypeX72973005?,
  public val typeState28Decoded: Boolean,
  public val typeState28Matches: Boolean,
  public val typeState25: InlineAnthropicWebSearchToolResultTypeX0fb13727?,
  public val typeState25Decoded: Boolean,
  public val typeState25Matches: Boolean,
  public val contentState6: InlineAnthropicWebSearchToolResultContentX8bf35e95?,
  public val contentState6Decoded: Boolean,
  public val toolUseId: String?,
  public val toolUseIdDecoded: Boolean,
  public val typeState26: InlineAnthropicWebSearchToolResultTypeX0fb13727?,
  public val typeState26Decoded: Boolean,
  public val typeState26Matches: Boolean,
  public val typeState23: InlineAnthropicWebFetchToolResultTypeX43274783?,
  public val typeState23Decoded: Boolean,
  public val typeState23Matches: Boolean,
  public val contentState5: AnthropicWebFetchContent?,
  public val contentState5Decoded: Boolean,
  public val typeState24: InlineAnthropicWebFetchToolResultTypeX43274783?,
  public val typeState24Decoded: Boolean,
  public val typeState24Matches: Boolean,
  public val typeState5: InlineAnthropicCodeExecutionToolResultTypeXa2888711?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val contentState2: AnthropicCodeExecutionContent?,
  public val contentState2Decoded: Boolean,
  public val typeState6: InlineAnthropicCodeExecutionToolResultTypeXa2888711?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val typeState3: InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val contentState1: AnthropicBashCodeExecutionContent?,
  public val contentState1Decoded: Boolean,
  public val typeState4: InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val typeState15: InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val contentState3: AnthropicTextEditorCodeExecutionContent?,
  public val contentState3Decoded: Boolean,
  public val typeState16: InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294?,
  public val typeState16Decoded: Boolean,
  public val typeState16Matches: Boolean,
  public val typeState19: InlineAnthropicToolSearchToolResultTypeXa6009ee6?,
  public val typeState19Decoded: Boolean,
  public val typeState19Matches: Boolean,
  public val contentState4: AnthropicToolSearchContent?,
  public val contentState4Decoded: Boolean,
  public val typeState20: InlineAnthropicToolSearchToolResultTypeXa6009ee6?,
  public val typeState20Decoded: Boolean,
  public val typeState20Matches: Boolean,
  public val typeState9: InlineAnthropicContainerUploadTypeXb985c53e?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val fileId: String?,
  public val fileIdDecoded: Boolean,
  public val typeState10: InlineAnthropicContainerUploadTypeXb985c53e?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState7: InlineAnthropicCompactionBlockTypeX84665b30?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val contentState8: String?,
  public val contentState8Present: Boolean,
  public val contentState8Decoded: Boolean,
  public val typeState8: InlineAnthropicCompactionBlockTypeX84665b30?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState1: InlineAnthropicAdvisorToolResultTypeXe304c700?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val contentState7: Map<String, JsonElement?>?,
  public val contentState7Decoded: Boolean,
  public val typeState2: InlineAnthropicAdvisorToolResultTypeXe304c700?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val anthropicTextBlockMatches: Boolean,
  public val anthropicToolUseBlockMatches: Boolean,
  public val anthropicThinkingBlockMatches: Boolean,
  public val anthropicRedactedThinkingBlockMatches: Boolean,
  public val orAnthropicServerToolUseBlockMatches: Boolean,
  public val anthropicWebSearchToolResultMatches: Boolean,
  public val anthropicWebFetchToolResultMatches: Boolean,
  public val anthropicCodeExecutionToolResultMatches: Boolean,
  public val anthropicBashCodeExecutionToolResultMatches: Boolean,
  public val anthropicTextEditorCodeExecutionToolResultMatches: Boolean,
  public val anthropicToolSearchToolResultMatches: Boolean,
  public val anthropicContainerUploadMatches: Boolean,
  public val anthropicCompactionBlockMatches: Boolean,
  public val anthropicAdvisorToolResultMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (anthropicTextBlockMatches) add("AnthropicTextBlock")
      if (anthropicToolUseBlockMatches) add("AnthropicToolUseBlock")
      if (anthropicThinkingBlockMatches) add("AnthropicThinkingBlock")
      if (anthropicRedactedThinkingBlockMatches) add("AnthropicRedactedThinkingBlock")
      if (orAnthropicServerToolUseBlockMatches) add("OrAnthropicServerToolUseBlock")
      if (anthropicWebSearchToolResultMatches) add("AnthropicWebSearchToolResult")
      if (anthropicWebFetchToolResultMatches) add("AnthropicWebFetchToolResult")
      if (anthropicCodeExecutionToolResultMatches) add("AnthropicCodeExecutionToolResult")
      if (anthropicBashCodeExecutionToolResultMatches) add("AnthropicBashCodeExecutionToolResult")
      if (anthropicTextEditorCodeExecutionToolResultMatches) add("AnthropicTextEditorCodeExecutionToolResult")
      if (anthropicToolSearchToolResultMatches) add("AnthropicToolSearchToolResult")
      if (anthropicContainerUploadMatches) add("AnthropicContainerUpload")
      if (anthropicCompactionBlockMatches) add("AnthropicCompactionBlock")
      if (anthropicAdvisorToolResultMatches) add("AnthropicAdvisorToolResult")
    }

  public val size: Int
    get() = names.size
}

private fun inspectOrAnthropicContentBlock(rawObject: JsonObject): OrAnthropicContentBlockInspection {
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicTextBlockTypeXbd960bad>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "text") && typeState13Decoded
  val citationsResult = rawObject["citations"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<AnthropicTextCitation>?>(element) } }
  val citations = citationsResult?.getOrNull()
  val citationsPresent = rawObject.containsKey("citations")
  val citationsDecoded = citationsResult?.isSuccess == true
  val textResult = rawObject["text"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val text = textResult?.getOrNull()
  val textDecoded = textResult?.isSuccess == true
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicTextBlockTypeXbd960bad>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "text") && typeState14Decoded
  val typeState21Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicToolUseBlockTypeX0d530418>(element) } }
  val typeState21 = typeState21Result?.getOrNull()
  val typeState21Decoded = typeState21Result?.isSuccess == true
  val typeState21Matches = (rawObject.stringValue("type") == "tool_use") && typeState21Decoded
  val callerResult = rawObject["caller"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicCaller>(element) } }
  val caller = callerResult?.getOrNull()
  val callerDecoded = callerResult?.isSuccess == true
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState22Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicToolUseBlockTypeX0d530418>(element) } }
  val typeState22 = typeState22Result?.getOrNull()
  val typeState22Decoded = typeState22Result?.isSuccess == true
  val typeState22Matches = (rawObject.stringValue("type") == "tool_use") && typeState22Decoded
  val typeState17Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicThinkingBlockTypeX4f592c6b>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = (rawObject.stringValue("type") == "thinking") && typeState17Decoded
  val signatureResult = rawObject["signature"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val signature = signatureResult?.getOrNull()
  val signatureDecoded = signatureResult?.isSuccess == true
  val thinkingResult = rawObject["thinking"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val thinking = thinkingResult?.getOrNull()
  val thinkingDecoded = thinkingResult?.isSuccess == true
  val typeState18Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicThinkingBlockTypeX4f592c6b>(element) } }
  val typeState18 = typeState18Result?.getOrNull()
  val typeState18Decoded = typeState18Result?.isSuccess == true
  val typeState18Matches = (rawObject.stringValue("type") == "thinking") && typeState18Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicRedactedThinkingBlockTypeX8930a877>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "redacted_thinking") && typeState11Decoded
  val dataResult = rawObject["data"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val data = dataResult?.getOrNull()
  val dataDecoded = dataResult?.isSuccess == true
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicRedactedThinkingBlockTypeX8930a877>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "redacted_thinking") && typeState12Decoded
  val typeState27Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOrAnthropicServerToolUseBlockTypeX72973005>(element) } }
  val typeState27 = typeState27Result?.getOrNull()
  val typeState27Decoded = typeState27Result?.isSuccess == true
  val typeState27Matches = (rawObject.stringValue("type") == "server_tool_use") && typeState27Decoded
  val typeState28Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOrAnthropicServerToolUseBlockTypeX72973005>(element) } }
  val typeState28 = typeState28Result?.getOrNull()
  val typeState28Decoded = typeState28Result?.isSuccess == true
  val typeState28Matches = (rawObject.stringValue("type") == "server_tool_use") && typeState28Decoded
  val typeState25Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicWebSearchToolResultTypeX0fb13727>(element) } }
  val typeState25 = typeState25Result?.getOrNull()
  val typeState25Decoded = typeState25Result?.isSuccess == true
  val typeState25Matches = (rawObject.stringValue("type") == "web_search_tool_result") && typeState25Decoded
  val contentState6Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicWebSearchToolResultContentX8bf35e95>(element) } }
  val contentState6 = contentState6Result?.getOrNull()
  val contentState6Decoded = contentState6Result?.isSuccess == true
  val toolUseIdResult = rawObject["tool_use_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val toolUseId = toolUseIdResult?.getOrNull()
  val toolUseIdDecoded = toolUseIdResult?.isSuccess == true
  val typeState26Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicWebSearchToolResultTypeX0fb13727>(element) } }
  val typeState26 = typeState26Result?.getOrNull()
  val typeState26Decoded = typeState26Result?.isSuccess == true
  val typeState26Matches = (rawObject.stringValue("type") == "web_search_tool_result") && typeState26Decoded
  val typeState23Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicWebFetchToolResultTypeX43274783>(element) } }
  val typeState23 = typeState23Result?.getOrNull()
  val typeState23Decoded = typeState23Result?.isSuccess == true
  val typeState23Matches = (rawObject.stringValue("type") == "web_fetch_tool_result") && typeState23Decoded
  val contentState5Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicWebFetchContent>(element) } }
  val contentState5 = contentState5Result?.getOrNull()
  val contentState5Decoded = contentState5Result?.isSuccess == true
  val typeState24Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicWebFetchToolResultTypeX43274783>(element) } }
  val typeState24 = typeState24Result?.getOrNull()
  val typeState24Decoded = typeState24Result?.isSuccess == true
  val typeState24Matches = (rawObject.stringValue("type") == "web_fetch_tool_result") && typeState24Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCodeExecutionToolResultTypeXa2888711>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "code_execution_tool_result") && typeState5Decoded
  val contentState2Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicCodeExecutionContent>(element) } }
  val contentState2 = contentState2Result?.getOrNull()
  val contentState2Decoded = contentState2Result?.isSuccess == true
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCodeExecutionToolResultTypeXa2888711>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "code_execution_tool_result") && typeState6Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "bash_code_execution_tool_result") && typeState3Decoded
  val contentState1Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicBashCodeExecutionContent>(element) } }
  val contentState1 = contentState1Result?.getOrNull()
  val contentState1Decoded = contentState1Result?.isSuccess == true
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "bash_code_execution_tool_result") && typeState4Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "text_editor_code_execution_tool_result") && typeState15Decoded
  val contentState3Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicTextEditorCodeExecutionContent>(element) } }
  val contentState3 = contentState3Result?.getOrNull()
  val contentState3Decoded = contentState3Result?.isSuccess == true
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "text_editor_code_execution_tool_result") && typeState16Decoded
  val typeState19Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicToolSearchToolResultTypeXa6009ee6>(element) } }
  val typeState19 = typeState19Result?.getOrNull()
  val typeState19Decoded = typeState19Result?.isSuccess == true
  val typeState19Matches = (rawObject.stringValue("type") == "tool_search_tool_result") && typeState19Decoded
  val contentState4Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<AnthropicToolSearchContent>(element) } }
  val contentState4 = contentState4Result?.getOrNull()
  val contentState4Decoded = contentState4Result?.isSuccess == true
  val typeState20Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicToolSearchToolResultTypeXa6009ee6>(element) } }
  val typeState20 = typeState20Result?.getOrNull()
  val typeState20Decoded = typeState20Result?.isSuccess == true
  val typeState20Matches = (rawObject.stringValue("type") == "tool_search_tool_result") && typeState20Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicContainerUploadTypeXb985c53e>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "container_upload") && typeState9Decoded
  val fileIdResult = rawObject["file_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val fileId = fileIdResult?.getOrNull()
  val fileIdDecoded = fileIdResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicContainerUploadTypeXb985c53e>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "container_upload") && typeState10Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCompactionBlockTypeX84665b30>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "compaction") && typeState7Decoded
  val contentState8Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val contentState8 = contentState8Result?.getOrNull()
  val contentState8Present = rawObject.containsKey("content")
  val contentState8Decoded = contentState8Result?.isSuccess == true
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicCompactionBlockTypeX84665b30>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "compaction") && typeState8Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicAdvisorToolResultTypeXe304c700>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "advisor_tool_result") && typeState1Decoded
  val contentState7Result = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Map<String, JsonElement?>>(element) } }
  val contentState7 = contentState7Result?.getOrNull()
  val contentState7Decoded = contentState7Result?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAnthropicAdvisorToolResultTypeXe304c700>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "advisor_tool_result") && typeState2Decoded
  val rawEmpty = rawObject.isEmpty()
  val anthropicTextBlockMatches = matchesOrAnthropicContentBlockAnthropicTextBlockBranch(rawObject) && (typeState13Matches)
  val anthropicToolUseBlockMatches = matchesOrAnthropicContentBlockAnthropicToolUseBlockBranch(rawObject) && (typeState21Matches)
  val anthropicThinkingBlockMatches = matchesOrAnthropicContentBlockAnthropicThinkingBlockBranch(rawObject) && (typeState17Matches)
  val anthropicRedactedThinkingBlockMatches = matchesOrAnthropicContentBlockAnthropicRedactedThinkingBlockBranch(rawObject) && (typeState11Matches)
  val orAnthropicServerToolUseBlockMatches = matchesOrAnthropicContentBlockOrAnthropicServerToolUseBlockBranch(rawObject) && (typeState27Matches)
  val anthropicWebSearchToolResultMatches = matchesOrAnthropicContentBlockAnthropicWebSearchToolResultBranch(rawObject) && (typeState25Matches)
  val anthropicWebFetchToolResultMatches = matchesOrAnthropicContentBlockAnthropicWebFetchToolResultBranch(rawObject) && (typeState23Matches)
  val anthropicCodeExecutionToolResultMatches = matchesOrAnthropicContentBlockAnthropicCodeExecutionToolResultBranch(rawObject) && (typeState5Matches)
  val anthropicBashCodeExecutionToolResultMatches = matchesOrAnthropicContentBlockAnthropicBashCodeExecutionToolResultBranch(rawObject) && (typeState3Matches)
  val anthropicTextEditorCodeExecutionToolResultMatches = matchesOrAnthropicContentBlockAnthropicTextEditorCodeExecutionToolResultBranch(rawObject) && (typeState15Matches)
  val anthropicToolSearchToolResultMatches = matchesOrAnthropicContentBlockAnthropicToolSearchToolResultBranch(rawObject) && (typeState19Matches)
  val anthropicContainerUploadMatches = matchesOrAnthropicContentBlockAnthropicContainerUploadBranch(rawObject) && (typeState9Matches)
  val anthropicCompactionBlockMatches = matchesOrAnthropicContentBlockAnthropicCompactionBlockBranch(rawObject) && (typeState7Matches)
  val anthropicAdvisorToolResultMatches = matchesOrAnthropicContentBlockAnthropicAdvisorToolResultBranch(rawObject) && (typeState1Matches)
  return OrAnthropicContentBlockInspection(
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    citations = citations,
    citationsPresent = citationsPresent,
    citationsDecoded = citationsDecoded,
    text = text,
    textDecoded = textDecoded,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState21 = typeState21,
    typeState21Decoded = typeState21Decoded,
    typeState21Matches = typeState21Matches,
    caller = caller,
    callerDecoded = callerDecoded,
    id = id,
    idDecoded = idDecoded,
    name = name,
    nameDecoded = nameDecoded,
    typeState22 = typeState22,
    typeState22Decoded = typeState22Decoded,
    typeState22Matches = typeState22Matches,
    typeState17 = typeState17,
    typeState17Decoded = typeState17Decoded,
    typeState17Matches = typeState17Matches,
    signature = signature,
    signatureDecoded = signatureDecoded,
    thinking = thinking,
    thinkingDecoded = thinkingDecoded,
    typeState18 = typeState18,
    typeState18Decoded = typeState18Decoded,
    typeState18Matches = typeState18Matches,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    data = data,
    dataDecoded = dataDecoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState27 = typeState27,
    typeState27Decoded = typeState27Decoded,
    typeState27Matches = typeState27Matches,
    typeState28 = typeState28,
    typeState28Decoded = typeState28Decoded,
    typeState28Matches = typeState28Matches,
    typeState25 = typeState25,
    typeState25Decoded = typeState25Decoded,
    typeState25Matches = typeState25Matches,
    contentState6 = contentState6,
    contentState6Decoded = contentState6Decoded,
    toolUseId = toolUseId,
    toolUseIdDecoded = toolUseIdDecoded,
    typeState26 = typeState26,
    typeState26Decoded = typeState26Decoded,
    typeState26Matches = typeState26Matches,
    typeState23 = typeState23,
    typeState23Decoded = typeState23Decoded,
    typeState23Matches = typeState23Matches,
    contentState5 = contentState5,
    contentState5Decoded = contentState5Decoded,
    typeState24 = typeState24,
    typeState24Decoded = typeState24Decoded,
    typeState24Matches = typeState24Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    contentState2 = contentState2,
    contentState2Decoded = contentState2Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    contentState1 = contentState1,
    contentState1Decoded = contentState1Decoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    contentState3 = contentState3,
    contentState3Decoded = contentState3Decoded,
    typeState16 = typeState16,
    typeState16Decoded = typeState16Decoded,
    typeState16Matches = typeState16Matches,
    typeState19 = typeState19,
    typeState19Decoded = typeState19Decoded,
    typeState19Matches = typeState19Matches,
    contentState4 = contentState4,
    contentState4Decoded = contentState4Decoded,
    typeState20 = typeState20,
    typeState20Decoded = typeState20Decoded,
    typeState20Matches = typeState20Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    fileId = fileId,
    fileIdDecoded = fileIdDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    contentState8 = contentState8,
    contentState8Present = contentState8Present,
    contentState8Decoded = contentState8Decoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    contentState7 = contentState7,
    contentState7Decoded = contentState7Decoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    anthropicTextBlockMatches = anthropicTextBlockMatches,
    anthropicToolUseBlockMatches = anthropicToolUseBlockMatches,
    anthropicThinkingBlockMatches = anthropicThinkingBlockMatches,
    anthropicRedactedThinkingBlockMatches = anthropicRedactedThinkingBlockMatches,
    orAnthropicServerToolUseBlockMatches = orAnthropicServerToolUseBlockMatches,
    anthropicWebSearchToolResultMatches = anthropicWebSearchToolResultMatches,
    anthropicWebFetchToolResultMatches = anthropicWebFetchToolResultMatches,
    anthropicCodeExecutionToolResultMatches = anthropicCodeExecutionToolResultMatches,
    anthropicBashCodeExecutionToolResultMatches = anthropicBashCodeExecutionToolResultMatches,
    anthropicTextEditorCodeExecutionToolResultMatches = anthropicTextEditorCodeExecutionToolResultMatches,
    anthropicToolSearchToolResultMatches = anthropicToolSearchToolResultMatches,
    anthropicContainerUploadMatches = anthropicContainerUploadMatches,
    anthropicCompactionBlockMatches = anthropicCompactionBlockMatches,
    anthropicAdvisorToolResultMatches = anthropicAdvisorToolResultMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!anthropicTextBlockMatches) add("AnthropicTextBlock: branch predicate did not match properties 'type'")
      if (!anthropicToolUseBlockMatches) add("AnthropicToolUseBlock: branch predicate did not match properties 'type'")
      if (!anthropicThinkingBlockMatches) add("AnthropicThinkingBlock: branch predicate did not match properties 'type'")
      if (!anthropicRedactedThinkingBlockMatches) add("AnthropicRedactedThinkingBlock: branch predicate did not match properties 'type'")
      if (!orAnthropicServerToolUseBlockMatches) add("OrAnthropicServerToolUseBlock: branch predicate did not match properties 'type'")
      if (!anthropicWebSearchToolResultMatches) add("AnthropicWebSearchToolResult: branch predicate did not match properties 'type'")
      if (!anthropicWebFetchToolResultMatches) add("AnthropicWebFetchToolResult: branch predicate did not match properties 'type'")
      if (!anthropicCodeExecutionToolResultMatches) add("AnthropicCodeExecutionToolResult: branch predicate did not match properties 'type'")
      if (!anthropicBashCodeExecutionToolResultMatches) add("AnthropicBashCodeExecutionToolResult: branch predicate did not match properties 'type'")
      if (!anthropicTextEditorCodeExecutionToolResultMatches) add("AnthropicTextEditorCodeExecutionToolResult: branch predicate did not match properties 'type'")
      if (!anthropicToolSearchToolResultMatches) add("AnthropicToolSearchToolResult: branch predicate did not match properties 'type'")
      if (!anthropicContainerUploadMatches) add("AnthropicContainerUpload: branch predicate did not match properties 'type'")
      if (!anthropicCompactionBlockMatches) add("AnthropicCompactionBlock: branch predicate did not match properties 'type'")
      if (!anthropicAdvisorToolResultMatches) add("AnthropicAdvisorToolResult: branch predicate did not match properties 'type'")
    },
  )
}

private fun matchesOrAnthropicContentBlockAnthropicTextBlockBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicToolUseBlockBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicThinkingBlockBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("signature") && rawObject.containsKey("thinking") && rawObject.containsKey("type") && (rawObject["signature"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["thinking"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"thinking\"")))) } ?: true)))

private fun matchesOrAnthropicContentBlockAnthropicRedactedThinkingBlockBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("data") && rawObject.containsKey("type") && (rawObject["data"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"redacted_thinking\"")))) } ?: true)))

private fun matchesOrAnthropicContentBlockOrAnthropicServerToolUseBlockBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicWebSearchToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicWebFetchToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicCodeExecutionToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicBashCodeExecutionToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicTextEditorCodeExecutionToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicToolSearchToolResultBranch(rawObject: JsonObject): Boolean = true

private fun matchesOrAnthropicContentBlockAnthropicContainerUploadBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("file_id") && rawObject.containsKey("type") && (rawObject["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"container_upload\"")))) } ?: true)))

private fun matchesOrAnthropicContentBlockAnthropicCompactionBlockBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content") && rawObject.containsKey("type") && (rawObject["content"]?.let { property -> (property is JsonPrimitive && property.isString || property is JsonNull) } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"compaction\"")))) } ?: true)))

private fun matchesOrAnthropicContentBlockAnthropicAdvisorToolResultBranch(rawObject: JsonObject): Boolean = ((rawObject.containsKey("content") && rawObject.containsKey("tool_use_id") && rawObject.containsKey("type") && (rawObject["content"]?.let { property -> (property is JsonObject && (property.all { (name, value) -> name in setOf<String>() || true })) } ?: true) && (rawObject["tool_use_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && (rawObject["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"advisor_tool_result\"")))) } ?: true)))

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
