package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398DecodingException(
  message: String,
) : SerializationException(message)

public class InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398NoMatchException(
  message: String,
) : InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398DecodingException(message)

internal data class InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val matchesBranch5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4, matchesBranch5).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items/properties/parameters/additional
 * Properties/anyOf/4/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/tools/items/properties/parameters/additional
 * Properties/anyOf/4/items
 */
@Serializable(with = InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398.Serializer::class)
public class InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Boolean>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val branch5: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches:
      Set<InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch.Branch3)
      if (inspection.matchesBranch4) add(InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch.Branch4)
      if (inspection.matchesBranch5) add(InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Branch.Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398 {
      val inspection = inspectInlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398(raw)
      if (inspection.matchCount == 0) {
        throw InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398NoMatchException("InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398) {
      encoder.requireJsonEncoder("InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398(element: JsonElement): InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement?>()
  val matchesBranch5 = element.isJsonDecodable<JsonElement?>()
  return InlineFusionPluginToolsItemParametersAdditionalValueAnyOf5ItemX7177d398Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Boolean")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
      if (!matchesBranch5) add("Branch5: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
