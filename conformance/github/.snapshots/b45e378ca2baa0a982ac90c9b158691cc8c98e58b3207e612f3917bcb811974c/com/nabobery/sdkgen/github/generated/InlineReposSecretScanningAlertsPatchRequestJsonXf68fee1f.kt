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

public enum class InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fNoMatchException(
  message: String,
) : InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fDecodingException(message)

internal data class InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1alerts~1{alert_number}/patch/requestBo
 * dy/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1secret-scanning~1alerts~1{alert_number}/patch/requestBo
 * dy/content/application~1json/schema
 */
@Serializable(with = InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f.Serializer::class)
public class InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fInspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f {
      val inspection = inspectInlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fNoMatchException("InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f) {
      encoder.requireJsonEncoder("InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposSecretScanningAlertsPatchRequestJsonXf68fee1f(element: JsonElement): InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement>()
  return InlineReposSecretScanningAlertsPatchRequestJsonXf68fee1fInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
