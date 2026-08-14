package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Branch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/custom_fields
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Inspection,
) {
  public val branch1:
      List<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataItemXd8114f76>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataItemXd8114f76>>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f:
      InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Branch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f) add(InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Branch.InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5NoMatchException("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataItemXd8114f76>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f>()
  return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationCustomFieldsXfbc081c5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f = matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f) add("InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f: value does not match InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2X92bbaf2f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
