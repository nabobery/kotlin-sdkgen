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

public sealed class InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsNoMatchException(
  message: String,
) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsDecodingException(message)

public class InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsAmbiguityException(
  message: String,
) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/plugins/items.
 */
@Serializable(with = InlineComponentsSchemasResponsesRequestPropertiesPluginsItems.Serializer::class)
public sealed interface InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AutoRouterPlugin internal constructor(
    public val id: InlineComponentsSchemasAutoRouterPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasAutoRouterPluginPropertiesId): AutoRouterPlugin = AutoRouterPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "auto-router")
        },
      )
    }
  }

  public class ModerationPlugin internal constructor(
    public val id: InlineComponentsSchemasModerationPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasModerationPluginPropertiesId): ModerationPlugin = ModerationPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "moderation")
        },
      )
    }
  }

  public class WebSearchPlugin internal constructor(
    public val id: InlineComponentsSchemasWebSearchPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasWebSearchPluginPropertiesId): WebSearchPlugin = WebSearchPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "web")
        },
      )
    }
  }

  public class WebFetchPlugin internal constructor(
    public val id: InlineComponentsSchemasWebFetchPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasWebFetchPluginPropertiesId): WebFetchPlugin = WebFetchPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "web-fetch")
        },
      )
    }
  }

  public class FileParserPlugin internal constructor(
    public val id: InlineComponentsSchemasFileParserPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasFileParserPluginPropertiesId): FileParserPlugin = FileParserPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "file-parser")
        },
      )
    }
  }

  public class ResponseHealingPlugin internal constructor(
    public val id: InlineComponentsSchemasResponseHealingPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasResponseHealingPluginPropertiesId): ResponseHealingPlugin =
        ResponseHealingPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "response-healing")
        },
      )
    }
  }

  public class ContextCompressionPlugin internal constructor(
    public val id: InlineComponentsSchemasContextCompressionPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasContextCompressionPluginPropertiesId): ContextCompressionPlugin =
        ContextCompressionPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "context-compression")
        },
      )
    }
  }

  public class ParetoRouterPlugin internal constructor(
    public val id: InlineComponentsSchemasParetoRouterPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasParetoRouterPluginPropertiesId): ParetoRouterPlugin = ParetoRouterPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "pareto-router")
        },
      )
    }
  }

  public class FusionPlugin internal constructor(
    public val id: InlineComponentsSchemasFusionPluginPropertiesId,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineComponentsSchemasFusionPluginPropertiesId): FusionPlugin = FusionPlugin(
        id = id,
        raw = buildJsonObject {
          put("id", "fusion")
        },
      )
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasResponsesRequestPropertiesPluginsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasResponsesRequestPropertiesPluginsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasResponsesRequestPropertiesPluginsItems")
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsNoMatchException("InlineComponentsSchemasResponsesRequestPropertiesPluginsItems " +
          "matched 0 branches: expected JSON object")
      val matches = inspectInlineComponentsSchemasResponsesRequestPropertiesPluginsItems(raw)
      if (matches.size == 0) {
        throw InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsNoMatchException("InlineComponentsSchemasResponsesRequestPropertiesPluginsItems " +
          "matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsAmbiguityException("InlineComponentsSchemasResponsesRequestPropertiesPluginsItems " +
          "matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.idState1Matches -> AutoRouterPlugin(id = requireNotNull(matches.idState1), raw = raw)
        matches.idState5Matches -> ModerationPlugin(id = requireNotNull(matches.idState5), raw = raw)
        matches.idState9Matches -> WebSearchPlugin(id = requireNotNull(matches.idState9), raw = raw)
        matches.idState8Matches -> WebFetchPlugin(id = requireNotNull(matches.idState8), raw = raw)
        matches.idState3Matches -> FileParserPlugin(id = requireNotNull(matches.idState3), raw = raw)
        matches.idState7Matches -> ResponseHealingPlugin(id = requireNotNull(matches.idState7), raw = raw)
        matches.idState2Matches -> ContextCompressionPlugin(id = requireNotNull(matches.idState2), raw = raw)
        matches.idState6Matches -> ParetoRouterPlugin(id = requireNotNull(matches.idState6), raw = raw)
        matches.idState4Matches -> FusionPlugin(id = requireNotNull(matches.idState4), raw = raw)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasResponsesRequestPropertiesPluginsItems) {
      encoder.requireJsonEncoder("InlineComponentsSchemasResponsesRequestPropertiesPluginsItems")
        .encodeJsonElement(value.raw)
    }
  }
}

