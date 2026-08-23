package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Pair
import kotlin.String
import kotlin.collections.List
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

public sealed class OutputItemsDecodingException(
  message: String,
) : SerializationException(message)

public class OutputItemsNoMatchException(
  message: String,
) : OutputItemsDecodingException(message)

public class OutputItemsAmbiguityException(
  message: String,
) : OutputItemsDecodingException(message)

public class OutputItemsBranchValidationException(
  message: String,
) : OutputItemsDecodingException(message)

/**
 * An output item from the response
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItems
 */
@Serializable(with = OutputItemsSerializer::class)
public sealed interface OutputItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class OutputMessageItem internal constructor(
    content: List<InlineOutputMessageContentItemX9f591485>,
    public val id: String,
    public val role: InlineOutputMessageRoleXe91a3401,
    public val type: InlineOutputMessageTypeXba66a1d6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val content: List<InlineOutputMessageContentItemX9f591485> = content.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        content: List<InlineOutputMessageContentItemX9f591485>,
        id: String,
        role: InlineOutputMessageRoleXe91a3401,
        type: InlineOutputMessageTypeXba66a1d6,
      ): OutputMessageItem {
        val contentOwnershipSnapshot = content.toList()
        val raw = buildJsonObject {
          put("content", SdkJson.encodeToJsonElement(contentOwnershipSnapshot))
          put("id", id)
          put("role", SdkJson.encodeToJsonElement(role))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputMessageItemMatches) {
          throw OutputItemsBranchValidationException("OutputMessageItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputMessageItem(
          content = contentOwnershipSnapshot,
          id = id,
          role = role,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputReasoningItem internal constructor(
    public val id: String,
    summary: List<ReasoningSummaryText>,
    public val type: InlineOutputItemReasoningTypeX9f535a4f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val summary: List<ReasoningSummaryText> = summary.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        summary: List<ReasoningSummaryText>,
        type: InlineOutputItemReasoningTypeX9f535a4f,
      ): OutputReasoningItem {
        val summaryOwnershipSnapshot = summary.toList()
        val raw = buildJsonObject {
          put("id", id)
          put("summary", SdkJson.encodeToJsonElement(summaryOwnershipSnapshot))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputReasoningItemMatches) {
          throw OutputItemsBranchValidationException("OutputReasoningItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputReasoningItem(
          id = id,
          summary = summaryOwnershipSnapshot,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputFunctionCallItem internal constructor(
    public val arguments: String,
    public val callId: String,
    public val name: String,
    public val type: InlineOutputItemFunctionCallTypeX494d8eba,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        arguments: String,
        callId: String,
        name: String,
        type: InlineOutputItemFunctionCallTypeX494d8eba,
      ): OutputFunctionCallItem {
        val raw = buildJsonObject {
          put("arguments", arguments)
          put("call_id", callId)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputFunctionCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputFunctionCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputFunctionCallItem(
          arguments = arguments,
          callId = callId,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputWebSearchCallItem internal constructor(
    public val id: String,
    public val status: WebSearchStatus,
    public val type: InlineOutputItemWebSearchCallTypeX70b2c197,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: WebSearchStatus,
        type: InlineOutputItemWebSearchCallTypeX70b2c197,
      ): OutputWebSearchCallItem {
        val raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputWebSearchCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputWebSearchCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputWebSearchCallItem(
          id = id,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputFileSearchCallItem internal constructor(
    public val id: String,
    queries: List<String>,
    public val status: WebSearchStatus,
    public val type: InlineOutputItemFileSearchCallTypeX69a7137a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val queries: List<String> = queries.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        queries: List<String>,
        status: WebSearchStatus,
        type: InlineOutputItemFileSearchCallTypeX69a7137a,
      ): OutputFileSearchCallItem {
        val queriesOwnershipSnapshot = queries.toList()
        val raw = buildJsonObject {
          put("id", id)
          put("queries", SdkJson.encodeToJsonElement(queriesOwnershipSnapshot))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputFileSearchCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputFileSearchCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputFileSearchCallItem(
          id = id,
          queries = queriesOwnershipSnapshot,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputImageGenerationCallItem internal constructor(
    public val id: String,
    public val status: ImageGenerationStatus,
    public val type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        id: String,
        status: ImageGenerationStatus,
        type: InlineOutputItemImageGenerationCallTypeX8aee14b8,
      ): OutputImageGenerationCallItem {
        val raw = buildJsonObject {
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputImageGenerationCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputImageGenerationCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputImageGenerationCallItem(
          id = id,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputCodeInterpreterCallItem internal constructor(
    public val code: String?,
    public val containerId: String,
    public val id: String,
    outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?,
    public val status: ToolCallStatus,
    public val type: InlineCodeInterpreterCallItemTypeXbc02d595,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>? =
        outputs?.let { collection0 -> collection0.toList() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        code: String?,
        containerId: String,
        id: String,
        outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?,
        status: ToolCallStatus,
        type: InlineCodeInterpreterCallItemTypeXbc02d595,
      ): OutputCodeInterpreterCallItem {
        val outputsOwnershipSnapshot = outputs?.let { collection0 -> collection0.toList() }
        val raw = buildJsonObject {
          put("code", code)
          put("container_id", containerId)
          put("id", id)
          put("outputs", SdkJson.encodeToJsonElement(outputsOwnershipSnapshot))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputCodeInterpreterCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputCodeInterpreterCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputCodeInterpreterCallItem(
          code = code,
          containerId = containerId,
          id = id,
          outputs = outputsOwnershipSnapshot,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputComputerCallItem internal constructor(
    public val callId: String,
    pendingSafetyChecks: List<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182>,
    public val status: InlineOutputComputerCallItemStatusX68983861,
    public val type: InlineOutputComputerCallItemTypeX57b5ed31,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val pendingSafetyChecks:
        List<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182> =
        pendingSafetyChecks.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        pendingSafetyChecks: List<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182>,
        status: InlineOutputComputerCallItemStatusX68983861,
        type: InlineOutputComputerCallItemTypeX57b5ed31,
      ): OutputComputerCallItem {
        val pendingSafetyChecksOwnershipSnapshot = pendingSafetyChecks.toList()
        val raw = buildJsonObject {
          put("call_id", callId)
          put("pending_safety_checks", SdkJson.encodeToJsonElement(pendingSafetyChecksOwnershipSnapshot))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputComputerCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputComputerCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputComputerCallItem(
          callId = callId,
          pendingSafetyChecks = pendingSafetyChecksOwnershipSnapshot,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputDatetimeItem internal constructor(
    public val datetime: String,
    public val status: ToolCallStatus,
    public val timezone: String,
    public val type: InlineOutputDatetimeItemTypeXb3ed5cc0,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        datetime: String,
        status: ToolCallStatus,
        timezone: String,
        type: InlineOutputDatetimeItemTypeXb3ed5cc0,
      ): OutputDatetimeItem {
        val raw = buildJsonObject {
          put("datetime", datetime)
          put("status", SdkJson.encodeToJsonElement(status))
          put("timezone", timezone)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputDatetimeItemMatches) {
          throw OutputItemsBranchValidationException("OutputDatetimeItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputDatetimeItem(
          datetime = datetime,
          status = status,
          timezone = timezone,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputWebSearchServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputWebSearchServerToolItemTypeX86ed43d9,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputWebSearchServerToolItemTypeX86ed43d9): OutputWebSearchServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputWebSearchServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputWebSearchServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputWebSearchServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputCodeInterpreterServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputCodeInterpreterServerToolItemTypeX7279e892,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputCodeInterpreterServerToolItemTypeX7279e892): OutputCodeInterpreterServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputCodeInterpreterServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputCodeInterpreterServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputCodeInterpreterServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputFileSearchServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputFileSearchServerToolItemTypeX848145bc,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputFileSearchServerToolItemTypeX848145bc): OutputFileSearchServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputFileSearchServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputFileSearchServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputFileSearchServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputImageGenerationServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputImageGenerationServerToolItemTypeX7367c8be,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputImageGenerationServerToolItemTypeX7367c8be): OutputImageGenerationServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputImageGenerationServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputImageGenerationServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputImageGenerationServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputBrowserUseServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputBrowserUseServerToolItemTypeX96bf58e6,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputBrowserUseServerToolItemTypeX96bf58e6): OutputBrowserUseServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputBrowserUseServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputBrowserUseServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputBrowserUseServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputBashServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputBashServerToolItemTypeXc097682a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputBashServerToolItemTypeXc097682a): OutputBashServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputBashServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputBashServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputBashServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputTextEditorServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputTextEditorServerToolItemTypeXdeead8d2,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputTextEditorServerToolItemTypeXdeead8d2): OutputTextEditorServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputTextEditorServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputTextEditorServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputTextEditorServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputApplyPatchServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputApplyPatchServerToolItemTypeX816f4f63,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputApplyPatchServerToolItemTypeX816f4f63): OutputApplyPatchServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputApplyPatchServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputApplyPatchServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputApplyPatchServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputApplyPatchCallItem internal constructor(
    public val callId: String,
    public val id: String,
    public val operation: ApplyPatchCallOperation,
    public val status: ApplyPatchCallStatus,
    public val type: InlineOutputApplyPatchCallItemTypeX5efc0c7d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        id: String,
        operation: ApplyPatchCallOperation,
        status: ApplyPatchCallStatus,
        type: InlineOutputApplyPatchCallItemTypeX5efc0c7d,
      ): OutputApplyPatchCallItem {
        val raw = buildJsonObject {
          put("call_id", callId)
          put("id", id)
          put("operation", SdkJson.encodeToJsonElement(operation))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputApplyPatchCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputApplyPatchCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputApplyPatchCallItem(
          callId = callId,
          id = id,
          operation = operation,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputShellCallItem internal constructor(
    public val callId: String,
    public val id: String,
    public val status: ShellCallStatus,
    public val type: InlineOutputShellCallItemTypeX8d274ede,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        id: String,
        status: ShellCallStatus,
        type: InlineOutputShellCallItemTypeX8d274ede,
      ): OutputShellCallItem {
        val raw = buildJsonObject {
          put("call_id", callId)
          put("id", id)
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputShellCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputShellCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputShellCallItem(
          callId = callId,
          id = id,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputShellCallOutputItem internal constructor(
    public val callId: String,
    public val id: String,
    output: List<InlineOutputShellCallOutputItemOutputItemX141fabad>,
    public val status: ShellCallStatus,
    public val type: InlineOutputShellCallOutputItemTypeX953b8882,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public val output: List<InlineOutputShellCallOutputItemOutputItemX141fabad> = output.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        id: String,
        output: List<InlineOutputShellCallOutputItemOutputItemX141fabad>,
        status: ShellCallStatus,
        type: InlineOutputShellCallOutputItemTypeX953b8882,
      ): OutputShellCallOutputItem {
        val outputOwnershipSnapshot = output.toList()
        val raw = buildJsonObject {
          put("call_id", callId)
          put("id", id)
          put("output", SdkJson.encodeToJsonElement(outputOwnershipSnapshot))
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputShellCallOutputItemMatches) {
          throw OutputItemsBranchValidationException("OutputShellCallOutputItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputShellCallOutputItem(
          callId = callId,
          id = id,
          output = outputOwnershipSnapshot,
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputWebFetchServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputWebFetchServerToolItemTypeXad27afcc,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputWebFetchServerToolItemTypeXad27afcc): OutputWebFetchServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputWebFetchServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputWebFetchServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputWebFetchServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputToolSearchServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputToolSearchServerToolItemTypeX5470ace1,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputToolSearchServerToolItemTypeX5470ace1): OutputToolSearchServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputToolSearchServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputToolSearchServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputToolSearchServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputMemoryServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputMemoryServerToolItemTypeX145b938f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputMemoryServerToolItemTypeX145b938f): OutputMemoryServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputMemoryServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputMemoryServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputMemoryServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputMcpServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputMcpServerToolItemTypeX4ef5a034,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputMcpServerToolItemTypeX4ef5a034): OutputMcpServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputMcpServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputMcpServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputMcpServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputSearchModelsServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputSearchModelsServerToolItemTypeX99374856,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputSearchModelsServerToolItemTypeX99374856): OutputSearchModelsServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputSearchModelsServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputSearchModelsServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputSearchModelsServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputFusionServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputFusionServerToolItemTypeX66d6265a,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputFusionServerToolItemTypeX66d6265a): OutputFusionServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputFusionServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputFusionServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputFusionServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputAdvisorServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputAdvisorServerToolItemTypeX996c03cf,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputAdvisorServerToolItemTypeX996c03cf): OutputAdvisorServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputAdvisorServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputAdvisorServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputAdvisorServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputSubagentServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputSubagentServerToolItemTypeXf7a3e6e2,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputSubagentServerToolItemTypeXf7a3e6e2): OutputSubagentServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputSubagentServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputSubagentServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputSubagentServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputFilesServerToolItem internal constructor(
    public val status: ToolCallStatus,
    public val type: InlineOutputFilesServerToolItemTypeX5fc5dc4b,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(status: ToolCallStatus, type: InlineOutputFilesServerToolItemTypeX5fc5dc4b): OutputFilesServerToolItem {
        val raw = buildJsonObject {
          put("status", SdkJson.encodeToJsonElement(status))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputFilesServerToolItemMatches) {
          throw OutputItemsBranchValidationException("OutputFilesServerToolItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputFilesServerToolItem(
          status = status,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class OutputCustomToolCallItem internal constructor(
    public val callId: String,
    public val input: String,
    public val name: String,
    public val type: InlineOutputCustomToolCallItemTypeX6abf3792,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : OutputItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        callId: String,
        input: String,
        name: String,
        type: InlineOutputCustomToolCallItemTypeX6abf3792,
      ): OutputCustomToolCallItem {
        val raw = buildJsonObject {
          put("call_id", callId)
          put("input", input)
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectOutputItems(raw)
        if (inspection.size == 0) {
          throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.outputCustomToolCallItemMatches) {
          throw OutputItemsBranchValidationException("OutputCustomToolCallItem factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw OutputItemsAmbiguityException("OutputItems matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return OutputCustomToolCallItem(
          callId = callId,
          input = input,
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object OutputItemsSerializer : KSerializer<OutputItems> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): OutputItems {
    val jsonDecoder = decoder.requireJsonDecoder("OutputItems")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw OutputItemsNoMatchException("OutputItems matched 0 branches: expected JSON object")
    val matches = inspectOutputItems(rawObject)
    if (matches.size == 0) {
      throw OutputItemsNoMatchException("OutputItems matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw OutputItemsAmbiguityException("OutputItems matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.outputMessageItemMatches -> OutputItems.OutputMessageItem(content = requireNotNull(matches.content), id = requireNotNull(matches.id), role = requireNotNull(matches.role), type = requireNotNull(matches.typeState43), raw = rawObject)
      matches.outputReasoningItemMatches -> OutputItems.OutputReasoningItem(id = requireNotNull(matches.id), summary = requireNotNull(matches.summary), type = requireNotNull(matches.typeState35), raw = rawObject)
      matches.outputFunctionCallItemMatches -> OutputItems.OutputFunctionCallItem(arguments = requireNotNull(matches.arguments), callId = requireNotNull(matches.callId), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState31), raw = rawObject)
      matches.outputWebSearchCallItemMatches -> OutputItems.OutputWebSearchCallItem(id = requireNotNull(matches.id), status = requireNotNull(matches.statusState6), type = requireNotNull(matches.typeState37), raw = rawObject)
      matches.outputFileSearchCallItemMatches -> OutputItems.OutputFileSearchCallItem(id = requireNotNull(matches.id), queries = requireNotNull(matches.queries), status = requireNotNull(matches.statusState6), type = requireNotNull(matches.typeState29), raw = rawObject)
      matches.outputImageGenerationCallItemMatches -> OutputItems.OutputImageGenerationCallItem(id = requireNotNull(matches.id), status = requireNotNull(matches.statusState2), type = requireNotNull(matches.typeState33), raw = rawObject)
      matches.outputCodeInterpreterCallItemMatches -> OutputItems.OutputCodeInterpreterCallItem(code = matches.code, containerId = requireNotNull(matches.containerId), id = requireNotNull(matches.id), outputs = matches.outputs, status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.outputComputerCallItemMatches -> OutputItems.OutputComputerCallItem(callId = requireNotNull(matches.callId), pendingSafetyChecks = requireNotNull(matches.pendingSafetyChecks), status = requireNotNull(matches.statusState3), type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.outputDatetimeItemMatches -> OutputItems.OutputDatetimeItem(datetime = requireNotNull(matches.datetime), status = requireNotNull(matches.statusState5), timezone = requireNotNull(matches.timezone), type = requireNotNull(matches.typeState19), raw = rawObject)
      matches.outputWebSearchServerToolItemMatches -> OutputItems.OutputWebSearchServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState59), raw = rawObject)
      matches.outputCodeInterpreterServerToolItemMatches -> OutputItems.OutputCodeInterpreterServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.outputFileSearchServerToolItemMatches -> OutputItems.OutputFileSearchServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState21), raw = rawObject)
      matches.outputImageGenerationServerToolItemMatches -> OutputItems.OutputImageGenerationServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState27), raw = rawObject)
      matches.outputBrowserUseServerToolItemMatches -> OutputItems.OutputBrowserUseServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState11), raw = rawObject)
      matches.outputBashServerToolItemMatches -> OutputItems.OutputBashServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.outputTextEditorServerToolItemMatches -> OutputItems.OutputTextEditorServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState53), raw = rawObject)
      matches.outputApplyPatchServerToolItemMatches -> OutputItems.OutputApplyPatchServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.outputApplyPatchCallItemMatches -> OutputItems.OutputApplyPatchCallItem(callId = requireNotNull(matches.callId), id = requireNotNull(matches.id), operation = requireNotNull(matches.operation), status = requireNotNull(matches.statusState1), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.outputShellCallItemMatches -> OutputItems.OutputShellCallItem(callId = requireNotNull(matches.callId), id = requireNotNull(matches.id), status = requireNotNull(matches.statusState4), type = requireNotNull(matches.typeState47), raw = rawObject)
      matches.outputShellCallOutputItemMatches -> OutputItems.OutputShellCallOutputItem(callId = requireNotNull(matches.callId), id = requireNotNull(matches.id), output = requireNotNull(matches.output), status = requireNotNull(matches.statusState4), type = requireNotNull(matches.typeState49), raw = rawObject)
      matches.outputWebFetchServerToolItemMatches -> OutputItems.OutputWebFetchServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState57), raw = rawObject)
      matches.outputToolSearchServerToolItemMatches -> OutputItems.OutputToolSearchServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState55), raw = rawObject)
      matches.outputMemoryServerToolItemMatches -> OutputItems.OutputMemoryServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState41), raw = rawObject)
      matches.outputMcpServerToolItemMatches -> OutputItems.OutputMcpServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState39), raw = rawObject)
      matches.outputSearchModelsServerToolItemMatches -> OutputItems.OutputSearchModelsServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState45), raw = rawObject)
      matches.outputFusionServerToolItemMatches -> OutputItems.OutputFusionServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState25), raw = rawObject)
      matches.outputAdvisorServerToolItemMatches -> OutputItems.OutputAdvisorServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.outputSubagentServerToolItemMatches -> OutputItems.OutputSubagentServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState51), raw = rawObject)
      matches.outputFilesServerToolItemMatches -> OutputItems.OutputFilesServerToolItem(status = requireNotNull(matches.statusState5), type = requireNotNull(matches.typeState23), raw = rawObject)
      matches.outputCustomToolCallItemMatches -> OutputItems.OutputCustomToolCallItem(callId = requireNotNull(matches.callId), input = requireNotNull(matches.input), name = requireNotNull(matches.name), type = requireNotNull(matches.typeState17), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: OutputItems) {
    encoder.requireJsonEncoder("OutputItems").encodeJsonElement(value.raw)
  }
}

internal class OutputItemsInspection {
  internal var typeState43: InlineOutputMessageTypeXba66a1d6? = null

  internal var typeState43Decoded: Boolean = false

  internal var typeState43Matches: Boolean = false

  internal var content: List<InlineOutputMessageContentItemX9f591485>? = null

  internal var contentDecoded: Boolean = false

  internal var id: String? = null

  internal var idDecoded: Boolean = false

  internal var role: InlineOutputMessageRoleXe91a3401? = null

  internal var roleDecoded: Boolean = false

  internal var roleMatches: Boolean = false

  internal var typeState44: InlineOutputMessageTypeXba66a1d6? = null

  internal var typeState44Decoded: Boolean = false

  internal var typeState44Matches: Boolean = false

  internal var typeState35: InlineOutputItemReasoningTypeX9f535a4f? = null

  internal var typeState35Decoded: Boolean = false

  internal var typeState35Matches: Boolean = false

  internal var summary: List<ReasoningSummaryText>? = null

  internal var summaryDecoded: Boolean = false

  internal var typeState36: InlineOutputItemReasoningTypeX9f535a4f? = null

  internal var typeState36Decoded: Boolean = false

  internal var typeState36Matches: Boolean = false

  internal var typeState31: InlineOutputItemFunctionCallTypeX494d8eba? = null

  internal var typeState31Decoded: Boolean = false

  internal var typeState31Matches: Boolean = false

  internal var arguments: String? = null

  internal var argumentsDecoded: Boolean = false

  internal var callId: String? = null

  internal var callIdDecoded: Boolean = false

  internal var name: String? = null

  internal var nameDecoded: Boolean = false

  internal var typeState32: InlineOutputItemFunctionCallTypeX494d8eba? = null

  internal var typeState32Decoded: Boolean = false

  internal var typeState32Matches: Boolean = false

  internal var typeState37: InlineOutputItemWebSearchCallTypeX70b2c197? = null

  internal var typeState37Decoded: Boolean = false

  internal var typeState37Matches: Boolean = false

  internal var statusState6: WebSearchStatus? = null

  internal var statusState6Decoded: Boolean = false

  internal var statusState6Matches: Boolean = false

  internal var typeState38: InlineOutputItemWebSearchCallTypeX70b2c197? = null

  internal var typeState38Decoded: Boolean = false

  internal var typeState38Matches: Boolean = false

  internal var typeState29: InlineOutputItemFileSearchCallTypeX69a7137a? = null

  internal var typeState29Decoded: Boolean = false

  internal var typeState29Matches: Boolean = false

  internal var queries: List<String>? = null

  internal var queriesDecoded: Boolean = false

  internal var typeState30: InlineOutputItemFileSearchCallTypeX69a7137a? = null

  internal var typeState30Decoded: Boolean = false

  internal var typeState30Matches: Boolean = false

  internal var typeState33: InlineOutputItemImageGenerationCallTypeX8aee14b8? = null

  internal var typeState33Decoded: Boolean = false

  internal var typeState33Matches: Boolean = false

  internal var statusState2: ImageGenerationStatus? = null

  internal var statusState2Decoded: Boolean = false

  internal var statusState2Matches: Boolean = false

  internal var typeState34: InlineOutputItemImageGenerationCallTypeX8aee14b8? = null

  internal var typeState34Decoded: Boolean = false

  internal var typeState34Matches: Boolean = false

  internal var typeState1: InlineCodeInterpreterCallItemTypeXbc02d595? = null

  internal var typeState1Decoded: Boolean = false

  internal var typeState1Matches: Boolean = false

  internal var code: String? = null

  internal var codePresent: Boolean = false

  internal var codeDecoded: Boolean = false

  internal var containerId: String? = null

  internal var containerIdDecoded: Boolean = false

  internal var outputs: List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>? = null

  internal var outputsPresent: Boolean = false

  internal var outputsDecoded: Boolean = false

  internal var statusState5: ToolCallStatus? = null

  internal var statusState5Decoded: Boolean = false

  internal var statusState5Matches: Boolean = false

  internal var typeState2: InlineCodeInterpreterCallItemTypeXbc02d595? = null

  internal var typeState2Decoded: Boolean = false

  internal var typeState2Matches: Boolean = false

  internal var typeState15: InlineOutputComputerCallItemTypeX57b5ed31? = null

  internal var typeState15Decoded: Boolean = false

  internal var typeState15Matches: Boolean = false

  internal var pendingSafetyChecks:
      List<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182>? = null

  internal var pendingSafetyChecksDecoded: Boolean = false

  internal var statusState3: InlineOutputComputerCallItemStatusX68983861? = null

  internal var statusState3Decoded: Boolean = false

  internal var statusState3Matches: Boolean = false

  internal var typeState16: InlineOutputComputerCallItemTypeX57b5ed31? = null

  internal var typeState16Decoded: Boolean = false

  internal var typeState16Matches: Boolean = false

  internal var typeState19: InlineOutputDatetimeItemTypeXb3ed5cc0? = null

  internal var typeState19Decoded: Boolean = false

  internal var typeState19Matches: Boolean = false

  internal var datetime: String? = null

  internal var datetimeDecoded: Boolean = false

  internal var timezone: String? = null

  internal var timezoneDecoded: Boolean = false

  internal var typeState20: InlineOutputDatetimeItemTypeXb3ed5cc0? = null

  internal var typeState20Decoded: Boolean = false

  internal var typeState20Matches: Boolean = false

  internal var typeState59: InlineOutputWebSearchServerToolItemTypeX86ed43d9? = null

  internal var typeState59Decoded: Boolean = false

  internal var typeState59Matches: Boolean = false

  internal var typeState60: InlineOutputWebSearchServerToolItemTypeX86ed43d9? = null

  internal var typeState60Decoded: Boolean = false

  internal var typeState60Matches: Boolean = false

  internal var typeState13: InlineOutputCodeInterpreterServerToolItemTypeX7279e892? = null

  internal var typeState13Decoded: Boolean = false

  internal var typeState13Matches: Boolean = false

  internal var typeState14: InlineOutputCodeInterpreterServerToolItemTypeX7279e892? = null

  internal var typeState14Decoded: Boolean = false

  internal var typeState14Matches: Boolean = false

  internal var typeState21: InlineOutputFileSearchServerToolItemTypeX848145bc? = null

  internal var typeState21Decoded: Boolean = false

  internal var typeState21Matches: Boolean = false

  internal var typeState22: InlineOutputFileSearchServerToolItemTypeX848145bc? = null

  internal var typeState22Decoded: Boolean = false

  internal var typeState22Matches: Boolean = false

  internal var typeState27: InlineOutputImageGenerationServerToolItemTypeX7367c8be? = null

  internal var typeState27Decoded: Boolean = false

  internal var typeState27Matches: Boolean = false

  internal var typeState28: InlineOutputImageGenerationServerToolItemTypeX7367c8be? = null

  internal var typeState28Decoded: Boolean = false

  internal var typeState28Matches: Boolean = false

  internal var typeState11: InlineOutputBrowserUseServerToolItemTypeX96bf58e6? = null

  internal var typeState11Decoded: Boolean = false

  internal var typeState11Matches: Boolean = false

  internal var typeState12: InlineOutputBrowserUseServerToolItemTypeX96bf58e6? = null

  internal var typeState12Decoded: Boolean = false

  internal var typeState12Matches: Boolean = false

  internal var typeState9: InlineOutputBashServerToolItemTypeXc097682a? = null

  internal var typeState9Decoded: Boolean = false

  internal var typeState9Matches: Boolean = false

  internal var typeState10: InlineOutputBashServerToolItemTypeXc097682a? = null

  internal var typeState10Decoded: Boolean = false

  internal var typeState10Matches: Boolean = false

  internal var typeState53: InlineOutputTextEditorServerToolItemTypeXdeead8d2? = null

  internal var typeState53Decoded: Boolean = false

  internal var typeState53Matches: Boolean = false

  internal var typeState54: InlineOutputTextEditorServerToolItemTypeXdeead8d2? = null

  internal var typeState54Decoded: Boolean = false

  internal var typeState54Matches: Boolean = false

  internal var typeState7: InlineOutputApplyPatchServerToolItemTypeX816f4f63? = null

  internal var typeState7Decoded: Boolean = false

  internal var typeState7Matches: Boolean = false

  internal var typeState8: InlineOutputApplyPatchServerToolItemTypeX816f4f63? = null

  internal var typeState8Decoded: Boolean = false

  internal var typeState8Matches: Boolean = false

  internal var typeState5: InlineOutputApplyPatchCallItemTypeX5efc0c7d? = null

  internal var typeState5Decoded: Boolean = false

  internal var typeState5Matches: Boolean = false

  internal var operation: ApplyPatchCallOperation? = null

  internal var operationDecoded: Boolean = false

  internal var statusState1: ApplyPatchCallStatus? = null

  internal var statusState1Decoded: Boolean = false

  internal var statusState1Matches: Boolean = false

  internal var typeState6: InlineOutputApplyPatchCallItemTypeX5efc0c7d? = null

  internal var typeState6Decoded: Boolean = false

  internal var typeState6Matches: Boolean = false

  internal var typeState47: InlineOutputShellCallItemTypeX8d274ede? = null

  internal var typeState47Decoded: Boolean = false

  internal var typeState47Matches: Boolean = false

  internal var statusState4: ShellCallStatus? = null

  internal var statusState4Decoded: Boolean = false

  internal var statusState4Matches: Boolean = false

  internal var typeState48: InlineOutputShellCallItemTypeX8d274ede? = null

  internal var typeState48Decoded: Boolean = false

  internal var typeState48Matches: Boolean = false

  internal var typeState49: InlineOutputShellCallOutputItemTypeX953b8882? = null

  internal var typeState49Decoded: Boolean = false

  internal var typeState49Matches: Boolean = false

  internal var output: List<InlineOutputShellCallOutputItemOutputItemX141fabad>? = null

  internal var outputDecoded: Boolean = false

  internal var typeState50: InlineOutputShellCallOutputItemTypeX953b8882? = null

  internal var typeState50Decoded: Boolean = false

  internal var typeState50Matches: Boolean = false

  internal var typeState57: InlineOutputWebFetchServerToolItemTypeXad27afcc? = null

  internal var typeState57Decoded: Boolean = false

  internal var typeState57Matches: Boolean = false

  internal var typeState58: InlineOutputWebFetchServerToolItemTypeXad27afcc? = null

  internal var typeState58Decoded: Boolean = false

  internal var typeState58Matches: Boolean = false

  internal var typeState55: InlineOutputToolSearchServerToolItemTypeX5470ace1? = null

  internal var typeState55Decoded: Boolean = false

  internal var typeState55Matches: Boolean = false

  internal var typeState56: InlineOutputToolSearchServerToolItemTypeX5470ace1? = null

  internal var typeState56Decoded: Boolean = false

  internal var typeState56Matches: Boolean = false

  internal var typeState41: InlineOutputMemoryServerToolItemTypeX145b938f? = null

  internal var typeState41Decoded: Boolean = false

  internal var typeState41Matches: Boolean = false

  internal var typeState42: InlineOutputMemoryServerToolItemTypeX145b938f? = null

  internal var typeState42Decoded: Boolean = false

  internal var typeState42Matches: Boolean = false

  internal var typeState39: InlineOutputMcpServerToolItemTypeX4ef5a034? = null

  internal var typeState39Decoded: Boolean = false

  internal var typeState39Matches: Boolean = false

  internal var typeState40: InlineOutputMcpServerToolItemTypeX4ef5a034? = null

  internal var typeState40Decoded: Boolean = false

  internal var typeState40Matches: Boolean = false

  internal var typeState45: InlineOutputSearchModelsServerToolItemTypeX99374856? = null

  internal var typeState45Decoded: Boolean = false

  internal var typeState45Matches: Boolean = false

  internal var typeState46: InlineOutputSearchModelsServerToolItemTypeX99374856? = null

  internal var typeState46Decoded: Boolean = false

  internal var typeState46Matches: Boolean = false

  internal var typeState25: InlineOutputFusionServerToolItemTypeX66d6265a? = null

  internal var typeState25Decoded: Boolean = false

  internal var typeState25Matches: Boolean = false

  internal var typeState26: InlineOutputFusionServerToolItemTypeX66d6265a? = null

  internal var typeState26Decoded: Boolean = false

  internal var typeState26Matches: Boolean = false

  internal var typeState3: InlineOutputAdvisorServerToolItemTypeX996c03cf? = null

  internal var typeState3Decoded: Boolean = false

  internal var typeState3Matches: Boolean = false

  internal var typeState4: InlineOutputAdvisorServerToolItemTypeX996c03cf? = null

  internal var typeState4Decoded: Boolean = false

  internal var typeState4Matches: Boolean = false

  internal var typeState51: InlineOutputSubagentServerToolItemTypeXf7a3e6e2? = null

  internal var typeState51Decoded: Boolean = false

  internal var typeState51Matches: Boolean = false

  internal var typeState52: InlineOutputSubagentServerToolItemTypeXf7a3e6e2? = null

  internal var typeState52Decoded: Boolean = false

  internal var typeState52Matches: Boolean = false

  internal var typeState23: InlineOutputFilesServerToolItemTypeX5fc5dc4b? = null

  internal var typeState23Decoded: Boolean = false

  internal var typeState23Matches: Boolean = false

  internal var typeState24: InlineOutputFilesServerToolItemTypeX5fc5dc4b? = null

  internal var typeState24Decoded: Boolean = false

  internal var typeState24Matches: Boolean = false

  internal var typeState17: InlineOutputCustomToolCallItemTypeX6abf3792? = null

  internal var typeState17Decoded: Boolean = false

  internal var typeState17Matches: Boolean = false

  internal var input: String? = null

  internal var inputDecoded: Boolean = false

  internal var typeState18: InlineOutputCustomToolCallItemTypeX6abf3792? = null

  internal var typeState18Decoded: Boolean = false

  internal var typeState18Matches: Boolean = false

  internal var outputMessageItemMatches: Boolean = false

  internal var outputReasoningItemMatches: Boolean = false

  internal var outputFunctionCallItemMatches: Boolean = false

  internal var outputWebSearchCallItemMatches: Boolean = false

  internal var outputFileSearchCallItemMatches: Boolean = false

  internal var outputImageGenerationCallItemMatches: Boolean = false

  internal var outputCodeInterpreterCallItemMatches: Boolean = false

  internal var outputComputerCallItemMatches: Boolean = false

  internal var outputDatetimeItemMatches: Boolean = false

  internal var outputWebSearchServerToolItemMatches: Boolean = false

  internal var outputCodeInterpreterServerToolItemMatches: Boolean = false

  internal var outputFileSearchServerToolItemMatches: Boolean = false

  internal var outputImageGenerationServerToolItemMatches: Boolean = false

  internal var outputBrowserUseServerToolItemMatches: Boolean = false

  internal var outputBashServerToolItemMatches: Boolean = false

  internal var outputTextEditorServerToolItemMatches: Boolean = false

  internal var outputApplyPatchServerToolItemMatches: Boolean = false

  internal var outputApplyPatchCallItemMatches: Boolean = false

  internal var outputShellCallItemMatches: Boolean = false

  internal var outputShellCallOutputItemMatches: Boolean = false

  internal var outputWebFetchServerToolItemMatches: Boolean = false

  internal var outputToolSearchServerToolItemMatches: Boolean = false

  internal var outputMemoryServerToolItemMatches: Boolean = false

  internal var outputMcpServerToolItemMatches: Boolean = false

  internal var outputSearchModelsServerToolItemMatches: Boolean = false

  internal var outputFusionServerToolItemMatches: Boolean = false

  internal var outputAdvisorServerToolItemMatches: Boolean = false

  internal var outputSubagentServerToolItemMatches: Boolean = false

  internal var outputFilesServerToolItemMatches: Boolean = false

  internal var outputCustomToolCallItemMatches: Boolean = false

  internal var rawEmpty: Boolean = false

  internal var failures: List<String> = emptyList()

  public val names: List<String>
    get() = buildList {
      if (outputMessageItemMatches) add("OutputMessageItem")
      if (outputReasoningItemMatches) add("OutputReasoningItem")
      if (outputFunctionCallItemMatches) add("OutputFunctionCallItem")
      if (outputWebSearchCallItemMatches) add("OutputWebSearchCallItem")
      if (outputFileSearchCallItemMatches) add("OutputFileSearchCallItem")
      if (outputImageGenerationCallItemMatches) add("OutputImageGenerationCallItem")
      if (outputCodeInterpreterCallItemMatches) add("OutputCodeInterpreterCallItem")
      if (outputComputerCallItemMatches) add("OutputComputerCallItem")
      if (outputDatetimeItemMatches) add("OutputDatetimeItem")
      if (outputWebSearchServerToolItemMatches) add("OutputWebSearchServerToolItem")
      if (outputCodeInterpreterServerToolItemMatches) add("OutputCodeInterpreterServerToolItem")
      if (outputFileSearchServerToolItemMatches) add("OutputFileSearchServerToolItem")
      if (outputImageGenerationServerToolItemMatches) add("OutputImageGenerationServerToolItem")
      if (outputBrowserUseServerToolItemMatches) add("OutputBrowserUseServerToolItem")
      if (outputBashServerToolItemMatches) add("OutputBashServerToolItem")
      if (outputTextEditorServerToolItemMatches) add("OutputTextEditorServerToolItem")
      if (outputApplyPatchServerToolItemMatches) add("OutputApplyPatchServerToolItem")
      if (outputApplyPatchCallItemMatches) add("OutputApplyPatchCallItem")
      if (outputShellCallItemMatches) add("OutputShellCallItem")
      if (outputShellCallOutputItemMatches) add("OutputShellCallOutputItem")
      if (outputWebFetchServerToolItemMatches) add("OutputWebFetchServerToolItem")
      if (outputToolSearchServerToolItemMatches) add("OutputToolSearchServerToolItem")
      if (outputMemoryServerToolItemMatches) add("OutputMemoryServerToolItem")
      if (outputMcpServerToolItemMatches) add("OutputMcpServerToolItem")
      if (outputSearchModelsServerToolItemMatches) add("OutputSearchModelsServerToolItem")
      if (outputFusionServerToolItemMatches) add("OutputFusionServerToolItem")
      if (outputAdvisorServerToolItemMatches) add("OutputAdvisorServerToolItem")
      if (outputSubagentServerToolItemMatches) add("OutputSubagentServerToolItem")
      if (outputFilesServerToolItemMatches) add("OutputFilesServerToolItem")
      if (outputCustomToolCallItemMatches) add("OutputCustomToolCallItem")
    }

  public val size: Int
    get() = names.size
}

private fun inspectOutputItems(rawObject: JsonObject): OutputItemsInspection {
  val typeState43Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageTypeXba66a1d6>(element) } }
  val typeState43 = typeState43Result?.getOrNull()
  val typeState43Decoded = typeState43Result?.isSuccess == true
  val typeState43Matches = (rawObject.stringValue("type") == "message") && typeState43Decoded
  val contentResult = rawObject["content"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineOutputMessageContentItemX9f591485>>(element) } }
  val content = contentResult?.getOrNull()
  val contentDecoded = contentResult?.isSuccess == true
  val idResult = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val id = idResult?.getOrNull()
  val idDecoded = idResult?.isSuccess == true
  val roleResult = rawObject["role"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageRoleXe91a3401>(element) } }
  val role = roleResult?.getOrNull()
  val roleDecoded = roleResult?.isSuccess == true
  val roleMatches = (rawObject.stringValue("role") == "assistant") && roleDecoded
  val typeState44Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMessageTypeXba66a1d6>(element) } }
  val typeState44 = typeState44Result?.getOrNull()
  val typeState44Decoded = typeState44Result?.isSuccess == true
  val typeState44Matches = (rawObject.stringValue("type") == "message") && typeState44Decoded
  val typeState35Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemReasoningTypeX9f535a4f>(element) } }
  val typeState35 = typeState35Result?.getOrNull()
  val typeState35Decoded = typeState35Result?.isSuccess == true
  val typeState35Matches = (rawObject.stringValue("type") == "reasoning") && typeState35Decoded
  val summaryResult = rawObject["summary"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<ReasoningSummaryText>>(element) } }
  val summary = summaryResult?.getOrNull()
  val summaryDecoded = summaryResult?.isSuccess == true
  val typeState36Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemReasoningTypeX9f535a4f>(element) } }
  val typeState36 = typeState36Result?.getOrNull()
  val typeState36Decoded = typeState36Result?.isSuccess == true
  val typeState36Matches = (rawObject.stringValue("type") == "reasoning") && typeState36Decoded
  val typeState31Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFunctionCallTypeX494d8eba>(element) } }
  val typeState31 = typeState31Result?.getOrNull()
  val typeState31Decoded = typeState31Result?.isSuccess == true
  val typeState31Matches = (rawObject.stringValue("type") == "function_call") && typeState31Decoded
  val argumentsResult = rawObject["arguments"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val arguments = argumentsResult?.getOrNull()
  val argumentsDecoded = argumentsResult?.isSuccess == true
  val callIdResult = rawObject["call_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val callId = callIdResult?.getOrNull()
  val callIdDecoded = callIdResult?.isSuccess == true
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val typeState32Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFunctionCallTypeX494d8eba>(element) } }
  val typeState32 = typeState32Result?.getOrNull()
  val typeState32Decoded = typeState32Result?.isSuccess == true
  val typeState32Matches = (rawObject.stringValue("type") == "function_call") && typeState32Decoded
  val typeState37Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemWebSearchCallTypeX70b2c197>(element) } }
  val typeState37 = typeState37Result?.getOrNull()
  val typeState37Decoded = typeState37Result?.isSuccess == true
  val typeState37Matches = (rawObject.stringValue("type") == "web_search_call") && typeState37Decoded
  val statusState6Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<WebSearchStatus>(element) } }
  val statusState6 = statusState6Result?.getOrNull()
  val statusState6Decoded = statusState6Result?.isSuccess == true
  val statusState6Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "failed" || rawObject.stringValue("status") == "in_progress" || rawObject.stringValue("status") == "searching") && statusState6Decoded
  val typeState38Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemWebSearchCallTypeX70b2c197>(element) } }
  val typeState38 = typeState38Result?.getOrNull()
  val typeState38Decoded = typeState38Result?.isSuccess == true
  val typeState38Matches = (rawObject.stringValue("type") == "web_search_call") && typeState38Decoded
  val typeState29Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFileSearchCallTypeX69a7137a>(element) } }
  val typeState29 = typeState29Result?.getOrNull()
  val typeState29Decoded = typeState29Result?.isSuccess == true
  val typeState29Matches = (rawObject.stringValue("type") == "file_search_call") && typeState29Decoded
  val queriesResult = rawObject["queries"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val queries = queriesResult?.getOrNull()
  val queriesDecoded = queriesResult?.isSuccess == true
  val typeState30Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemFileSearchCallTypeX69a7137a>(element) } }
  val typeState30 = typeState30Result?.getOrNull()
  val typeState30Decoded = typeState30Result?.isSuccess == true
  val typeState30Matches = (rawObject.stringValue("type") == "file_search_call") && typeState30Decoded
  val typeState33Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemImageGenerationCallTypeX8aee14b8>(element) } }
  val typeState33 = typeState33Result?.getOrNull()
  val typeState33Decoded = typeState33Result?.isSuccess == true
  val typeState33Matches = (rawObject.stringValue("type") == "image_generation_call") && typeState33Decoded
  val statusState2Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ImageGenerationStatus>(element) } }
  val statusState2 = statusState2Result?.getOrNull()
  val statusState2Decoded = statusState2Result?.isSuccess == true
  val statusState2Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "failed" || rawObject.stringValue("status") == "generating" || rawObject.stringValue("status") == "in_progress") && statusState2Decoded
  val typeState34Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputItemImageGenerationCallTypeX8aee14b8>(element) } }
  val typeState34 = typeState34Result?.getOrNull()
  val typeState34Decoded = typeState34Result?.isSuccess == true
  val typeState34Matches = (rawObject.stringValue("type") == "image_generation_call") && typeState34Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCodeInterpreterCallItemTypeXbc02d595>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "code_interpreter_call") && typeState1Decoded
  val codeResult = rawObject["code"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String?>(element) } }
  val code = codeResult?.getOrNull()
  val codePresent = rawObject.containsKey("code")
  val codeDecoded = codeResult?.isSuccess == true
  val containerIdResult = rawObject["container_id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val containerId = containerIdResult?.getOrNull()
  val containerIdDecoded = containerIdResult?.isSuccess == true
  val outputsResult = rawObject["outputs"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineCodeInterpreterCallItemOutputsItemXcf11179a>?>(element) } }
  val outputs = outputsResult?.getOrNull()
  val outputsPresent = rawObject.containsKey("outputs")
  val outputsDecoded = outputsResult?.isSuccess == true
  val statusState5Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ToolCallStatus>(element) } }
  val statusState5 = statusState5Result?.getOrNull()
  val statusState5Decoded = statusState5Result?.isSuccess == true
  val statusState5Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "in_progress" || rawObject.stringValue("status") == "incomplete") && statusState5Decoded
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCodeInterpreterCallItemTypeXbc02d595>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "code_interpreter_call") && typeState2Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputComputerCallItemTypeX57b5ed31>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "computer_call") && typeState15Decoded
  val pendingSafetyChecksResult = rawObject["pending_safety_checks"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineOutputComputerCallItemPendingSafetyChecksItemXce0a6182>>(element) } }
  val pendingSafetyChecks = pendingSafetyChecksResult?.getOrNull()
  val pendingSafetyChecksDecoded = pendingSafetyChecksResult?.isSuccess == true
  val statusState3Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputComputerCallItemStatusX68983861>(element) } }
  val statusState3 = statusState3Result?.getOrNull()
  val statusState3Decoded = statusState3Result?.isSuccess == true
  val statusState3Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "in_progress" || rawObject.stringValue("status") == "incomplete") && statusState3Decoded
  val typeState16Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputComputerCallItemTypeX57b5ed31>(element) } }
  val typeState16 = typeState16Result?.getOrNull()
  val typeState16Decoded = typeState16Result?.isSuccess == true
  val typeState16Matches = (rawObject.stringValue("type") == "computer_call") && typeState16Decoded
  val typeState19Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputDatetimeItemTypeXb3ed5cc0>(element) } }
  val typeState19 = typeState19Result?.getOrNull()
  val typeState19Decoded = typeState19Result?.isSuccess == true
  val typeState19Matches = (rawObject.stringValue("type") == "openrouter:datetime") && typeState19Decoded
  val datetimeResult = rawObject["datetime"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val datetime = datetimeResult?.getOrNull()
  val datetimeDecoded = datetimeResult?.isSuccess == true
  val timezoneResult = rawObject["timezone"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val timezone = timezoneResult?.getOrNull()
  val timezoneDecoded = timezoneResult?.isSuccess == true
  val typeState20Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputDatetimeItemTypeXb3ed5cc0>(element) } }
  val typeState20 = typeState20Result?.getOrNull()
  val typeState20Decoded = typeState20Result?.isSuccess == true
  val typeState20Matches = (rawObject.stringValue("type") == "openrouter:datetime") && typeState20Decoded
  val typeState59Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputWebSearchServerToolItemTypeX86ed43d9>(element) } }
  val typeState59 = typeState59Result?.getOrNull()
  val typeState59Decoded = typeState59Result?.isSuccess == true
  val typeState59Matches = (rawObject.stringValue("type") == "openrouter:web_search") && typeState59Decoded
  val typeState60Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputWebSearchServerToolItemTypeX86ed43d9>(element) } }
  val typeState60 = typeState60Result?.getOrNull()
  val typeState60Decoded = typeState60Result?.isSuccess == true
  val typeState60Matches = (rawObject.stringValue("type") == "openrouter:web_search") && typeState60Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputCodeInterpreterServerToolItemTypeX7279e892>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "openrouter:code_interpreter") && typeState13Decoded
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputCodeInterpreterServerToolItemTypeX7279e892>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "openrouter:code_interpreter") && typeState14Decoded
  val typeState21Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFileSearchServerToolItemTypeX848145bc>(element) } }
  val typeState21 = typeState21Result?.getOrNull()
  val typeState21Decoded = typeState21Result?.isSuccess == true
  val typeState21Matches = (rawObject.stringValue("type") == "openrouter:file_search") && typeState21Decoded
  val typeState22Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFileSearchServerToolItemTypeX848145bc>(element) } }
  val typeState22 = typeState22Result?.getOrNull()
  val typeState22Decoded = typeState22Result?.isSuccess == true
  val typeState22Matches = (rawObject.stringValue("type") == "openrouter:file_search") && typeState22Decoded
  val typeState27Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputImageGenerationServerToolItemTypeX7367c8be>(element) } }
  val typeState27 = typeState27Result?.getOrNull()
  val typeState27Decoded = typeState27Result?.isSuccess == true
  val typeState27Matches = (rawObject.stringValue("type") == "openrouter:image_generation") && typeState27Decoded
  val typeState28Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputImageGenerationServerToolItemTypeX7367c8be>(element) } }
  val typeState28 = typeState28Result?.getOrNull()
  val typeState28Decoded = typeState28Result?.isSuccess == true
  val typeState28Matches = (rawObject.stringValue("type") == "openrouter:image_generation") && typeState28Decoded
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputBrowserUseServerToolItemTypeX96bf58e6>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "openrouter:browser_use") && typeState11Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputBrowserUseServerToolItemTypeX96bf58e6>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "openrouter:browser_use") && typeState12Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputBashServerToolItemTypeXc097682a>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "openrouter:bash") && typeState9Decoded
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputBashServerToolItemTypeXc097682a>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "openrouter:bash") && typeState10Decoded
  val typeState53Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputTextEditorServerToolItemTypeXdeead8d2>(element) } }
  val typeState53 = typeState53Result?.getOrNull()
  val typeState53Decoded = typeState53Result?.isSuccess == true
  val typeState53Matches = (rawObject.stringValue("type") == "openrouter:text_editor") && typeState53Decoded
  val typeState54Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputTextEditorServerToolItemTypeXdeead8d2>(element) } }
  val typeState54 = typeState54Result?.getOrNull()
  val typeState54Decoded = typeState54Result?.isSuccess == true
  val typeState54Matches = (rawObject.stringValue("type") == "openrouter:text_editor") && typeState54Decoded
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputApplyPatchServerToolItemTypeX816f4f63>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "openrouter:apply_patch") && typeState7Decoded
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputApplyPatchServerToolItemTypeX816f4f63>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "openrouter:apply_patch") && typeState8Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputApplyPatchCallItemTypeX5efc0c7d>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "apply_patch_call") && typeState5Decoded
  val operationResult = rawObject["operation"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ApplyPatchCallOperation>(element) } }
  val operation = operationResult?.getOrNull()
  val operationDecoded = operationResult?.isSuccess == true
  val statusState1Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ApplyPatchCallStatus>(element) } }
  val statusState1 = statusState1Result?.getOrNull()
  val statusState1Decoded = statusState1Result?.isSuccess == true
  val statusState1Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "in_progress") && statusState1Decoded
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputApplyPatchCallItemTypeX5efc0c7d>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "apply_patch_call") && typeState6Decoded
  val typeState47Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputShellCallItemTypeX8d274ede>(element) } }
  val typeState47 = typeState47Result?.getOrNull()
  val typeState47Decoded = typeState47Result?.isSuccess == true
  val typeState47Matches = (rawObject.stringValue("type") == "shell_call") && typeState47Decoded
  val statusState4Result = rawObject["status"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<ShellCallStatus>(element) } }
  val statusState4 = statusState4Result?.getOrNull()
  val statusState4Decoded = statusState4Result?.isSuccess == true
  val statusState4Matches = (rawObject.stringValue("status") == "completed" || rawObject.stringValue("status") == "in_progress" || rawObject.stringValue("status") == "incomplete") && statusState4Decoded
  val typeState48Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputShellCallItemTypeX8d274ede>(element) } }
  val typeState48 = typeState48Result?.getOrNull()
  val typeState48Decoded = typeState48Result?.isSuccess == true
  val typeState48Matches = (rawObject.stringValue("type") == "shell_call") && typeState48Decoded
  val typeState49Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputShellCallOutputItemTypeX953b8882>(element) } }
  val typeState49 = typeState49Result?.getOrNull()
  val typeState49Decoded = typeState49Result?.isSuccess == true
  val typeState49Matches = (rawObject.stringValue("type") == "shell_call_output") && typeState49Decoded
  val outputResult = rawObject["output"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineOutputShellCallOutputItemOutputItemX141fabad>>(element) } }
  val output = outputResult?.getOrNull()
  val outputDecoded = outputResult?.isSuccess == true
  val typeState50Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputShellCallOutputItemTypeX953b8882>(element) } }
  val typeState50 = typeState50Result?.getOrNull()
  val typeState50Decoded = typeState50Result?.isSuccess == true
  val typeState50Matches = (rawObject.stringValue("type") == "shell_call_output") && typeState50Decoded
  val typeState57Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputWebFetchServerToolItemTypeXad27afcc>(element) } }
  val typeState57 = typeState57Result?.getOrNull()
  val typeState57Decoded = typeState57Result?.isSuccess == true
  val typeState57Matches = (rawObject.stringValue("type") == "openrouter:web_fetch") && typeState57Decoded
  val typeState58Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputWebFetchServerToolItemTypeXad27afcc>(element) } }
  val typeState58 = typeState58Result?.getOrNull()
  val typeState58Decoded = typeState58Result?.isSuccess == true
  val typeState58Matches = (rawObject.stringValue("type") == "openrouter:web_fetch") && typeState58Decoded
  val typeState55Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputToolSearchServerToolItemTypeX5470ace1>(element) } }
  val typeState55 = typeState55Result?.getOrNull()
  val typeState55Decoded = typeState55Result?.isSuccess == true
  val typeState55Matches = (rawObject.stringValue("type") == "openrouter:tool_search") && typeState55Decoded
  val typeState56Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputToolSearchServerToolItemTypeX5470ace1>(element) } }
  val typeState56 = typeState56Result?.getOrNull()
  val typeState56Decoded = typeState56Result?.isSuccess == true
  val typeState56Matches = (rawObject.stringValue("type") == "openrouter:tool_search") && typeState56Decoded
  val typeState41Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMemoryServerToolItemTypeX145b938f>(element) } }
  val typeState41 = typeState41Result?.getOrNull()
  val typeState41Decoded = typeState41Result?.isSuccess == true
  val typeState41Matches = (rawObject.stringValue("type") == "openrouter:memory") && typeState41Decoded
  val typeState42Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMemoryServerToolItemTypeX145b938f>(element) } }
  val typeState42 = typeState42Result?.getOrNull()
  val typeState42Decoded = typeState42Result?.isSuccess == true
  val typeState42Matches = (rawObject.stringValue("type") == "openrouter:memory") && typeState42Decoded
  val typeState39Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMcpServerToolItemTypeX4ef5a034>(element) } }
  val typeState39 = typeState39Result?.getOrNull()
  val typeState39Decoded = typeState39Result?.isSuccess == true
  val typeState39Matches = (rawObject.stringValue("type") == "openrouter:mcp") && typeState39Decoded
  val typeState40Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputMcpServerToolItemTypeX4ef5a034>(element) } }
  val typeState40 = typeState40Result?.getOrNull()
  val typeState40Decoded = typeState40Result?.isSuccess == true
  val typeState40Matches = (rawObject.stringValue("type") == "openrouter:mcp") && typeState40Decoded
  val typeState45Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputSearchModelsServerToolItemTypeX99374856>(element) } }
  val typeState45 = typeState45Result?.getOrNull()
  val typeState45Decoded = typeState45Result?.isSuccess == true
  val typeState45Matches = (rawObject.stringValue("type") == "openrouter:experimental__search_models") && typeState45Decoded
  val typeState46Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputSearchModelsServerToolItemTypeX99374856>(element) } }
  val typeState46 = typeState46Result?.getOrNull()
  val typeState46Decoded = typeState46Result?.isSuccess == true
  val typeState46Matches = (rawObject.stringValue("type") == "openrouter:experimental__search_models") && typeState46Decoded
  val typeState25Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFusionServerToolItemTypeX66d6265a>(element) } }
  val typeState25 = typeState25Result?.getOrNull()
  val typeState25Decoded = typeState25Result?.isSuccess == true
  val typeState25Matches = (rawObject.stringValue("type") == "openrouter:fusion") && typeState25Decoded
  val typeState26Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFusionServerToolItemTypeX66d6265a>(element) } }
  val typeState26 = typeState26Result?.getOrNull()
  val typeState26Decoded = typeState26Result?.isSuccess == true
  val typeState26Matches = (rawObject.stringValue("type") == "openrouter:fusion") && typeState26Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputAdvisorServerToolItemTypeX996c03cf>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "openrouter:advisor") && typeState3Decoded
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputAdvisorServerToolItemTypeX996c03cf>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "openrouter:advisor") && typeState4Decoded
  val typeState51Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputSubagentServerToolItemTypeXf7a3e6e2>(element) } }
  val typeState51 = typeState51Result?.getOrNull()
  val typeState51Decoded = typeState51Result?.isSuccess == true
  val typeState51Matches = (rawObject.stringValue("type") == "openrouter:subagent") && typeState51Decoded
  val typeState52Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputSubagentServerToolItemTypeXf7a3e6e2>(element) } }
  val typeState52 = typeState52Result?.getOrNull()
  val typeState52Decoded = typeState52Result?.isSuccess == true
  val typeState52Matches = (rawObject.stringValue("type") == "openrouter:subagent") && typeState52Decoded
  val typeState23Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFilesServerToolItemTypeX5fc5dc4b>(element) } }
  val typeState23 = typeState23Result?.getOrNull()
  val typeState23Decoded = typeState23Result?.isSuccess == true
  val typeState23Matches = (rawObject.stringValue("type") == "openrouter:files") && typeState23Decoded
  val typeState24Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputFilesServerToolItemTypeX5fc5dc4b>(element) } }
  val typeState24 = typeState24Result?.getOrNull()
  val typeState24Decoded = typeState24Result?.isSuccess == true
  val typeState24Matches = (rawObject.stringValue("type") == "openrouter:files") && typeState24Decoded
  val typeState17Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputCustomToolCallItemTypeX6abf3792>(element) } }
  val typeState17 = typeState17Result?.getOrNull()
  val typeState17Decoded = typeState17Result?.isSuccess == true
  val typeState17Matches = (rawObject.stringValue("type") == "custom_tool_call") && typeState17Decoded
  val inputResult = rawObject["input"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val input = inputResult?.getOrNull()
  val inputDecoded = inputResult?.isSuccess == true
  val typeState18Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineOutputCustomToolCallItemTypeX6abf3792>(element) } }
  val typeState18 = typeState18Result?.getOrNull()
  val typeState18Decoded = typeState18Result?.isSuccess == true
  val typeState18Matches = (rawObject.stringValue("type") == "custom_tool_call") && typeState18Decoded
  val rawEmpty = rawObject.isEmpty()
  val outputMessageItemMatches = matchesOutputItemsOutputMessageItemBranch(rawObject) && (typeState43Matches)
  val outputReasoningItemMatches = matchesOutputItemsOutputReasoningItemBranch(rawObject) && (typeState35Matches)
  val outputFunctionCallItemMatches = matchesOutputItemsOutputFunctionCallItemBranch(rawObject) && (typeState31Matches)
  val outputWebSearchCallItemMatches = matchesOutputItemsOutputWebSearchCallItemBranch(rawObject) && (typeState37Matches)
  val outputFileSearchCallItemMatches = matchesOutputItemsOutputFileSearchCallItemBranch(rawObject) && (typeState29Matches)
  val outputImageGenerationCallItemMatches = matchesOutputItemsOutputImageGenerationCallItemBranch(rawObject) && (typeState33Matches)
  val outputCodeInterpreterCallItemMatches = matchesOutputItemsOutputCodeInterpreterCallItemBranch(rawObject) && (typeState1Matches)
  val outputComputerCallItemMatches = matchesOutputItemsOutputComputerCallItemBranch(rawObject) && (typeState15Matches)
  val outputDatetimeItemMatches = matchesOutputItemsOutputDatetimeItemBranch(rawObject) && (typeState19Matches)
  val outputWebSearchServerToolItemMatches = matchesOutputItemsOutputWebSearchServerToolItemBranch(rawObject) && (typeState59Matches)
  val outputCodeInterpreterServerToolItemMatches = matchesOutputItemsOutputCodeInterpreterServerToolItemBranch(rawObject) && (typeState13Matches)
  val outputFileSearchServerToolItemMatches = matchesOutputItemsOutputFileSearchServerToolItemBranch(rawObject) && (typeState21Matches)
  val outputImageGenerationServerToolItemMatches = matchesOutputItemsOutputImageGenerationServerToolItemBranch(rawObject) && (typeState27Matches)
  val outputBrowserUseServerToolItemMatches = matchesOutputItemsOutputBrowserUseServerToolItemBranch(rawObject) && (typeState11Matches)
  val outputBashServerToolItemMatches = matchesOutputItemsOutputBashServerToolItemBranch(rawObject) && (typeState9Matches)
  val outputTextEditorServerToolItemMatches = matchesOutputItemsOutputTextEditorServerToolItemBranch(rawObject) && (typeState53Matches)
  val outputApplyPatchServerToolItemMatches = matchesOutputItemsOutputApplyPatchServerToolItemBranch(rawObject) && (typeState7Matches)
  val outputApplyPatchCallItemMatches = matchesOutputItemsOutputApplyPatchCallItemBranch(rawObject) && (typeState5Matches)
  val outputShellCallItemMatches = matchesOutputItemsOutputShellCallItemBranch(rawObject) && (typeState47Matches)
  val outputShellCallOutputItemMatches = matchesOutputItemsOutputShellCallOutputItemBranch(rawObject) && (typeState49Matches)
  val outputWebFetchServerToolItemMatches = matchesOutputItemsOutputWebFetchServerToolItemBranch(rawObject) && (typeState57Matches)
  val outputToolSearchServerToolItemMatches = matchesOutputItemsOutputToolSearchServerToolItemBranch(rawObject) && (typeState55Matches)
  val outputMemoryServerToolItemMatches = matchesOutputItemsOutputMemoryServerToolItemBranch(rawObject) && (typeState41Matches)
  val outputMcpServerToolItemMatches = matchesOutputItemsOutputMcpServerToolItemBranch(rawObject) && (typeState39Matches)
  val outputSearchModelsServerToolItemMatches = matchesOutputItemsOutputSearchModelsServerToolItemBranch(rawObject) && (typeState45Matches)
  val outputFusionServerToolItemMatches = matchesOutputItemsOutputFusionServerToolItemBranch(rawObject) && (typeState25Matches)
  val outputAdvisorServerToolItemMatches = matchesOutputItemsOutputAdvisorServerToolItemBranch(rawObject) && (typeState3Matches)
  val outputSubagentServerToolItemMatches = matchesOutputItemsOutputSubagentServerToolItemBranch(rawObject) && (typeState51Matches)
  val outputFilesServerToolItemMatches = matchesOutputItemsOutputFilesServerToolItemBranch(rawObject) && (typeState23Matches)
  val outputCustomToolCallItemMatches = matchesOutputItemsOutputCustomToolCallItemBranch(rawObject) && (typeState17Matches)
  val inspection = OutputItemsInspection()
  inspection.typeState43 = typeState43
  inspection.typeState43Decoded = typeState43Decoded
  inspection.typeState43Matches = typeState43Matches
  inspection.content = content
  inspection.contentDecoded = contentDecoded
  inspection.id = id
  inspection.idDecoded = idDecoded
  inspection.role = role
  inspection.roleDecoded = roleDecoded
  inspection.roleMatches = roleMatches
  inspection.typeState44 = typeState44
  inspection.typeState44Decoded = typeState44Decoded
  inspection.typeState44Matches = typeState44Matches
  inspection.typeState35 = typeState35
  inspection.typeState35Decoded = typeState35Decoded
  inspection.typeState35Matches = typeState35Matches
  inspection.summary = summary
  inspection.summaryDecoded = summaryDecoded
  inspection.typeState36 = typeState36
  inspection.typeState36Decoded = typeState36Decoded
  inspection.typeState36Matches = typeState36Matches
  inspection.typeState31 = typeState31
  inspection.typeState31Decoded = typeState31Decoded
  inspection.typeState31Matches = typeState31Matches
  inspection.arguments = arguments
  inspection.argumentsDecoded = argumentsDecoded
  inspection.callId = callId
  inspection.callIdDecoded = callIdDecoded
  inspection.name = name
  inspection.nameDecoded = nameDecoded
  inspection.typeState32 = typeState32
  inspection.typeState32Decoded = typeState32Decoded
  inspection.typeState32Matches = typeState32Matches
  inspection.typeState37 = typeState37
  inspection.typeState37Decoded = typeState37Decoded
  inspection.typeState37Matches = typeState37Matches
  inspection.statusState6 = statusState6
  inspection.statusState6Decoded = statusState6Decoded
  inspection.statusState6Matches = statusState6Matches
  inspection.typeState38 = typeState38
  inspection.typeState38Decoded = typeState38Decoded
  inspection.typeState38Matches = typeState38Matches
  inspection.typeState29 = typeState29
  inspection.typeState29Decoded = typeState29Decoded
  inspection.typeState29Matches = typeState29Matches
  inspection.queries = queries
  inspection.queriesDecoded = queriesDecoded
  inspection.typeState30 = typeState30
  inspection.typeState30Decoded = typeState30Decoded
  inspection.typeState30Matches = typeState30Matches
  inspection.typeState33 = typeState33
  inspection.typeState33Decoded = typeState33Decoded
  inspection.typeState33Matches = typeState33Matches
  inspection.statusState2 = statusState2
  inspection.statusState2Decoded = statusState2Decoded
  inspection.statusState2Matches = statusState2Matches
  inspection.typeState34 = typeState34
  inspection.typeState34Decoded = typeState34Decoded
  inspection.typeState34Matches = typeState34Matches
  inspection.typeState1 = typeState1
  inspection.typeState1Decoded = typeState1Decoded
  inspection.typeState1Matches = typeState1Matches
  inspection.code = code
  inspection.codePresent = codePresent
  inspection.codeDecoded = codeDecoded
  inspection.containerId = containerId
  inspection.containerIdDecoded = containerIdDecoded
  inspection.outputs = outputs
  inspection.outputsPresent = outputsPresent
  inspection.outputsDecoded = outputsDecoded
  inspection.statusState5 = statusState5
  inspection.statusState5Decoded = statusState5Decoded
  inspection.statusState5Matches = statusState5Matches
  inspection.typeState2 = typeState2
  inspection.typeState2Decoded = typeState2Decoded
  inspection.typeState2Matches = typeState2Matches
  inspection.typeState15 = typeState15
  inspection.typeState15Decoded = typeState15Decoded
  inspection.typeState15Matches = typeState15Matches
  inspection.pendingSafetyChecks = pendingSafetyChecks
  inspection.pendingSafetyChecksDecoded = pendingSafetyChecksDecoded
  inspection.statusState3 = statusState3
  inspection.statusState3Decoded = statusState3Decoded
  inspection.statusState3Matches = statusState3Matches
  inspection.typeState16 = typeState16
  inspection.typeState16Decoded = typeState16Decoded
  inspection.typeState16Matches = typeState16Matches
  inspection.typeState19 = typeState19
  inspection.typeState19Decoded = typeState19Decoded
  inspection.typeState19Matches = typeState19Matches
  inspection.datetime = datetime
  inspection.datetimeDecoded = datetimeDecoded
  inspection.timezone = timezone
  inspection.timezoneDecoded = timezoneDecoded
  inspection.typeState20 = typeState20
  inspection.typeState20Decoded = typeState20Decoded
  inspection.typeState20Matches = typeState20Matches
  inspection.typeState59 = typeState59
  inspection.typeState59Decoded = typeState59Decoded
  inspection.typeState59Matches = typeState59Matches
  inspection.typeState60 = typeState60
  inspection.typeState60Decoded = typeState60Decoded
  inspection.typeState60Matches = typeState60Matches
  inspection.typeState13 = typeState13
  inspection.typeState13Decoded = typeState13Decoded
  inspection.typeState13Matches = typeState13Matches
  inspection.typeState14 = typeState14
  inspection.typeState14Decoded = typeState14Decoded
  inspection.typeState14Matches = typeState14Matches
  inspection.typeState21 = typeState21
  inspection.typeState21Decoded = typeState21Decoded
  inspection.typeState21Matches = typeState21Matches
  inspection.typeState22 = typeState22
  inspection.typeState22Decoded = typeState22Decoded
  inspection.typeState22Matches = typeState22Matches
  inspection.typeState27 = typeState27
  inspection.typeState27Decoded = typeState27Decoded
  inspection.typeState27Matches = typeState27Matches
  inspection.typeState28 = typeState28
  inspection.typeState28Decoded = typeState28Decoded
  inspection.typeState28Matches = typeState28Matches
  inspection.typeState11 = typeState11
  inspection.typeState11Decoded = typeState11Decoded
  inspection.typeState11Matches = typeState11Matches
  inspection.typeState12 = typeState12
  inspection.typeState12Decoded = typeState12Decoded
  inspection.typeState12Matches = typeState12Matches
  inspection.typeState9 = typeState9
  inspection.typeState9Decoded = typeState9Decoded
  inspection.typeState9Matches = typeState9Matches
  inspection.typeState10 = typeState10
  inspection.typeState10Decoded = typeState10Decoded
  inspection.typeState10Matches = typeState10Matches
  inspection.typeState53 = typeState53
  inspection.typeState53Decoded = typeState53Decoded
  inspection.typeState53Matches = typeState53Matches
  inspection.typeState54 = typeState54
  inspection.typeState54Decoded = typeState54Decoded
  inspection.typeState54Matches = typeState54Matches
  inspection.typeState7 = typeState7
  inspection.typeState7Decoded = typeState7Decoded
  inspection.typeState7Matches = typeState7Matches
  inspection.typeState8 = typeState8
  inspection.typeState8Decoded = typeState8Decoded
  inspection.typeState8Matches = typeState8Matches
  inspection.typeState5 = typeState5
  inspection.typeState5Decoded = typeState5Decoded
  inspection.typeState5Matches = typeState5Matches
  inspection.operation = operation
  inspection.operationDecoded = operationDecoded
  inspection.statusState1 = statusState1
  inspection.statusState1Decoded = statusState1Decoded
  inspection.statusState1Matches = statusState1Matches
  inspection.typeState6 = typeState6
  inspection.typeState6Decoded = typeState6Decoded
  inspection.typeState6Matches = typeState6Matches
  inspection.typeState47 = typeState47
  inspection.typeState47Decoded = typeState47Decoded
  inspection.typeState47Matches = typeState47Matches
  inspection.statusState4 = statusState4
  inspection.statusState4Decoded = statusState4Decoded
  inspection.statusState4Matches = statusState4Matches
  inspection.typeState48 = typeState48
  inspection.typeState48Decoded = typeState48Decoded
  inspection.typeState48Matches = typeState48Matches
  inspection.typeState49 = typeState49
  inspection.typeState49Decoded = typeState49Decoded
  inspection.typeState49Matches = typeState49Matches
  inspection.output = output
  inspection.outputDecoded = outputDecoded
  inspection.typeState50 = typeState50
  inspection.typeState50Decoded = typeState50Decoded
  inspection.typeState50Matches = typeState50Matches
  inspection.typeState57 = typeState57
  inspection.typeState57Decoded = typeState57Decoded
  inspection.typeState57Matches = typeState57Matches
  inspection.typeState58 = typeState58
  inspection.typeState58Decoded = typeState58Decoded
  inspection.typeState58Matches = typeState58Matches
  inspection.typeState55 = typeState55
  inspection.typeState55Decoded = typeState55Decoded
  inspection.typeState55Matches = typeState55Matches
  inspection.typeState56 = typeState56
  inspection.typeState56Decoded = typeState56Decoded
  inspection.typeState56Matches = typeState56Matches
  inspection.typeState41 = typeState41
  inspection.typeState41Decoded = typeState41Decoded
  inspection.typeState41Matches = typeState41Matches
  inspection.typeState42 = typeState42
  inspection.typeState42Decoded = typeState42Decoded
  inspection.typeState42Matches = typeState42Matches
  inspection.typeState39 = typeState39
  inspection.typeState39Decoded = typeState39Decoded
  inspection.typeState39Matches = typeState39Matches
  inspection.typeState40 = typeState40
  inspection.typeState40Decoded = typeState40Decoded
  inspection.typeState40Matches = typeState40Matches
  inspection.typeState45 = typeState45
  inspection.typeState45Decoded = typeState45Decoded
  inspection.typeState45Matches = typeState45Matches
  inspection.typeState46 = typeState46
  inspection.typeState46Decoded = typeState46Decoded
  inspection.typeState46Matches = typeState46Matches
  inspection.typeState25 = typeState25
  inspection.typeState25Decoded = typeState25Decoded
  inspection.typeState25Matches = typeState25Matches
  inspection.typeState26 = typeState26
  inspection.typeState26Decoded = typeState26Decoded
  inspection.typeState26Matches = typeState26Matches
  inspection.typeState3 = typeState3
  inspection.typeState3Decoded = typeState3Decoded
  inspection.typeState3Matches = typeState3Matches
  inspection.typeState4 = typeState4
  inspection.typeState4Decoded = typeState4Decoded
  inspection.typeState4Matches = typeState4Matches
  inspection.typeState51 = typeState51
  inspection.typeState51Decoded = typeState51Decoded
  inspection.typeState51Matches = typeState51Matches
  inspection.typeState52 = typeState52
  inspection.typeState52Decoded = typeState52Decoded
  inspection.typeState52Matches = typeState52Matches
  inspection.typeState23 = typeState23
  inspection.typeState23Decoded = typeState23Decoded
  inspection.typeState23Matches = typeState23Matches
  inspection.typeState24 = typeState24
  inspection.typeState24Decoded = typeState24Decoded
  inspection.typeState24Matches = typeState24Matches
  inspection.typeState17 = typeState17
  inspection.typeState17Decoded = typeState17Decoded
  inspection.typeState17Matches = typeState17Matches
  inspection.input = input
  inspection.inputDecoded = inputDecoded
  inspection.typeState18 = typeState18
  inspection.typeState18Decoded = typeState18Decoded
  inspection.typeState18Matches = typeState18Matches
  inspection.outputMessageItemMatches = outputMessageItemMatches
  inspection.outputReasoningItemMatches = outputReasoningItemMatches
  inspection.outputFunctionCallItemMatches = outputFunctionCallItemMatches
  inspection.outputWebSearchCallItemMatches = outputWebSearchCallItemMatches
  inspection.outputFileSearchCallItemMatches = outputFileSearchCallItemMatches
  inspection.outputImageGenerationCallItemMatches = outputImageGenerationCallItemMatches
  inspection.outputCodeInterpreterCallItemMatches = outputCodeInterpreterCallItemMatches
  inspection.outputComputerCallItemMatches = outputComputerCallItemMatches
  inspection.outputDatetimeItemMatches = outputDatetimeItemMatches
  inspection.outputWebSearchServerToolItemMatches = outputWebSearchServerToolItemMatches
  inspection.outputCodeInterpreterServerToolItemMatches = outputCodeInterpreterServerToolItemMatches
  inspection.outputFileSearchServerToolItemMatches = outputFileSearchServerToolItemMatches
  inspection.outputImageGenerationServerToolItemMatches = outputImageGenerationServerToolItemMatches
  inspection.outputBrowserUseServerToolItemMatches = outputBrowserUseServerToolItemMatches
  inspection.outputBashServerToolItemMatches = outputBashServerToolItemMatches
  inspection.outputTextEditorServerToolItemMatches = outputTextEditorServerToolItemMatches
  inspection.outputApplyPatchServerToolItemMatches = outputApplyPatchServerToolItemMatches
  inspection.outputApplyPatchCallItemMatches = outputApplyPatchCallItemMatches
  inspection.outputShellCallItemMatches = outputShellCallItemMatches
  inspection.outputShellCallOutputItemMatches = outputShellCallOutputItemMatches
  inspection.outputWebFetchServerToolItemMatches = outputWebFetchServerToolItemMatches
  inspection.outputToolSearchServerToolItemMatches = outputToolSearchServerToolItemMatches
  inspection.outputMemoryServerToolItemMatches = outputMemoryServerToolItemMatches
  inspection.outputMcpServerToolItemMatches = outputMcpServerToolItemMatches
  inspection.outputSearchModelsServerToolItemMatches = outputSearchModelsServerToolItemMatches
  inspection.outputFusionServerToolItemMatches = outputFusionServerToolItemMatches
  inspection.outputAdvisorServerToolItemMatches = outputAdvisorServerToolItemMatches
  inspection.outputSubagentServerToolItemMatches = outputSubagentServerToolItemMatches
  inspection.outputFilesServerToolItemMatches = outputFilesServerToolItemMatches
  inspection.outputCustomToolCallItemMatches = outputCustomToolCallItemMatches
  inspection.rawEmpty = rawEmpty
  inspection.failures = buildList {
    if (!outputMessageItemMatches) add("OutputMessageItem: branch predicate did not match properties 'type'")
    if (!outputReasoningItemMatches) add("OutputReasoningItem: branch predicate did not match properties 'type'")
    if (!outputFunctionCallItemMatches) add("OutputFunctionCallItem: branch predicate did not match properties 'type'")
    if (!outputWebSearchCallItemMatches) add("OutputWebSearchCallItem: branch predicate did not match properties 'type'")
    if (!outputFileSearchCallItemMatches) add("OutputFileSearchCallItem: branch predicate did not match properties 'type'")
    if (!outputImageGenerationCallItemMatches) add("OutputImageGenerationCallItem: branch predicate did not match properties 'type'")
    if (!outputCodeInterpreterCallItemMatches) add("OutputCodeInterpreterCallItem: branch predicate did not match properties 'type'")
    if (!outputComputerCallItemMatches) add("OutputComputerCallItem: branch predicate did not match properties 'type'")
    if (!outputDatetimeItemMatches) add("OutputDatetimeItem: branch predicate did not match properties 'type'")
    if (!outputWebSearchServerToolItemMatches) add("OutputWebSearchServerToolItem: branch predicate did not match properties 'type'")
    if (!outputCodeInterpreterServerToolItemMatches) add("OutputCodeInterpreterServerToolItem: branch predicate did not match properties 'type'")
    if (!outputFileSearchServerToolItemMatches) add("OutputFileSearchServerToolItem: branch predicate did not match properties 'type'")
    if (!outputImageGenerationServerToolItemMatches) add("OutputImageGenerationServerToolItem: branch predicate did not match properties 'type'")
    if (!outputBrowserUseServerToolItemMatches) add("OutputBrowserUseServerToolItem: branch predicate did not match properties 'type'")
    if (!outputBashServerToolItemMatches) add("OutputBashServerToolItem: branch predicate did not match properties 'type'")
    if (!outputTextEditorServerToolItemMatches) add("OutputTextEditorServerToolItem: branch predicate did not match properties 'type'")
    if (!outputApplyPatchServerToolItemMatches) add("OutputApplyPatchServerToolItem: branch predicate did not match properties 'type'")
    if (!outputApplyPatchCallItemMatches) add("OutputApplyPatchCallItem: branch predicate did not match properties 'type'")
    if (!outputShellCallItemMatches) add("OutputShellCallItem: branch predicate did not match properties 'type'")
    if (!outputShellCallOutputItemMatches) add("OutputShellCallOutputItem: branch predicate did not match properties 'type'")
    if (!outputWebFetchServerToolItemMatches) add("OutputWebFetchServerToolItem: branch predicate did not match properties 'type'")
    if (!outputToolSearchServerToolItemMatches) add("OutputToolSearchServerToolItem: branch predicate did not match properties 'type'")
    if (!outputMemoryServerToolItemMatches) add("OutputMemoryServerToolItem: branch predicate did not match properties 'type'")
    if (!outputMcpServerToolItemMatches) add("OutputMcpServerToolItem: branch predicate did not match properties 'type'")
    if (!outputSearchModelsServerToolItemMatches) add("OutputSearchModelsServerToolItem: branch predicate did not match properties 'type'")
    if (!outputFusionServerToolItemMatches) add("OutputFusionServerToolItem: branch predicate did not match properties 'type'")
    if (!outputAdvisorServerToolItemMatches) add("OutputAdvisorServerToolItem: branch predicate did not match properties 'type'")
    if (!outputSubagentServerToolItemMatches) add("OutputSubagentServerToolItem: branch predicate did not match properties 'type'")
    if (!outputFilesServerToolItemMatches) add("OutputFilesServerToolItem: branch predicate did not match properties 'type'")
    if (!outputCustomToolCallItemMatches) add("OutputCustomToolCallItem: branch predicate did not match properties 'type'")
  }
  return inspection
}

private fun matchesOutputItemsOutputMessageItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputReasoningItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputFunctionCallItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputWebSearchCallItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputFileSearchCallItemBranch(rawObject: JsonObject): Boolean = ((rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("queries") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["queries"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"searching\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"failed\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"file_search_call\"")))) } ?: true)))) && rawObject is JsonObject)

private fun matchesOutputItemsOutputImageGenerationCallItemBranch(rawObject: JsonObject): Boolean = ((rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["result"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"generating\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"failed\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_generation_call\"")))) } ?: true)))) && rawObject is JsonObject)

private fun matchesOutputItemsOutputCodeInterpreterCallItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputComputerCallItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("call_id") && (rawObject as JsonObject).containsKey("pending_safety_checks") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["action"]?.let { property -> true } ?: true) && ((rawObject as JsonObject)["call_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["pending_safety_checks"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("code") && (item as JsonObject).containsKey("id") && (item as JsonObject).containsKey("message") && ((item as JsonObject)["code"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["message"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"computer_call\"")))) } ?: true))))

private fun matchesOutputItemsOutputDatetimeItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("datetime") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("timezone") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["datetime"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:datetime\"")))) } ?: true))))

private fun matchesOutputItemsOutputWebSearchServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["action"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("query") && (property as JsonObject).containsKey("type") && ((property as JsonObject)["query"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["sources"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("type") && (item as JsonObject).containsKey("url") && ((item as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"url\"")))) } ?: true) && ((item as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"search\"")))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:web_search\"")))) } ?: true))))

