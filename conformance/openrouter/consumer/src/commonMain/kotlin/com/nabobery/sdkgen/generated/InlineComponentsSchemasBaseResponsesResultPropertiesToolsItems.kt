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

public sealed class InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsDecodingException(message)

public class InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/BaseResponsesResult/properties/tools/items.
 */
@Serializable(with = InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems.Serializer::class)
public sealed interface InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0 internal constructor(
    public val name: String,
    public val parameters: Map<String, JsonElement?>?,
    public val type: InlineComponentsSchemasFunctionToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        name: String,
        parameters: Map<String, JsonElement?>?,
        type: InlineComponentsSchemasFunctionToolPropertiesType,
      ): InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0 =
        InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0(
        name = name,
        parameters = parameters,
        type = type,
        raw = buildJsonObject {
          put("name", name)
          put("parameters", SdkJson.encodeToJsonElement(parameters))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class PreviewWebSearchServerTool internal constructor(
    public val type: InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType): PreviewWebSearchServerTool = PreviewWebSearchServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class Preview20250311WebSearchServerTool internal constructor(
    public val type: InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType): Preview20250311WebSearchServerTool = Preview20250311WebSearchServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class LegacyWebSearchServerTool internal constructor(
    public val type: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType): LegacyWebSearchServerTool =
        LegacyWebSearchServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class WebSearchServerTool internal constructor(
    public val type: InlineComponentsSchemasWebSearchServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasWebSearchServerToolPropertiesType): WebSearchServerTool =
        WebSearchServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class FileSearchServerTool internal constructor(
    public val type: InlineComponentsSchemasFileSearchServerToolPropertiesType,
    public val vectorStoreIds: List<String>,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasFileSearchServerToolPropertiesType,
        vectorStoreIds: List<String>): FileSearchServerTool = FileSearchServerTool(
        type = type,
        vectorStoreIds = vectorStoreIds,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
          put("vector_store_ids", SdkJson.encodeToJsonElement(vectorStoreIds))
        },
      )
    }
  }

  public class ComputerUseServerTool internal constructor(
    public val displayHeight: Int,
    public val displayWidth: Int,
    public val environment: InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment,
    public val type: InlineComponentsSchemasComputerUseServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        displayHeight: Int,
        displayWidth: Int,
        environment: InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment,
        type: InlineComponentsSchemasComputerUseServerToolPropertiesType,
      ): ComputerUseServerTool = ComputerUseServerTool(
        displayHeight = displayHeight,
        displayWidth = displayWidth,
        environment = environment,
        type = type,
        raw = buildJsonObject {
          put("display_height", SdkJson.encodeToJsonElement(displayHeight))
          put("display_width", SdkJson.encodeToJsonElement(displayWidth))
          put("environment", SdkJson.encodeToJsonElement(environment))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class CodeInterpreterServerTool internal constructor(
    public val container: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer,
    public val type: InlineComponentsSchemasCodeInterpreterServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(container: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer,
        type: InlineComponentsSchemasCodeInterpreterServerToolPropertiesType): CodeInterpreterServerTool =
          CodeInterpreterServerTool(
        container = container,
        type = type,
        raw = buildJsonObject {
          put("container", SdkJson.encodeToJsonElement(container))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class McpServerTool internal constructor(
    public val serverLabel: String,
    public val type: InlineComponentsSchemasMcpServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(serverLabel: String, type: InlineComponentsSchemasMcpServerToolPropertiesType): McpServerTool =
        McpServerTool(
        serverLabel = serverLabel,
        type = type,
        raw = buildJsonObject {
          put("server_label", serverLabel)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ImageGenerationServerTool internal constructor(
    public val type: InlineComponentsSchemasImageGenerationServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasImageGenerationServerToolPropertiesType): ImageGenerationServerTool =
        ImageGenerationServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class CodexLocalShellTool internal constructor(
    public val type: InlineComponentsSchemasCodexLocalShellToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasCodexLocalShellToolPropertiesType): CodexLocalShellTool =
        CodexLocalShellTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ShellServerTool internal constructor(
    public val type: InlineComponentsSchemasShellServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasShellServerToolPropertiesType): ShellServerTool = ShellServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class ApplyPatchServerTool internal constructor(
    public val type: InlineComponentsSchemasApplyPatchServerToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(type: InlineComponentsSchemasApplyPatchServerToolPropertiesType): ApplyPatchServerTool =
        ApplyPatchServerTool(
        type = type,
        raw = buildJsonObject {
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class CustomTool internal constructor(
    public val name: String,
    public val type: InlineComponentsSchemasCustomToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(name: String, type: InlineComponentsSchemasCustomToolPropertiesType): CustomTool = CustomTool(
        name = name,
        type = type,
        raw = buildJsonObject {
          put("name", name)
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public class NamespaceTool internal constructor(
    public val description: String,
    public val name: String,
    public val tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>,
    public val type: InlineComponentsSchemasNamespaceToolPropertiesType,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        description: String,
        name: String,
        tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>,
        type: InlineComponentsSchemasNamespaceToolPropertiesType,
      ): NamespaceTool = NamespaceTool(
        description = description,
        name = name,
        tools = tools,
        type = type,
        raw = buildJsonObject {
          put("description", description)
          put("name", name)
          put("tools", SdkJson.encodeToJsonElement(tools))
          put("type", SdkJson.encodeToJsonElement(type))
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsNoMatchException("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasBaseResponsesResultPropertiesToolsItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsNoMatchException("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsAmbiguityException("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.nameDecoded && matches.parametersPresent && matches.parametersDecoded && matches.typeState7Decoded ->
          InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0(name = requireNotNull(matches.name),
            parameters = matches.parameters, type = requireNotNull(matches.typeState7), raw = raw)
        matches.typeState13Decoded -> PreviewWebSearchServerTool(type = requireNotNull(matches.typeState13), raw = raw)
        matches.typeState12Decoded -> Preview20250311WebSearchServerTool(type = requireNotNull(matches.typeState12),
          raw = raw)
        matches.typeState9Decoded -> LegacyWebSearchServerTool(type = requireNotNull(matches.typeState9), raw = raw)
        matches.typeState15Decoded -> WebSearchServerTool(type = requireNotNull(matches.typeState15), raw = raw)
        matches.typeState6Decoded && matches.vectorStoreIdsDecoded -> FileSearchServerTool(type =
          requireNotNull(matches.typeState6), vectorStoreIds = requireNotNull(matches.vectorStoreIds), raw = raw)
        matches.displayHeightDecoded && matches.displayWidthDecoded && matches.environmentDecoded && matches
          .typeState4Decoded -> ComputerUseServerTool(displayHeight = requireNotNull(matches.displayHeight),
            displayWidth = requireNotNull(matches.displayWidth), environment = requireNotNull(matches.environment),
              type = requireNotNull(matches.typeState4), raw = raw)
        matches.containerDecoded && matches.typeState2Decoded -> CodeInterpreterServerTool(container =
          requireNotNull(matches.container), type = requireNotNull(matches.typeState2), raw = raw)
        matches.serverLabelDecoded && matches.typeState10Decoded -> McpServerTool(serverLabel = requireNotNull(matches
          .serverLabel), type = requireNotNull(matches.typeState10), raw = raw)
        matches.typeState8Decoded -> ImageGenerationServerTool(type = requireNotNull(matches.typeState8), raw = raw)
        matches.typeState3Decoded -> CodexLocalShellTool(type = requireNotNull(matches.typeState3), raw = raw)
        matches.typeState14Decoded -> ShellServerTool(type = requireNotNull(matches.typeState14), raw = raw)
        matches.typeState1Decoded -> ApplyPatchServerTool(type = requireNotNull(matches.typeState1), raw = raw)
        matches.nameDecoded && matches.typeState5Decoded -> CustomTool(name = requireNotNull(matches.name), type =
          requireNotNull(matches.typeState5), raw = raw)
        matches.descriptionDecoded && matches.nameDecoded && matches.toolsDecoded && matches.typeState11Decoded ->
          NamespaceTool(description = requireNotNull(matches.description), name = requireNotNull(matches.name), tools =
            requireNotNull(matches.tools), type = requireNotNull(matches.typeState11), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsInspection(
  public val name: String?,
  public val nameDecoded: Boolean,
  public val parameters: Map<String, JsonElement?>?,
  public val parametersPresent: Boolean,
  public val parametersDecoded: Boolean,
  public val typeState7: InlineComponentsSchemasFunctionToolPropertiesType?,
  public val typeState7Decoded: Boolean,
  public val typeState13: InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType?,
  public val typeState13Decoded: Boolean,
  public val typeState12: InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType?,
  public val typeState12Decoded: Boolean,
  public val typeState9: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType?,
  public val typeState9Decoded: Boolean,
  public val typeState15: InlineComponentsSchemasWebSearchServerToolPropertiesType?,
  public val typeState15Decoded: Boolean,
  public val typeState6: InlineComponentsSchemasFileSearchServerToolPropertiesType?,
  public val typeState6Decoded: Boolean,
  public val vectorStoreIds: List<String>?,
  public val vectorStoreIdsDecoded: Boolean,
  public val displayHeight: Int?,
  public val displayHeightDecoded: Boolean,
  public val displayWidth: Int?,
  public val displayWidthDecoded: Boolean,
  public val environment: InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment?,
  public val environmentDecoded: Boolean,
  public val typeState4: InlineComponentsSchemasComputerUseServerToolPropertiesType?,
  public val typeState4Decoded: Boolean,
  public val container: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer?,
  public val containerDecoded: Boolean,
  public val typeState2: InlineComponentsSchemasCodeInterpreterServerToolPropertiesType?,
  public val typeState2Decoded: Boolean,
  public val serverLabel: String?,
  public val serverLabelDecoded: Boolean,
  public val typeState10: InlineComponentsSchemasMcpServerToolPropertiesType?,
  public val typeState10Decoded: Boolean,
  public val typeState8: InlineComponentsSchemasImageGenerationServerToolPropertiesType?,
  public val typeState8Decoded: Boolean,
  public val typeState3: InlineComponentsSchemasCodexLocalShellToolPropertiesType?,
  public val typeState3Decoded: Boolean,
  public val typeState14: InlineComponentsSchemasShellServerToolPropertiesType?,
  public val typeState14Decoded: Boolean,
  public val typeState1: InlineComponentsSchemasApplyPatchServerToolPropertiesType?,
  public val typeState1Decoded: Boolean,
  public val typeState5: InlineComponentsSchemasCustomToolPropertiesType?,
  public val typeState5Decoded: Boolean,
  public val description: String?,
  public val descriptionDecoded: Boolean,
  public val tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>?,
  public val toolsDecoded: Boolean,
  public val typeState11: InlineComponentsSchemasNamespaceToolPropertiesType?,
  public val typeState11Decoded: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (nameDecoded && parametersPresent && parametersDecoded &&
        typeState7Decoded) add("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0")
      if (typeState13Decoded) add("PreviewWebSearchServerTool")
      if (typeState12Decoded) add("Preview20250311WebSearchServerTool")
      if (typeState9Decoded) add("LegacyWebSearchServerTool")
      if (typeState15Decoded) add("WebSearchServerTool")
      if (typeState6Decoded && vectorStoreIdsDecoded) add("FileSearchServerTool")
      if (displayHeightDecoded && displayWidthDecoded && environmentDecoded &&
        typeState4Decoded) add("ComputerUseServerTool")
      if (containerDecoded && typeState2Decoded) add("CodeInterpreterServerTool")
      if (serverLabelDecoded && typeState10Decoded) add("McpServerTool")
      if (typeState8Decoded) add("ImageGenerationServerTool")
      if (typeState3Decoded) add("CodexLocalShellTool")
      if (typeState14Decoded) add("ShellServerTool")
      if (typeState1Decoded) add("ApplyPatchServerTool")
      if (nameDecoded && typeState5Decoded) add("CustomTool")
      if (descriptionDecoded && nameDecoded && toolsDecoded && typeState11Decoded) add("NamespaceTool")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasBaseResponsesResultPropertiesToolsItems(raw: JsonObject): InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsInspection {
  val nameResult = raw["name"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val name = nameResult?.getOrNull()
  val nameDecoded = nameResult?.isSuccess == true
  val parametersResult = raw["parameters"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Map<String,
    JsonElement?>?>(element) } }
  val parameters = parametersResult?.getOrNull()
  val parametersPresent = raw.containsKey("parameters")
  val parametersDecoded = parametersResult?.isSuccess == true
  val typeState7Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasFunctionToolPropertiesType>(element) } }
  val typeState7 = typeState7Result?.getOrNull()
  val typeState7Decoded = typeState7Result?.isSuccess == true
  val typeState13Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasPreviewWebSearchServerToolPropertiesType>(element) } }
  val typeState13 = typeState13Result?.getOrNull()
  val typeState13Decoded = typeState13Result?.isSuccess == true
  val typeState12Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasPreview20250311WebSearchServerToolPropertiesType>(element) } }
  val typeState12 = typeState12Result?.getOrNull()
  val typeState12Decoded = typeState12Result?.isSuccess == true
  val typeState9Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType>(element) } }
  val typeState9 = typeState9Result?.getOrNull()
  val typeState9Decoded = typeState9Result?.isSuccess == true
  val typeState15Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasWebSearchServerToolPropertiesType>(element) } }
  val typeState15 = typeState15Result?.getOrNull()
  val typeState15Decoded = typeState15Result?.isSuccess == true
  val typeState6Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasFileSearchServerToolPropertiesType>(element) } }
  val typeState6 = typeState6Result?.getOrNull()
  val typeState6Decoded = typeState6Result?.isSuccess == true
  val vectorStoreIdsResult = raw["vector_store_ids"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<String>>(element) } }
  val vectorStoreIds = vectorStoreIdsResult?.getOrNull()
  val vectorStoreIdsDecoded = vectorStoreIdsResult?.isSuccess == true
  val displayHeightResult = raw["display_height"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val displayHeight = displayHeightResult?.getOrNull()
  val displayHeightDecoded = displayHeightResult?.isSuccess == true
  val displayWidthResult = raw["display_width"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<Int>(element) } }
  val displayWidth = displayWidthResult?.getOrNull()
  val displayWidthDecoded = displayWidthResult?.isSuccess == true
  val environmentResult = raw["environment"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasComputerUseServerToolPropertiesEnvironment>(element) } }
  val environment = environmentResult?.getOrNull()
  val environmentDecoded = environmentResult?.isSuccess == true
  val typeState4Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasComputerUseServerToolPropertiesType>(element) } }
  val typeState4 = typeState4Result?.getOrNull()
  val typeState4Decoded = typeState4Result?.isSuccess == true
  val containerResult = raw["container"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer>(element) } }
  val container = containerResult?.getOrNull()
  val containerDecoded = containerResult?.isSuccess == true
  val typeState2Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterServerToolPropertiesType>(element) } }
  val typeState2 = typeState2Result?.getOrNull()
  val typeState2Decoded = typeState2Result?.isSuccess == true
  val serverLabelResult = raw["server_label"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val serverLabel = serverLabelResult?.getOrNull()
  val serverLabelDecoded = serverLabelResult?.isSuccess == true
  val typeState10Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesType>(element) } }
  val typeState10 = typeState10Result?.getOrNull()
  val typeState10Decoded = typeState10Result?.isSuccess == true
  val typeState8Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasImageGenerationServerToolPropertiesType>(element) } }
  val typeState8 = typeState8Result?.getOrNull()
  val typeState8Decoded = typeState8Result?.isSuccess == true
  val typeState3Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasCodexLocalShellToolPropertiesType>(element) } }
  val typeState3 = typeState3Result?.getOrNull()
  val typeState3Decoded = typeState3Result?.isSuccess == true
  val typeState14Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasShellServerToolPropertiesType>(element) } }
  val typeState14 = typeState14Result?.getOrNull()
  val typeState14Decoded = typeState14Result?.isSuccess == true
  val typeState1Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasApplyPatchServerToolPropertiesType>(element) } }
  val typeState1 = typeState1Result?.getOrNull()
  val typeState1Decoded = typeState1Result?.isSuccess == true
  val typeState5Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasCustomToolPropertiesType>(element) } }
  val typeState5 = typeState5Result?.getOrNull()
  val typeState5Decoded = typeState5Result?.isSuccess == true
  val descriptionResult = raw["description"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<String>(element) } }
  val description = descriptionResult?.getOrNull()
  val descriptionDecoded = descriptionResult?.isSuccess == true
  val toolsResult = raw["tools"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>>(element) } }
  val tools = toolsResult?.getOrNull()
  val toolsDecoded = toolsResult?.isSuccess == true
  val typeState11Result = raw["type"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasNamespaceToolPropertiesType>(element) } }
  val typeState11 = typeState11Result?.getOrNull()
  val typeState11Decoded = typeState11Result?.isSuccess == true
  return InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsInspection(
    name = name,
    nameDecoded = nameDecoded,
    parameters = parameters,
    parametersPresent = parametersPresent,
    parametersDecoded = parametersDecoded,
    typeState7 = typeState7,
    typeState7Decoded = typeState7Decoded,
    typeState13 = typeState13,
    typeState13Decoded = typeState13Decoded,
    typeState12 = typeState12,
    typeState12Decoded = typeState12Decoded,
    typeState9 = typeState9,
    typeState9Decoded = typeState9Decoded,
    typeState15 = typeState15,
    typeState15Decoded = typeState15Decoded,
    typeState6 = typeState6,
    typeState6Decoded = typeState6Decoded,
    vectorStoreIds = vectorStoreIds,
    vectorStoreIdsDecoded = vectorStoreIdsDecoded,
    displayHeight = displayHeight,
    displayHeightDecoded = displayHeightDecoded,
    displayWidth = displayWidth,
    displayWidthDecoded = displayWidthDecoded,
    environment = environment,
    environmentDecoded = environmentDecoded,
    typeState4 = typeState4,
    typeState4Decoded = typeState4Decoded,
    container = container,
    containerDecoded = containerDecoded,
    typeState2 = typeState2,
    typeState2Decoded = typeState2Decoded,
    serverLabel = serverLabel,
    serverLabelDecoded = serverLabelDecoded,
    typeState10 = typeState10,
    typeState10Decoded = typeState10Decoded,
    typeState8 = typeState8,
    typeState8Decoded = typeState8Decoded,
    typeState3 = typeState3,
    typeState3Decoded = typeState3Decoded,
    typeState14 = typeState14,
    typeState14Decoded = typeState14Decoded,
    typeState1 = typeState1,
    typeState1Decoded = typeState1Decoded,
    typeState5 = typeState5,
    typeState5Decoded = typeState5Decoded,
    description = description,
    descriptionDecoded = descriptionDecoded,
    tools = tools,
    toolsDecoded = toolsDecoded,
    typeState11 = typeState11,
    typeState11Decoded = typeState11Decoded,
    failures = buildList {
      if (!nameDecoded || !parametersPresent || !parametersDecoded ||
        !typeState7Decoded) add("InlineComponentsSchemasBaseResponsesResultPropertiesToolsItemsOneOf0: required " +
          "properties 'name' and 'parameters' and 'type' do not match their declared types")
      if (!typeState13Decoded) add("PreviewWebSearchServerTool: required properties 'type' do not match their " +
        "declared types")
      if (!typeState12Decoded) add("Preview20250311WebSearchServerTool: required properties 'type' do not match their " +
        "declared types")
      if (!typeState9Decoded) add("LegacyWebSearchServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!typeState15Decoded) add("WebSearchServerTool: required properties 'type' do not match their declared types")
      if (!typeState6Decoded ||
        !vectorStoreIdsDecoded) add("FileSearchServerTool: required properties 'type' and 'vector_store_ids' do not " +
          "match their declared types")
      if (!displayHeightDecoded || !displayWidthDecoded || !environmentDecoded ||
        !typeState4Decoded) add("ComputerUseServerTool: required properties 'display_height' and 'display_width' and " +
          "'environment' and 'type' do not match their declared types")
      if (!containerDecoded ||
        !typeState2Decoded) add("CodeInterpreterServerTool: required properties 'container' and 'type' do not match " +
          "their declared types")
      if (!serverLabelDecoded ||
        !typeState10Decoded) add("McpServerTool: required properties 'server_label' and 'type' do not match their " +
          "declared types")
      if (!typeState8Decoded) add("ImageGenerationServerTool: required properties 'type' do not match their declared " +
        "types")
      if (!typeState3Decoded) add("CodexLocalShellTool: required properties 'type' do not match their declared types")
      if (!typeState14Decoded) add("ShellServerTool: required properties 'type' do not match their declared types")
      if (!typeState1Decoded) add("ApplyPatchServerTool: required properties 'type' do not match their declared types")
      if (!nameDecoded ||
        !typeState5Decoded) add("CustomTool: required properties 'name' and 'type' do not match their declared types")
      if (!descriptionDecoded || !nameDecoded || !toolsDecoded ||
        !typeState11Decoded) add("NamespaceTool: required properties 'description' and 'name' and 'tools' and 'type' " +
          "do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
