package io.github.nabobery.sdkgen.generated

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

public sealed class InlineResponsesRequestPluginsItemX0152a27cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineResponsesRequestPluginsItemX0152a27cNoMatchException(
  message: String,
) : InlineResponsesRequestPluginsItemX0152a27cDecodingException(message)

public class InlineResponsesRequestPluginsItemX0152a27cAmbiguityException(
  message: String,
) : InlineResponsesRequestPluginsItemX0152a27cDecodingException(message)

public class InlineResponsesRequestPluginsItemX0152a27cBranchValidationException(
  message: String,
) : InlineResponsesRequestPluginsItemX0152a27cDecodingException(message)

/**
 * Closed oneOf union for sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/plugins/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest/properties/plugins/items
 */
@Serializable(with = InlineResponsesRequestPluginsItemX0152a27cSerializer::class)
public sealed interface InlineResponsesRequestPluginsItemX0152a27c {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class AutoRouterPlugin internal constructor(
    public val id: InlineAutoRouterPluginIdX2adccf1f,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineAutoRouterPluginIdX2adccf1f): AutoRouterPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.autoRouterPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("AutoRouterPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return AutoRouterPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class ModerationPlugin internal constructor(
    public val id: InlineModerationPluginIdX7d3ab755,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineModerationPluginIdX7d3ab755): ModerationPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.moderationPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("ModerationPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ModerationPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class WebSearchPlugin internal constructor(
    public val id: InlineWebSearchPluginIdX656406c7,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineWebSearchPluginIdX656406c7): WebSearchPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webSearchPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("WebSearchPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebSearchPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class WebFetchPlugin internal constructor(
    public val id: InlineWebFetchPluginIdXbfd564fa,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineWebFetchPluginIdXbfd564fa): WebFetchPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.webFetchPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("WebFetchPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return WebFetchPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class FileParserPlugin internal constructor(
    public val id: InlineFileParserPluginIdX43ae2ffb,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineFileParserPluginIdX43ae2ffb): FileParserPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fileParserPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("FileParserPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FileParserPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class ResponseHealingPlugin internal constructor(
    public val id: InlineResponseHealingPluginIdX79023015,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineResponseHealingPluginIdX79023015): ResponseHealingPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.responseHealingPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("ResponseHealingPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ResponseHealingPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class ContextCompressionPlugin internal constructor(
    public val id: InlineContextCompressionPluginIdX80e8af94,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineContextCompressionPluginIdX80e8af94): ContextCompressionPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.contextCompressionPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("ContextCompressionPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ContextCompressionPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class ParetoRouterPlugin internal constructor(
    public val id: InlineParetoRouterPluginIdX5f41930c,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineParetoRouterPluginIdX5f41930c): ParetoRouterPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.paretoRouterPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("ParetoRouterPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ParetoRouterPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }

  public class FusionPlugin internal constructor(
    public val id: InlineFusionPluginIdX75801025,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineResponsesRequestPluginsItemX0152a27c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(id: InlineFusionPluginIdX75801025): FusionPlugin {
        val raw = buildJsonObject {
          put("id", SdkJson.encodeToJsonElement(id))
        }
        val inspection = inspectInlineResponsesRequestPluginsItemX0152a27c(raw)
        if (inspection.size == 0) {
          throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.fusionPluginMatches) {
          throw InlineResponsesRequestPluginsItemX0152a27cBranchValidationException("FusionPlugin factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return FusionPlugin(
          id = id,
          raw = raw,
        )
      }
    }
  }
}

internal object InlineResponsesRequestPluginsItemX0152a27cSerializer : KSerializer<InlineResponsesRequestPluginsItemX0152a27c> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): InlineResponsesRequestPluginsItemX0152a27c {
    val jsonDecoder = decoder.requireJsonDecoder("InlineResponsesRequestPluginsItemX0152a27c")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: expected JSON object")
    val matches = inspectInlineResponsesRequestPluginsItemX0152a27c(rawObject)
    if (matches.size == 0) {
      throw InlineResponsesRequestPluginsItemX0152a27cNoMatchException("InlineResponsesRequestPluginsItemX0152a27c matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw InlineResponsesRequestPluginsItemX0152a27cAmbiguityException("InlineResponsesRequestPluginsItemX0152a27c matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.autoRouterPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.AutoRouterPlugin(id = requireNotNull(matches.idState1), raw = rawObject)
      matches.moderationPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.ModerationPlugin(id = requireNotNull(matches.idState9), raw = rawObject)
      matches.webSearchPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.WebSearchPlugin(id = requireNotNull(matches.idState17), raw = rawObject)
      matches.webFetchPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.WebFetchPlugin(id = requireNotNull(matches.idState15), raw = rawObject)
      matches.fileParserPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.FileParserPlugin(id = requireNotNull(matches.idState5), raw = rawObject)
      matches.responseHealingPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.ResponseHealingPlugin(id = requireNotNull(matches.idState13), raw = rawObject)
      matches.contextCompressionPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.ContextCompressionPlugin(id = requireNotNull(matches.idState3), raw = rawObject)
      matches.paretoRouterPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.ParetoRouterPlugin(id = requireNotNull(matches.idState11), raw = rawObject)
      matches.fusionPluginMatches -> InlineResponsesRequestPluginsItemX0152a27c.FusionPlugin(id = requireNotNull(matches.idState7), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: InlineResponsesRequestPluginsItemX0152a27c) {
    encoder.requireJsonEncoder("InlineResponsesRequestPluginsItemX0152a27c").encodeJsonElement(value.raw)
  }
}

internal data class InlineResponsesRequestPluginsItemX0152a27cInspection(
  public val idState1: InlineAutoRouterPluginIdX2adccf1f?,
  public val idState1Decoded: Boolean,
  public val idState1Matches: Boolean,
  public val idState2: InlineAutoRouterPluginIdX2adccf1f?,
  public val idState2Decoded: Boolean,
  public val idState2Matches: Boolean,
  public val idState9: InlineModerationPluginIdX7d3ab755?,
  public val idState9Decoded: Boolean,
  public val idState9Matches: Boolean,
  public val idState10: InlineModerationPluginIdX7d3ab755?,
  public val idState10Decoded: Boolean,
  public val idState10Matches: Boolean,
  public val idState17: InlineWebSearchPluginIdX656406c7?,
  public val idState17Decoded: Boolean,
  public val idState17Matches: Boolean,
  public val idState18: InlineWebSearchPluginIdX656406c7?,
  public val idState18Decoded: Boolean,
  public val idState18Matches: Boolean,
  public val idState15: InlineWebFetchPluginIdXbfd564fa?,
  public val idState15Decoded: Boolean,
  public val idState15Matches: Boolean,
  public val idState16: InlineWebFetchPluginIdXbfd564fa?,
  public val idState16Decoded: Boolean,
  public val idState16Matches: Boolean,
  public val idState5: InlineFileParserPluginIdX43ae2ffb?,
  public val idState5Decoded: Boolean,
  public val idState5Matches: Boolean,
  public val idState6: InlineFileParserPluginIdX43ae2ffb?,
  public val idState6Decoded: Boolean,
  public val idState6Matches: Boolean,
  public val idState13: InlineResponseHealingPluginIdX79023015?,
  public val idState13Decoded: Boolean,
  public val idState13Matches: Boolean,
  public val idState14: InlineResponseHealingPluginIdX79023015?,
  public val idState14Decoded: Boolean,
  public val idState14Matches: Boolean,
  public val idState3: InlineContextCompressionPluginIdX80e8af94?,
  public val idState3Decoded: Boolean,
  public val idState3Matches: Boolean,
  public val idState4: InlineContextCompressionPluginIdX80e8af94?,
  public val idState4Decoded: Boolean,
  public val idState4Matches: Boolean,
  public val idState11: InlineParetoRouterPluginIdX5f41930c?,
  public val idState11Decoded: Boolean,
  public val idState11Matches: Boolean,
  public val idState12: InlineParetoRouterPluginIdX5f41930c?,
  public val idState12Decoded: Boolean,
  public val idState12Matches: Boolean,
  public val idState7: InlineFusionPluginIdX75801025?,
  public val idState7Decoded: Boolean,
  public val idState7Matches: Boolean,
  public val idState8: InlineFusionPluginIdX75801025?,
  public val idState8Decoded: Boolean,
  public val idState8Matches: Boolean,
  public val autoRouterPluginMatches: Boolean,
  public val moderationPluginMatches: Boolean,
  public val webSearchPluginMatches: Boolean,
  public val webFetchPluginMatches: Boolean,
  public val fileParserPluginMatches: Boolean,
  public val responseHealingPluginMatches: Boolean,
  public val contextCompressionPluginMatches: Boolean,
  public val paretoRouterPluginMatches: Boolean,
  public val fusionPluginMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (autoRouterPluginMatches) add("AutoRouterPlugin")
      if (moderationPluginMatches) add("ModerationPlugin")
      if (webSearchPluginMatches) add("WebSearchPlugin")
      if (webFetchPluginMatches) add("WebFetchPlugin")
      if (fileParserPluginMatches) add("FileParserPlugin")
      if (responseHealingPluginMatches) add("ResponseHealingPlugin")
      if (contextCompressionPluginMatches) add("ContextCompressionPlugin")
      if (paretoRouterPluginMatches) add("ParetoRouterPlugin")
      if (fusionPluginMatches) add("FusionPlugin")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineResponsesRequestPluginsItemX0152a27c(rawObject: JsonObject): InlineResponsesRequestPluginsItemX0152a27cInspection {
  val idState1Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAutoRouterPluginIdX2adccf1f>(element) } }
  val idState1 = idState1Result?.getOrNull()
  val idState1Decoded = idState1Result?.isSuccess == true
  val idState1Matches = (rawObject.stringValue("id") == "auto-router") && idState1Decoded
  val idState2Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineAutoRouterPluginIdX2adccf1f>(element) } }
  val idState2 = idState2Result?.getOrNull()
  val idState2Decoded = idState2Result?.isSuccess == true
  val idState2Matches = (rawObject.stringValue("id") == "auto-router") && idState2Decoded
  val idState9Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineModerationPluginIdX7d3ab755>(element) } }
  val idState9 = idState9Result?.getOrNull()
  val idState9Decoded = idState9Result?.isSuccess == true
  val idState9Matches = (rawObject.stringValue("id") == "moderation") && idState9Decoded
  val idState10Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineModerationPluginIdX7d3ab755>(element) } }
  val idState10 = idState10Result?.getOrNull()
  val idState10Decoded = idState10Result?.isSuccess == true
  val idState10Matches = (rawObject.stringValue("id") == "moderation") && idState10Decoded
  val idState17Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebSearchPluginIdX656406c7>(element) } }
  val idState17 = idState17Result?.getOrNull()
  val idState17Decoded = idState17Result?.isSuccess == true
  val idState17Matches = (rawObject.stringValue("id") == "web") && idState17Decoded
  val idState18Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebSearchPluginIdX656406c7>(element) } }
  val idState18 = idState18Result?.getOrNull()
  val idState18Decoded = idState18Result?.isSuccess == true
  val idState18Matches = (rawObject.stringValue("id") == "web") && idState18Decoded
  val idState15Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebFetchPluginIdXbfd564fa>(element) } }
  val idState15 = idState15Result?.getOrNull()
  val idState15Decoded = idState15Result?.isSuccess == true
  val idState15Matches = (rawObject.stringValue("id") == "web-fetch") && idState15Decoded
  val idState16Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebFetchPluginIdXbfd564fa>(element) } }
  val idState16 = idState16Result?.getOrNull()
  val idState16Decoded = idState16Result?.isSuccess == true
  val idState16Matches = (rawObject.stringValue("id") == "web-fetch") && idState16Decoded
  val idState5Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFileParserPluginIdX43ae2ffb>(element) } }
  val idState5 = idState5Result?.getOrNull()
  val idState5Decoded = idState5Result?.isSuccess == true
  val idState5Matches = (rawObject.stringValue("id") == "file-parser") && idState5Decoded
  val idState6Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFileParserPluginIdX43ae2ffb>(element) } }
  val idState6 = idState6Result?.getOrNull()
  val idState6Decoded = idState6Result?.isSuccess == true
  val idState6Matches = (rawObject.stringValue("id") == "file-parser") && idState6Decoded
  val idState13Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineResponseHealingPluginIdX79023015>(element) } }
  val idState13 = idState13Result?.getOrNull()
  val idState13Decoded = idState13Result?.isSuccess == true
  val idState13Matches = (rawObject.stringValue("id") == "response-healing") && idState13Decoded
  val idState14Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineResponseHealingPluginIdX79023015>(element) } }
  val idState14 = idState14Result?.getOrNull()
  val idState14Decoded = idState14Result?.isSuccess == true
  val idState14Matches = (rawObject.stringValue("id") == "response-healing") && idState14Decoded
  val idState3Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineContextCompressionPluginIdX80e8af94>(element) } }
  val idState3 = idState3Result?.getOrNull()
  val idState3Decoded = idState3Result?.isSuccess == true
  val idState3Matches = (rawObject.stringValue("id") == "context-compression") && idState3Decoded
  val idState4Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineContextCompressionPluginIdX80e8af94>(element) } }
  val idState4 = idState4Result?.getOrNull()
  val idState4Decoded = idState4Result?.isSuccess == true
  val idState4Matches = (rawObject.stringValue("id") == "context-compression") && idState4Decoded
  val idState11Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineParetoRouterPluginIdX5f41930c>(element) } }
  val idState11 = idState11Result?.getOrNull()
  val idState11Decoded = idState11Result?.isSuccess == true
  val idState11Matches = (rawObject.stringValue("id") == "pareto-router") && idState11Decoded
  val idState12Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineParetoRouterPluginIdX5f41930c>(element) } }
  val idState12 = idState12Result?.getOrNull()
  val idState12Decoded = idState12Result?.isSuccess == true
  val idState12Matches = (rawObject.stringValue("id") == "pareto-router") && idState12Decoded
  val idState7Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionPluginIdX75801025>(element) } }
  val idState7 = idState7Result?.getOrNull()
  val idState7Decoded = idState7Result?.isSuccess == true
  val idState7Matches = (rawObject.stringValue("id") == "fusion") && idState7Decoded
  val idState8Result = rawObject["id"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineFusionPluginIdX75801025>(element) } }
  val idState8 = idState8Result?.getOrNull()
  val idState8Decoded = idState8Result?.isSuccess == true
  val idState8Matches = (rawObject.stringValue("id") == "fusion") && idState8Decoded
  val rawEmpty = rawObject.isEmpty()
  val autoRouterPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cAutoRouterPluginBranch(rawObject) && (idState1Matches)
  val moderationPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cModerationPluginBranch(rawObject) && (idState9Matches)
  val webSearchPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cWebSearchPluginBranch(rawObject) && (idState17Matches)
  val webFetchPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cWebFetchPluginBranch(rawObject) && (idState15Matches)
  val fileParserPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cFileParserPluginBranch(rawObject) && (idState5Matches)
  val responseHealingPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cResponseHealingPluginBranch(rawObject) && (idState13Matches)
  val contextCompressionPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cContextCompressionPluginBranch(rawObject) && (idState3Matches)
  val paretoRouterPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cParetoRouterPluginBranch(rawObject) && (idState11Matches)
  val fusionPluginMatches = matchesInlineResponsesRequestPluginsItemX0152a27cFusionPluginBranch(rawObject) && (idState7Matches)
  return InlineResponsesRequestPluginsItemX0152a27cInspection(
    idState1 = idState1,
    idState1Decoded = idState1Decoded,
    idState1Matches = idState1Matches,
    idState2 = idState2,
    idState2Decoded = idState2Decoded,
    idState2Matches = idState2Matches,
    idState9 = idState9,
    idState9Decoded = idState9Decoded,
    idState9Matches = idState9Matches,
    idState10 = idState10,
    idState10Decoded = idState10Decoded,
    idState10Matches = idState10Matches,
    idState17 = idState17,
    idState17Decoded = idState17Decoded,
    idState17Matches = idState17Matches,
    idState18 = idState18,
    idState18Decoded = idState18Decoded,
    idState18Matches = idState18Matches,
    idState15 = idState15,
    idState15Decoded = idState15Decoded,
    idState15Matches = idState15Matches,
    idState16 = idState16,
    idState16Decoded = idState16Decoded,
    idState16Matches = idState16Matches,
    idState5 = idState5,
    idState5Decoded = idState5Decoded,
    idState5Matches = idState5Matches,
    idState6 = idState6,
    idState6Decoded = idState6Decoded,
    idState6Matches = idState6Matches,
    idState13 = idState13,
    idState13Decoded = idState13Decoded,
    idState13Matches = idState13Matches,
    idState14 = idState14,
    idState14Decoded = idState14Decoded,
    idState14Matches = idState14Matches,
    idState3 = idState3,
    idState3Decoded = idState3Decoded,
    idState3Matches = idState3Matches,
    idState4 = idState4,
    idState4Decoded = idState4Decoded,
    idState4Matches = idState4Matches,
    idState11 = idState11,
    idState11Decoded = idState11Decoded,
    idState11Matches = idState11Matches,
    idState12 = idState12,
    idState12Decoded = idState12Decoded,
    idState12Matches = idState12Matches,
    idState7 = idState7,
    idState7Decoded = idState7Decoded,
    idState7Matches = idState7Matches,
    idState8 = idState8,
    idState8Decoded = idState8Decoded,
    idState8Matches = idState8Matches,
    autoRouterPluginMatches = autoRouterPluginMatches,
    moderationPluginMatches = moderationPluginMatches,
    webSearchPluginMatches = webSearchPluginMatches,
    webFetchPluginMatches = webFetchPluginMatches,
    fileParserPluginMatches = fileParserPluginMatches,
    responseHealingPluginMatches = responseHealingPluginMatches,
    contextCompressionPluginMatches = contextCompressionPluginMatches,
    paretoRouterPluginMatches = paretoRouterPluginMatches,
    fusionPluginMatches = fusionPluginMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!autoRouterPluginMatches) add("AutoRouterPlugin: branch predicate did not match properties 'id'")
      if (!moderationPluginMatches) add("ModerationPlugin: branch predicate did not match properties 'id'")
      if (!webSearchPluginMatches) add("WebSearchPlugin: branch predicate did not match properties 'id'")
      if (!webFetchPluginMatches) add("WebFetchPlugin: branch predicate did not match properties 'id'")
      if (!fileParserPluginMatches) add("FileParserPlugin: branch predicate did not match properties 'id'")
      if (!responseHealingPluginMatches) add("ResponseHealingPlugin: branch predicate did not match properties 'id'")
      if (!contextCompressionPluginMatches) add("ContextCompressionPlugin: branch predicate did not match properties 'id'")
      if (!paretoRouterPluginMatches) add("ParetoRouterPlugin: branch predicate did not match properties 'id'")
      if (!fusionPluginMatches) add("FusionPlugin: branch predicate did not match properties 'id'")
    },
  )
}