private fun matchesOutputItemsOutputCodeInterpreterServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["code"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["exitCode"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["language"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["stderr"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["stdout"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:code_interpreter\"")))) } ?: true))))

private fun matchesOutputItemsOutputFileSearchServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["queries"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:file_search\"")))) } ?: true))))

private fun matchesOutputItemsOutputImageGenerationServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["imageB64"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["imageUrl"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["result"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["revisedPrompt"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:image_generation\"")))) } ?: true))))

private fun matchesOutputItemsOutputBrowserUseServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["action"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["screenshotB64"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:browser_use\"")))) } ?: true))))

private fun matchesOutputItemsOutputBashServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["command"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["exitCode"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["stderr"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["stdout"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:bash\"")))) } ?: true))))

private fun matchesOutputItemsOutputTextEditorServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["command"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"view\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"create\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"str_replace\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"insert\"")))) } ?: true) && ((rawObject as JsonObject)["filePath"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:text_editor\"")))) } ?: true))))

private fun matchesOutputItemsOutputApplyPatchServerToolItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputApplyPatchCallItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputShellCallItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("call_id") && (rawObject as JsonObject).containsKey("id") && (rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["action"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("commands") && (property as JsonObject).containsKey("max_output_length") && (property as JsonObject).containsKey("timeout_ms") && ((property as JsonObject)["commands"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["max_output_length"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((property as JsonObject)["timeout_ms"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) } ?: true) && ((rawObject as JsonObject)["call_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"shell_call\"")))) } ?: true))))

