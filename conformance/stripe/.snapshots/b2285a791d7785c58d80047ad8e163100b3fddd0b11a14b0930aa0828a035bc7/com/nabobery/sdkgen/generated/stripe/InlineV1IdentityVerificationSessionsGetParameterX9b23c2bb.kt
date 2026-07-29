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

public enum class InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbBranch {
  InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401,
  Branch2,
}

public sealed class InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbNoMatchException(
  message: String,
) : InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbDecodingException(message)

internal data class InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbInspection(
  public val matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/get/parameters/1/schema
 */
@Serializable(with = InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb.Serializer::class)
public class InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbInspection,
) {
  public val inlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401:
      InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401) json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401) add(InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbBranch.InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401)
      if (inspection.matchesBranch2) add(InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb {
      val inspection = inspectInlineV1IdentityVerificationSessionsGetParameterX9b23c2bb(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbNoMatchException("InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb) {
      encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsGetParameterX9b23c2bb").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IdentityVerificationSessionsGetParameterX9b23c2bb(element: JsonElement): InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbInspection {
  val matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401 = element.isJsonDecodable<InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1IdentityVerificationSessionsGetParameterX9b23c2bbInspection(
    matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401 = matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401) add("InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401: value does not match InlineV1IdentityVerificationSessionsGetParameterAnyOf1X5101d401")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