private fun matchesInlineResponsesRequestPluginsItemX0152a27cAutoRouterPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["allowed_models"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["cost_quality_tradeoff"]?.let { property -> (property.isJsonSchemaInteger() && property.matchesJsonSchemaNumber("0", "10", null, null, null)) } ?: true) && ((rawObject as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"auto-router\"")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cModerationPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"moderation\"")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cWebSearchPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"native\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"exa\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"firecrawl\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"parallel\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"perplexity\"")))) } ?: true) && ((rawObject as JsonObject)["exclude_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web\"")))) } ?: true) && ((rawObject as JsonObject)["include_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["max_results"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["max_uses"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["search_prompt"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((rawObject as JsonObject)["user_location"]?.let { property -> ((property is JsonObject && (property !is JsonObject || (((property as JsonObject)["city"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["country"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["region"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["timezone"]?.let { property -> property is JsonPrimitive && property.isString } ?: true) && ((property as JsonObject)["type"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"approximate\"")))) } ?: true)))) && (property !is JsonObject || ((property as JsonObject).containsKey("type")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cWebFetchPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["allowed_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["blocked_domains"]?.let { property -> (property is JsonArray && (property !is JsonArray || ((property as JsonArray).all { item -> item is JsonPrimitive && item.isString }))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"web-fetch\"")))) } ?: true) && ((rawObject as JsonObject)["max_content_tokens"]?.let { property -> property.isJsonSchemaInteger() } ?: true) && ((rawObject as JsonObject)["max_uses"]?.let { property -> property.isJsonSchemaInteger() } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cFileParserPluginBranch(rawObject: JsonObject): Boolean = true

private fun matchesInlineResponsesRequestPluginsItemX0152a27cResponseHealingPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"response-healing\"")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cContextCompressionPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["engine"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"middle-out\"")))) } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"context-compression\"")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cParetoRouterPluginBranch(rawObject: JsonObject): Boolean = (rawObject is JsonObject && (rawObject !is JsonObject || ((rawObject as JsonObject).containsKey("id") && ((rawObject as JsonObject)["enabled"]?.let { property -> property is JsonPrimitive && (property.content == "true" || property.content == "false") } ?: true) && ((rawObject as JsonObject)["id"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"pareto-router\"")))) } ?: true) && ((rawObject as JsonObject)["min_coding_score"]?.let { property -> (property.isJsonSchemaNumber() && property.matchesJsonSchemaNumber("0", "1", null, null, null)) } ?: true) && ((rawObject as JsonObject)["price_source"]?.let { property -> (property is JsonPrimitive && property.isString && (property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"prompt\"")) || property.jsonSchemaEquals(SdkJson.parseToJsonElement("\"weighted_avg\"")))) } ?: true))))

private fun matchesInlineResponsesRequestPluginsItemX0152a27cFusionPluginBranch(rawObject: JsonObject): Boolean = true

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
