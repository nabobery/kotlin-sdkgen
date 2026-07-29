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

public enum class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedBranch {
  Branch1,
  InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79,
}

public sealed class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedNoMatchException(
  message: String,
) : InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedDecodingException(message)

internal data class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded.Serializer::class)
public class InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79:
      InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79) json.decodeFromJsonElement<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedBranch.Branch1)
      if (inspection.matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79) add(InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedBranch.InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded {
      val inspection = inspectInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedNoMatchException("InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded) {
      encoder.requireJsonEncoder("InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bded(element: JsonElement): InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 = element.isJsonDecodable<InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79>()
  return InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataX8a93bdedInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79 = matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79) add("InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79: value does not match InlineV1PaymentRecordsReportPaymentPostRequestFormMetadataAnyOf2X98e40c79")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
