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

public enum class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afBranch {
  InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74,
  InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3,
}

public sealed class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afInspection(
  public val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74:
      Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74, matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3).count { it }
}

/**
 * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
 * invoice](/api/invoices/create) for the given subscription at the specified interval.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/pending_invoice_item_interval
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afInspection,
) {
  public val inlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74:
      InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3:
      InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74) add(InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afBranch.InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3) add(InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afBranch.InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afNoMatchException("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af(element: JsonElement): InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afInspection {
  val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74>()
  val matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3>()
  return InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0afInspection(
    matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74 = matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74,
    matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3 = matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74) add("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74: value does not match InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf1X8342ea74")
      if (!matchesInlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3) add("InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3: value does not match InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalAnyOf2Xaa73e2c3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
