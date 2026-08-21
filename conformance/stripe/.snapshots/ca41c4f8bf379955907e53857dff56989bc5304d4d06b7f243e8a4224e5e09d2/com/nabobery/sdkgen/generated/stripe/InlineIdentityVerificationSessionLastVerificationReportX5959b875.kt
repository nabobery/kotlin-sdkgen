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

public enum class InlineIdentityVerificationSessionLastVerificationReportX5959b875Branch {
  Branch1,
  IdentityVerificationReport,
}

public sealed class InlineIdentityVerificationSessionLastVerificationReportX5959b875DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIdentityVerificationSessionLastVerificationReportX5959b875NoMatchException(
  message: String,
) : InlineIdentityVerificationSessionLastVerificationReportX5959b875DecodingException(message)

internal data class InlineIdentityVerificationSessionLastVerificationReportX5959b875Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIdentityVerificationReport: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIdentityVerificationReport).count { it }
}

/**
 * ID of the most recent VerificationReport. [Learn more about accessing detailed verification
 * results.](https://docs.stripe.com/identity/verification-sessions#results)
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/identity.verification_session/properties/last_verification_report
 */
@Serializable(with = InlineIdentityVerificationSessionLastVerificationReportX5959b875.Serializer::class)
public class InlineIdentityVerificationSessionLastVerificationReportX5959b875 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineIdentityVerificationSessionLastVerificationReportX5959b875Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val identityVerificationReport: IdentityVerificationReport? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIdentityVerificationReport) json.decodeFromJsonElement<IdentityVerificationReport>(raw) else null }

  public val matchedBranches:
      Set<InlineIdentityVerificationSessionLastVerificationReportX5959b875Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIdentityVerificationSessionLastVerificationReportX5959b875Branch.Branch1)
      if (inspection.matchesIdentityVerificationReport) add(InlineIdentityVerificationSessionLastVerificationReportX5959b875Branch.IdentityVerificationReport)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIdentityVerificationSessionLastVerificationReportX5959b875 {
      val inspection = inspectInlineIdentityVerificationSessionLastVerificationReportX5959b875(raw)
      if (inspection.matchCount == 0) {
        throw InlineIdentityVerificationSessionLastVerificationReportX5959b875NoMatchException("InlineIdentityVerificationSessionLastVerificationReportX5959b875 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIdentityVerificationSessionLastVerificationReportX5959b875(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIdentityVerificationSessionLastVerificationReportX5959b875> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIdentityVerificationSessionLastVerificationReportX5959b875 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIdentityVerificationSessionLastVerificationReportX5959b875")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIdentityVerificationSessionLastVerificationReportX5959b875) {
      encoder.requireJsonEncoder("InlineIdentityVerificationSessionLastVerificationReportX5959b875").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIdentityVerificationSessionLastVerificationReportX5959b875(element: JsonElement): InlineIdentityVerificationSessionLastVerificationReportX5959b875Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIdentityVerificationReport = element.isJsonDecodable<IdentityVerificationReport>()
  return InlineIdentityVerificationSessionLastVerificationReportX5959b875Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIdentityVerificationReport = matchesIdentityVerificationReport,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIdentityVerificationReport) add("IdentityVerificationReport: value does not match IdentityVerificationReport")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
