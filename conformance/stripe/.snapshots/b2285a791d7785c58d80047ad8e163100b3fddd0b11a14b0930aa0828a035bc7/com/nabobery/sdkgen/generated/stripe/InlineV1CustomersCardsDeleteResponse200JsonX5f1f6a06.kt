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

public enum class InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Branch {
  PaymentSource,
  DeletedPaymentSource,
}

public sealed class InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06NoMatchException(
  message: String,
) : InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06DecodingException(message)

internal data class InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Inspection(
  public val matchesPaymentSource: Boolean,
  public val matchesDeletedPaymentSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentSource, matchesDeletedPaymentSource).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/delete/responses/200/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/delete/responses/200/content/application
 * ~1json/schema
 */
@Serializable(with = InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06.Serializer::class)
public class InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Inspection,
) {
  public val paymentSource: PaymentSource? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentSource) json.decodeFromJsonElement<PaymentSource>(raw) else null }

  public val deletedPaymentSource: DeletedPaymentSource? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedPaymentSource) json.decodeFromJsonElement<DeletedPaymentSource>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Branch>
    get() = buildSet {
      if (inspection.matchesPaymentSource) add(InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Branch.PaymentSource)
      if (inspection.matchesDeletedPaymentSource) add(InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Branch.DeletedPaymentSource)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06 {
      val inspection = inspectInlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06NoMatchException("InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06) {
      encoder.requireJsonEncoder("InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06(element: JsonElement): InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Inspection {
  val matchesPaymentSource = element.isJsonDecodable<PaymentSource>()
  val matchesDeletedPaymentSource = element.isJsonDecodable<DeletedPaymentSource>()
  return InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06Inspection(
    matchesPaymentSource = matchesPaymentSource,
    matchesDeletedPaymentSource = matchesDeletedPaymentSource,
    failures = buildList {
      if (!matchesPaymentSource) add("PaymentSource: value does not match PaymentSource")
      if (!matchesDeletedPaymentSource) add("DeletedPaymentSource: value does not match DeletedPaymentSource")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
