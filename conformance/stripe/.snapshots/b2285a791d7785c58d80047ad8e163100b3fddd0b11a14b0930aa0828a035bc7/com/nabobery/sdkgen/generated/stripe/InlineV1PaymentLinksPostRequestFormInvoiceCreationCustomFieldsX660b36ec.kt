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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecBranch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecInspection,
) {
  public val branch1:
      List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemX69dcaa83>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemX69dcaa83>>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6:
      InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecBranch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6) add(InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecBranch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecNoMatchException("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ec(element: JsonElement): InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataItemX69dcaa83>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6>()
  return InlineV1PaymentLinksPostRequestFormInvoiceCreationCustomFieldsX660b36ecInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6 = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6) add("InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xa66161d6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
