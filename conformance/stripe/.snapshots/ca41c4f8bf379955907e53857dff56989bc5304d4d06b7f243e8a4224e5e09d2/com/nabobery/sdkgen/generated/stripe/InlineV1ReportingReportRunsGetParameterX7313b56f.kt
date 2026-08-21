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

public enum class InlineV1ReportingReportRunsGetParameterX7313b56fBranch {
  InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9,
  Branch2,
}

public sealed class InlineV1ReportingReportRunsGetParameterX7313b56fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ReportingReportRunsGetParameterX7313b56fNoMatchException(
  message: String,
) : InlineV1ReportingReportRunsGetParameterX7313b56fDecodingException(message)

internal data class InlineV1ReportingReportRunsGetParameterX7313b56fInspection(
  public val matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1reporting~1report_runs/get/parameters/0/schema
 */
@Serializable(with = InlineV1ReportingReportRunsGetParameterX7313b56f.Serializer::class)
public class InlineV1ReportingReportRunsGetParameterX7313b56f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ReportingReportRunsGetParameterX7313b56fInspection,
) {
  public val inlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9:
      InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9) json.decodeFromJsonElement<InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1ReportingReportRunsGetParameterX7313b56fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9) add(InlineV1ReportingReportRunsGetParameterX7313b56fBranch.InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9)
      if (inspection.matchesBranch2) add(InlineV1ReportingReportRunsGetParameterX7313b56fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ReportingReportRunsGetParameterX7313b56f {
      val inspection = inspectInlineV1ReportingReportRunsGetParameterX7313b56f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ReportingReportRunsGetParameterX7313b56fNoMatchException("InlineV1ReportingReportRunsGetParameterX7313b56f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ReportingReportRunsGetParameterX7313b56f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ReportingReportRunsGetParameterX7313b56f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ReportingReportRunsGetParameterX7313b56f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ReportingReportRunsGetParameterX7313b56f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ReportingReportRunsGetParameterX7313b56f) {
      encoder.requireJsonEncoder("InlineV1ReportingReportRunsGetParameterX7313b56f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ReportingReportRunsGetParameterX7313b56f(element: JsonElement): InlineV1ReportingReportRunsGetParameterX7313b56fInspection {
  val matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9 = element.isJsonDecodable<InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1ReportingReportRunsGetParameterX7313b56fInspection(
    matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9 = matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9) add("InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9: value does not match InlineV1ReportingReportRunsGetParameterAnyOf1X5ee8caf9")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
