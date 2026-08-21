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

public enum class InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bBranch {
  Branch1,
  Branch2,
}

public sealed class InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bNoMatchException(
  message: String,
) : InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bDecodingException(message)

internal data class InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1alerts~1{alert_number}/patch/requestBody/co
 * ntent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1dependabot~1alerts~1{alert_number}/patch/requestBody/co
 * ntent/application~1json/schema
 */
@Serializable(with = InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b.Serializer::class)
public class InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bInspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b {
      val inspection = inspectInlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bNoMatchException("InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b) {
      encoder.requireJsonEncoder("InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposDependabotAlertsPatchRequestJsonX3f8e6a6b(element: JsonElement): InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  return InlineReposDependabotAlertsPatchRequestJsonX3f8e6a6bInspection(
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
