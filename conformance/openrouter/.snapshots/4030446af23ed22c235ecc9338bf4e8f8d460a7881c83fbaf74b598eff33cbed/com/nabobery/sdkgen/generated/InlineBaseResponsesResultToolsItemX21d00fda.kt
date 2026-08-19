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

public sealed class InlineBaseResponsesResultToolsItemX21d00fdaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException(
  message: String,
) : InlineBaseResponsesResultToolsItemX21d00fdaDecodingException(message)

public class InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException(
  message: String,
) : InlineBaseResponsesResultToolsItemX21d00fdaDecodingException(message)

public class InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException(
  message: String,
) : InlineBaseResponsesResultToolsItemX21d00fdaDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/tools/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/tools/items
 */
@Serializable(with = InlineBaseResponsesResultToolsItemX21d00fdaSerializer::class)
public sealed interface InlineBaseResponsesResultToolsItemX21d00fda {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineBaseResponsesResultToolsItemOneOf1X6ef85309 internal constructor(
    public val name: String,
    parameters: Map<String, JsonElement?>?,
    public val type: InlineFunctionToolTypeX23edb1b8,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public val parameters: Map<String, JsonElement?>? =
        parameters?.let { collection0 -> collection0.toMap() }

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        name: String,
        parameters: Map<String, JsonElement?>?,
        type: InlineFunctionToolTypeX23edb1b8,
      ): InlineBaseResponsesResultToolsItemOneOf1X6ef85309 {
        val parametersOwnershipSnapshot = parameters?.let { collection0 -> collection0.toMap() }
        val raw = buildJsonObject {
          put("name", name)
          put("parameters", SdkJson.encodeToJsonElement(parametersOwnershipSnapshot))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("InlineBaseResponsesResultToolsItemOneOf1X6ef85309 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineBaseResponsesResultToolsItemOneOf1X6ef85309(
          name = name,
          parameters = parametersOwnershipSnapshot,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class PreviewWebSearchServerTool internal constructor(
    public val type: InlinePreviewWebSearchServerToolTypeXc485f9b5,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlinePreviewWebSearchServerToolTypeXc485f9b5): PreviewWebSearchServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.previewWebSearchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("PreviewWebSearchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return PreviewWebSearchServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class Preview20250311WebSearchServerTool internal constructor(
    public val type: InlinePreview20250311WebSearchServerToolTypeX527f63bd,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlinePreview20250311WebSearchServerToolTypeX527f63bd): Preview20250311WebSearchServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.preview20250311WebSearchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("Preview20250311WebSearchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return Preview20250311WebSearchServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class LegacyWebSearchServerTool internal constructor(
    public val type: InlineLegacyWebSearchServerToolTypeXb725a510,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineLegacyWebSearchServerToolTypeXb725a510): LegacyWebSearchServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.legacyWebSearchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("LegacyWebSearchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return LegacyWebSearchServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class WebSearchServerTool internal constructor(
    public val type: InlineWebSearchServerToolTypeX7d2abf06,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineWebSearchServerToolTypeX7d2abf06): WebSearchServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webSearchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("WebSearchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebSearchServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class FileSearchServerTool internal constructor(
    public val type: InlineFileSearchServerToolTypeXcfb1e282,
    vectorStoreIds: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public val vectorStoreIds: List<String> = vectorStoreIds.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineFileSearchServerToolTypeXcfb1e282, vectorStoreIds: List<String>): FileSearchServerTool {
        val vectorStoreIdsOwnershipSnapshot = vectorStoreIds.toList()
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("vector_store_ids", SdkJson.encodeToJsonElement(vectorStoreIdsOwnershipSnapshot))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fileSearchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("FileSearchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FileSearchServerTool(
          type = type,
          vectorStoreIds = vectorStoreIdsOwnershipSnapshot,
          raw = raw,
        )
      }
    }
  }

  public class ComputerUseServerTool internal constructor(
    public val displayHeight: Int,
    public val displayWidth: Int,
    public val environment: InlineComputerUseServerToolEnvironmentXb519cc33,
    public val type: InlineComputerUseServerToolTypeXd55af592,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        displayHeight: Int,
        displayWidth: Int,
        environment: InlineComputerUseServerToolEnvironmentXb519cc33,
        type: InlineComputerUseServerToolTypeXd55af592,
      ): ComputerUseServerTool {
        val raw = buildJsonObject {
          put("display_height", SdkJson.encodeToJsonElement(displayHeight))
          put("display_width", SdkJson.encodeToJsonElement(displayWidth))
          put("environment", SdkJson.encodeToJsonElement(environment))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.computerUseServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("ComputerUseServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ComputerUseServerTool(
          displayHeight = displayHeight,
          displayWidth = displayWidth,
          environment = environment,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class CodeInterpreterServerTool internal constructor(
    public val container: InlineCodeInterpreterServerToolContainerX490ea590,
    public val type: InlineCodeInterpreterServerToolTypeX77a72d83,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(container: InlineCodeInterpreterServerToolContainerX490ea590, type: InlineCodeInterpreterServerToolTypeX77a72d83): CodeInterpreterServerTool {
        val raw = buildJsonObject {
          put("container", SdkJson.encodeToJsonElement(container))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.codeInterpreterServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("CodeInterpreterServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return CodeInterpreterServerTool(
          container = container,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class McpServerTool internal constructor(
    public val serverLabel: String,
    public val type: InlineMcpServerToolTypeXe80a2149,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(serverLabel: String, type: InlineMcpServerToolTypeXe80a2149): McpServerTool {
        val raw = buildJsonObject {
          put("server_label", serverLabel)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.mcpServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("McpServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return McpServerTool(
          serverLabel = serverLabel,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ImageGenerationServerTool internal constructor(
    public val type: InlineImageGenerationServerToolTypeX17e7461f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineImageGenerationServerToolTypeX17e7461f): ImageGenerationServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.imageGenerationServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("ImageGenerationServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ImageGenerationServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class CodexLocalShellTool internal constructor(
    public val type: InlineCodexLocalShellToolTypeX65141ad7,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineCodexLocalShellToolTypeX65141ad7): CodexLocalShellTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.codexLocalShellToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("CodexLocalShellTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return CodexLocalShellTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ShellServerTool internal constructor(
    public val type: InlineShellServerToolTypeX5a1681b4,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineShellServerToolTypeX5a1681b4): ShellServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.shellServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("ShellServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ShellServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class ApplyPatchServerTool internal constructor(
    public val type: InlineApplyPatchServerToolTypeXb68d4282,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineApplyPatchServerToolTypeXb68d4282): ApplyPatchServerTool {
        val raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.applyPatchServerToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("ApplyPatchServerTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ApplyPatchServerTool(
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class CustomTool internal constructor(
    public val name: String,
    public val type: InlineCustomToolTypeX0525c3ac,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(name: String, type: InlineCustomToolTypeX0525c3ac): CustomTool {
        val raw = buildJsonObject {
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.customToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("CustomTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return CustomTool(
          name = name,
          type = type,
          raw = raw,
        )
      }
    }
  }

  public class NamespaceTool internal constructor(
    public val description: String,
    public val name: String,
    tools: List<InlineNamespaceToolToolsItemXec65fe71>,
    public val type: InlineNamespaceToolTypeX01631f80,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineBaseResponsesResultToolsItemX21d00fda {
    public val tools: List<InlineNamespaceToolToolsItemXec65fe71> = tools.toList()

    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        description: String,
        name: String,
        tools: List<InlineNamespaceToolToolsItemXec65fe71>,
        type: InlineNamespaceToolTypeX01631f80,
      ): NamespaceTool {
        val toolsOwnershipSnapshot = tools.toList()
        val raw = buildJsonObject {
          put("description", description)
          put("name", name)
          put("tools", SdkJson.encodeToJsonElement(toolsOwnershipSnapshot))
          put("type", SdkJson.encodeToJsonElement(type))
        }
        val inspection = inspectInlineBaseResponsesResultToolsItemX21d00fda(raw)
        if (inspection.size == 0) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.namespaceToolMatches) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaBranchValidationException("NamespaceTool factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return NamespaceTool(
          description = description,
          name = name,
          tools = toolsOwnershipSnapshot,
          type = type,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineBaseResponsesResultToolsItemX21d00fdaSerializer : KSerializer<InlineBaseResponsesResultToolsItemX21d00fda> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineBaseResponsesResultToolsItemX21d00fda {
    val jsonDecoder = decoder.requireJsonDecoder("InlineBaseResponsesResultToolsItemX21d00fda")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: expected JSON object")
    val matches = inspectInlineBaseResponsesResultToolsItemX21d00fda(rawObject)
    if (matches.size == 0) {
      throw InlineBaseResponsesResultToolsItemX21d00fdaNoMatchException("InlineBaseResponsesResultToolsItemX21d00fda matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineBaseResponsesResultToolsItemX21d00fdaAmbiguityException("InlineBaseResponsesResultToolsItemX21d00fda matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches -> InlineBaseResponsesResultToolsItemX21d00fda.InlineBaseResponsesResultToolsItemOneOf1X6ef85309(name = requireNotNull(matches.name), parameters = matches.parameters, type = requireNotNull(matches.typeState7), raw = rawObject)
      matches.previewWebSearchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.PreviewWebSearchServerTool(type = requireNotNull(matches.typeState13), raw = rawObject)
      matches.preview20250311WebSearchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.Preview20250311WebSearchServerTool(type = requireNotNull(matches.typeState12), raw = rawObject)
      matches.legacyWebSearchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.LegacyWebSearchServerTool(type = requireNotNull(matches.typeState9), raw = rawObject)
      matches.webSearchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.WebSearchServerTool(type = requireNotNull(matches.typeState15), raw = rawObject)
      matches.fileSearchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.FileSearchServerTool(type = requireNotNull(matches.typeState6), vectorStoreIds = requireNotNull(matches.vectorStoreIds), raw = rawObject)
      matches.computerUseServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.ComputerUseServerTool(displayHeight = requireNotNull(matches.displayHeight), displayWidth = requireNotNull(matches.displayWidth), environment = requireNotNull(matches.environment), type = requireNotNull(matches.typeState4), raw = rawObject)
      matches.codeInterpreterServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.CodeInterpreterServerTool(container = requireNotNull(matches.container), type = requireNotNull(matches.typeState2), raw = rawObject)
      matches.mcpServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.McpServerTool(serverLabel = requireNotNull(matches.serverLabel), type = requireNotNull(matches.typeState10), raw = rawObject)
      matches.imageGenerationServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.ImageGenerationServerTool(type = requireNotNull(matches.typeState8), raw = rawObject)
      matches.codexLocalShellToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.CodexLocalShellTool(type = requireNotNull(matches.typeState3), raw = rawObject)
      matches.shellServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.ShellServerTool(type = requireNotNull(matches.typeState14), raw = rawObject)
      matches.applyPatchServerToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.ApplyPatchServerTool(type = requireNotNull(matches.typeState1), raw = rawObject)
      matches.customToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.CustomTool(name = requireNotNull(matches.name), type = requireNotNull(matches.typeState5), raw = rawObject)
      matches.namespaceToolMatches -> InlineBaseResponsesResultToolsItemX21d00fda.NamespaceTool(description = requireNotNull(matches.description), name = requireNotNull(matches.name), tools = requireNotNull(matches.tools), type = requireNotNull(matches.typeState11), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineBaseResponsesResultToolsItemX21d00fda) {
    encoder.requireJsonEncoder("InlineBaseResponsesResultToolsItemX21d00fda").encodeJsonElement(value.raw)
  }
}

internal data class InlineBaseResponsesResultToolsItemX21d00fdaInspection(
  public val name: String?,
  public val nameDecoded: Boolean,
  public val parameters: Map<String, JsonElement?>?,
  public val parametersPresent: Boolean,
  public val parametersDecoded: Boolean,
  public val typeState7: InlineFunctionToolTypeX23edb1b8?,
  public val typeState7Decoded: Boolean,
  public val typeState7Matches: Boolean,
  public val typeState13: InlinePreviewWebSearchServerToolTypeXc485f9b5?,
  public val typeState13Decoded: Boolean,
  public val typeState13Matches: Boolean,
  public val typeState12: InlinePreview20250311WebSearchServerToolTypeX527f63bd?,
  public val typeState12Decoded: Boolean,
  public val typeState12Matches: Boolean,
  public val typeState9: InlineLegacyWebSearchServerToolTypeXb725a510?,
  public val typeState9Decoded: Boolean,
  public val typeState9Matches: Boolean,
  public val typeState15: InlineWebSearchServerToolTypeX7d2abf06?,
  public val typeState15Decoded: Boolean,
  public val typeState15Matches: Boolean,
  public val typeState6: InlineFileSearchServerToolTypeXcfb1e282?,
  public val typeState6Decoded: Boolean,
  public val typeState6Matches: Boolean,
  public val vectorStoreIds: List<String>?,
  public val vectorStoreIdsDecoded: Boolean,
  public val displayHeight: Int?,
  public val displayHeightDecoded: Boolean,
  public val displayWidth: Int?,
  public val displayWidthDecoded: Boolean,
  public val environment: InlineComputerUseServerToolEnvironmentXb519cc33?,
  public val environmentDecoded: Boolean,
  public val environmentMatches: Boolean,
  public val typeState4: InlineComputerUseServerToolTypeXd55af592?,
  public val typeState4Decoded: Boolean,
  public val typeState4Matches: Boolean,
  public val container: InlineCodeInterpreterServerToolContainerX490ea590?,
  public val containerDecoded: Boolean,
  public val typeState2: InlineCodeInterpreterServerToolTypeX77a72d83?,
  public val typeState2Decoded: Boolean,
  public val typeState2Matches: Boolean,
  public val serverLabel: String?,
  public val serverLabelDecoded: Boolean,
  public val typeState10: InlineMcpServerToolTypeXe80a2149?,
  public val typeState10Decoded: Boolean,
  public val typeState10Matches: Boolean,
  public val typeState8: InlineImageGenerationServerToolTypeX17e7461f?,
  public val typeState8Decoded: Boolean,
  public val typeState8Matches: Boolean,
  public val typeState3: InlineCodexLocalShellToolTypeX65141ad7?,
  public val typeState3Decoded: Boolean,
  public val typeState3Matches: Boolean,
  public val typeState14: InlineShellServerToolTypeX5a1681b4?,
  public val typeState14Decoded: Boolean,
  public val typeState14Matches: Boolean,
  public val typeState1: InlineApplyPatchServerToolTypeXb68d4282?,
  public val typeState1Decoded: Boolean,
  public val typeState1Matches: Boolean,
  public val typeState5: InlineCustomToolTypeX0525c3ac?,
  public val typeState5Decoded: Boolean,
  public val typeState5Matches: Boolean,
  public val description: String?,
  public val descriptionDecoded: Boolean,
  public val tools: List<InlineNamespaceToolToolsItemXec65fe71>?,
  public val toolsDecoded: Boolean,
  public val typeState11: InlineNamespaceToolTypeX01631f80?,
  public val typeState11Decoded: Boolean,
  public val typeState11Matches: Boolean,
  public val inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches: Boolean,
  public val previewWebSearchServerToolMatches: Boolean,
  public val preview20250311WebSearchServerToolMatches: Boolean,
  public val legacyWebSearchServerToolMatches: Boolean,
  public val webSearchServerToolMatches: Boolean,
  public val fileSearchServerToolMatches: Boolean,
  public val computerUseServerToolMatches: Boolean,
  public val codeInterpreterServerToolMatches: Boolean,
  public val mcpServerToolMatches: Boolean,
  public val imageGenerationServerToolMatches: Boolean,
  public val codexLocalShellToolMatches: Boolean,
  public val shellServerToolMatches: Boolean,
  public val applyPatchServerToolMatches: Boolean,
  public val customToolMatches: Boolean,
  public val namespaceToolMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches) add("InlineBaseResponsesResultToolsItemOneOf1X6ef85309")
      if (previewWebSearchServerToolMatches) add("PreviewWebSearchServerTool")
      if (preview20250311WebSearchServerToolMatches) add("Preview20250311WebSearchServerTool")
      if (legacyWebSearchServerToolMatches) add("LegacyWebSearchServerTool")
      if (webSearchServerToolMatches) add("WebSearchServerTool")
      if (fileSearchServerToolMatches) add("FileSearchServerTool")
      if (computerUseServerToolMatches) add("ComputerUseServerTool")
      if (codeInterpreterServerToolMatches) add("CodeInterpreterServerTool")
      if (mcpServerToolMatches) add("McpServerTool")
      if (imageGenerationServerToolMatches) add("ImageGenerationServerTool")
      if (codexLocalShellToolMatches) add("CodexLocalShellTool")
      if (shellServerToolMatches) add("ShellServerTool")
      if (applyPatchServerToolMatches) add("ApplyPatchServerTool")
      if (customToolMatches) add("CustomTool")
      if (namespaceToolMatches) add("NamespaceTool")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineBaseResponsesResultToolsItemX21d00fda(rawObject: JsonObject): InlineBaseResponsesResultToolsItemX21d00fdaInspection {
  val nameResult = rawObject["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val parametersResult = rawObject["parameters"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Map<String, JsonElement?>?>(element) } }
  val parameters = parametersResult?.getOrNull()
  val parametersPresent = rawObject.containsKey("parameters")
  val parametersDecoded = parametersResult?.isSuccess == true
  val typeState7Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFunctionToolTypeX23edb1b8>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState7Matches = (rawObject.stringValue("type") == "function") && typeState7Decoded
  val typeState13Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlinePreviewWebSearchServerToolTypeXc485f9b5>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState13Matches = (rawObject.stringValue("type") == "web_search_preview") && typeState13Decoded
  val typeState12Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlinePreview20250311WebSearchServerToolTypeX527f63bd>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState12Matches = (rawObject.stringValue("type") == "web_search_preview_2025_03_11") && typeState12Decoded
  val typeState9Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineLegacyWebSearchServerToolTypeXb725a510>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState9Matches = (rawObject.stringValue("type") == "web_search") && typeState9Decoded
  val typeState15Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebSearchServerToolTypeX7d2abf06>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState15Matches = (rawObject.stringValue("type") == "web_search_2025_08_26") && typeState15Decoded
  val typeState6Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFileSearchServerToolTypeXcfb1e282>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val typeState6Matches = (rawObject.stringValue("type") == "file_search") && typeState6Decoded
  val vectorStoreIdsResult = rawObject["vector_store_ids"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<String>>(element) } }
  val vectorStoreIds = vectorStoreIdsResult?.getOrNull()
  val vectorStoreIdsDecoded = vectorStoreIdsResult?.isSuccess == true
  val displayHeightResult = rawObject["display_height"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val displayHeight = displayHeightResult?.getOrNull()
  val displayHeightDecoded = displayHeightResult?.isSuccess == true
  val displayWidthResult = rawObject["display_width"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Int>(element) } }
  val displayWidth = displayWidthResult?.getOrNull()
  val displayWidthDecoded = displayWidthResult?.isSuccess == true
  val environmentResult = rawObject["environment"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineComputerUseServerToolEnvironmentXb519cc33>(element) } }
  val environment = environmentResult?.getOrNull()
  val environmentDecoded = environmentResult?.isSuccess == true
  val environmentMatches = (rawObject.stringValue("environment") == "browser" || rawObject.stringValue("environment") == "linux" || rawObject.stringValue("environment") == "mac" || rawObject.stringValue("environment") == "ubuntu" || rawObject.stringValue("environment") == "windows") && environmentDecoded
  val typeState4Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineComputerUseServerToolTypeXd55af592>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val typeState4Matches = (rawObject.stringValue("type") == "computer_use_preview") && typeState4Decoded
  val containerResult = rawObject["container"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCodeInterpreterServerToolContainerX490ea590>(element) } }
  val container = containerResult?.getOrNull()
  val containerDecoded = containerResult?.isSuccess == true
  val typeState2Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCodeInterpreterServerToolTypeX77a72d83>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val typeState2Matches = (rawObject.stringValue("type") == "code_interpreter") && typeState2Decoded
  val serverLabelResult = rawObject["server_label"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val serverLabel = serverLabelResult?.getOrNull()
  val serverLabelDecoded = serverLabelResult?.isSuccess == true
  val typeState10Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineMcpServerToolTypeXe80a2149>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState10Matches = (rawObject.stringValue("type") == "mcp") && typeState10Decoded
  val typeState8Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineImageGenerationServerToolTypeX17e7461f>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState8Matches = (rawObject.stringValue("type") == "image_generation") && typeState8Decoded
  val typeState3Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCodexLocalShellToolTypeX65141ad7>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState3Matches = (rawObject.stringValue("type") == "local_shell") && typeState3Decoded
  val typeState14Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineShellServerToolTypeX5a1681b4>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState14Matches = (rawObject.stringValue("type") == "shell") && typeState14Decoded
  val typeState1Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineApplyPatchServerToolTypeXb68d4282>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState1Matches = (rawObject.stringValue("type") == "apply_patch") && typeState1Decoded
  val typeState5Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineCustomToolTypeX0525c3ac>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val typeState5Matches = (rawObject.stringValue("type") == "custom") && typeState5Decoded
  val descriptionResult = rawObject["description"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val description = descriptionResult?.getOrNull()
  val descriptionDecoded = descriptionResult?.isSuccess == true
  val toolsResult = rawObject["tools"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<List<InlineNamespaceToolToolsItemXec65fe71>>(element) } }
  val tools = toolsResult?.getOrNull()
  val toolsDecoded = toolsResult?.isSuccess == true
  val typeState11Result = rawObject["type"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineNamespaceToolTypeX01631f80>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  val typeState11Matches = (rawObject.stringValue("type") == "namespace") && typeState11Decoded
  val rawEmpty = rawObject.isEmpty()
  val inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches = matchesInlineBaseResponsesResultToolsItemX21d00fdaInlineBaseResponsesResultToolsItemOneOf1X6ef85309Branch(rawObject) && (nameDecoded && parametersPresent && parametersDecoded && typeState7Matches)
  val previewWebSearchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaPreviewWebSearchServerToolBranch(rawObject) && (typeState13Matches)
  val preview20250311WebSearchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaPreview20250311WebSearchServerToolBranch(rawObject) && (typeState12Matches)
  val legacyWebSearchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaLegacyWebSearchServerToolBranch(rawObject) && (typeState9Matches)
  val webSearchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaWebSearchServerToolBranch(rawObject) && (typeState15Matches)
  val fileSearchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaFileSearchServerToolBranch(rawObject) && (typeState6Matches && vectorStoreIdsDecoded)
  val computerUseServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaComputerUseServerToolBranch(rawObject) && (displayHeightDecoded && displayWidthDecoded && environmentMatches && typeState4Matches)
  val codeInterpreterServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaCodeInterpreterServerToolBranch(rawObject) && (containerDecoded && typeState2Matches)
  val mcpServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaMcpServerToolBranch(rawObject) && (serverLabelDecoded && typeState10Matches)
  val imageGenerationServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaImageGenerationServerToolBranch(rawObject) && (typeState8Matches)
  val codexLocalShellToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaCodexLocalShellToolBranch(rawObject) && (typeState3Matches)
  val shellServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaShellServerToolBranch(rawObject) && (typeState14Matches)
  val applyPatchServerToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaApplyPatchServerToolBranch(rawObject) && (typeState1Matches)
  val customToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaCustomToolBranch(rawObject) && (nameDecoded && typeState5Matches)
  val namespaceToolMatches = matchesInlineBaseResponsesResultToolsItemX21d00fdaNamespaceToolBranch(rawObject) && (descriptionDecoded && nameDecoded && toolsDecoded && typeState11Matches)
  return InlineBaseResponsesResultToolsItemX21d00fdaInspection(
    name = name,
    nameDecoded = nameDecoded,
    parameters = parameters,
    parametersPresent = parametersPresent,
    parametersDecoded = parametersDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState7Matches = typeState7Matches,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState13Matches = typeState13Matches,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState12Matches = typeState12Matches,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState9Matches = typeState9Matches,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState15Matches = typeState15Matches,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    typeState6Matches = typeState6Matches,
    vectorStoreIds = vectorStoreIds,
    vectorStoreIdsDecoded = vectorStoreIdsDecoded,
    displayHeight = displayHeight,
    displayHeightDecoded = displayHeightDecoded,
    displayWidth = displayWidth,
    displayWidthDecoded = displayWidthDecoded,
    environment = environment,
    environmentDecoded = environmentDecoded,
    environmentMatches = environmentMatches,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    typeState4Matches = typeState4Matches,
    container = container,
    containerDecoded = containerDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    typeState2Matches = typeState2Matches,
    serverLabel = serverLabel,
    serverLabelDecoded = serverLabelDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState10Matches = typeState10Matches,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState8Matches = typeState8Matches,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState3Matches = typeState3Matches,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState14Matches = typeState14Matches,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState1Matches = typeState1Matches,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    typeState5Matches = typeState5Matches,
    description = description,
    descriptionDecoded = descriptionDecoded,
    tools = tools,
    toolsDecoded = toolsDecoded,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    typeState11Matches = typeState11Matches,
    inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches = inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches,
    previewWebSearchServerToolMatches = previewWebSearchServerToolMatches,
    preview20250311WebSearchServerToolMatches = preview20250311WebSearchServerToolMatches,
    legacyWebSearchServerToolMatches = legacyWebSearchServerToolMatches,
    webSearchServerToolMatches = webSearchServerToolMatches,
    fileSearchServerToolMatches = fileSearchServerToolMatches,
    computerUseServerToolMatches = computerUseServerToolMatches,
    codeInterpreterServerToolMatches = codeInterpreterServerToolMatches,
    mcpServerToolMatches = mcpServerToolMatches,
    imageGenerationServerToolMatches = imageGenerationServerToolMatches,
    codexLocalShellToolMatches = codexLocalShellToolMatches,
    shellServerToolMatches = shellServerToolMatches,
    applyPatchServerToolMatches = applyPatchServerToolMatches,
    customToolMatches = customToolMatches,
    namespaceToolMatches = namespaceToolMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!inlineBaseResponsesResultToolsItemOneOf1X6ef85309Matches) add("InlineBaseResponsesResultToolsItemOneOf1X6ef85309: branch predicate did not match properties 'name' and 'parameters' and 'type'")
      if (!previewWebSearchServerToolMatches) add("PreviewWebSearchServerTool: branch predicate did not match properties 'type'")
      if (!preview20250311WebSearchServerToolMatches) add("Preview20250311WebSearchServerTool: branch predicate did not match properties 'type'")
      if (!legacyWebSearchServerToolMatches) add("LegacyWebSearchServerTool: branch predicate did not match properties 'type'")
      if (!webSearchServerToolMatches) add("WebSearchServerTool: branch predicate did not match properties 'type'")
      if (!fileSearchServerToolMatches) add("FileSearchServerTool: branch predicate did not match properties 'type' and 'vector_store_ids'")
      if (!computerUseServerToolMatches) add("ComputerUseServerTool: branch predicate did not match properties 'display_height' and 'display_width' and 'environment' and 'type'")
      if (!codeInterpreterServerToolMatches) add("CodeInterpreterServerTool: branch predicate did not match properties 'container' and 'type'")
      if (!mcpServerToolMatches) add("McpServerTool: branch predicate did not match properties 'server_label' and 'type'")
      if (!imageGenerationServerToolMatches) add("ImageGenerationServerTool: branch predicate did not match properties 'type'")
      if (!codexLocalShellToolMatches) add("CodexLocalShellTool: branch predicate did not match properties 'type'")
      if (!shellServerToolMatches) add("ShellServerTool: branch predicate did not match properties 'type'")
      if (!applyPatchServerToolMatches) add("ApplyPatchServerTool: branch predicate did not match properties 'type'")
      if (!customToolMatches) add("CustomTool: branch predicate did not match properties 'name' and 'type'")
      if (!namespaceToolMatches) add("NamespaceTool: branch predicate did not match properties 'description' and 'name' and 'tools' and 'type'")
    },
  )
}

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaInlineBaseResponsesResultToolsItemOneOf1X6ef85309Branch(rawObject: JsonObject): Boolean = ((rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("name") && (rawObject as JsonObject).containsKey("parameters") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["description"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["name"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["parameters"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).all { (name, value) -> name in setOf<String>() || true }))) } ?: true) && ((rawObject as JsonObject)["strict"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"function\"")))) } ?: true)))) && rawObject is JsonObject)

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaPreviewWebSearchServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"native\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"exa\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"parallel\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"firecrawl\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"perplexity\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["filters"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["allowed_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["excluded_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["max_results"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_context_size"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web_search_preview\"")))) } ?: true) && ((rawObject as JsonObject)["user_location"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["city"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["country"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"approximate\"")))) } ?: true)))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaPreview20250311WebSearchServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"native\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"exa\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"parallel\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"firecrawl\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"perplexity\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["filters"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["allowed_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["excluded_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["max_results"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_context_size"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web_search_preview_2025_03_11\"")))) } ?: true) && ((rawObject as JsonObject)["user_location"]?.let { property -> (property is JsonObject && (property !is JsonObject || ((property as JsonObject).containsKey("type") && ((property as JsonObject)["city"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["country"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"approximate\"")))) } ?: true)))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaLegacyWebSearchServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"native\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"exa\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"parallel\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"firecrawl\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"perplexity\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["filters"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["allowed_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["excluded_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["max_results"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_context_size"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web_search\"")))) } ?: true) && ((rawObject as JsonObject)["user_location"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["city"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["country"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"approximate\"")))) } ?: true)))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaWebSearchServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"native\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"exa\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"parallel\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"firecrawl\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"perplexity\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["filters"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["allowed_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((property as JsonObject)["excluded_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true)))) } ?: true) && ((rawObject as JsonObject)["max_results"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_context_size"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web_search_2025_08_26\"")))) } ?: true) && ((rawObject as JsonObject)["user_location"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["city"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["country"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"approximate\"")))) } ?: true)))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaFileSearchServerToolBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaComputerUseServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("display_height") && (rawObject as JsonObject).containsKey("display_width") && (rawObject as JsonObject).containsKey("environment") && (rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["display_height"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["display_width"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["environment"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"windows\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"mac\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"linux\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"ubuntu\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"browser\"")))) } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"computer_use_preview\"")))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaCodeInterpreterServerToolBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaMcpServerToolBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaImageGenerationServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["background"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"transparent\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"opaque\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["input_fidelity"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("null")))) } ?: true) && ((rawObject as JsonObject)["input_image_mask"]?.let { property -> (property is JsonObject && (property !is JsonObject || (((property as JsonObject)["file_id"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["image_url"]?.let { property -> property is JsonPrimitive && property.isString } ?: true)))) } ?: true) && ((rawObject as JsonObject)["model"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["moderation"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")))) } ?: true) && ((rawObject as JsonObject)["output_compression"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["output_format"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"png\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"webp\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"jpeg\"")))) } ?: true) && ((rawObject as JsonObject)["partial_images"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["quality"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"low\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"medium\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"high\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto\"")))) } ?: true) && ((rawObject as JsonObject)["size"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"image_generation\"")))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaCodexLocalShellToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"local_shell\"")))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaShellServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"shell\"")))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaApplyPatchServerToolBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("type") && ((rawObject as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"apply_patch\"")))) } ?: true))))

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaCustomToolBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineBaseResponsesResultToolsItemX21d00fdaNamespaceToolBranch(rawObject: JsonObject): Boolean = true

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
