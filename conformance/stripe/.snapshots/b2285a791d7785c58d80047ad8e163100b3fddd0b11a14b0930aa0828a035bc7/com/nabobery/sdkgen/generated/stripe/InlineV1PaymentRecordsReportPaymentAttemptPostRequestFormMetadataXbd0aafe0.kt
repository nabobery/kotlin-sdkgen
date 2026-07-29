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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Branch {
  Branch1,
  InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373,
}

public sealed class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0NoMatchException(
  message: String,
) : InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0DecodingException(message)

internal data class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt/post/requestBody/content/appl
 * ication~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373:
      InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373) json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Branch.Branch1)
      if (inspection.matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373) add(InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Branch.InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0 {
      val inspection = inspectInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0NoMatchException("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0) {
      encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0(element: JsonElement): InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 = element.isJsonDecodable<InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373>()
  return InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataXbd0aafe0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373 = matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373) add("InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373: value does not match InlineV1PaymentRecordsReportPaymentAttemptPostRequestFormMetadataAnyOf2X8e4c6373")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
