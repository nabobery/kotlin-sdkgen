package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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

public enum class InlineReposCodeScanningAlertsPatchRequestJsonX81128345Branch {
  Branch1,
  Branch2,
}

public sealed class InlineReposCodeScanningAlertsPatchRequestJsonX81128345DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposCodeScanningAlertsPatchRequestJsonX81128345NoMatchException(
  message: String,
) : InlineReposCodeScanningAlertsPatchRequestJsonX81128345DecodingException(message)

internal data class InlineReposCodeScanningAlertsPatchRequestJsonX81128345Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1alerts~1{alert_number}/patch/requestBody
 * /content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1alerts~1{alert_number}/patch/requestBody
 * /content/application~1json/schema
 */
@Serializable(with = InlineReposCodeScanningAlertsPatchRequestJsonX81128345.Serializer::class)
public class InlineReposCodeScanningAlertsPatchRequestJsonX81128345 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposCodeScanningAlertsPatchRequestJsonX81128345Inspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposCodeScanningAlertsPatchRequestJsonX81128345Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposCodeScanningAlertsPatchRequestJsonX81128345Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposCodeScanningAlertsPatchRequestJsonX81128345Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposCodeScanningAlertsPatchRequestJsonX81128345 {
      val inspection = inspectInlineReposCodeScanningAlertsPatchRequestJsonX81128345(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposCodeScanningAlertsPatchRequestJsonX81128345NoMatchException("InlineReposCodeScanningAlertsPatchRequestJsonX81128345 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposCodeScanningAlertsPatchRequestJsonX81128345(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReposCodeScanningAlertsPatchRequestJsonX81128345> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodeScanningAlertsPatchRequestJsonX81128345 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodeScanningAlertsPatchRequestJsonX81128345")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeScanningAlertsPatchRequestJsonX81128345) {
      encoder.requireJsonEncoder("InlineReposCodeScanningAlertsPatchRequestJsonX81128345").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposCodeScanningAlertsPatchRequestJsonX81128345(element: JsonElement): InlineReposCodeScanningAlertsPatchRequestJsonX81128345Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  return InlineReposCodeScanningAlertsPatchRequestJsonX81128345Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