private data class InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsInspection(
  public val idState1: InlineComponentsSchemasAutoRouterPluginPropertiesId?,
  public val idState1Decoded: Boolean,
  public val idState1Matches: Boolean,
  public val idState5: InlineComponentsSchemasModerationPluginPropertiesId?,
  public val idState5Decoded: Boolean,
  public val idState5Matches: Boolean,
  public val idState9: InlineComponentsSchemasWebSearchPluginPropertiesId?,
  public val idState9Decoded: Boolean,
  public val idState9Matches: Boolean,
  public val idState8: InlineComponentsSchemasWebFetchPluginPropertiesId?,
  public val idState8Decoded: Boolean,
  public val idState8Matches: Boolean,
  public val idState3: InlineComponentsSchemasFileParserPluginPropertiesId?,
  public val idState3Decoded: Boolean,
  public val idState3Matches: Boolean,
  public val idState7: InlineComponentsSchemasResponseHealingPluginPropertiesId?,
  public val idState7Decoded: Boolean,
  public val idState7Matches: Boolean,
  public val idState2: InlineComponentsSchemasContextCompressionPluginPropertiesId?,
  public val idState2Decoded: Boolean,
  public val idState2Matches: Boolean,
  public val idState6: InlineComponentsSchemasParetoRouterPluginPropertiesId?,
  public val idState6Decoded: Boolean,
  public val idState6Matches: Boolean,
  public val idState4: InlineComponentsSchemasFusionPluginPropertiesId?,
  public val idState4Decoded: Boolean,
  public val idState4Matches: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (idState1Matches) add("AutoRouterPlugin")
      if (idState5Matches) add("ModerationPlugin")
      if (idState9Matches) add("WebSearchPlugin")
      if (idState8Matches) add("WebFetchPlugin")
      if (idState3Matches) add("FileParserPlugin")
      if (idState7Matches) add("ResponseHealingPlugin")
      if (idState2Matches) add("ContextCompressionPlugin")
      if (idState6Matches) add("ParetoRouterPlugin")
      if (idState4Matches) add("FusionPlugin")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineComponentsSchemasResponsesRequestPropertiesPluginsItems(raw: JsonObject): InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsInspection {
  val idState1Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasAutoRouterPluginPropertiesId>(element) } }
  val idState1 = idState1Result?.getOrNull()
  val idState1Decoded = idState1Result?.isSuccess == true
  val idState1Matches = raw.stringValue("id") == "auto-router" && idState1Decoded
  val idState5Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasModerationPluginPropertiesId>(element) } }
  val idState5 = idState5Result?.getOrNull()
  val idState5Decoded = idState5Result?.isSuccess == true
  val idState5Matches = raw.stringValue("id") == "moderation" && idState5Decoded
  val idState9Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasWebSearchPluginPropertiesId>(element) } }
  val idState9 = idState9Result?.getOrNull()
  val idState9Decoded = idState9Result?.isSuccess == true
  val idState9Matches = raw.stringValue("id") == "web" && idState9Decoded
  val idState8Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasWebFetchPluginPropertiesId>(element) } }
  val idState8 = idState8Result?.getOrNull()
  val idState8Decoded = idState8Result?.isSuccess == true
  val idState8Matches = raw.stringValue("id") == "web-fetch" && idState8Decoded
  val idState3Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasFileParserPluginPropertiesId>(element) } }
  val idState3 = idState3Result?.getOrNull()
  val idState3Decoded = idState3Result?.isSuccess == true
  val idState3Matches = raw.stringValue("id") == "file-parser" && idState3Decoded
  val idState7Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasResponseHealingPluginPropertiesId>(element) } }
  val idState7 = idState7Result?.getOrNull()
  val idState7Decoded = idState7Result?.isSuccess == true
  val idState7Matches = raw.stringValue("id") == "response-healing" && idState7Decoded
  val idState2Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasContextCompressionPluginPropertiesId>(element) } }
  val idState2 = idState2Result?.getOrNull()
  val idState2Decoded = idState2Result?.isSuccess == true
  val idState2Matches = raw.stringValue("id") == "context-compression" && idState2Decoded
  val idState6Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasParetoRouterPluginPropertiesId>(element) } }
  val idState6 = idState6Result?.getOrNull()
  val idState6Decoded = idState6Result?.isSuccess == true
  val idState6Matches = raw.stringValue("id") == "pareto-router" && idState6Decoded
  val idState4Result = raw["id"]?.let { element -> runCatching { SdkJson
    .decodeFromJsonElement<InlineComponentsSchemasFusionPluginPropertiesId>(element) } }
  val idState4 = idState4Result?.getOrNull()
  val idState4Decoded = idState4Result?.isSuccess == true
  val idState4Matches = raw.stringValue("id") == "fusion" && idState4Decoded
  return InlineComponentsSchemasResponsesRequestPropertiesPluginsItemsInspection(
    idState1 = idState1,
    idState1Decoded = idState1Decoded,
    idState1Matches = idState1Matches,
    idState5 = idState5,
    idState5Decoded = idState5Decoded,
    idState5Matches = idState5Matches,
    idState9 = idState9,
    idState9Decoded = idState9Decoded,
    idState9Matches = idState9Matches,
    idState8 = idState8,
    idState8Decoded = idState8Decoded,
    idState8Matches = idState8Matches,
    idState3 = idState3,
    idState3Decoded = idState3Decoded,
    idState3Matches = idState3Matches,
    idState7 = idState7,
    idState7Decoded = idState7Decoded,
    idState7Matches = idState7Matches,
    idState2 = idState2,
    idState2Decoded = idState2Decoded,
    idState2Matches = idState2Matches,
    idState6 = idState6,
    idState6Decoded = idState6Decoded,
    idState6Matches = idState6Matches,
    idState4 = idState4,
    idState4Decoded = idState4Decoded,
    idState4Matches = idState4Matches,
    failures = buildList {
      if (!idState1Matches) add("AutoRouterPlugin: required properties 'id' do not match their declared types")
      if (!idState5Matches) add("ModerationPlugin: required properties 'id' do not match their declared types")
      if (!idState9Matches) add("WebSearchPlugin: required properties 'id' do not match their declared types")
      if (!idState8Matches) add("WebFetchPlugin: required properties 'id' do not match their declared types")
      if (!idState3Matches) add("FileParserPlugin: required properties 'id' do not match their declared types")
      if (!idState7Matches) add("ResponseHealingPlugin: required properties 'id' do not match their declared types")
      if (!idState2Matches) add("ContextCompressionPlugin: required properties 'id' do not match their declared types")
      if (!idState6Matches) add("ParetoRouterPlugin: required properties 'id' do not match their declared types")
      if (!idState4Matches) add("FusionPlugin: required properties 'id' do not match their declared types")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
