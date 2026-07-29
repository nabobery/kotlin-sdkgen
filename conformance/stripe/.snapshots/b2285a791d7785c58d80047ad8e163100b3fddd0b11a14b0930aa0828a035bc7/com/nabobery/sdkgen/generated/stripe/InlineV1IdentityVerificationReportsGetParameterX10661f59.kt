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

public enum class InlineV1IdentityVerificationReportsGetParameterX10661f59Branch {
  InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c,
  Branch2,
}

public sealed class InlineV1IdentityVerificationReportsGetParameterX10661f59DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IdentityVerificationReportsGetParameterX10661f59NoMatchException(
  message: String,
) : InlineV1IdentityVerificationReportsGetParameterX10661f59DecodingException(message)

internal data class InlineV1IdentityVerificationReportsGetParameterX10661f59Inspection(
  public val matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_reports/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_reports/get/parameters/1/schema
 */
@Serializable(with = InlineV1IdentityVerificationReportsGetParameterX10661f59.Serializer::class)
public class InlineV1IdentityVerificationReportsGetParameterX10661f59 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IdentityVerificationReportsGetParameterX10661f59Inspection,
) {
  public val inlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c:
      InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c) json.decodeFromJsonElement<InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1IdentityVerificationReportsGetParameterX10661f59Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c) add(InlineV1IdentityVerificationReportsGetParameterX10661f59Branch.InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c)
      if (inspection.matchesBranch2) add(InlineV1IdentityVerificationReportsGetParameterX10661f59Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IdentityVerificationReportsGetParameterX10661f59 {
      val inspection = inspectInlineV1IdentityVerificationReportsGetParameterX10661f59(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IdentityVerificationReportsGetParameterX10661f59NoMatchException("InlineV1IdentityVerificationReportsGetParameterX10661f59 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IdentityVerificationReportsGetParameterX10661f59(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1IdentityVerificationReportsGetParameterX10661f59> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationReportsGetParameterX10661f59 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationReportsGetParameterX10661f59")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationReportsGetParameterX10661f59) {
      encoder.requireJsonEncoder("InlineV1IdentityVerificationReportsGetParameterX10661f59").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IdentityVerificationReportsGetParameterX10661f59(element: JsonElement): InlineV1IdentityVerificationReportsGetParameterX10661f59Inspection {
  val matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c = element.isJsonDecodable<InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1IdentityVerificationReportsGetParameterX10661f59Inspection(
    matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c = matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c) add("InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c: value does not match InlineV1IdentityVerificationReportsGetParameterAnyOf1Xabc6ae9c")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
