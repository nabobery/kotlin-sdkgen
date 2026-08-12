package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PlansGetParameterX8261943eBranch {
  InlineV1PlansGetParameterAnyOf1X9b127349,
  Branch2,
}

public sealed class InlineV1PlansGetParameterX8261943eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PlansGetParameterX8261943eNoMatchException(
  message: String,
) : InlineV1PlansGetParameterX8261943eDecodingException(message)

internal data class InlineV1PlansGetParameterX8261943eInspection(
  public val matchesInlineV1PlansGetParameterAnyOf1X9b127349: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PlansGetParameterAnyOf1X9b127349, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1plans/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1plans/get/parameters/1/schema
 */
@Serializable(with = InlineV1PlansGetParameterX8261943e.Serializer::class)
public class InlineV1PlansGetParameterX8261943e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PlansGetParameterX8261943eInspection,
) {
  public val inlineV1PlansGetParameterAnyOf1X9b127349: InlineV1PlansGetParameterAnyOf1X9b127349? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PlansGetParameterAnyOf1X9b127349) json.decodeFromJsonElement<InlineV1PlansGetParameterAnyOf1X9b127349>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PlansGetParameterX8261943eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PlansGetParameterAnyOf1X9b127349) add(InlineV1PlansGetParameterX8261943eBranch.InlineV1PlansGetParameterAnyOf1X9b127349)
      if (inspection.matchesBranch2) add(InlineV1PlansGetParameterX8261943eBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PlansGetParameterX8261943e {
      val inspection = inspectInlineV1PlansGetParameterX8261943e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PlansGetParameterX8261943eNoMatchException("InlineV1PlansGetParameterX8261943e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PlansGetParameterX8261943e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PlansGetParameterX8261943e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PlansGetParameterX8261943e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansGetParameterX8261943e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PlansGetParameterX8261943e) {
      encoder.requireJsonEncoder("InlineV1PlansGetParameterX8261943e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PlansGetParameterX8261943e(element: JsonElement): InlineV1PlansGetParameterX8261943eInspection {
  val matchesInlineV1PlansGetParameterAnyOf1X9b127349 = element.isJsonDecodable<InlineV1PlansGetParameterAnyOf1X9b127349>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PlansGetParameterX8261943eInspection(
    matchesInlineV1PlansGetParameterAnyOf1X9b127349 = matchesInlineV1PlansGetParameterAnyOf1X9b127349,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PlansGetParameterAnyOf1X9b127349) add("InlineV1PlansGetParameterAnyOf1X9b127349: value does not match InlineV1PlansGetParameterAnyOf1X9b127349")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