private fun matchesOutputItemsOutputShellCallOutputItemBranch(rawObject: JsonObject): Boolean = true

private fun matchesOutputItemsOutputWebFetchServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["content"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["httpStatus"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:web_fetch\"")))) } ?: true) && ((rawObject as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true))))

private fun matchesOutputItemsOutputToolSearchServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["query"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:tool_search\"")))) } ?: true))))

private fun matchesOutputItemsOutputMemoryServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["action"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"read\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"write\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"delete\"")))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["key"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:memory\"")))) } ?: true) && ((rawObject as JsonObject)["value"]?.let { property -> true } ?: true))))

private fun matchesOutputItemsOutputMcpServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["serverLabel"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["toolName"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:mcp\"")))) } ?: true))))

private fun matchesOutputItemsOutputSearchModelsServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["arguments"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["query"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:experimental__search_models\"")))) } ?: true))))

private fun matchesOutputItemsOutputFusionServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["analysis"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("blind_spots") && (property as JsonObject).containsKey("consensus") && (property as JsonObject).containsKey("contradictions") && (property as JsonObject).containsKey("partial_coverage") && (property as JsonObject).containsKey("unique_insights") && ((property as JsonObject)["blind_spots"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["consensus"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["contradictions"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("stances") && (item as JsonObject).containsKey("topic") && ((item as JsonObject)["stances"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && (item as JsonObject).containsKey("stance") && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["stance"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((item as JsonObject)["topic"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((property as JsonObject)["partial_coverage"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("models") && (item as JsonObject).containsKey("point") && ((item as JsonObject)["models"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((item as JsonObject)["point"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((property as JsonObject)["unique_insights"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("insight") && (item as JsonObject).containsKey("model") && ((item as JsonObject)["insight"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["failed_models"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("error") && (item as JsonObject).containsKey("model") && ((item as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["status_code"]?.let { property -> property.isJsonSchemaInteger() } ?: true)))) }))) } ?: true) && ((rawObject as JsonObject)["failure_reason"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["responses"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("model") && ((item as JsonObject)["content"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((rawObject as JsonObject)["sources"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> (item is JsonObject && (item !is JsonObject || ((item as JsonObject).containsKey("title") && (item as JsonObject).containsKey("url") && ((item as JsonObject)["title"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((item as JsonObject)["url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) }))) } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:fusion\"")))) } ?: true))))

private fun matchesOutputItemsOutputAdvisorServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["advice"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["instance_name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["prompt"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:advisor\"")))) } ?: true))))

private fun matchesOutputItemsOutputSubagentServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["outcome"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["task_description"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["task_name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:subagent\"")))) } ?: true))))

private fun matchesOutputItemsOutputFilesServerToolItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("status") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["error"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["filename"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["operation"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["result"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["status"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"in_progress\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"completed\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"incomplete\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"openrouter:files\"")))) } ?: true))))

private fun matchesOutputItemsOutputCustomToolCallItemBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("call_id") && (rawObject as JsonObject).containsKey("input") && (rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["call_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["input"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["namespace"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"custom_tool_call\"")))) } ?: true))))

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
